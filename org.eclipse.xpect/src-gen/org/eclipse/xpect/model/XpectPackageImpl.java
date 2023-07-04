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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xpect.AbstractComponent;
import org.eclipse.xpect.Assignment;
import org.eclipse.xpect.BooleanLiteral;
import org.eclipse.xpect.ClassLiteral;
import org.eclipse.xpect.Component;
import org.eclipse.xpect.IntLiteral;
import org.eclipse.xpect.Literal;
import org.eclipse.xpect.Member;
import org.eclipse.xpect.StringLiteral;
import org.eclipse.xpect.Text;
import org.eclipse.xpect.Value;
import org.eclipse.xpect.XpectArgument;
import org.eclipse.xpect.XpectFactory;
import org.eclipse.xpect.XpectFile;
import org.eclipse.xpect.XpectIgnore;
import org.eclipse.xpect.XpectInvocation;
import org.eclipse.xpect.XpectJavaModelPackage;
import org.eclipse.xpect.XpectPackage;
import org.eclipse.xpect.XpectTest;

import org.eclipse.xpect.parameter.IStatementRelatedRegion;

import org.eclipse.xpect.setup.ISetupInitializer;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XpectPackageImpl extends EPackageImpl implements XpectPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpectFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpectTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpectIgnoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpectInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpectArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statementRelatedRegionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iSetupInitializerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xpect.XpectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XpectPackageImpl()
	{
		super(eNS_URI, XpectFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link XpectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XpectPackage init()
	{
		if (isInited) return (XpectPackage)EPackage.Registry.INSTANCE.getEPackage(XpectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXpectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XpectPackageImpl theXpectPackage = registeredXpectPackage instanceof XpectPackageImpl ? (XpectPackageImpl)registeredXpectPackage : new XpectPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XpectJavaModelPackage.eNS_URI);
		XpectJavaModelPackageImpl theXpectJavaModelPackage = (XpectJavaModelPackageImpl)(registeredPackage instanceof XpectJavaModelPackageImpl ? registeredPackage : XpectJavaModelPackage.eINSTANCE);

		// Create package meta-data objects
		theXpectPackage.createPackageContents();
		theXpectJavaModelPackage.createPackageContents();

		// Initialize created meta-data
		theXpectPackage.initializePackageContents();
		theXpectJavaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXpectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XpectPackage.eNS_URI, theXpectPackage);
		return theXpectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXpectFile()
	{
		return xpectFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectFile_Members()
	{
		return (EReference)xpectFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXpectTest()
	{
		return xpectTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectTest_DeclaredSuite()
	{
		return (EReference)xpectTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXpectIgnore()
	{
		return xpectIgnoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXpectInvocation()
	{
		return xpectInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXpectInvocation_Id()
	{
		return (EAttribute)xpectInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXpectInvocation_Ignore()
	{
		return (EAttribute)xpectInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXpectInvocation_Fixme()
	{
		return (EAttribute)xpectInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectInvocation_Method()
	{
		return (EReference)xpectInvocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectInvocation_Arguments()
	{
		return (EReference)xpectInvocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXpectInvocation_RelatedRegions()
	{
		return (EAttribute)xpectInvocationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXpectInvocation_ExtendedRegion()
	{
		return (EAttribute)xpectInvocationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXpectArgument()
	{
		return xpectArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXpectArgument_Index()
	{
		return (EAttribute)xpectArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMember()
	{
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMember_File()
	{
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText()
	{
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Text()
	{
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractComponent()
	{
		return abstractComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractComponent_Parameters()
	{
		return (EReference)abstractComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractComponent_Assignments()
	{
		return (EReference)abstractComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment()
	{
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_DeclaredTarget()
	{
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Value()
	{
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue()
	{
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent()
	{
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ComponentClass()
	{
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral()
	{
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassLiteral()
	{
		return classLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassLiteral_Type()
	{
		return (EReference)classLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral()
	{
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanLiteral_Value()
	{
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntLiteral()
	{
		return intLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntLiteral_Value()
	{
		return (EAttribute)intLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral()
	{
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteral_Value()
	{
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStatementRelatedRegion()
	{
		return statementRelatedRegionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getISetupInitializer()
	{
		return iSetupInitializerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XpectFactory getXpectFactory()
	{
		return (XpectFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xpectFileEClass = createEClass(XPECT_FILE);
		createEReference(xpectFileEClass, XPECT_FILE__MEMBERS);

		xpectTestEClass = createEClass(XPECT_TEST);
		createEReference(xpectTestEClass, XPECT_TEST__DECLARED_SUITE);

		xpectIgnoreEClass = createEClass(XPECT_IGNORE);

		xpectInvocationEClass = createEClass(XPECT_INVOCATION);
		createEAttribute(xpectInvocationEClass, XPECT_INVOCATION__ID);
		createEAttribute(xpectInvocationEClass, XPECT_INVOCATION__IGNORE);
		createEAttribute(xpectInvocationEClass, XPECT_INVOCATION__FIXME);
		createEReference(xpectInvocationEClass, XPECT_INVOCATION__METHOD);
		createEReference(xpectInvocationEClass, XPECT_INVOCATION__ARGUMENTS);
		createEAttribute(xpectInvocationEClass, XPECT_INVOCATION__RELATED_REGIONS);
		createEAttribute(xpectInvocationEClass, XPECT_INVOCATION__EXTENDED_REGION);

		xpectArgumentEClass = createEClass(XPECT_ARGUMENT);
		createEAttribute(xpectArgumentEClass, XPECT_ARGUMENT__INDEX);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__FILE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__PARAMETERS);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__ASSIGNMENTS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__DECLARED_TARGET);
		createEReference(assignmentEClass, ASSIGNMENT__VALUE);

		valueEClass = createEClass(VALUE);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__COMPONENT_CLASS);

		literalEClass = createEClass(LITERAL);

		classLiteralEClass = createEClass(CLASS_LITERAL);
		createEReference(classLiteralEClass, CLASS_LITERAL__TYPE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		intLiteralEClass = createEClass(INT_LITERAL);
		createEAttribute(intLiteralEClass, INT_LITERAL__VALUE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		// Create data types
		statementRelatedRegionEDataType = createEDataType(STATEMENT_RELATED_REGION);
		iSetupInitializerEDataType = createEDataType(ISETUP_INITIALIZER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XpectJavaModelPackage theXpectJavaModelPackage = (XpectJavaModelPackage)EPackage.Registry.INSTANCE.getEPackage(XpectJavaModelPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(iSetupInitializerEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		xpectTestEClass.getESuperTypes().add(this.getMember());
		xpectTestEClass.getESuperTypes().add(this.getAbstractComponent());
		xpectIgnoreEClass.getESuperTypes().add(this.getMember());
		xpectInvocationEClass.getESuperTypes().add(this.getMember());
		textEClass.getESuperTypes().add(this.getMember());
		componentEClass.getESuperTypes().add(this.getValue());
		componentEClass.getESuperTypes().add(this.getAbstractComponent());
		literalEClass.getESuperTypes().add(this.getValue());
		classLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		intLiteralEClass.getESuperTypes().add(this.getLiteral());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());

		// Initialize classes and features; add operations and parameters
		initEClass(xpectFileEClass, XpectFile.class, "XpectFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXpectFile_Members(), this.getMember(), this.getMember_File(), "members", null, 0, -1, XpectFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(xpectFileEClass, ecorePackage.getEBoolean(), "isIgnore", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(xpectFileEClass, this.getXpectTest(), "getTest", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(xpectFileEClass, null, "getInvocations", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theTypesPackage.getIterable());
		EGenericType g2 = createEGenericType(this.getXpectInvocation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(xpectFileEClass, this.getXpectInvocation(), "getInvocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xpectFileEClass, this.getXpectInvocation(), "getInvocationAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(xpectFileEClass, ecorePackage.getEString(), "getDocument", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(xpectFileEClass, theXpectJavaModelPackage.getXpectJavaModel(), "getJavaModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xpectFileEClass, null, "createSetupInitializer", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getISetupInitializer());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(xpectTestEClass, XpectTest.class, "XpectTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXpectTest_DeclaredSuite(), theTypesPackage.getJvmDeclaredType(), null, "declaredSuite", null, 0, 1, XpectTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xpectIgnoreEClass, XpectIgnore.class, "XpectIgnore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xpectInvocationEClass, XpectInvocation.class, "XpectInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXpectInvocation_Id(), ecorePackage.getEString(), "id", null, 0, 1, XpectInvocation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXpectInvocation_Ignore(), ecorePackage.getEBoolean(), "ignore", null, 0, 1, XpectInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXpectInvocation_Fixme(), ecorePackage.getEBoolean(), "fixme", null, 0, 1, XpectInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXpectInvocation_Method(), theXpectJavaModelPackage.getXjmXpectMethod(), null, "method", null, 0, 1, XpectInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXpectInvocation_Arguments(), this.getXpectArgument(), null, "arguments", null, 0, -1, XpectInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXpectInvocation_RelatedRegions(), this.getStatementRelatedRegion(), "relatedRegions", null, 0, -1, XpectInvocation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getXpectInvocation_ExtendedRegion(), this.getStatementRelatedRegion(), "extendedRegion", null, 0, 1, XpectInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(xpectInvocationEClass, ecorePackage.getEString(), "getMethodName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xpectInvocationEClass, null, "getRelatedRegion", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getStatementRelatedRegion());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		addEOperation(xpectInvocationEClass, this.getXpectFile(), "getFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xpectArgumentEClass, XpectArgument.class, "XpectArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXpectArgument_Index(), ecorePackage.getEInt(), "index", null, 0, 1, XpectArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(xpectArgumentEClass, null, "getJavaType", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(xpectArgumentEClass, this.getXpectInvocation(), "getStatement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xpectArgumentEClass, null, "getAnnotationOrDefault", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(theXpectJavaModelPackage.getJavaAnnotation());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "annotationType", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(xpectArgumentEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "showClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "showMethod", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(xpectArgumentEClass, theXpectJavaModelPackage.getJavaAnnotation(), "getStateAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_File(), this.getXpectFile(), this.getXpectFile_Members(), "file", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComponent_Parameters(), this.getLiteral(), null, "parameters", null, 0, -1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_Assignments(), this.getAssignment(), null, "assignments", null, 0, -1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_DeclaredTarget(), theTypesPackage.getJvmOperation(), null, "declaredTarget", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Value(), this.getValue(), null, "value", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(assignmentEClass, this.getAbstractComponent(), "getInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ComponentClass(), theTypesPackage.getJvmDeclaredType(), null, "componentClass", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(componentEClass, this.getAssignment(), "getAssignment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classLiteralEClass, ClassLiteral.class, "ClassLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassLiteral_Type(), theTypesPackage.getJvmDeclaredType(), null, "type", null, 0, 1, ClassLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intLiteralEClass, IntLiteral.class, "IntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(statementRelatedRegionEDataType, IStatementRelatedRegion.class, "StatementRelatedRegion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iSetupInitializerEDataType, ISetupInitializer.class, "ISetupInitializer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XpectPackageImpl
