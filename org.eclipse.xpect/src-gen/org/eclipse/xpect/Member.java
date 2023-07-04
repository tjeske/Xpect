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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.Member#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xpect.XpectPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject
{
	/**
	 * Returns the value of the '<em><b>File</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xpect.XpectFile#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' container reference.
	 * @see #setFile(XpectFile)
	 * @see org.eclipse.xpect.XpectPackage#getMember_File()
	 * @see org.eclipse.xpect.XpectFile#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	XpectFile getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.xpect.Member#getFile <em>File</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' container reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(XpectFile value);

} // Member
