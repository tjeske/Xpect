/*******************************************************************************
 * Copyright (c) 2012-2017 TypeFox GmbH and itemis AG.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Moritz Eysholdt - Initial contribution and API
 *******************************************************************************/

timestamps() {
    properties([
        pipelineTriggers([cron('H 2 * * *')])
    ])
    node('centos-8') {
        def javaHome = tool 'temurin-jdk11-latest'
        env.JAVA_HOME = "${javaHome}"
        def java11Home = tool 'temurin-jdk11-latest'
        def mvnHome = tool 'apache-maven-3.8.6'
        def mvnParams = '--batch-mode --update-snapshots -fae -Dmaven.repo.local=xpect-local-maven-repository -DtestOnly=false'
        timeout(time: 1, unit: 'HOURS') {
            stage('prepare workspace') {
                step([$class: 'WsCleanup'])
                // we need to live with detached head, or we need to adjust settings:
                // https://issues.jenkins-ci.org/browse/JENKINS-42860
                checkout scm
            }
            stage('log configuration') {
                echo("===== checking tools versions =====")
                sh """\
                       git config --get remote.origin.url
                       git reset --hard
                       pwd
                       ls -la
                       ${mvnHome}/bin/mvn -v
                       ${javaHome}/bin/java -version
                   """
                echo("===================================")
            }

            stage('compile with Eclipse 2022-03 and Xtext nighly') {
                sh "${mvnHome}/bin/mvn -P!tests -Declipsesign=true -Dtycho-version=2.7.5 -Dtarget-platform=eclipse_2022_03-xtext_nightly ${mvnParams} clean install"
                archiveArtifacts artifacts: 'org.eclipse.xpect.releng/p2-repository/target/repository/**/*.*,org.eclipse.xpect.releng/p2-repository/target/org.eclipse.xpect.repository-*.zip'
            }

            wrap([$class: 'Xvnc', useXauthority: true]) {

                stage('test with Eclipse 2022-03 and Xtext nighly') {
                    try{
                        sh "JAVA_HOME=${java11Home} ${mvnHome}/bin/mvn -P!plugins -P!xtext-examples -Dtycho-version=2.7.5 -Dtarget-platform=eclipse_2022_03-xtext_nightly ${mvnParams} clean integration-test"
                    }finally {
                        junit '**/TEST-*.xml'
                    }
                }
            }

        }
    }
}
