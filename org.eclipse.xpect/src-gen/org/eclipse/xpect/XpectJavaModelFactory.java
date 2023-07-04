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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpect.XpectJavaModelPackage
 * @generated
 */
public interface XpectJavaModelFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XpectJavaModelFactory eINSTANCE = org.eclipse.xpect.model.XpectJavaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Xpect Java Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xpect Java Model</em>'.
	 * @generated
	 */
	XpectJavaModel createXpectJavaModel();

	/**
	 * Returns a new object of class '<em>Xjm Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xjm Element</em>'.
	 * @generated
	 */
	XjmElement createXjmElement();

	/**
	 * Returns a new object of class '<em>Xjm Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xjm Test</em>'.
	 * @generated
	 */
	XjmTest createXjmTest();

	/**
	 * Returns a new object of class '<em>Xjm Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xjm Contribution</em>'.
	 * @generated
	 */
	XjmContribution createXjmContribution();

	/**
	 * Returns a new object of class '<em>Xjm Test Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xjm Test Method</em>'.
	 * @generated
	 */
	XjmTestMethod createXjmTestMethod();

	/**
	 * Returns a new object of class '<em>Xjm Xpect Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xjm Xpect Method</em>'.
	 * @generated
	 */
	XjmXpectMethod createXjmXpectMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XpectJavaModelPackage getXpectJavaModelPackage();

} //XpectJavaModelFactory
