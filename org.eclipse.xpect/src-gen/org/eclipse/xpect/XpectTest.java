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

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.XpectTest#getDeclaredSuite <em>Declared Suite</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectPackage#getXpectTest()
 * @model
 * @generated
 */
public interface XpectTest extends Member, AbstractComponent
{
	/**
	 * Returns the value of the '<em><b>Declared Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Suite</em>' reference.
	 * @see #setDeclaredSuite(JvmDeclaredType)
	 * @see org.eclipse.xpect.XpectPackage#getXpectTest_DeclaredSuite()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getDeclaredSuite();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XpectTest#getDeclaredSuite <em>Declared Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Suite</em>' reference.
	 * @see #getDeclaredSuite()
	 * @generated
	 */
	void setDeclaredSuite(JvmDeclaredType value);

} // XpectTest
