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

import java.lang.annotation.Annotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xjm Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.XjmContribution#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.xpect.XjmContribution#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.eclipse.xpect.XjmContribution#getDeactivationReason <em>Deactivation Reason</em>}</li>
 *   <li>{@link org.eclipse.xpect.XjmContribution#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmContribution()
 * @model
 * @generated
 */
public interface XjmContribution extends XjmClass
{
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.annotation.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmContribution_Roles()
	 * @model dataType="org.eclipse.xpect.JavaAnnotation"
	 * @generated
	 */
	EList<Annotation> getRoles();

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.xpect.Environment}.
	 * The literals are from the enumeration {@link org.eclipse.xpect.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' attribute list.
	 * @see org.eclipse.xpect.Environment
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmContribution_Environments()
	 * @model
	 * @generated
	 */
	EList<Environment> getEnvironments();

	/**
	 * Returns the value of the '<em><b>Deactivation Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deactivation Reason</em>' attribute.
	 * @see #setDeactivationReason(String)
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmContribution_DeactivationReason()
	 * @model
	 * @generated
	 */
	String getDeactivationReason();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XjmContribution#getDeactivationReason <em>Deactivation Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deactivation Reason</em>' attribute.
	 * @see #getDeactivationReason()
	 * @generated
	 */
	void setDeactivationReason(String value);

	/**
	 * Returns the value of the '<em><b>Replaced By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced By</em>' reference.
	 * @see #setReplacedBy(XjmContribution)
	 * @see org.eclipse.xpect.XpectJavaModelPackage#getXjmContribution_ReplacedBy()
	 * @model
	 * @generated
	 */
	XjmContribution getReplacedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XjmContribution#getReplacedBy <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced By</em>' reference.
	 * @see #getReplacedBy()
	 * @generated
	 */
	void setReplacedBy(XjmContribution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isActive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T> T newInstance(Class<T> expectedType);

} // XjmContribution
