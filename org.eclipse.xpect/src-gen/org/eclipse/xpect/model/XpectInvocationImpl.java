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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpect.XjmXpectMethod;
import org.eclipse.xpect.XpectArgument;
import org.eclipse.xpect.XpectInvocation;
import org.eclipse.xpect.XpectPackage;

import org.eclipse.xpect.parameter.IStatementRelatedRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#isIgnore <em>Ignore</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#isFixme <em>Fixme</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#getRelatedRegions <em>Related Regions</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XpectInvocationImpl#getExtendedRegion <em>Extended Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XpectInvocationImpl extends MemberImpl implements XpectInvocation
{
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnore() <em>Ignore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnore()
	 * @generated
	 * @ordered
	 */
	protected boolean ignore = IGNORE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixme() <em>Fixme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixme()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixme() <em>Fixme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixme()
	 * @generated
	 * @ordered
	 */
	protected boolean fixme = FIXME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected XjmXpectMethod method;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<XpectArgument> arguments;

	/**
	 * The cached value of the '{@link #getRelatedRegions() <em>Related Regions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<IStatementRelatedRegion> relatedRegions;

	/**
	 * The default value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected static final IStatementRelatedRegion EXTENDED_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected IStatementRelatedRegion extendedRegion = EXTENDED_REGION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XpectInvocationImpl()
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
		return XpectPackage.Literals.XPECT_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnore()
	{
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnore(boolean newIgnore)
	{
		boolean oldIgnore = ignore;
		ignore = newIgnore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectPackage.XPECT_INVOCATION__IGNORE, oldIgnore, ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixme()
	{
		return fixme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixme(boolean newFixme)
	{
		boolean oldFixme = fixme;
		fixme = newFixme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectPackage.XPECT_INVOCATION__FIXME, oldFixme, fixme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XjmXpectMethod getMethod()
	{
		if (method != null && method.eIsProxy())
		{
			InternalEObject oldMethod = (InternalEObject)method;
			method = (XjmXpectMethod)eResolveProxy(oldMethod);
			if (method != oldMethod)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XpectPackage.XPECT_INVOCATION__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XjmXpectMethod basicGetMethod()
	{
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(XjmXpectMethod newMethod)
	{
		XjmXpectMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectPackage.XPECT_INVOCATION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XpectArgument> getArguments()
	{
		if (arguments == null)
		{
			arguments = new EObjectContainmentEList<XpectArgument>(XpectArgument.class, this, XpectPackage.XPECT_INVOCATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IStatementRelatedRegion> getRelatedRegions()
	{
		if (relatedRegions == null)
		{
			relatedRegions = new EDataTypeEList<IStatementRelatedRegion>(IStatementRelatedRegion.class, this, XpectPackage.XPECT_INVOCATION__RELATED_REGIONS);
		}
		return relatedRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatementRelatedRegion getExtendedRegion()
	{
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(IStatementRelatedRegion newExtendedRegion)
	{
		IStatementRelatedRegion oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectPackage.XPECT_INVOCATION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName()
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
	public <T extends IStatementRelatedRegion> T getRelatedRegion(Class<T> type)
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
			case XpectPackage.XPECT_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case XpectPackage.XPECT_INVOCATION__ID:
				return getId();
			case XpectPackage.XPECT_INVOCATION__IGNORE:
				return isIgnore();
			case XpectPackage.XPECT_INVOCATION__FIXME:
				return isFixme();
			case XpectPackage.XPECT_INVOCATION__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case XpectPackage.XPECT_INVOCATION__ARGUMENTS:
				return getArguments();
			case XpectPackage.XPECT_INVOCATION__RELATED_REGIONS:
				return getRelatedRegions();
			case XpectPackage.XPECT_INVOCATION__EXTENDED_REGION:
				return getExtendedRegion();
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
			case XpectPackage.XPECT_INVOCATION__IGNORE:
				setIgnore((Boolean)newValue);
				return;
			case XpectPackage.XPECT_INVOCATION__FIXME:
				setFixme((Boolean)newValue);
				return;
			case XpectPackage.XPECT_INVOCATION__METHOD:
				setMethod((XjmXpectMethod)newValue);
				return;
			case XpectPackage.XPECT_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends XpectArgument>)newValue);
				return;
			case XpectPackage.XPECT_INVOCATION__EXTENDED_REGION:
				setExtendedRegion((IStatementRelatedRegion)newValue);
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
			case XpectPackage.XPECT_INVOCATION__IGNORE:
				setIgnore(IGNORE_EDEFAULT);
				return;
			case XpectPackage.XPECT_INVOCATION__FIXME:
				setFixme(FIXME_EDEFAULT);
				return;
			case XpectPackage.XPECT_INVOCATION__METHOD:
				setMethod((XjmXpectMethod)null);
				return;
			case XpectPackage.XPECT_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case XpectPackage.XPECT_INVOCATION__EXTENDED_REGION:
				setExtendedRegion(EXTENDED_REGION_EDEFAULT);
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
			case XpectPackage.XPECT_INVOCATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XpectPackage.XPECT_INVOCATION__IGNORE:
				return ignore != IGNORE_EDEFAULT;
			case XpectPackage.XPECT_INVOCATION__FIXME:
				return fixme != FIXME_EDEFAULT;
			case XpectPackage.XPECT_INVOCATION__METHOD:
				return method != null;
			case XpectPackage.XPECT_INVOCATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case XpectPackage.XPECT_INVOCATION__RELATED_REGIONS:
				return relatedRegions != null && !relatedRegions.isEmpty();
			case XpectPackage.XPECT_INVOCATION__EXTENDED_REGION:
				return EXTENDED_REGION_EDEFAULT == null ? extendedRegion != null : !EXTENDED_REGION_EDEFAULT.equals(extendedRegion);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", ignore: ");
		result.append(ignore);
		result.append(", fixme: ");
		result.append(fixme);
		result.append(", relatedRegions: ");
		result.append(relatedRegions);
		result.append(", extendedRegion: ");
		result.append(extendedRegion);
		result.append(')');
		return result.toString();
	}

} //XpectInvocationImpl
