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
package org.eclipse.xpect.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xpect.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpect.XpectJavaModelPackage
 * @generated
 */
public class XpectJavaModelSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XpectJavaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectJavaModelSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = XpectJavaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL:
			{
				XpectJavaModel xpectJavaModel = (XpectJavaModel)theEObject;
				T result = caseXpectJavaModel(xpectJavaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_ELEMENT:
			{
				XjmElement xjmElement = (XjmElement)theEObject;
				T result = caseXjmElement(xjmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_CLASS:
			{
				XjmClass xjmClass = (XjmClass)theEObject;
				T result = caseXjmClass(xjmClass);
				if (result == null) result = caseXjmElement(xjmClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_TEST:
			{
				XjmTest xjmTest = (XjmTest)theEObject;
				T result = caseXjmTest(xjmTest);
				if (result == null) result = caseXjmClass(xjmTest);
				if (result == null) result = caseXjmElement(xjmTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_CONTRIBUTION:
			{
				XjmContribution xjmContribution = (XjmContribution)theEObject;
				T result = caseXjmContribution(xjmContribution);
				if (result == null) result = caseXjmClass(xjmContribution);
				if (result == null) result = caseXjmElement(xjmContribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_METHOD:
			{
				XjmMethod xjmMethod = (XjmMethod)theEObject;
				T result = caseXjmMethod(xjmMethod);
				if (result == null) result = caseXjmElement(xjmMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_TEST_METHOD:
			{
				XjmTestMethod xjmTestMethod = (XjmTestMethod)theEObject;
				T result = caseXjmTestMethod(xjmTestMethod);
				if (result == null) result = caseXjmMethod(xjmTestMethod);
				if (result == null) result = caseXjmElement(xjmTestMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.XJM_XPECT_METHOD:
			{
				XjmXpectMethod xjmXpectMethod = (XjmXpectMethod)theEObject;
				T result = caseXjmXpectMethod(xjmXpectMethod);
				if (result == null) result = caseXjmMethod(xjmXpectMethod);
				if (result == null) result = caseXjmElement(xjmXpectMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XpectJavaModelPackage.NAME_TO_METHOD_ENTRY:
			{
				@SuppressWarnings("unchecked") Map.Entry<String, XjmMethod> nameToMethodEntry = (Map.Entry<String, XjmMethod>)theEObject;
				T result = caseNameToMethodEntry(nameToMethodEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xpect Java Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xpect Java Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXpectJavaModel(XpectJavaModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmElement(XjmElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmClass(XjmClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmTest(XjmTest object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmContribution(XjmContribution object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmMethod(XjmMethod object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Test Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Test Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmTestMethod(XjmTestMethod object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xjm Xpect Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xjm Xpect Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXjmXpectMethod(XjmXpectMethod object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name To Method Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name To Method Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameToMethodEntry(Map.Entry<String, XjmMethod> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //XpectJavaModelSwitch
