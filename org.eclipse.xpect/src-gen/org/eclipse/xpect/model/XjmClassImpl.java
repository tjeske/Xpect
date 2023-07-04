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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xpect.XjmClass;
import org.eclipse.xpect.XpectJavaModelPackage;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xjm Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xpect.model.XjmClassImpl#getJvmClass <em>Jvm Class</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XjmClassImpl#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XjmClassImpl extends XjmElementImplCustom implements XjmClass
{
	/**
	 * The cached value of the '{@link #getJvmClass() <em>Jvm Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmClass()
	 * @generated
	 * @ordered
	 */
	protected JvmDeclaredType jvmClass;

	/**
	 * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaClass()
	 * @generated
	 * @ordered
	 */
	protected Class<?> javaClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XjmClassImpl()
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
		return XpectJavaModelPackage.Literals.XJM_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JvmDeclaredType getJvmClass()
	{
		if (jvmClass != null && jvmClass.eIsProxy())
		{
			InternalEObject oldJvmClass = (InternalEObject)jvmClass;
			jvmClass = (JvmDeclaredType)eResolveProxy(oldJvmClass);
			if (jvmClass != oldJvmClass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XpectJavaModelPackage.XJM_CLASS__JVM_CLASS, oldJvmClass, jvmClass));
			}
		}
		return jvmClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmDeclaredType basicGetJvmClass()
	{
		return jvmClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJvmClass(JvmDeclaredType newJvmClass)
	{
		JvmDeclaredType oldJvmClass = jvmClass;
		jvmClass = newJvmClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectJavaModelPackage.XJM_CLASS__JVM_CLASS, oldJvmClass, jvmClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Class<?> getJavaClass()
	{
		return javaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaClass(Class<?> newJavaClass)
	{
		Class<?> oldJavaClass = javaClass;
		javaClass = newJavaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectJavaModelPackage.XJM_CLASS__JAVA_CLASS, oldJavaClass, javaClass));
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
			case XpectJavaModelPackage.XJM_CLASS__JVM_CLASS:
				if (resolve) return getJvmClass();
				return basicGetJvmClass();
			case XpectJavaModelPackage.XJM_CLASS__JAVA_CLASS:
				return getJavaClass();
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
			case XpectJavaModelPackage.XJM_CLASS__JVM_CLASS:
				setJvmClass((JvmDeclaredType)newValue);
				return;
			case XpectJavaModelPackage.XJM_CLASS__JAVA_CLASS:
				setJavaClass((Class<?>)newValue);
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
			case XpectJavaModelPackage.XJM_CLASS__JVM_CLASS:
				setJvmClass((JvmDeclaredType)null);
				return;
			case XpectJavaModelPackage.XJM_CLASS__JAVA_CLASS:
				setJavaClass((Class<?>)null);
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
			case XpectJavaModelPackage.XJM_CLASS__JVM_CLASS:
				return jvmClass != null;
			case XpectJavaModelPackage.XJM_CLASS__JAVA_CLASS:
				return javaClass != null;
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
		result.append(" (javaClass: ");
		result.append(javaClass);
		result.append(')');
		return result.toString();
	}

} //XjmClassImpl
