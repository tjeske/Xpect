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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Environment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.xpect.XpectJavaModelPackage#getEnvironment()
 * @model
 * @generated
 */
public enum Environment implements Enumerator
{
	/**
	 * The '<em><b>STANDALONE TEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDALONE_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	STANDALONE_TEST(0, "STANDALONE_TEST", "STANDALONE_TEST"),

	/**
	 * The '<em><b>PLUGIN TEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUGIN_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	PLUGIN_TEST(1, "PLUGIN_TEST", "PLUGIN_TEST"),

	/**
	 * The '<em><b>WORKBENCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKBENCH_VALUE
	 * @generated
	 * @ordered
	 */
	WORKBENCH(2, "WORKBENCH", "WORKBENCH");

	/**
	 * The '<em><b>STANDALONE TEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDALONE_TEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDALONE_TEST_VALUE = 0;

	/**
	 * The '<em><b>PLUGIN TEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUGIN_TEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLUGIN_TEST_VALUE = 1;

	/**
	 * The '<em><b>WORKBENCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKBENCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WORKBENCH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Environment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Environment[] VALUES_ARRAY =
		new Environment[]
		{
			STANDALONE_TEST,
			PLUGIN_TEST,
			WORKBENCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Environment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Environment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Environment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Environment get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Environment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Environment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Environment getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Environment result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Environment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Environment get(int value)
	{
		switch (value)
		{
			case STANDALONE_TEST_VALUE: return STANDALONE_TEST;
			case PLUGIN_TEST_VALUE: return PLUGIN_TEST;
			case WORKBENCH_VALUE: return WORKBENCH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Environment(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //Environment
