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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.Component#getComponentClass <em>Component Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Value, AbstractComponent
{
	/**
	 * Returns the value of the '<em><b>Component Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Class</em>' reference.
	 * @see #setComponentClass(JvmDeclaredType)
	 * @see org.eclipse.xpect.XpectPackage#getComponent_ComponentClass()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getComponentClass();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.Component#getComponentClass <em>Component Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Class</em>' reference.
	 * @see #getComponentClass()
	 * @generated
	 */
	void setComponentClass(JvmDeclaredType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Assignment getAssignment();

} // Component
