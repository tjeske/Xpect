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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xpect.*;

import org.eclipse.xpect.parameter.IStatementRelatedRegion;

import org.eclipse.xpect.setup.ISetupInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XpectFactoryImpl extends EFactoryImpl implements XpectFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XpectFactory init()
	{
		try
		{
			XpectFactory theXpectFactory = (XpectFactory)EPackage.Registry.INSTANCE.getEFactory(XpectPackage.eNS_URI);
			if (theXpectFactory != null)
			{
				return theXpectFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XpectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectFactoryImpl()
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
			case XpectPackage.XPECT_FILE: return createXpectFile();
			case XpectPackage.XPECT_TEST: return createXpectTest();
			case XpectPackage.XPECT_IGNORE: return createXpectIgnore();
			case XpectPackage.XPECT_INVOCATION: return createXpectInvocation();
			case XpectPackage.XPECT_ARGUMENT: return createXpectArgument();
			case XpectPackage.MEMBER: return createMember();
			case XpectPackage.TEXT: return createText();
			case XpectPackage.ASSIGNMENT: return createAssignment();
			case XpectPackage.VALUE: return createValue();
			case XpectPackage.COMPONENT: return createComponent();
			case XpectPackage.LITERAL: return createLiteral();
			case XpectPackage.CLASS_LITERAL: return createClassLiteral();
			case XpectPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case XpectPackage.INT_LITERAL: return createIntLiteral();
			case XpectPackage.STRING_LITERAL: return createStringLiteral();
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
			case XpectPackage.STATEMENT_RELATED_REGION:
				return createStatementRelatedRegionFromString(eDataType, initialValue);
			case XpectPackage.ISETUP_INITIALIZER:
				return createISetupInitializerFromString(eDataType, initialValue);
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
			case XpectPackage.STATEMENT_RELATED_REGION:
				return convertStatementRelatedRegionToString(eDataType, instanceValue);
			case XpectPackage.ISETUP_INITIALIZER:
				return convertISetupInitializerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectFile createXpectFile()
	{
		XpectFileImplCustom xpectFile = new XpectFileImplCustom();
		return xpectFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectTest createXpectTest()
	{
		XpectTestImplCustom xpectTest = new XpectTestImplCustom();
		return xpectTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectIgnore createXpectIgnore()
	{
		XpectIgnoreImpl xpectIgnore = new XpectIgnoreImpl();
		return xpectIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectInvocation createXpectInvocation()
	{
		XpectInvocationImplCustom xpectInvocation = new XpectInvocationImplCustom();
		return xpectInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectArgument createXpectArgument()
	{
		XpectArgumentImplCustom xpectArgument = new XpectArgumentImplCustom();
		return xpectArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember()
	{
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText()
	{
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment()
	{
		AssignmentImplCustom assignment = new AssignmentImplCustom();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue()
	{
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent()
	{
		ComponentImplCustom component = new ComponentImplCustom();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral()
	{
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLiteral createClassLiteral()
	{
		ClassLiteralImpl classLiteral = new ClassLiteralImpl();
		return classLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral()
	{
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntLiteral createIntLiteral()
	{
		IntLiteralImpl intLiteral = new IntLiteralImpl();
		return intLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral()
	{
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatementRelatedRegion createStatementRelatedRegionFromString(EDataType eDataType, String initialValue)
	{
		return (IStatementRelatedRegion)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatementRelatedRegionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISetupInitializer<?> createISetupInitializerFromString(EDataType eDataType, String initialValue)
	{
		return (ISetupInitializer<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISetupInitializerToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XpectPackage getXpectPackage()
	{
		return (XpectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XpectPackage getPackage()
	{
		return XpectPackage.eINSTANCE;
	}

} //XpectFactoryImpl
