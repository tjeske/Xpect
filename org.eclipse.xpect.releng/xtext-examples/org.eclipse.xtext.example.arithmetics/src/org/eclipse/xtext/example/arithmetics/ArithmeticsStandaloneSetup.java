/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.example.arithmetics;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ArithmeticsStandaloneSetup extends ArithmeticsStandaloneSetupGenerated {

	public static void doSetup() {
		new ArithmeticsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}				
}
