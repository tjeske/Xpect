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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xpect.XpectJavaModelFactory
 * @model kind="package"
 * @generated
 */
public interface XpectJavaModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xpect";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xpect/XpectJavaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xpect";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XpectJavaModelPackage eINSTANCE = org.eclipse.xpect.model.XpectJavaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XpectJavaModelImpl <em>Xpect Java Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XpectJavaModelImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXpectJavaModel()
	 * @generated
	 */
	int XPECT_JAVA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Test Or Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_JAVA_MODEL__TEST_OR_SUITE = 0;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_JAVA_MODEL__CONTRIBUTIONS = 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_JAVA_MODEL__TESTS = 2;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_JAVA_MODEL__METHODS = 3;

	/**
	 * The number of structural features of the '<em>Xpect Java Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_JAVA_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmElementImpl <em>Xjm Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmElementImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmElement()
	 * @generated
	 */
	int XJM_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_ELEMENT__IMPORTS = 0;

	/**
	 * The number of structural features of the '<em>Xjm Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmClassImpl <em>Xjm Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmClassImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmClass()
	 * @generated
	 */
	int XJM_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CLASS__IMPORTS = XJM_ELEMENT__IMPORTS;

	/**
	 * The feature id for the '<em><b>Jvm Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CLASS__JVM_CLASS = XJM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CLASS__JAVA_CLASS = XJM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Xjm Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CLASS_FEATURE_COUNT = XJM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmTestImpl <em>Xjm Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmTestImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmTest()
	 * @generated
	 */
	int XJM_TEST = 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST__IMPORTS = XJM_CLASS__IMPORTS;

	/**
	 * The feature id for the '<em><b>Jvm Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST__JVM_CLASS = XJM_CLASS__JVM_CLASS;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST__JAVA_CLASS = XJM_CLASS__JAVA_CLASS;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST__METHODS = XJM_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xjm Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST_FEATURE_COUNT = XJM_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmContributionImpl <em>Xjm Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmContributionImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmContribution()
	 * @generated
	 */
	int XJM_CONTRIBUTION = 4;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__IMPORTS = XJM_CLASS__IMPORTS;

	/**
	 * The feature id for the '<em><b>Jvm Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__JVM_CLASS = XJM_CLASS__JVM_CLASS;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__JAVA_CLASS = XJM_CLASS__JAVA_CLASS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__ROLES = XJM_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__ENVIRONMENTS = XJM_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deactivation Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__DEACTIVATION_REASON = XJM_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replaced By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION__REPLACED_BY = XJM_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xjm Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_CONTRIBUTION_FEATURE_COUNT = XJM_CLASS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmMethodImpl <em>Xjm Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmMethodImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmMethod()
	 * @generated
	 */
	int XJM_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_METHOD__IMPORTS = XJM_ELEMENT__IMPORTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_METHOD__TEST = XJM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jvm Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_METHOD__JVM_METHOD = XJM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_METHOD__JAVA_METHOD = XJM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xjm Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_METHOD_FEATURE_COUNT = XJM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmTestMethodImpl <em>Xjm Test Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmTestMethodImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmTestMethod()
	 * @generated
	 */
	int XJM_TEST_METHOD = 6;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST_METHOD__IMPORTS = XJM_METHOD__IMPORTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST_METHOD__TEST = XJM_METHOD__TEST;

	/**
	 * The feature id for the '<em><b>Jvm Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST_METHOD__JVM_METHOD = XJM_METHOD__JVM_METHOD;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST_METHOD__JAVA_METHOD = XJM_METHOD__JAVA_METHOD;

	/**
	 * The number of structural features of the '<em>Xjm Test Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_TEST_METHOD_FEATURE_COUNT = XJM_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XjmXpectMethodImpl <em>Xjm Xpect Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XjmXpectMethodImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmXpectMethod()
	 * @generated
	 */
	int XJM_XPECT_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_XPECT_METHOD__IMPORTS = XJM_METHOD__IMPORTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_XPECT_METHOD__TEST = XJM_METHOD__TEST;

	/**
	 * The feature id for the '<em><b>Jvm Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_XPECT_METHOD__JVM_METHOD = XJM_METHOD__JVM_METHOD;

	/**
	 * The feature id for the '<em><b>Java Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_XPECT_METHOD__JAVA_METHOD = XJM_METHOD__JAVA_METHOD;

	/**
	 * The number of structural features of the '<em>Xjm Xpect Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XJM_XPECT_METHOD_FEATURE_COUNT = XJM_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.NameToMethodEntryImpl <em>Name To Method Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.NameToMethodEntryImpl
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getNameToMethodEntry()
	 * @generated
	 */
	int NAME_TO_METHOD_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_METHOD_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_METHOD_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Name To Method Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TO_METHOD_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.Environment <em>Environment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.Environment
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 9;

	/**
	 * The meta object id for the '<em>Java Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.Method
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getJavaMethod()
	 * @generated
	 */
	int JAVA_METHOD = 10;

	/**
	 * The meta object id for the '<em>Java Annotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.annotation.Annotation
	 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getJavaAnnotation()
	 * @generated
	 */
	int JAVA_ANNOTATION = 11;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XpectJavaModel <em>Xpect Java Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xpect Java Model</em>'.
	 * @see org.eclipse.xpect.XpectJavaModel
	 * @generated
	 */
	EClass getXpectJavaModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.XpectJavaModel#getTestOrSuite <em>Test Or Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Or Suite</em>'.
	 * @see org.eclipse.xpect.XpectJavaModel#getTestOrSuite()
	 * @see #getXpectJavaModel()
	 * @generated
	 */
	EReference getXpectJavaModel_TestOrSuite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.XpectJavaModel#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributions</em>'.
	 * @see org.eclipse.xpect.XpectJavaModel#getContributions()
	 * @see #getXpectJavaModel()
	 * @generated
	 */
	EReference getXpectJavaModel_Contributions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.XpectJavaModel#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.eclipse.xpect.XpectJavaModel#getTests()
	 * @see #getXpectJavaModel()
	 * @generated
	 */
	EReference getXpectJavaModel_Tests();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.xpect.XpectJavaModel#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Methods</em>'.
	 * @see org.eclipse.xpect.XpectJavaModel#getMethods()
	 * @see #getXpectJavaModel()
	 * @generated
	 */
	EReference getXpectJavaModel_Methods();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmElement <em>Xjm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Element</em>'.
	 * @see org.eclipse.xpect.XjmElement
	 * @generated
	 */
	EClass getXjmElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xpect.XjmElement#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.eclipse.xpect.XjmElement#getImports()
	 * @see #getXjmElement()
	 * @generated
	 */
	EReference getXjmElement_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmClass <em>Xjm Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Class</em>'.
	 * @see org.eclipse.xpect.XjmClass
	 * @generated
	 */
	EClass getXjmClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.XjmClass#getJvmClass <em>Jvm Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jvm Class</em>'.
	 * @see org.eclipse.xpect.XjmClass#getJvmClass()
	 * @see #getXjmClass()
	 * @generated
	 */
	EReference getXjmClass_JvmClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XjmClass#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class</em>'.
	 * @see org.eclipse.xpect.XjmClass#getJavaClass()
	 * @see #getXjmClass()
	 * @generated
	 */
	EAttribute getXjmClass_JavaClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmTest <em>Xjm Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Test</em>'.
	 * @see org.eclipse.xpect.XjmTest
	 * @generated
	 */
	EClass getXjmTest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.XjmTest#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclipse.xpect.XjmTest#getMethods()
	 * @see #getXjmTest()
	 * @generated
	 */
	EReference getXjmTest_Methods();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmContribution <em>Xjm Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Contribution</em>'.
	 * @see org.eclipse.xpect.XjmContribution
	 * @generated
	 */
	EClass getXjmContribution();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.xpect.XjmContribution#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.eclipse.xpect.XjmContribution#getRoles()
	 * @see #getXjmContribution()
	 * @generated
	 */
	EAttribute getXjmContribution_Roles();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.xpect.XjmContribution#getEnvironments <em>Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Environments</em>'.
	 * @see org.eclipse.xpect.XjmContribution#getEnvironments()
	 * @see #getXjmContribution()
	 * @generated
	 */
	EAttribute getXjmContribution_Environments();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XjmContribution#getDeactivationReason <em>Deactivation Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deactivation Reason</em>'.
	 * @see org.eclipse.xpect.XjmContribution#getDeactivationReason()
	 * @see #getXjmContribution()
	 * @generated
	 */
	EAttribute getXjmContribution_DeactivationReason();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.XjmContribution#getReplacedBy <em>Replaced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replaced By</em>'.
	 * @see org.eclipse.xpect.XjmContribution#getReplacedBy()
	 * @see #getXjmContribution()
	 * @generated
	 */
	EReference getXjmContribution_ReplacedBy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmMethod <em>Xjm Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Method</em>'.
	 * @see org.eclipse.xpect.XjmMethod
	 * @generated
	 */
	EClass getXjmMethod();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xpect.XjmMethod#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Test</em>'.
	 * @see org.eclipse.xpect.XjmMethod#getTest()
	 * @see #getXjmMethod()
	 * @generated
	 */
	EReference getXjmMethod_Test();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.XjmMethod#getJvmMethod <em>Jvm Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jvm Method</em>'.
	 * @see org.eclipse.xpect.XjmMethod#getJvmMethod()
	 * @see #getXjmMethod()
	 * @generated
	 */
	EReference getXjmMethod_JvmMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XjmMethod#getJavaMethod <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Method</em>'.
	 * @see org.eclipse.xpect.XjmMethod#getJavaMethod()
	 * @see #getXjmMethod()
	 * @generated
	 */
	EAttribute getXjmMethod_JavaMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmTestMethod <em>Xjm Test Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Test Method</em>'.
	 * @see org.eclipse.xpect.XjmTestMethod
	 * @generated
	 */
	EClass getXjmTestMethod();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XjmXpectMethod <em>Xjm Xpect Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xjm Xpect Method</em>'.
	 * @see org.eclipse.xpect.XjmXpectMethod
	 * @generated
	 */
	EClass getXjmXpectMethod();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Name To Method Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name To Method Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.xpect.XjmMethod"
	 * @generated
	 */
	EClass getNameToMethodEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNameToMethodEntry()
	 * @generated
	 */
	EAttribute getNameToMethodEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getNameToMethodEntry()
	 * @generated
	 */
	EReference getNameToMethodEntry_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.xpect.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Environment</em>'.
	 * @see org.eclipse.xpect.Environment
	 * @generated
	 */
	EEnum getEnvironment();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.Method <em>Java Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Method</em>'.
	 * @see java.lang.reflect.Method
	 * @model instanceClass="java.lang.reflect.Method"
	 * @generated
	 */
	EDataType getJavaMethod();

	/**
	 * Returns the meta object for data type '{@link java.lang.annotation.Annotation <em>Java Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Annotation</em>'.
	 * @see java.lang.annotation.Annotation
	 * @model instanceClass="java.lang.annotation.Annotation"
	 * @generated
	 */
	EDataType getJavaAnnotation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XpectJavaModelFactory getXpectJavaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XpectJavaModelImpl <em>Xpect Java Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XpectJavaModelImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXpectJavaModel()
		 * @generated
		 */
		EClass XPECT_JAVA_MODEL = eINSTANCE.getXpectJavaModel();

		/**
		 * The meta object literal for the '<em><b>Test Or Suite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_JAVA_MODEL__TEST_OR_SUITE = eINSTANCE.getXpectJavaModel_TestOrSuite();

		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_JAVA_MODEL__CONTRIBUTIONS = eINSTANCE.getXpectJavaModel_Contributions();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_JAVA_MODEL__TESTS = eINSTANCE.getXpectJavaModel_Tests();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_JAVA_MODEL__METHODS = eINSTANCE.getXpectJavaModel_Methods();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmElementImpl <em>Xjm Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmElementImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmElement()
		 * @generated
		 */
		EClass XJM_ELEMENT = eINSTANCE.getXjmElement();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XJM_ELEMENT__IMPORTS = eINSTANCE.getXjmElement_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmClassImpl <em>Xjm Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmClassImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmClass()
		 * @generated
		 */
		EClass XJM_CLASS = eINSTANCE.getXjmClass();

		/**
		 * The meta object literal for the '<em><b>Jvm Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XJM_CLASS__JVM_CLASS = eINSTANCE.getXjmClass_JvmClass();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XJM_CLASS__JAVA_CLASS = eINSTANCE.getXjmClass_JavaClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmTestImpl <em>Xjm Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmTestImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmTest()
		 * @generated
		 */
		EClass XJM_TEST = eINSTANCE.getXjmTest();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XJM_TEST__METHODS = eINSTANCE.getXjmTest_Methods();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmContributionImpl <em>Xjm Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmContributionImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmContribution()
		 * @generated
		 */
		EClass XJM_CONTRIBUTION = eINSTANCE.getXjmContribution();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XJM_CONTRIBUTION__ROLES = eINSTANCE.getXjmContribution_Roles();

		/**
		 * The meta object literal for the '<em><b>Environments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XJM_CONTRIBUTION__ENVIRONMENTS = eINSTANCE.getXjmContribution_Environments();

		/**
		 * The meta object literal for the '<em><b>Deactivation Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XJM_CONTRIBUTION__DEACTIVATION_REASON = eINSTANCE.getXjmContribution_DeactivationReason();

		/**
		 * The meta object literal for the '<em><b>Replaced By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XJM_CONTRIBUTION__REPLACED_BY = eINSTANCE.getXjmContribution_ReplacedBy();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmMethodImpl <em>Xjm Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmMethodImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmMethod()
		 * @generated
		 */
		EClass XJM_METHOD = eINSTANCE.getXjmMethod();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XJM_METHOD__TEST = eINSTANCE.getXjmMethod_Test();

		/**
		 * The meta object literal for the '<em><b>Jvm Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XJM_METHOD__JVM_METHOD = eINSTANCE.getXjmMethod_JvmMethod();

		/**
		 * The meta object literal for the '<em><b>Java Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XJM_METHOD__JAVA_METHOD = eINSTANCE.getXjmMethod_JavaMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmTestMethodImpl <em>Xjm Test Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmTestMethodImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmTestMethod()
		 * @generated
		 */
		EClass XJM_TEST_METHOD = eINSTANCE.getXjmTestMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XjmXpectMethodImpl <em>Xjm Xpect Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XjmXpectMethodImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getXjmXpectMethod()
		 * @generated
		 */
		EClass XJM_XPECT_METHOD = eINSTANCE.getXjmXpectMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.NameToMethodEntryImpl <em>Name To Method Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.NameToMethodEntryImpl
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getNameToMethodEntry()
		 * @generated
		 */
		EClass NAME_TO_METHOD_ENTRY = eINSTANCE.getNameToMethodEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TO_METHOD_ENTRY__KEY = eINSTANCE.getNameToMethodEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_TO_METHOD_ENTRY__VALUE = eINSTANCE.getNameToMethodEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.Environment <em>Environment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.Environment
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getEnvironment()
		 * @generated
		 */
		EEnum ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em>Java Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.Method
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getJavaMethod()
		 * @generated
		 */
		EDataType JAVA_METHOD = eINSTANCE.getJavaMethod();

		/**
		 * The meta object literal for the '<em>Java Annotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.annotation.Annotation
		 * @see org.eclipse.xpect.model.XpectJavaModelPackageImpl#getJavaAnnotation()
		 * @generated
		 */
		EDataType JAVA_ANNOTATION = eINSTANCE.getJavaAnnotation();

	}

} //XpectJavaModelPackage
