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

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpect.parameter.IStatementRelatedRegion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#isFixme <em>Fixme</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#getRelatedRegions <em>Related Regions</em>}</li>
 *   <li>{@link org.eclipse.xpect.XpectInvocation#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation()
 * @model
 * @generated
 */
public interface XpectInvocation extends Member
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_Id()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore</em>' attribute.
	 * @see #setIgnore(boolean)
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_Ignore()
	 * @model
	 * @generated
	 */
	boolean isIgnore();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XpectInvocation#isIgnore <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore</em>' attribute.
	 * @see #isIgnore()
	 * @generated
	 */
	void setIgnore(boolean value);

	/**
	 * Returns the value of the '<em><b>Fixme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag to indicate that the reported issue is a bug and will be fixed in future development steps.
	 * Semantically this will break the build if and only if the issue is not encountered any more. (a.k.a. is fixed).
	 * This can help tracking known issues. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixme</em>' attribute.
	 * @see #setFixme(boolean)
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_Fixme()
	 * @model
	 * @generated
	 */
	boolean isFixme();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XpectInvocation#isFixme <em>Fixme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixme</em>' attribute.
	 * @see #isFixme()
	 * @generated
	 */
	void setFixme(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(XjmXpectMethod)
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_Method()
	 * @model
	 * @generated
	 */
	XjmXpectMethod getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XpectInvocation#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(XjmXpectMethod value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xpect.XpectArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<XpectArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Related Regions</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.xpect.parameter.IStatementRelatedRegion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Regions</em>' attribute list.
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_RelatedRegions()
	 * @model unique="false" dataType="org.eclipse.xpect.StatementRelatedRegion" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<IStatementRelatedRegion> getRelatedRegions();

	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Region</em>' attribute.
	 * @see #setExtendedRegion(IStatementRelatedRegion)
	 * @see org.eclipse.xpect.XpectPackage#getXpectInvocation_ExtendedRegion()
	 * @model dataType="org.eclipse.xpect.StatementRelatedRegion"
	 * @generated
	 */
	IStatementRelatedRegion getExtendedRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.XpectInvocation#getExtendedRegion <em>Extended Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' attribute.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(IStatementRelatedRegion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMethodName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model TBounds="org.eclipse.xpect.StatementRelatedRegion"
	 * @generated
	 */
	<T extends IStatementRelatedRegion> T getRelatedRegion(Class<T> type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	XpectFile getFile();

} // XpectInvocation
