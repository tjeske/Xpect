/**
 * ******************************************************************************
 * Copyright (c) 2012-2017 TypeFox GmbH and itemis AG.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Moritz Eysholdt - Initial contribution and API
 *  ******************************************************************************
 */
package org.eclipse.xpect;

import java.lang.Iterable;

import java.lang.annotation.Annotation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xpect Java Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpect.XpectJavaModel#getTestOrSuite <em>Test Or Suite</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectJavaModel#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectJavaModel#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectJavaModel#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpect.XpectJavaModelPackage#getXpectJavaModel()
 * @model
 * @generated
 */
public interface XpectJavaModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Test Or Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Or Suite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Or Suite</em>' reference.
	 * @see #setTestOrSuite(XjmTest)
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXpectJavaModel_TestOrSuite()
	 * @model resolveProxies="false"
	 * @generated
	 */
	XjmTest getTestOrSuite();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XpectJavaModel#getTestOrSuite <em>Test Or Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Or Suite</em>' reference.
	 * @see #getTestOrSuite()
	 * @generated
	 */
	void setTestOrSuite(XjmTest value);

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpect.XjmContribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributions</em>' containment reference list.
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXpectJavaModel_Contributions()
	 * @model containment="true"
	 * @generated
	 */
	EList<XjmContribution> getContributions();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpect.XjmTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXpectJavaModel_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<XjmTest> getTests();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.xpect.XjmMethod},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' map.
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXpectJavaModel_Methods()
	 * @model mapType="org.eclipse.xpect.NameToMethodEntry<org.eclipse.emf.ecore.EString, org.eclipse.xpect.XjmMethod>"
	 * @generated
	 */
	EMap<String, XjmMethod> getMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.xtext.common.types.Iterable<org.eclipse.xpect.XjmContribution>"
	 * @generated
	 */
	Iterable<XjmContribution> getContributions(Class<? extends Annotation> role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.xtext.common.types.Iterable<org.eclipse.xpect.XjmContribution>"
	 * @generated
	 */
	Iterable<XjmContribution> getContributions(Class<? extends Annotation> role, Environment environment);

} // XpectJavaModel
