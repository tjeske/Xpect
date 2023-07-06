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

import java.lang.reflect.Method;

import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xjm Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xpect.XjmMethod#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.xpect.XjmMethod#getJvmMethod <em>Jvm Method</em>}</li>
 *   <li>{@link org.eclipse.xpect.XjmMethod#getJavaMethod <em>Java Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmMethod()
 * @model abstract="true"
 * @generated
 */
public interface XjmMethod extends XjmElement
{
	/**
	 * Returns the value of the '<em><b>Test</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xpect.XjmTest#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' container reference.
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmMethod_Test()
	 * @see org.eclipse.xpect.XjmTest#getMethods
	 * @model opposite="methods" resolveProxies="false" transient="false" changeable="false"
	 * @generated
	 */
	XjmTest getTest();

	/**
	 * Returns the value of the '<em><b>Jvm Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jvm Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jvm Method</em>' reference.
	 * @see #setJvmMethod(JvmOperation)
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmMethod_JvmMethod()
	 * @model resolveProxies="false"
	 * @generated
	 */
	JvmOperation getJvmMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XjmMethod#getJvmMethod <em>Jvm Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jvm Method</em>' reference.
	 * @see #getJvmMethod()
	 * @generated
	 */
	void setJvmMethod(JvmOperation value);

	/**
	 * Returns the value of the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Method</em>' attribute.
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmMethod_JavaMethod()
	 * @model dataType="org.eclipse.xpect.JavaMethod" changeable="false"
	 * @generated
	 */
	Method getJavaMethod();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

} // XjmMethod
