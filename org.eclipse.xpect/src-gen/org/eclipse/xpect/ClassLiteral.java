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
 * A representation of the model object '<em><b>Class Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.ClassLiteral#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectPackage#getClassLiteral()
 * @model
 * @generated
 */
public interface ClassLiteral extends Literal
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(JvmDeclaredType)
	 * @see org.eclipse.xpect.XpectPackage#getClassLiteral_Type()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.ClassLiteral#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(JvmDeclaredType value);

} // ClassLiteral
