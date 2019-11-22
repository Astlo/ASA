/**
 */
package aSA.impl;

import aSA.ASAPackage;
import aSA.Composant;
import aSA.Propriete;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propriete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aSA.impl.ProprieteImpl#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProprieteImpl extends MinimalEObjectImpl.Container implements Propriete {
	/**
	 * The cached value of the '{@link #getComposant() <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposant()
	 * @generated
	 * @ordered
	 */
	protected Composant composant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProprieteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASAPackage.Literals.PROPRIETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composant getComposant() {
		if (composant != null && composant.eIsProxy()) {
			InternalEObject oldComposant = (InternalEObject) composant;
			composant = (Composant) eResolveProxy(oldComposant);
			if (composant != oldComposant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASAPackage.PROPRIETE__COMPOSANT,
							oldComposant, composant));
			}
		}
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant basicGetComposant() {
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposant(Composant newComposant, NotificationChain msgs) {
		Composant oldComposant = composant;
		composant = newComposant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ASAPackage.PROPRIETE__COMPOSANT, oldComposant, newComposant);
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
	public void setComposant(Composant newComposant) {
		if (newComposant != composant) {
			NotificationChain msgs = null;
			if (composant != null)
				msgs = ((InternalEObject) composant).eInverseRemove(this, ASAPackage.COMPOSANT__PROPRIETE,
						Composant.class, msgs);
			if (newComposant != null)
				msgs = ((InternalEObject) newComposant).eInverseAdd(this, ASAPackage.COMPOSANT__PROPRIETE,
						Composant.class, msgs);
			msgs = basicSetComposant(newComposant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASAPackage.PROPRIETE__COMPOSANT, newComposant,
					newComposant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ASAPackage.PROPRIETE__COMPOSANT:
			if (composant != null)
				msgs = ((InternalEObject) composant).eInverseRemove(this, ASAPackage.COMPOSANT__PROPRIETE,
						Composant.class, msgs);
			return basicSetComposant((Composant) otherEnd, msgs);
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
		case ASAPackage.PROPRIETE__COMPOSANT:
			return basicSetComposant(null, msgs);
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
		case ASAPackage.PROPRIETE__COMPOSANT:
			if (resolve)
				return getComposant();
			return basicGetComposant();
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
		case ASAPackage.PROPRIETE__COMPOSANT:
			setComposant((Composant) newValue);
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
		case ASAPackage.PROPRIETE__COMPOSANT:
			setComposant((Composant) null);
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
		case ASAPackage.PROPRIETE__COMPOSANT:
			return composant != null;
		}
		return super.eIsSet(featureID);
	}

} //ProprieteImpl
