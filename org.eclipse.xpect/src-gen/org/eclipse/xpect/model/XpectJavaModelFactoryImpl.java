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
package org.eclipse.xpect.model;

import java.lang.annotation.Annotation;

import java.lang.reflect.Method;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpect.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XpectJavaModelFactoryImpl extends EFactoryImpl implements XpectJavaModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XpectJavaModelFactory init()
	{
		try
		{
			XpectJavaModelFactory theXpectJavaModelFactory = (XpectJavaModelFactory)EPackage.Registry.INSTANCE.getEFactory(XpectJavaModelPackage.eNS_URI);
			if (theXpectJavaModelFactory != null)
			{
				return theXpectJavaModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XpectJavaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectJavaModelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL: return createXpectJavaModel();
			case XpectJavaModelPackage.XJM_ELEMENT: return createXjmElement();
			case XpectJavaModelPackage.XJM_TEST: return createXjmTest();
			case XpectJavaModelPackage.XJM_CONTRIBUTION: return createXjmContribution();
			case XpectJavaModelPackage.XJM_TEST_METHOD: return createXjmTestMethod();
			case XpectJavaModelPackage.XJM_XPECT_METHOD: return createXjmXpectMethod();
			case XpectJavaModelPackage.NAME_TO_METHOD_ENTRY: return (EObject)createNameToMethodEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case XpectJavaModelPackage.ENVIRONMENT:
				return createEnvironmentFromString(eDataType, initialValue);
			case XpectJavaModelPackage.JAVA_METHOD:
				return createJavaMethodFromString(eDataType, initialValue);
			case XpectJavaModelPackage.JAVA_ANNOTATION:
				return createJavaAnnotationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case XpectJavaModelPackage.ENVIRONMENT:
				return convertEnvironmentToString(eDataType, instanceValue);
			case XpectJavaModelPackage.JAVA_METHOD:
				return convertJavaMethodToString(eDataType, instanceValue);
			case XpectJavaModelPackage.JAVA_ANNOTATION:
				return convertJavaAnnotationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XpectJavaModel createXpectJavaModel()
	{
		XpectJavaModelImplCustom xpectJavaModel = new XpectJavaModelImplCustom();
		return xpectJavaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmElement createXjmElement()
	{
		XjmElementImplCustom xjmElement = new XjmElementImplCustom();
		return xjmElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmTest createXjmTest()
	{
		XjmTestImplCustom xjmTest = new XjmTestImplCustom();
		return xjmTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmContribution createXjmContribution()
	{
		XjmContributionImplCustom xjmContribution = new XjmContributionImplCustom();
		return xjmContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmTestMethod createXjmTestMethod()
	{
		XjmTestMethodImplCustom xjmTestMethod = new XjmTestMethodImplCustom();
		return xjmTestMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmXpectMethod createXjmXpectMethod()
	{
		XjmXpectMethodImplCustom xjmXpectMethod = new XjmXpectMethodImplCustom();
		return xjmXpectMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, XjmMethod> createNameToMethodEntry()
	{
		NameToMethodEntryImpl nameToMethodEntry = new NameToMethodEntryImpl();
		return nameToMethodEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironmentFromString(EDataType eDataType, String initialValue)
	{
		Environment result = Environment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvironmentToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createJavaMethodFromString(EDataType eDataType, String initialValue)
	{
		return (Method)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaMethodToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createJavaAnnotationFromString(EDataType eDataType, String initialValue)
	{
		return (Annotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaAnnotationToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XpectJavaModelPackage getXpectJavaModelPackage()
	{
		return (XpectJavaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XpectJavaModelPackage getPackage()
	{
		return XpectJavaModelPackage.eINSTANCE;
	}

} //XpectJavaModelFactoryImpl
