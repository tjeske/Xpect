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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xpect.AbstractComponent;
import org.eclipse.xpect.Assignment;
import org.eclipse.xpect.Component;
import org.eclipse.xpect.Literal;
import org.eclipse.xpect.XpectPackage;

import org.eclipse.xtext.common.types.JvmDeclaredType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xpect.model.ComponentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.ComponentImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.eclipse.xpect.model.ComponentImpl#getComponentClass <em>Component Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends ValueImpl implements Component
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> parameters;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignments;

	/**
	 * The cached value of the '{@link #getComponentClass() <em>Component Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentClass()
	 * @generated
	 * @ordered
	 */
	protected JvmDeclaredType componentClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl()
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
		return XpectPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<Literal>(Literal.class, this, XpectPackage.COMPONENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssignments()
	{
		if (assignments == null)
		{
			assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, XpectPackage.COMPONENT__ASSIGNMENTS);
		}
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmDeclaredType getComponentClass()
	{
		if (componentClass != null && componentClass.eIsProxy())
		{
			InternalEObject oldComponentClass = (InternalEObject)componentClass;
			componentClass = (JvmDeclaredType)eResolveProxy(oldComponentClass);
			if (componentClass != oldComponentClass)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XpectPackage.COMPONENT__COMPONENT_CLASS, oldComponentClass, componentClass));
			}
		}
		return componentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmDeclaredType basicGetComponentClass()
	{
		return componentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentClass(JvmDeclaredType newComponentClass)
	{
		JvmDeclaredType oldComponentClass = componentClass;
		componentClass = newComponentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XpectPackage.COMPONENT__COMPONENT_CLASS, oldComponentClass, componentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment getAssignment()
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
			case XpectPackage.COMPONENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case XpectPackage.COMPONENT__ASSIGNMENTS:
				return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
			case XpectPackage.COMPONENT__PARAMETERS:
				return getParameters();
			case XpectPackage.COMPONENT__ASSIGNMENTS:
				return getAssignments();
			case XpectPackage.COMPONENT__COMPONENT_CLASS:
				if (resolve) return getComponentClass();
				return basicGetComponentClass();
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
			case XpectPackage.COMPONENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Literal>)newValue);
				return;
			case XpectPackage.COMPONENT__ASSIGNMENTS:
				getAssignments().clear();
				getAssignments().addAll((Collection<? extends Assignment>)newValue);
				return;
			case XpectPackage.COMPONENT__COMPONENT_CLASS:
				setComponentClass((JvmDeclaredType)newValue);
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
			case XpectPackage.COMPONENT__PARAMETERS:
				getParameters().clear();
				return;
			case XpectPackage.COMPONENT__ASSIGNMENTS:
				getAssignments().clear();
				return;
			case XpectPackage.COMPONENT__COMPONENT_CLASS:
				setComponentClass((JvmDeclaredType)null);
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
			case XpectPackage.COMPONENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case XpectPackage.COMPONENT__ASSIGNMENTS:
				return assignments != null && !assignments.isEmpty();
			case XpectPackage.COMPONENT__COMPONENT_CLASS:
				return componentClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == AbstractComponent.class)
		{
			switch (derivedFeatureID)
			{
				case XpectPackage.COMPONENT__PARAMETERS: return XpectPackage.ABSTRACT_COMPONENT__PARAMETERS;
				case XpectPackage.COMPONENT__ASSIGNMENTS: return XpectPackage.ABSTRACT_COMPONENT__ASSIGNMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == AbstractComponent.class)
		{
			switch (baseFeatureID)
			{
				case XpectPackage.ABSTRACT_COMPONENT__PARAMETERS: return XpectPackage.COMPONENT__PARAMETERS;
				case XpectPackage.ABSTRACT_COMPONENT__ASSIGNMENTS: return XpectPackage.COMPONENT__ASSIGNMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentImpl
