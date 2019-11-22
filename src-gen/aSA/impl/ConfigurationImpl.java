/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Attachement;
import aSA.Binding;
import aSA.Composant;
import aSA.Configuration;
import aSA.Connecteur;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ConfigurationImpl#getComposant <em>Composant</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getAttachements <em>Attachements</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link aSA.impl.ConfigurationImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends NamedElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> composant;

	/**
	 * The cached value of the '{@link #getConnecteur() <em>Connecteur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnecteur()
	 * @generated
	 * @ordered
	 */
	protected EList<Connecteur> connecteur;

	/**
	 * The cached value of the '{@link #getAttachements() <em>Attachements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachements()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachement> attachements;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Composant> getComposant() {
		if (composant == null) {
			composant = new EObjectContainmentWithInverseEList<Composant>(Composant.class, this,
					ASAPackage.CONFIGURATION__COMPOSANT, ASAPackage.COMPOSANT__SYSTEM_PERE);
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connecteur> getConnecteur() {
		if (connecteur == null) {
			connecteur = new EObjectContainmentWithInverseEList<Connecteur>(Connecteur.class, this,
					ASAPackage.CONFIGURATION__CONNECTEUR, ASAPackage.CONNECTEUR__SYSTEM);
		}
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachement> getAttachements() {
		if (attachements == null) {
			attachements = new EObjectContainmentWithInverseEList<Attachement>(Attachement.class, this,
					ASAPackage.CONFIGURATION__ATTACHEMENTS, ASAPackage.ATTACHEMENT__SYSTEM);
		}
		return attachements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ASAPackage.CONFIGURATION__INTERFACE, oldInterface, newInterface);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(Interface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject) interface_).eInverseRemove(this, ASAPackage.INTERFACE__CONFIGURATION,
						Interface.class, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this, ASAPackage.INTERFACE__CONFIGURATION,
						Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.CONFIGURATION__INTERFACE, newInterface,
					newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, ASAPackage.CONFIGURATION__BINDING);
		}
		return binding;
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
		case ASAPackage.CONFIGURATION__COMPOSANT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComposant()).basicAdd(otherEnd, msgs);
		case ASAPackage.CONFIGURATION__CONNECTEUR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnecteur()).basicAdd(otherEnd, msgs);
		case ASAPackage.CONFIGURATION__ATTACHEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttachements()).basicAdd(otherEnd, msgs);
		case ASAPackage.CONFIGURATION__INTERFACE:
			if (interface_ != null)
				msgs = ((InternalEObject) interface_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ASAPackage.CONFIGURATION__INTERFACE, null, msgs);
			return basicSetInterface((Interface) otherEnd, msgs);
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
		case ASAPackage.CONFIGURATION__COMPOSANT:
			return ((InternalEList<?>) getComposant()).basicRemove(otherEnd, msgs);
		case ASAPackage.CONFIGURATION__CONNECTEUR:
			return ((InternalEList<?>) getConnecteur()).basicRemove(otherEnd, msgs);
		case ASAPackage.CONFIGURATION__ATTACHEMENTS:
			return ((InternalEList<?>) getAttachements()).basicRemove(otherEnd, msgs);
		case ASAPackage.CONFIGURATION__INTERFACE:
			return basicSetInterface(null, msgs);
		case ASAPackage.CONFIGURATION__BINDING:
			return ((InternalEList<?>) getBinding()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ASAPackage.CONFIGURATION__COMPOSANT:
			return getComposant();
		case ASAPackage.CONFIGURATION__CONNECTEUR:
			return getConnecteur();
		case ASAPackage.CONFIGURATION__ATTACHEMENTS:
			return getAttachements();
		case ASAPackage.CONFIGURATION__INTERFACE:
			return getInterface();
		case ASAPackage.CONFIGURATION__BINDING:
			return getBinding();
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
		case ASAPackage.CONFIGURATION__COMPOSANT:
			getComposant().clear();
			getComposant().addAll((Collection<? extends Composant>) newValue);
			return;
		case ASAPackage.CONFIGURATION__CONNECTEUR:
			getConnecteur().clear();
			getConnecteur().addAll((Collection<? extends Connecteur>) newValue);
			return;
		case ASAPackage.CONFIGURATION__ATTACHEMENTS:
			getAttachements().clear();
			getAttachements().addAll((Collection<? extends Attachement>) newValue);
			return;
		case ASAPackage.CONFIGURATION__INTERFACE:
			setInterface((Interface) newValue);
			return;
		case ASAPackage.CONFIGURATION__BINDING:
			getBinding().clear();
			getBinding().addAll((Collection<? extends Binding>) newValue);
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
		case ASAPackage.CONFIGURATION__COMPOSANT:
			getComposant().clear();
			return;
		case ASAPackage.CONFIGURATION__CONNECTEUR:
			getConnecteur().clear();
			return;
		case ASAPackage.CONFIGURATION__ATTACHEMENTS:
			getAttachements().clear();
			return;
		case ASAPackage.CONFIGURATION__INTERFACE:
			setInterface((Interface) null);
			return;
		case ASAPackage.CONFIGURATION__BINDING:
			getBinding().clear();
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
		case ASAPackage.CONFIGURATION__COMPOSANT:
			return composant != null && !composant.isEmpty();
		case ASAPackage.CONFIGURATION__CONNECTEUR:
			return connecteur != null && !connecteur.isEmpty();
		case ASAPackage.CONFIGURATION__ATTACHEMENTS:
			return attachements != null && !attachements.isEmpty();
		case ASAPackage.CONFIGURATION__INTERFACE:
			return interface_ != null;
		case ASAPackage.CONFIGURATION__BINDING:
			return binding != null && !binding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
