/**
 */
package asaM1.impl;

import aSA.impl.ConnecteurImpl;

import asaM1.AsaM1Package;
import asaM1.RPC3;
import asaM1.Role_Fourni_RPC3;
import asaM1.Role_Requis_RPC3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.RPC3Impl#getRole_requis_rpc3 <em>Role requis rpc3</em>}</li>
 *   <li>{@link asaM1.impl.RPC3Impl#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPC3Impl extends ConnecteurImpl implements RPC3 {
	/**
	 * The cached value of the '{@link #getRole_requis_rpc3() <em>Role requis rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc3()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC3 role_requis_rpc3;

	/**
	 * The cached value of the '{@link #getRole_fourni_rpc3() <em>Role fourni rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc3()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_RPC3 role_fourni_rpc3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPC3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.RPC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC3 getRole_requis_rpc3() {
		if (role_requis_rpc3 != null && role_requis_rpc3.eIsProxy()) {
			InternalEObject oldRole_requis_rpc3 = (InternalEObject)role_requis_rpc3;
			role_requis_rpc3 = (Role_Requis_RPC3)eResolveProxy(oldRole_requis_rpc3);
			if (role_requis_rpc3 != oldRole_requis_rpc3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC3__ROLE_REQUIS_RPC3, oldRole_requis_rpc3, role_requis_rpc3));
			}
		}
		return role_requis_rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC3 basicGetRole_requis_rpc3() {
		return role_requis_rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_requis_rpc3(Role_Requis_RPC3 newRole_requis_rpc3) {
		Role_Requis_RPC3 oldRole_requis_rpc3 = role_requis_rpc3;
		role_requis_rpc3 = newRole_requis_rpc3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC3__ROLE_REQUIS_RPC3, oldRole_requis_rpc3, role_requis_rpc3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Fourni_RPC3 getRole_fourni_rpc3() {
		if (role_fourni_rpc3 != null && role_fourni_rpc3.eIsProxy()) {
			InternalEObject oldRole_fourni_rpc3 = (InternalEObject)role_fourni_rpc3;
			role_fourni_rpc3 = (Role_Fourni_RPC3)eResolveProxy(oldRole_fourni_rpc3);
			if (role_fourni_rpc3 != oldRole_fourni_rpc3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC3__ROLE_FOURNI_RPC3, oldRole_fourni_rpc3, role_fourni_rpc3));
			}
		}
		return role_fourni_rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC3 basicGetRole_fourni_rpc3() {
		return role_fourni_rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_fourni_rpc3(Role_Fourni_RPC3 newRole_fourni_rpc3) {
		Role_Fourni_RPC3 oldRole_fourni_rpc3 = role_fourni_rpc3;
		role_fourni_rpc3 = newRole_fourni_rpc3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC3__ROLE_FOURNI_RPC3, oldRole_fourni_rpc3, role_fourni_rpc3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.RPC3__ROLE_REQUIS_RPC3:
				if (resolve) return getRole_requis_rpc3();
				return basicGetRole_requis_rpc3();
			case AsaM1Package.RPC3__ROLE_FOURNI_RPC3:
				if (resolve) return getRole_fourni_rpc3();
				return basicGetRole_fourni_rpc3();
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
			case AsaM1Package.RPC3__ROLE_REQUIS_RPC3:
				setRole_requis_rpc3((Role_Requis_RPC3)newValue);
				return;
			case AsaM1Package.RPC3__ROLE_FOURNI_RPC3:
				setRole_fourni_rpc3((Role_Fourni_RPC3)newValue);
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
			case AsaM1Package.RPC3__ROLE_REQUIS_RPC3:
				setRole_requis_rpc3((Role_Requis_RPC3)null);
				return;
			case AsaM1Package.RPC3__ROLE_FOURNI_RPC3:
				setRole_fourni_rpc3((Role_Fourni_RPC3)null);
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
			case AsaM1Package.RPC3__ROLE_REQUIS_RPC3:
				return role_requis_rpc3 != null;
			case AsaM1Package.RPC3__ROLE_FOURNI_RPC3:
				return role_fourni_rpc3 != null;
		}
		return super.eIsSet(featureID);
	}

} //RPC3Impl
