/**
 */
package asaM1.impl;

import aSA.impl.RoleRequisImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC3CM;
import asaM1.Role_Requis_RPC3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis RPC3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.Role_Requis_RPC3Impl#getAttachementrpc3cm <em>Attachementrpc3cm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Requis_RPC3Impl extends RoleRequisImpl implements Role_Requis_RPC3 {
	/**
	 * The cached value of the '{@link #getAttachementrpc3cm() <em>Attachementrpc3cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc3cm()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC3CM attachementrpc3cm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Requis_RPC3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ROLE_REQUIS_RPC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC3CM getAttachementrpc3cm() {
		if (attachementrpc3cm != null && attachementrpc3cm.eIsProxy()) {
			InternalEObject oldAttachementrpc3cm = (InternalEObject)attachementrpc3cm;
			attachementrpc3cm = (AttachementRPC3CM)eResolveProxy(oldAttachementrpc3cm);
			if (attachementrpc3cm != oldAttachementrpc3cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM, oldAttachementrpc3cm, attachementrpc3cm));
			}
		}
		return attachementrpc3cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementRPC3CM basicGetAttachementrpc3cm() {
		return attachementrpc3cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachementrpc3cm(AttachementRPC3CM newAttachementrpc3cm) {
		AttachementRPC3CM oldAttachementrpc3cm = attachementrpc3cm;
		attachementrpc3cm = newAttachementrpc3cm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM, oldAttachementrpc3cm, attachementrpc3cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM:
				if (resolve) return getAttachementrpc3cm();
				return basicGetAttachementrpc3cm();
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
			case AsaM1Package.ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM:
				setAttachementrpc3cm((AttachementRPC3CM)newValue);
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
			case AsaM1Package.ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM:
				setAttachementrpc3cm((AttachementRPC3CM)null);
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
			case AsaM1Package.ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM:
				return attachementrpc3cm != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Requis_RPC3Impl
