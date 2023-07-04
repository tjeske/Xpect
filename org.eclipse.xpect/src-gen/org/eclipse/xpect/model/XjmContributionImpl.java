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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.xpect.Environment;
import org.eclipse.xpect.XjmContribution;
import org.eclipse.xpect.XpectJavaModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xjm Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpect.model.XjmContributionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XjmContributionImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XjmContributionImpl#getDeactivationReason <em>Deactivation Reason</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.XjmContributionImpl#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XjmContributionImpl extends XjmClassImplCustom implements XjmContribution
{
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> roles;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The default value of the '{@link #getDeactivationReason() <em>Deactivation Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivationReason()
	 * @generated
	 * @ordered
	 */
	protected static final String DEACTIVATION_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeactivationReason() <em>Deactivation Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivationReason()
	 * @generated
	 * @ordered
	 */
	protected String deactivationReason = DEACTIVATION_REASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplacedBy() <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedBy()
	 * @generated
	 * @ordered
	 */
	protected XjmContribution replacedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XjmContributionImpl()
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
		return XpectJavaModelPackage.Literals.XJM_CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getRoles()
	{
		if (roles == null)
		{
			roles = new EDataTypeUniqueEList<Annotation>(Annotation.class, this, XpectJavaModelPackage.XJM_CONTRIBUTION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getEnvironments()
	{
		if (environments == null)
		{
			environments = new EDataTypeUniqueEList<Environment>(Environment.class, this, XpectJavaModelPackage.XJM_CONTRIBUTION__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeactivationReason()
	{
		return deactivationReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeactivationReason(String newDeactivationReason)
	{
		String oldDeactivationReason = deactivationReason;
		deactivationReason = newDeactivationReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectJavaModelPackage.XJM_CONTRIBUTION__DEACTIVATION_REASON, oldDeactivationReason, deactivationReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XjmContribution getReplacedBy()
	{
		if (replacedBy != null && replacedBy.eIsProxy())
		{
			InternalEObject oldReplacedBy = (InternalEObject)replacedBy;
			replacedBy = (XjmContribution)eResolveProxy(oldReplacedBy);
			if (replacedBy != oldReplacedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XpectJavaModelPackage.XJM_CONTRIBUTION__REPLACED_BY, oldReplacedBy, replacedBy));
			}
		}
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XjmContribution basicGetReplacedBy()
	{
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedBy(XjmContribution newReplacedBy)
	{
		XjmContribution oldReplacedBy = replacedBy;
		replacedBy = newReplacedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectJavaModelPackage.XJM_CONTRIBUTION__REPLACED_BY, oldReplacedBy, replacedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive()
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
	public <T> T newInstance(Class<T> expectedType)
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ROLES:
				return getRoles();
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ENVIRONMENTS:
				return getEnvironments();
			case XpectJavaModelPackage.XJM_CONTRIBUTION__DEACTIVATION_REASON:
				return getDeactivationReason();
			case XpectJavaModelPackage.XJM_CONTRIBUTION__REPLACED_BY:
				if (resolve) return getReplacedBy();
				return basicGetReplacedBy();
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
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Annotation>)newValue);
				return;
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ENVIRONMENTS:
				getEnvironments().clear();
				getEnvironments().addAll((Collection<? extends Environment>)newValue);
				return;
			case XpectJavaModelPackage.XJM_CONTRIBUTION__DEACTIVATION_REASON:
				setDeactivationReason((String)newValue);
				return;
			case XpectJavaModelPackage.XJM_CONTRIBUTION__REPLACED_BY:
				setReplacedBy((XjmContribution)newValue);
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
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ROLES:
				getRoles().clear();
				return;
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ENVIRONMENTS:
				getEnvironments().clear();
				return;
			case XpectJavaModelPackage.XJM_CONTRIBUTION__DEACTIVATION_REASON:
				setDeactivationReason(DEACTIVATION_REASON_EDEFAULT);
				return;
			case XpectJavaModelPackage.XJM_CONTRIBUTION__REPLACED_BY:
				setReplacedBy((XjmContribution)null);
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
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ROLES:
				return roles != null && !roles.isEmpty();
			case XpectJavaModelPackage.XJM_CONTRIBUTION__ENVIRONMENTS:
				return environments != null && !environments.isEmpty();
			case XpectJavaModelPackage.XJM_CONTRIBUTION__DEACTIVATION_REASON:
				return DEACTIVATION_REASON_EDEFAULT == null ? deactivationReason != null : !DEACTIVATION_REASON_EDEFAULT.equals(deactivationReason);
			case XpectJavaModelPackage.XJM_CONTRIBUTION__REPLACED_BY:
				return replacedBy != null;
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
		result.append(" (roles: ");
		result.append(roles);
		result.append(", environments: ");
		result.append(environments);
		result.append(", deactivationReason: ");
		result.append(deactivationReason);
		result.append(')');
		return result.toString();
	}

} //XjmContributionImpl
