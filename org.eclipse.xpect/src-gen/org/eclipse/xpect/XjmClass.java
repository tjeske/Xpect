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
 * A representation of the model object '<em><b>Xjm Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.XjmClass#getJvmClass <em>Jvm Class</em>}</li>
 *   <li>{@link org.eclipse.xpect.XjmClass#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmClass()
 * @model abstract="true"
 * @generated
 */
public interface XjmClass extends XjmElement
{
	/**
	 * Returns the value of the '<em><b>Jvm Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvm Class</em>' reference.
	 * @see #setJvmClass(JvmDeclaredType)
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmClass_JvmClass()
	 * @model
	 * @generated
	 */
	JvmDeclaredType getJvmClass();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XjmClass#getJvmClass <em>Jvm Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Class</em>' reference.
	 * @see #getJvmClass()
	 * @generated
	 */
	void setJvmClass(JvmDeclaredType value);

	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' attribute.
	 * @see #setJavaClass(Class)
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmClass_JavaClass()
	 * @model derived="true"
	 * @generated
	 */
	Class<?> getJavaClass();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XjmClass#getJavaClass <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' attribute.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(Class<?> value);

} // XjmClass
