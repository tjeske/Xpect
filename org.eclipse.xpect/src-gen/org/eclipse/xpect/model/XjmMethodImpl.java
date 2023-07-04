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

import java.lang.reflect.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpect.XjmMethod;
import org.eclipse.xpect.XjmTest;
import org.eclipse.xpect.XpectJavaModelPackage;

import org.eclipse.xtext.common.types.JvmOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xjm Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.model.XjmMethodImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XjmMethodImpl#getJvmMethod <em>Jvm Method</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XjmMethodImpl#getJavaMethod <em>Java Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XjmMethodImpl extends XjmElementImplCustom implements XjmMethod
{
	/**
	 * The cached value of the '{@link #getJvmMethod() <em>Jvm Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmMethod()
	 * @generated
	 * @ordered
	 */
	protected JvmOperation jvmMethod;

	/**
	 * The default value of the '{@link #getJavaMethod() <em>Java Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method JAVA_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaMethod() <em>Java Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected Method javaMethod = JAVA_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XjmMethodImpl()
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
		return XpectJavaModelPackage.Literals.XJM_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XjmTest getTest()
	{
		if (eContainerFeatureID() != XpectJavaModelPackage.XJM_METHOD__TEST) return null;
		return (XjmTest)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JvmOperation getJvmMethod()
	{
		return jvmMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJvmMethod(JvmOperation newJvmMethod)
	{
		JvmOperation oldJvmMethod = jvmMethod;
		jvmMethod = newJvmMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectJavaModelPackage.XJM_METHOD__JVM_METHOD, oldJvmMethod, jvmMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getJavaMethod()
	{
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XJM_METHOD__TEST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, XpectJavaModelPackage.XJM_METHOD__TEST, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case XpectJavaModelPackage.XJM_METHOD__TEST:
				return eBasicSetContainer(null, XpectJavaModelPackage.XJM_METHOD__TEST, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case XpectJavaModelPackage.XJM_METHOD__TEST:
				return eInternalContainer().eInverseRemove(this, XpectJavaModelPackage.XJM_TEST__METHODS, XjmTest.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case XpectJavaModelPackage.XJM_METHOD__TEST:
				return getTest();
			case XpectJavaModelPackage.XJM_METHOD__JVM_METHOD:
				return getJvmMethod();
			case XpectJavaModelPackage.XJM_METHOD__JAVA_METHOD:
				return getJavaMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XJM_METHOD__JVM_METHOD:
				setJvmMethod((JvmOperation)newValue);
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
			case XpectJavaModelPackage.XJM_METHOD__JVM_METHOD:
				setJvmMethod((JvmOperation)null);
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
			case XpectJavaModelPackage.XJM_METHOD__TEST:
				return getTest() != null;
			case XpectJavaModelPackage.XJM_METHOD__JVM_METHOD:
				return jvmMethod != null;
			case XpectJavaModelPackage.XJM_METHOD__JAVA_METHOD:
				return JAVA_METHOD_EDEFAULT == null ? javaMethod != null : !JAVA_METHOD_EDEFAULT.equals(javaMethod);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (javaMethod: ");
		result.append(javaMethod);
		result.append(')');
		return result.toString();
	}

} //XjmMethodImpl
