/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Composant;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.Interface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.InterfaceImpl#getComposant <em>Composant</em>}</li>
 *   <li>{@link aSA.impl.InterfaceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link aSA.impl.InterfaceImpl#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link aSA.impl.InterfaceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composant getComposant() {
		if (eContainerFeatureID() != ASAPackage.INTERFACE__COMPOSANT)
			return null;
		return (Composant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposant(Composant newComposant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newComposant, ASAPackage.INTERFACE__COMPOSANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposant(Composant newComposant) {
		if (newComposant != eInternalContainer()
				|| (eContainerFeatureID() != ASAPackage.INTERFACE__COMPOSANT && newComposant != null)) {
			if (EcoreUtil.isAncestor(this, newComposant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComposant != null)
				msgs = ((InternalEObject) newComposant).eInverseAdd(this, ASAPackage.COMPOSANT__INTERFACE,
						Composant.class, msgs);
			msgs = basicSetComposant(newComposant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.INTERFACE__COMPOSANT, newComposant,
					newComposant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getConfiguration() {
		if (eContainerFeatureID() != ASAPackage.INTERFACE__CONFIGURATION)
			return null;
		return (Configuration) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newConfiguration, ASAPackage.INTERFACE__CONFIGURATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != eInternalContainer()
				|| (eContainerFeatureID() != ASAPackage.INTERFACE__CONFIGURATION && newConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this, ASAPackage.CONFIGURATION__INTERFACE,
						Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.INTERFACE__CONFIGURATION, newConfiguration,
					newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connecteur getConnecteur() {
		if (eContainerFeatureID() != ASAPackage.INTERFACE__CONNECTEUR)
			return null;
		return (Connecteur) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnecteur(Connecteur newConnecteur, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newConnecteur, ASAPackage.INTERFACE__CONNECTEUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnecteur(Connecteur newConnecteur) {
		if (newConnecteur != eInternalContainer()
				|| (eContainerFeatureID() != ASAPackage.INTERFACE__CONNECTEUR && newConnecteur != null)) {
			if (EcoreUtil.isAncestor(this, newConnecteur))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnecteur != null)
				msgs = ((InternalEObject) newConnecteur).eInverseAdd(this, ASAPackage.CONNECTEUR__INTERFACE,
						Connecteur.class, msgs);
			msgs = basicSetConnecteur(newConnecteur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.INTERFACE__CONNECTEUR, newConnecteur,
					newConnecteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ASAPackage.INTERFACE__COMPOSANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetComposant((Composant) otherEnd, msgs);
		case ASAPackage.INTERFACE__CONFIGURATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetConfiguration((Configuration) otherEnd, msgs);
		case ASAPackage.INTERFACE__CONNECTEUR:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetConnecteur((Connecteur) otherEnd, msgs);
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
		case ASAPackage.INTERFACE__COMPOSANT:
			return basicSetComposant(null, msgs);
		case ASAPackage.INTERFACE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
		case ASAPackage.INTERFACE__CONNECTEUR:
			return basicSetConnecteur(null, msgs);
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
		case ASAPackage.INTERFACE__COMPOSANT:
			return eInternalContainer().eInverseRemove(this, ASAPackage.COMPOSANT__INTERFACE, Composant.class, msgs);
		case ASAPackage.INTERFACE__CONFIGURATION:
			return eInternalContainer().eInverseRemove(this, ASAPackage.CONFIGURATION__INTERFACE, Configuration.class,
					msgs);
		case ASAPackage.INTERFACE__CONNECTEUR:
			return eInternalContainer().eInverseRemove(this, ASAPackage.CONNECTEUR__INTERFACE, Connecteur.class, msgs);
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
		case ASAPackage.INTERFACE__COMPOSANT:
			return getComposant();
		case ASAPackage.INTERFACE__CONFIGURATION:
			return getConfiguration();
		case ASAPackage.INTERFACE__CONNECTEUR:
			return getConnecteur();
		case ASAPackage.INTERFACE__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ASAPackage.INTERFACE__COMPOSANT:
			setComposant((Composant) newValue);
			return;
		case ASAPackage.INTERFACE__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case ASAPackage.INTERFACE__CONNECTEUR:
			setConnecteur((Connecteur) newValue);
			return;
		case ASAPackage.INTERFACE__NAME:
			setName((String) newValue);
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
		case ASAPackage.INTERFACE__COMPOSANT:
			setComposant((Composant) null);
			return;
		case ASAPackage.INTERFACE__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case ASAPackage.INTERFACE__CONNECTEUR:
			setConnecteur((Connecteur) null);
			return;
		case ASAPackage.INTERFACE__NAME:
			setName(NAME_EDEFAULT);
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
		case ASAPackage.INTERFACE__COMPOSANT:
			return getComposant() != null;
		case ASAPackage.INTERFACE__CONFIGURATION:
			return getConfiguration() != null;
		case ASAPackage.INTERFACE__CONNECTEUR:
			return getConnecteur() != null;
		case ASAPackage.INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
