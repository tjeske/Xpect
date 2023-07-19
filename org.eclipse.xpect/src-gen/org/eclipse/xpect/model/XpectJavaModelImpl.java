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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpect.Environment;
import org.eclipse.xpect.XjmContribution;
import org.eclipse.xpect.XjmMethod;
import org.eclipse.xpect.XjmTest;
import org.eclipse.xpect.XpectJavaModel;
import org.eclipse.xpect.XpectJavaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xpect Java Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.model.XpectJavaModelImpl#getTestOrSuite <em>Test Or Suite</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectJavaModelImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectJavaModelImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectJavaModelImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XpectJavaModelImpl extends EObjectImpl implements XpectJavaModel
{
	/**
	 * The cached value of the '{@link #getTestOrSuite() <em>Test Or Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestOrSuite()
	 * @generated
	 * @ordered
	 */
	protected XjmTest testOrSuite;

	/**
	 * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<XjmContribution> contributions;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<XjmTest> tests;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, XjmMethod> methods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XpectJavaModelImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return XpectJavaModelPackage.Literals.XPECT_JAVA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmTest getTestOrSuite()
	{
		return testOrSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestOrSuite(XjmTest newTestOrSuite)
	{
		XjmTest oldTestOrSuite = testOrSuite;
		testOrSuite = newTestOrSuite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectJavaModelPackage.XPECT_JAVA_MODEL__TEST_OR_SUITE, oldTestOrSuite, testOrSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XjmContribution> getContributions()
	{
		if (contributions == null)
		{
			contributions = new EObjectContainmentEList<XjmContribution>(XjmContribution.class, this, XpectJavaModelPackage.XPECT_JAVA_MODEL__CONTRIBUTIONS);
		}
		return contributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<XjmTest> getTests()
	{
		if (tests == null)
		{
			tests = new EObjectContainmentEList<XjmTest>(XjmTest.class, this, XpectJavaModelPackage.XPECT_JAVA_MODEL__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, XjmMethod> getMethods()
	{
		if (methods == null)
		{
			methods = new EcoreEMap<String,XjmMethod>(XpectJavaModelPackage.Literals.NAME_TO_METHOD_ENTRY, NameToMethodEntryImpl.class, this, XpectJavaModelPackage.XPECT_JAVA_MODEL__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iterable<XjmContribution> getContributions(Class<? extends Annotation> role)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iterable<XjmContribution> getContributions(Class<? extends Annotation> role, Environment environment)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__CONTRIBUTIONS:
				return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TEST_OR_SUITE:
				return getTestOrSuite();
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__CONTRIBUTIONS:
				return getContributions();
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TESTS:
				return getTests();
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__METHODS:
				if (coreType) return getMethods();
				else return getMethods().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TEST_OR_SUITE:
				setTestOrSuite((XjmTest)newValue);
				return;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends XjmContribution>)newValue);
				return;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends XjmTest>)newValue);
				return;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__METHODS:
				((EStructuralFeature.Setting)getMethods()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TEST_OR_SUITE:
				setTestOrSuite((XjmTest)null);
				return;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__CONTRIBUTIONS:
				getContributions().clear();
				return;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TESTS:
				getTests().clear();
				return;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__METHODS:
				getMethods().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TEST_OR_SUITE:
				return testOrSuite != null;
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__CONTRIBUTIONS:
				return contributions != null && !contributions.isEmpty();
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__TESTS:
				return tests != null && !tests.isEmpty();
			case XpectJavaModelPackage.XPECT_JAVA_MODEL__METHODS:
				return methods != null && !methods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XpectJavaModelImpl
