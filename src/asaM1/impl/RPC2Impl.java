/**
 */
package asaM1.impl;

import aSA.impl.ConnecteurImpl;

import asaM1.AsaM1Package;
import asaM1.RPC2;
import asaM1.Role_Fourni_RPC2;
import asaM1.Role_Requis_RPC2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.RPC2Impl#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}</li>
 *   <li>{@link asaM1.impl.RPC2Impl#getRole_requis_rpc2 <em>Role requis rpc2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPC2Impl extends ConnecteurImpl implements RPC2 {
	/**
	 * The cached value of the '{@link #getRole_fourni_rpc2() <em>Role fourni rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc2()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_RPC2 role_fourni_rpc2;

	/**
	 * The cached value of the '{@link #getRole_requis_rpc2() <em>Role requis rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc2()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC2 role_requis_rpc2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPC2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.RPC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Fourni_RPC2 getRole_fourni_rpc2() {
		if (role_fourni_rpc2 != null && role_fourni_rpc2.eIsProxy()) {
			InternalEObject oldRole_fourni_rpc2 = (InternalEObject)role_fourni_rpc2;
			role_fourni_rpc2 = (Role_Fourni_RPC2)eResolveProxy(oldRole_fourni_rpc2);
			if (role_fourni_rpc2 != oldRole_fourni_rpc2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC2__ROLE_FOURNI_RPC2, oldRole_fourni_rpc2, role_fourni_rpc2));
			}
		}
		return role_fourni_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC2 basicGetRole_fourni_rpc2() {
		return role_fourni_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_fourni_rpc2(Role_Fourni_RPC2 newRole_fourni_rpc2) {
		Role_Fourni_RPC2 oldRole_fourni_rpc2 = role_fourni_rpc2;
		role_fourni_rpc2 = newRole_fourni_rpc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC2__ROLE_FOURNI_RPC2, oldRole_fourni_rpc2, role_fourni_rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC2 getRole_requis_rpc2() {
		if (role_requis_rpc2 != null && role_requis_rpc2.eIsProxy()) {
			InternalEObject oldRole_requis_rpc2 = (InternalEObject)role_requis_rpc2;
			role_requis_rpc2 = (Role_Requis_RPC2)eResolveProxy(oldRole_requis_rpc2);
			if (role_requis_rpc2 != oldRole_requis_rpc2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC2__ROLE_REQUIS_RPC2, oldRole_requis_rpc2, role_requis_rpc2));
			}
		}
		return role_requis_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC2 basicGetRole_requis_rpc2() {
		return role_requis_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_requis_rpc2(Role_Requis_RPC2 newRole_requis_rpc2) {
		Role_Requis_RPC2 oldRole_requis_rpc2 = role_requis_rpc2;
		role_requis_rpc2 = newRole_requis_rpc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC2__ROLE_REQUIS_RPC2, oldRole_requis_rpc2, role_requis_rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.RPC2__ROLE_FOURNI_RPC2:
				if (resolve) return getRole_fourni_rpc2();
				return basicGetRole_fourni_rpc2();
			case AsaM1Package.RPC2__ROLE_REQUIS_RPC2:
				if (resolve) return getRole_requis_rpc2();
				return basicGetRole_requis_rpc2();
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
			case AsaM1Package.RPC2__ROLE_FOURNI_RPC2:
				setRole_fourni_rpc2((Role_Fourni_RPC2)newValue);
				return;
			case AsaM1Package.RPC2__ROLE_REQUIS_RPC2:
				setRole_requis_rpc2((Role_Requis_RPC2)newValue);
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
			case AsaM1Package.RPC2__ROLE_FOURNI_RPC2:
				setRole_fourni_rpc2((Role_Fourni_RPC2)null);
				return;
			case AsaM1Package.RPC2__ROLE_REQUIS_RPC2:
				setRole_requis_rpc2((Role_Requis_RPC2)null);
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
			case AsaM1Package.RPC2__ROLE_FOURNI_RPC2:
				return role_fourni_rpc2 != null;
			case AsaM1Package.RPC2__ROLE_REQUIS_RPC2:
				return role_requis_rpc2 != null;
		}
		return super.eIsSet(featureID);
	}

} //RPC2Impl
