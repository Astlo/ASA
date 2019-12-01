/**
 */
package asaM1.impl;

import aSA.impl.ConnecteurImpl;

import asaM1.AsaM1Package;
import asaM1.RPC1;
import asaM1.Role_Requis_RPC1;
import asaM1.Role_fourni_RPC1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.RPC1Impl#getRole_requis_rpc1 <em>Role requis rpc1</em>}</li>
 *   <li>{@link asaM1.impl.RPC1Impl#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPC1Impl extends ConnecteurImpl implements RPC1 {
	/**
	 * The cached value of the '{@link #getRole_requis_rpc1() <em>Role requis rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc1()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC1 role_requis_rpc1;

	/**
	 * The cached value of the '{@link #getRole_fourni_rpc1() <em>Role fourni rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc1()
	 * @generated
	 * @ordered
	 */
	protected Role_fourni_RPC1 role_fourni_rpc1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPC1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.RPC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC1 getRole_requis_rpc1() {
		if (role_requis_rpc1 != null && role_requis_rpc1.eIsProxy()) {
			InternalEObject oldRole_requis_rpc1 = (InternalEObject)role_requis_rpc1;
			role_requis_rpc1 = (Role_Requis_RPC1)eResolveProxy(oldRole_requis_rpc1);
			if (role_requis_rpc1 != oldRole_requis_rpc1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC1__ROLE_REQUIS_RPC1, oldRole_requis_rpc1, role_requis_rpc1));
			}
		}
		return role_requis_rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC1 basicGetRole_requis_rpc1() {
		return role_requis_rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_requis_rpc1(Role_Requis_RPC1 newRole_requis_rpc1) {
		Role_Requis_RPC1 oldRole_requis_rpc1 = role_requis_rpc1;
		role_requis_rpc1 = newRole_requis_rpc1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC1__ROLE_REQUIS_RPC1, oldRole_requis_rpc1, role_requis_rpc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_fourni_RPC1 getRole_fourni_rpc1() {
		if (role_fourni_rpc1 != null && role_fourni_rpc1.eIsProxy()) {
			InternalEObject oldRole_fourni_rpc1 = (InternalEObject)role_fourni_rpc1;
			role_fourni_rpc1 = (Role_fourni_RPC1)eResolveProxy(oldRole_fourni_rpc1);
			if (role_fourni_rpc1 != oldRole_fourni_rpc1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC1__ROLE_FOURNI_RPC1, oldRole_fourni_rpc1, role_fourni_rpc1));
			}
		}
		return role_fourni_rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_fourni_RPC1 basicGetRole_fourni_rpc1() {
		return role_fourni_rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_fourni_rpc1(Role_fourni_RPC1 newRole_fourni_rpc1) {
		Role_fourni_RPC1 oldRole_fourni_rpc1 = role_fourni_rpc1;
		role_fourni_rpc1 = newRole_fourni_rpc1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC1__ROLE_FOURNI_RPC1, oldRole_fourni_rpc1, role_fourni_rpc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.RPC1__ROLE_REQUIS_RPC1:
				if (resolve) return getRole_requis_rpc1();
				return basicGetRole_requis_rpc1();
			case AsaM1Package.RPC1__ROLE_FOURNI_RPC1:
				if (resolve) return getRole_fourni_rpc1();
				return basicGetRole_fourni_rpc1();
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
			case AsaM1Package.RPC1__ROLE_REQUIS_RPC1:
				setRole_requis_rpc1((Role_Requis_RPC1)newValue);
				return;
			case AsaM1Package.RPC1__ROLE_FOURNI_RPC1:
				setRole_fourni_rpc1((Role_fourni_RPC1)newValue);
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
			case AsaM1Package.RPC1__ROLE_REQUIS_RPC1:
				setRole_requis_rpc1((Role_Requis_RPC1)null);
				return;
			case AsaM1Package.RPC1__ROLE_FOURNI_RPC1:
				setRole_fourni_rpc1((Role_fourni_RPC1)null);
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
			case AsaM1Package.RPC1__ROLE_REQUIS_RPC1:
				return role_requis_rpc1 != null;
			case AsaM1Package.RPC1__ROLE_FOURNI_RPC1:
				return role_fourni_rpc1 != null;
		}
		return super.eIsSet(featureID);
	}

} //RPC1Impl
