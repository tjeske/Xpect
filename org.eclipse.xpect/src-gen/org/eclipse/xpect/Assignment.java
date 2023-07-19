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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.Assignment#getDeclaredTarget <em>Declared Target</em>}</li>
 *   <li>{@link org.eclipse.xpect.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
	/**
	 * Returns the value of the '<em><b>Declared Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Target</em>' reference.
	 * @see #setDeclaredTarget(JvmOperation)
	 * @see org.eclipse.xpect.XpectPackage#getAssignment_DeclaredTarget()
	 * @model
	 * @generated
	 */
	JvmOperation getDeclaredTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.Assignment#getDeclaredTarget <em>Declared Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Target</em>' reference.
	 * @see #getDeclaredTarget()
	 * @generated
	 */
	void setDeclaredTarget(JvmOperation value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.eclipse.xpect.XpectPackage#getAssignment_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.Assignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AbstractComponent getInstance();

} // Assignment
