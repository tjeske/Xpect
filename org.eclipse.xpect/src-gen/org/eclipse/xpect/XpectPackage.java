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
 * @see org.eclipse.xpect.XpectFactory
 * @model kind="package"
 * @generated
 */
public interface XpectPackage extends EPackage
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
	String eNS_URI = "http://www.eclipse.org/xpect/Xpect";

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
	XpectPackage eINSTANCE = org.eclipse.xpect.model.XpectPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XpectFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XpectFileImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectFile()
	 * @generated
	 */
	int XPECT_FILE = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_FILE__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.MemberImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FILE = 0;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XpectTestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XpectTestImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectTest()
	 * @generated
	 */
	int XPECT_TEST = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_TEST__FILE = MEMBER__FILE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_TEST__PARAMETERS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_TEST__ASSIGNMENTS = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declared Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_TEST__DECLARED_SUITE = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_TEST_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XpectIgnoreImpl <em>Ignore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XpectIgnoreImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectIgnore()
	 * @generated
	 */
	int XPECT_IGNORE = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_IGNORE__FILE = MEMBER__FILE;

	/**
	 * The number of structural features of the '<em>Ignore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_IGNORE_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XpectInvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XpectInvocationImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectInvocation()
	 * @generated
	 */
	int XPECT_INVOCATION = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__FILE = MEMBER__FILE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__ID = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__IGNORE = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__FIXME = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__METHOD = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__ARGUMENTS = MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Related Regions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__RELATED_REGIONS = MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extended Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION__EXTENDED_REGION = MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_INVOCATION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.XpectArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.XpectArgumentImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectArgument()
	 * @generated
	 */
	int XPECT_ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_ARGUMENT__INDEX = 0;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPECT_ARGUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.TextImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 6;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FILE = MEMBER__FILE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.AbstractComponentImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__ASSIGNMENTS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.AssignmentImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Declared Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DECLARED_TARGET = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.ValueImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 9;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.ComponentImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAMETERS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASSIGNMENTS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_CLASS = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.LiteralImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 11;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.ClassLiteralImpl <em>Class Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.ClassLiteralImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getClassLiteral()
	 * @generated
	 */
	int CLASS_LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL__TYPE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.BooleanLiteralImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.IntLiteralImpl <em>Int Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.IntLiteralImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getIntLiteral()
	 * @generated
	 */
	int INT_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xpect.model.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.model.StringLiteralImpl
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Statement Related Region</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.parameter.IStatementRelatedRegion
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getStatementRelatedRegion()
	 * @generated
	 */
	int STATEMENT_RELATED_REGION = 16;

	/**
	 * The meta object id for the '<em>ISetup Initializer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xpect.setup.ISetupInitializer
	 * @see org.eclipse.xpect.model.XpectPackageImpl#getISetupInitializer()
	 * @generated
	 */
	int ISETUP_INITIALIZER = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XpectFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.xpect.XpectFile
	 * @generated
	 */
	EClass getXpectFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.XpectFile#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.xpect.XpectFile#getMembers()
	 * @see #getXpectFile()
	 * @generated
	 */
	EReference getXpectFile_Members();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XpectTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.eclipse.xpect.XpectTest
	 * @generated
	 */
	EClass getXpectTest();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.XpectTest#getDeclaredSuite <em>Declared Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Suite</em>'.
	 * @see org.eclipse.xpect.XpectTest#getDeclaredSuite()
	 * @see #getXpectTest()
	 * @generated
	 */
	EReference getXpectTest_DeclaredSuite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XpectIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore</em>'.
	 * @see org.eclipse.xpect.XpectIgnore
	 * @generated
	 */
	EClass getXpectIgnore();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XpectInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see org.eclipse.xpect.XpectInvocation
	 * @generated
	 */
	EClass getXpectInvocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XpectInvocation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#getId()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EAttribute getXpectInvocation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XpectInvocation#isIgnore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#isIgnore()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EAttribute getXpectInvocation_Ignore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XpectInvocation#isFixme <em>Fixme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixme</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#isFixme()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EAttribute getXpectInvocation_Fixme();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.XpectInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#getMethod()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EReference getXpectInvocation_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.XpectInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#getArguments()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EReference getXpectInvocation_Arguments();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.xpect.XpectInvocation#getRelatedRegions <em>Related Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Related Regions</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#getRelatedRegions()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EAttribute getXpectInvocation_RelatedRegions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XpectInvocation#getExtendedRegion <em>Extended Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Region</em>'.
	 * @see org.eclipse.xpect.XpectInvocation#getExtendedRegion()
	 * @see #getXpectInvocation()
	 * @generated
	 */
	EAttribute getXpectInvocation_ExtendedRegion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.XpectArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.eclipse.xpect.XpectArgument
	 * @generated
	 */
	EClass getXpectArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.XpectArgument#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.eclipse.xpect.XpectArgument#getIndex()
	 * @see #getXpectArgument()
	 * @generated
	 */
	EAttribute getXpectArgument_Index();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.eclipse.xpect.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xpect.Member#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>File</em>'.
	 * @see org.eclipse.xpect.Member#getFile()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_File();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.eclipse.xpect.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.xpect.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.eclipse.xpect.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.AbstractComponent#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.xpect.AbstractComponent#getParameters()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xpect.AbstractComponent#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.eclipse.xpect.AbstractComponent#getAssignments()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_Assignments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.eclipse.xpect.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.Assignment#getDeclaredTarget <em>Declared Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declared Target</em>'.
	 * @see org.eclipse.xpect.Assignment#getDeclaredTarget()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_DeclaredTarget();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xpect.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.xpect.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.xpect.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.xpect.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.Component#getComponentClass <em>Component Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Class</em>'.
	 * @see org.eclipse.xpect.Component#getComponentClass()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.eclipse.xpect.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.ClassLiteral <em>Class Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Literal</em>'.
	 * @see org.eclipse.xpect.ClassLiteral
	 * @generated
	 */
	EClass getClassLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xpect.ClassLiteral#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.xpect.ClassLiteral#getType()
	 * @see #getClassLiteral()
	 * @generated
	 */
	EReference getClassLiteral_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.eclipse.xpect.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.xpect.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.IntLiteral <em>Int Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Literal</em>'.
	 * @see org.eclipse.xpect.IntLiteral
	 * @generated
	 */
	EClass getIntLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.IntLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.xpect.IntLiteral#getValue()
	 * @see #getIntLiteral()
	 * @generated
	 */
	EAttribute getIntLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xpect.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.eclipse.xpect.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xpect.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.xpect.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.xpect.parameter.IStatementRelatedRegion <em>Statement Related Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Statement Related Region</em>'.
	 * @see org.eclipse.xpect.parameter.IStatementRelatedRegion
	 * @model instanceClass="org.eclipse.xpect.parameter.IStatementRelatedRegion"
	 * @generated
	 */
	EDataType getStatementRelatedRegion();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.xpect.setup.ISetupInitializer <em>ISetup Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ISetup Initializer</em>'.
	 * @see org.eclipse.xpect.setup.ISetupInitializer
	 * @model instanceClass="org.eclipse.xpect.setup.ISetupInitializer" typeParameters="T"
	 * @generated
	 */
	EDataType getISetupInitializer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XpectFactory getXpectFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XpectFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XpectFileImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectFile()
		 * @generated
		 */
		EClass XPECT_FILE = eINSTANCE.getXpectFile();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_FILE__MEMBERS = eINSTANCE.getXpectFile_Members();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XpectTestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XpectTestImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectTest()
		 * @generated
		 */
		EClass XPECT_TEST = eINSTANCE.getXpectTest();

		/**
		 * The meta object literal for the '<em><b>Declared Suite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_TEST__DECLARED_SUITE = eINSTANCE.getXpectTest_DeclaredSuite();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XpectIgnoreImpl <em>Ignore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XpectIgnoreImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectIgnore()
		 * @generated
		 */
		EClass XPECT_IGNORE = eINSTANCE.getXpectIgnore();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XpectInvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XpectInvocationImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectInvocation()
		 * @generated
		 */
		EClass XPECT_INVOCATION = eINSTANCE.getXpectInvocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPECT_INVOCATION__ID = eINSTANCE.getXpectInvocation_Id();

		/**
		 * The meta object literal for the '<em><b>Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPECT_INVOCATION__IGNORE = eINSTANCE.getXpectInvocation_Ignore();

		/**
		 * The meta object literal for the '<em><b>Fixme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPECT_INVOCATION__FIXME = eINSTANCE.getXpectInvocation_Fixme();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_INVOCATION__METHOD = eINSTANCE.getXpectInvocation_Method();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPECT_INVOCATION__ARGUMENTS = eINSTANCE.getXpectInvocation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Related Regions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPECT_INVOCATION__RELATED_REGIONS = eINSTANCE.getXpectInvocation_RelatedRegions();

		/**
		 * The meta object literal for the '<em><b>Extended Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPECT_INVOCATION__EXTENDED_REGION = eINSTANCE.getXpectInvocation_ExtendedRegion();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.XpectArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.XpectArgumentImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getXpectArgument()
		 * @generated
		 */
		EClass XPECT_ARGUMENT = eINSTANCE.getXpectArgument();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPECT_ARGUMENT__INDEX = eINSTANCE.getXpectArgument_Index();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.MemberImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__FILE = eINSTANCE.getMember_File();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.TextImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.AbstractComponentImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__PARAMETERS = eINSTANCE.getAbstractComponent_Parameters();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__ASSIGNMENTS = eINSTANCE.getAbstractComponent_Assignments();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.AssignmentImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Declared Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__DECLARED_TARGET = eINSTANCE.getAssignment_DeclaredTarget();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.ValueImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.ComponentImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_CLASS = eINSTANCE.getComponent_ComponentClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.LiteralImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.ClassLiteralImpl <em>Class Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.ClassLiteralImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getClassLiteral()
		 * @generated
		 */
		EClass CLASS_LITERAL = eINSTANCE.getClassLiteral();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LITERAL__TYPE = eINSTANCE.getClassLiteral_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.BooleanLiteralImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.IntLiteralImpl <em>Int Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.IntLiteralImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getIntLiteral()
		 * @generated
		 */
		EClass INT_LITERAL = eINSTANCE.getIntLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.xpect.model.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.model.StringLiteralImpl
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '<em>Statement Related Region</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.parameter.IStatementRelatedRegion
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getStatementRelatedRegion()
		 * @generated
		 */
		EDataType STATEMENT_RELATED_REGION = eINSTANCE.getStatementRelatedRegion();

		/**
		 * The meta object literal for the '<em>ISetup Initializer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xpect.setup.ISetupInitializer
		 * @see org.eclipse.xpect.model.XpectPackageImpl#getISetupInitializer()
		 * @generated
		 */
		EDataType ISETUP_INITIALIZER = eINSTANCE.getISetupInitializer();

	}

} //XpectPackage
