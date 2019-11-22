/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Composant;
import aSA.Configuration;
import aSA.Contrainte;
import aSA.Interface;
import aSA.Propriete;

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
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ComposantImpl#getSystem_pere <em>System pere</em>}</li>
 *   <li>{@link aSA.impl.ComposantImpl#getSystem_fils <em>System fils</em>}</li>
 *   <li>{@link aSA.impl.ComposantImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link aSA.impl.ComposantImpl#getContrainte <em>Contrainte</em>}</li>
 *   <li>{@link aSA.impl.ComposantImpl#getPropriete <em>Propriete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends NamedElementImpl implements Composant {
	/**
	 * The cached value of the '{@link #getSystem_fils() <em>System fils</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_fils()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> system_fils;

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
	 * The cached value of the '{@link #getContrainte() <em>Contrainte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrainte()
	 * @generated
	 * @ordered
	 */
	protected Contrainte contrainte;

	/**
	 * The cached value of the '{@link #getPropriete() <em>Propriete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropriete()
	 * @generated
	 * @ordered
	 */
	protected Propriete propriete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.COMPOSANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getSystem_pere() {
		if (eContainerFeatureID() != ASAPackage.COMPOSANT__SYSTEM_PERE)
			return null;
		return (Configuration) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem_pere(Configuration newSystem_pere, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSystem_pere, ASAPackage.COMPOSANT__SYSTEM_PERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem_pere(Configuration newSystem_pere) {
		if (newSystem_pere != eInternalContainer()
				|| (eContainerFeatureID() != ASAPackage.COMPOSANT__SYSTEM_PERE && newSystem_pere != null)) {
			if (EcoreUtil.isAncestor(this, newSystem_pere))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystem_pere != null)
				msgs = ((InternalEObject) newSystem_pere).eInverseAdd(this, ASAPackage.CONFIGURATION__COMPOSANT,
						Configuration.class, msgs);
			msgs = basicSetSystem_pere(newSystem_pere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPOSANT__SYSTEM_PERE, newSystem_pere,
					newSystem_pere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getSystem_fils() {
		if (system_fils == null) {
			system_fils = new EObjectContainmentEList<Configuration>(Configuration.class, this,
					ASAPackage.COMPOSANT__SYSTEM_FILS);
		}
		return system_fils;
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
					ASAPackage.COMPOSANT__INTERFACE, ASAPackage.INTERFACE__COMPOSANT);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte getContrainte() {
		if (contrainte != null && contrainte.eIsProxy()) {
			InternalEObject oldContrainte = (InternalEObject) contrainte;
			contrainte = (Contrainte) eResolveProxy(oldContrainte);
			if (contrainte != oldContrainte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPOSANT__CONTRAINTE,
							oldContrainte, contrainte));
			}
		}
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contrainte basicGetContrainte() {
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContrainte(Contrainte newContrainte, NotificationChain msgs) {
		Contrainte oldContrainte = contrainte;
		contrainte = newContrainte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ASAPackage.COMPOSANT__CONTRAINTE, oldContrainte, newContrainte);
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
	public void setContrainte(Contrainte newContrainte) {
		if (newContrainte != contrainte) {
			NotificationChain msgs = null;
			if (contrainte != null)
				msgs = ((InternalEObject) contrainte).eInverseRemove(this, ASAPackage.CONTRAINTE__COMPOSANT,
						Contrainte.class, msgs);
			if (newContrainte != null)
				msgs = ((InternalEObject) newContrainte).eInverseAdd(this, ASAPackage.CONTRAINTE__COMPOSANT,
						Contrainte.class, msgs);
			msgs = basicSetContrainte(newContrainte, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPOSANT__CONTRAINTE, newContrainte,
					newContrainte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Propriete getPropriete() {
		if (propriete != null && propriete.eIsProxy()) {
			InternalEObject oldPropriete = (InternalEObject) propriete;
			propriete = (Propriete) eResolveProxy(oldPropriete);
			if (propriete != oldPropriete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.COMPOSANT__PROPRIETE,
							oldPropriete, propriete));
			}
		}
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propriete basicGetPropriete() {
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropriete(Propriete newPropriete, NotificationChain msgs) {
		Propriete oldPropriete = propriete;
		propriete = newPropriete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ASAPackage.COMPOSANT__PROPRIETE, oldPropriete, newPropriete);
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
	public void setPropriete(Propriete newPropriete) {
		if (newPropriete != propriete) {
			NotificationChain msgs = null;
			if (propriete != null)
				msgs = ((InternalEObject) propriete).eInverseRemove(this, ASAPackage.PROPRIETE__COMPOSANT,
						Propriete.class, msgs);
			if (newPropriete != null)
				msgs = ((InternalEObject) newPropriete).eInverseAdd(this, ASAPackage.PROPRIETE__COMPOSANT,
						Propriete.class, msgs);
			msgs = basicSetPropriete(newPropriete, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.COMPOSANT__PROPRIETE, newPropriete,
					newPropriete));
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSystem_pere((Configuration) otherEnd, msgs);
		case ASAPackage.COMPOSANT__INTERFACE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterface()).basicAdd(otherEnd, msgs);
		case ASAPackage.COMPOSANT__CONTRAINTE:
			if (contrainte != null)
				msgs = ((InternalEObject) contrainte).eInverseRemove(this, ASAPackage.CONTRAINTE__COMPOSANT,
						Contrainte.class, msgs);
			return basicSetContrainte((Contrainte) otherEnd, msgs);
		case ASAPackage.COMPOSANT__PROPRIETE:
			if (propriete != null)
				msgs = ((InternalEObject) propriete).eInverseRemove(this, ASAPackage.PROPRIETE__COMPOSANT,
						Propriete.class, msgs);
			return basicSetPropriete((Propriete) otherEnd, msgs);
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			return basicSetSystem_pere(null, msgs);
		case ASAPackage.COMPOSANT__SYSTEM_FILS:
			return ((InternalEList<?>) getSystem_fils()).basicRemove(otherEnd, msgs);
		case ASAPackage.COMPOSANT__INTERFACE:
			return ((InternalEList<?>) getInterface()).basicRemove(otherEnd, msgs);
		case ASAPackage.COMPOSANT__CONTRAINTE:
			return basicSetContrainte(null, msgs);
		case ASAPackage.COMPOSANT__PROPRIETE:
			return basicSetPropriete(null, msgs);
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			return eInternalContainer().eInverseRemove(this, ASAPackage.CONFIGURATION__COMPOSANT, Configuration.class,
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			return getSystem_pere();
		case ASAPackage.COMPOSANT__SYSTEM_FILS:
			return getSystem_fils();
		case ASAPackage.COMPOSANT__INTERFACE:
			return getInterface();
		case ASAPackage.COMPOSANT__CONTRAINTE:
			if (resolve)
				return getContrainte();
			return basicGetContrainte();
		case ASAPackage.COMPOSANT__PROPRIETE:
			if (resolve)
				return getPropriete();
			return basicGetPropriete();
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			setSystem_pere((Configuration) newValue);
			return;
		case ASAPackage.COMPOSANT__SYSTEM_FILS:
			getSystem_fils().clear();
			getSystem_fils().addAll((Collection<? extends Configuration>) newValue);
			return;
		case ASAPackage.COMPOSANT__INTERFACE:
			getInterface().clear();
			getInterface().addAll((Collection<? extends Interface>) newValue);
			return;
		case ASAPackage.COMPOSANT__CONTRAINTE:
			setContrainte((Contrainte) newValue);
			return;
		case ASAPackage.COMPOSANT__PROPRIETE:
			setPropriete((Propriete) newValue);
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			setSystem_pere((Configuration) null);
			return;
		case ASAPackage.COMPOSANT__SYSTEM_FILS:
			getSystem_fils().clear();
			return;
		case ASAPackage.COMPOSANT__INTERFACE:
			getInterface().clear();
			return;
		case ASAPackage.COMPOSANT__CONTRAINTE:
			setContrainte((Contrainte) null);
			return;
		case ASAPackage.COMPOSANT__PROPRIETE:
			setPropriete((Propriete) null);
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
		case ASAPackage.COMPOSANT__SYSTEM_PERE:
			return getSystem_pere() != null;
		case ASAPackage.COMPOSANT__SYSTEM_FILS:
			return system_fils != null && !system_fils.isEmpty();
		case ASAPackage.COMPOSANT__INTERFACE:
			return interface_ != null && !interface_.isEmpty();
		case ASAPackage.COMPOSANT__CONTRAINTE:
			return contrainte != null;
		case ASAPackage.COMPOSANT__PROPRIETE:
			return propriete != null;
		}
		return super.eIsSet(featureID);
	}

} //ComposantImpl
