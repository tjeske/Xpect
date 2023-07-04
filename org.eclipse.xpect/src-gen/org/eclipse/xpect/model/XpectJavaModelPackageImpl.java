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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xpect.Environment;
import org.eclipse.xpect.XjmClass;
import org.eclipse.xpect.XjmContribution;
import org.eclipse.xpect.XjmElement;
import org.eclipse.xpect.XjmMethod;
import org.eclipse.xpect.XjmTest;
import org.eclipse.xpect.XjmTestMethod;
import org.eclipse.xpect.XjmXpectMethod;
import org.eclipse.xpect.XpectJavaModel;
import org.eclipse.xpect.XpectJavaModelFactory;
import org.eclipse.xpect.XpectJavaModelPackage;
import org.eclipse.xpect.XpectPackage;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XpectJavaModelPackageImpl extends EPackageImpl implements XpectJavaModelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xpectJavaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmContributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmTestMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xjmXpectMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameToMethodEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum environmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaMethodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType javaAnnotationEDataType = null;

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
	 * @see org.eclipse.xpect.XpectJavaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XpectJavaModelPackageImpl()
	{
		super(eNS_URI, XpectJavaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XpectJavaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XpectJavaModelPackage init()
	{
		if (isInited) return (XpectJavaModelPackage)EPackage.Registry.INSTANCE.getEPackage(XpectJavaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXpectJavaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XpectJavaModelPackageImpl theXpectJavaModelPackage = registeredXpectJavaModelPackage instanceof XpectJavaModelPackageImpl ? (XpectJavaModelPackageImpl)registeredXpectJavaModelPackage : new XpectJavaModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XpectPackage.eNS_URI);
		XpectPackageImpl theXpectPackage = (XpectPackageImpl)(registeredPackage instanceof XpectPackageImpl ? registeredPackage : XpectPackage.eINSTANCE);

		// Create package meta-data objects
		theXpectJavaModelPackage.createPackageContents();
		theXpectPackage.createPackageContents();

		// Initialize created meta-data
		theXpectJavaModelPackage.initializePackageContents();
		theXpectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXpectJavaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XpectJavaModelPackage.eNS_URI, theXpectJavaModelPackage);
		return theXpectJavaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXpectJavaModel()
	{
		return xpectJavaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectJavaModel_TestOrSuite()
	{
		return (EReference)xpectJavaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectJavaModel_Contributions()
	{
		return (EReference)xpectJavaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectJavaModel_Tests()
	{
		return (EReference)xpectJavaModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXpectJavaModel_Methods()
	{
		return (EReference)xpectJavaModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmElement()
	{
		return xjmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXjmElement_Imports()
	{
		return (EReference)xjmElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmClass()
	{
		return xjmClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXjmClass_JvmClass()
	{
		return (EReference)xjmClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXjmClass_JavaClass()
	{
		return (EAttribute)xjmClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmTest()
	{
		return xjmTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXjmTest_Methods()
	{
		return (EReference)xjmTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmContribution()
	{
		return xjmContributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXjmContribution_Roles()
	{
		return (EAttribute)xjmContributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXjmContribution_Environments()
	{
		return (EAttribute)xjmContributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXjmContribution_DeactivationReason()
	{
		return (EAttribute)xjmContributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXjmContribution_ReplacedBy()
	{
		return (EReference)xjmContributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmMethod()
	{
		return xjmMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXjmMethod_Test()
	{
		return (EReference)xjmMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXjmMethod_JvmMethod()
	{
		return (EReference)xjmMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXjmMethod_JavaMethod()
	{
		return (EAttribute)xjmMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmTestMethod()
	{
		return xjmTestMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXjmXpectMethod()
	{
		return xjmXpectMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNameToMethodEntry()
	{
		return nameToMethodEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNameToMethodEntry_Key()
	{
		return (EAttribute)nameToMethodEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNameToMethodEntry_Value()
	{
		return (EReference)nameToMethodEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnvironment()
	{
		return environmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaMethod()
	{
		return javaMethodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJavaAnnotation()
	{
		return javaAnnotationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XpectJavaModelFactory getXpectJavaModelFactory()
	{
		return (XpectJavaModelFactory)getEFactoryInstance();
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
		xpectJavaModelEClass = createEClass(XPECT_JAVA_MODEL);
		createEReference(xpectJavaModelEClass, XPECT_JAVA_MODEL__TEST_OR_SUITE);
		createEReference(xpectJavaModelEClass, XPECT_JAVA_MODEL__CONTRIBUTIONS);
		createEReference(xpectJavaModelEClass, XPECT_JAVA_MODEL__TESTS);
		createEReference(xpectJavaModelEClass, XPECT_JAVA_MODEL__METHODS);

		xjmElementEClass = createEClass(XJM_ELEMENT);
		createEReference(xjmElementEClass, XJM_ELEMENT__IMPORTS);

		xjmClassEClass = createEClass(XJM_CLASS);
		createEReference(xjmClassEClass, XJM_CLASS__JVM_CLASS);
		createEAttribute(xjmClassEClass, XJM_CLASS__JAVA_CLASS);

		xjmTestEClass = createEClass(XJM_TEST);
		createEReference(xjmTestEClass, XJM_TEST__METHODS);

		xjmContributionEClass = createEClass(XJM_CONTRIBUTION);
		createEAttribute(xjmContributionEClass, XJM_CONTRIBUTION__ROLES);
		createEAttribute(xjmContributionEClass, XJM_CONTRIBUTION__ENVIRONMENTS);
		createEAttribute(xjmContributionEClass, XJM_CONTRIBUTION__DEACTIVATION_REASON);
		createEReference(xjmContributionEClass, XJM_CONTRIBUTION__REPLACED_BY);

		xjmMethodEClass = createEClass(XJM_METHOD);
		createEReference(xjmMethodEClass, XJM_METHOD__TEST);
		createEReference(xjmMethodEClass, XJM_METHOD__JVM_METHOD);
		createEAttribute(xjmMethodEClass, XJM_METHOD__JAVA_METHOD);

		xjmTestMethodEClass = createEClass(XJM_TEST_METHOD);

		xjmXpectMethodEClass = createEClass(XJM_XPECT_METHOD);

		nameToMethodEntryEClass = createEClass(NAME_TO_METHOD_ENTRY);
		createEAttribute(nameToMethodEntryEClass, NAME_TO_METHOD_ENTRY__KEY);
		createEReference(nameToMethodEntryEClass, NAME_TO_METHOD_ENTRY__VALUE);

		// Create enums
		environmentEEnum = createEEnum(ENVIRONMENT);

		// Create data types
		javaMethodEDataType = createEDataType(JAVA_METHOD);
		javaAnnotationEDataType = createEDataType(JAVA_ANNOTATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xjmClassEClass.getESuperTypes().add(this.getXjmElement());
		xjmTestEClass.getESuperTypes().add(this.getXjmClass());
		xjmContributionEClass.getESuperTypes().add(this.getXjmClass());
		xjmMethodEClass.getESuperTypes().add(this.getXjmElement());
		xjmTestMethodEClass.getESuperTypes().add(this.getXjmMethod());
		xjmXpectMethodEClass.getESuperTypes().add(this.getXjmMethod());

		// Initialize classes and features; add operations and parameters
		initEClass(xpectJavaModelEClass, XpectJavaModel.class, "XpectJavaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXpectJavaModel_TestOrSuite(), this.getXjmTest(), null, "testOrSuite", null, 0, 1, XpectJavaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXpectJavaModel_Contributions(), this.getXjmContribution(), null, "contributions", null, 0, -1, XpectJavaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXpectJavaModel_Tests(), this.getXjmTest(), null, "tests", null, 0, -1, XpectJavaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXpectJavaModel_Methods(), this.getNameToMethodEntry(), null, "methods", null, 0, -1, XpectJavaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(xpectJavaModelEClass, null, "getContributions", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getJavaAnnotation());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "role", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theTypesPackage.getIterable());
		g2 = createEGenericType(this.getXjmContribution());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(xpectJavaModelEClass, null, "getContributions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getJavaAnnotation());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "role", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theTypesPackage.getIterable());
		g2 = createEGenericType(this.getXjmContribution());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(xjmElementEClass, XjmElement.class, "XjmElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXjmElement_Imports(), this.getXjmClass(), null, "imports", null, 0, -1, XjmElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xjmClassEClass, XjmClass.class, "XjmClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXjmClass_JvmClass(), theTypesPackage.getJvmDeclaredType(), null, "jvmClass", null, 0, 1, XjmClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getXjmClass_JavaClass(), g1, "javaClass", null, 0, 1, XjmClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(xjmTestEClass, XjmTest.class, "XjmTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXjmTest_Methods(), this.getXjmMethod(), this.getXjmMethod_Test(), "methods", null, 0, -1, XjmTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xjmContributionEClass, XjmContribution.class, "XjmContribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXjmContribution_Roles(), this.getJavaAnnotation(), "roles", null, 0, -1, XjmContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXjmContribution_Environments(), this.getEnvironment(), "environments", null, 0, -1, XjmContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXjmContribution_DeactivationReason(), ecorePackage.getEString(), "deactivationReason", null, 0, 1, XjmContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXjmContribution_ReplacedBy(), this.getXjmContribution(), null, "replacedBy", null, 0, 1, XjmContribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(xjmContributionEClass, ecorePackage.getEBoolean(), "isActive", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xjmContributionEClass, null, "newInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(xjmMethodEClass, XjmMethod.class, "XjmMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXjmMethod_Test(), this.getXjmTest(), this.getXjmTest_Methods(), "test", null, 0, 1, XjmMethod.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXjmMethod_JvmMethod(), theTypesPackage.getJvmOperation(), null, "jvmMethod", null, 0, 1, XjmMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXjmMethod_JavaMethod(), this.getJavaMethod(), "javaMethod", null, 0, 1, XjmMethod.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(xjmMethodEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xjmTestMethodEClass, XjmTestMethod.class, "XjmTestMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xjmXpectMethodEClass, XjmXpectMethod.class, "XjmXpectMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(xjmXpectMethodEClass, ecorePackage.getEInt(), "getParameterCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameToMethodEntryEClass, Map.Entry.class, "NameToMethodEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameToMethodEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameToMethodEntry_Value(), this.getXjmMethod(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(environmentEEnum, Environment.class, "Environment");
		addEEnumLiteral(environmentEEnum, Environment.STANDALONE_TEST);
		addEEnumLiteral(environmentEEnum, Environment.PLUGIN_TEST);
		addEEnumLiteral(environmentEEnum, Environment.WORKBENCH);

		// Initialize data types
		initEDataType(javaMethodEDataType, Method.class, "JavaMethod", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(javaAnnotationEDataType, Annotation.class, "JavaAnnotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XpectJavaModelPackageImpl
