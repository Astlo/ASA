/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.Glue;
import aSA.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ConnecteurImpl#getSystem <em>System</em>}</li>
 *   <li>{@link aSA.impl.ConnecteurImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link aSA.impl.ConnecteurImpl#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnecteurImpl extends NamedElementImpl implements Connecteur {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected EList<Glue> glue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnecteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.CONNECTEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getSystem() {
		if (eContainerFeatureID() != ASAPackage.CONNECTEUR__SYSTEM)
			return null;
		return (Configuration) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Configuration newSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSystem, ASAPackage.CONNECTEUR__SYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(Configuration newSystem) {
		if (newSystem != eInternalContainer()
				|| (eContainerFeatureID() != ASAPackage.CONNECTEUR__SYSTEM && newSystem != null)) {
			if (EcoreUtil.isAncestor(this, newSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem != null)
				msgs = ((InternalEObject) newSystem).eInverseAdd(this, ASAPackage.CONFIGURATION__CONNECTEUR,
						Configuration.class, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.CONNECTEUR__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this,
					ASAPackage.CONNECTEUR__INTERFACE, ASAPackage.INTERFACE__CONNECTEUR);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Glue> getGlue() {
		if (glue == null) {
			glue = new EObjectContainmentEList<Glue>(Glue.class, this, ASAPackage.CONNECTEUR__GLUE);
		}
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSystem((Configuration) otherEnd, msgs);
		case ASAPackage.CONNECTEUR__INTERFACE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterface()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			return basicSetSystem(null, msgs);
		case ASAPackage.CONNECTEUR__INTERFACE:
			return ((InternalEList<?>) getInterface()).basicRemove(otherEnd, msgs);
		case ASAPackage.CONNECTEUR__GLUE:
			return ((InternalEList<?>) getGlue()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			return eInternalContainer().eInverseRemove(this, ASAPackage.CONFIGURATION__CONNECTEUR, Configuration.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			return getSystem();
		case ASAPackage.CONNECTEUR__INTERFACE:
			return getInterface();
		case ASAPackage.CONNECTEUR__GLUE:
			return getGlue();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			setSystem((Configuration) newValue);
			return;
		case ASAPackage.CONNECTEUR__INTERFACE:
			getInterface().clear();
			getInterface().addAll((Collection<? extends Interface>) newValue);
			return;
		case ASAPackage.CONNECTEUR__GLUE:
			getGlue().clear();
			getGlue().addAll((Collection<? extends Glue>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			setSystem((Configuration) null);
			return;
		case ASAPackage.CONNECTEUR__INTERFACE:
			getInterface().clear();
			return;
		case ASAPackage.CONNECTEUR__GLUE:
			getGlue().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ASAPackage.CONNECTEUR__SYSTEM:
			return getSystem() != null;
		case ASAPackage.CONNECTEUR__INTERFACE:
			return interface_ != null && !interface_.isEmpty();
		case ASAPackage.CONNECTEUR__GLUE:
			return glue != null && !glue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnecteurImpl
