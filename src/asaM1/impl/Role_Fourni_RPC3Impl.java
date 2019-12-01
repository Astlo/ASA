/**
 */
package asaM1.impl;

import aSA.impl.RoleFourniImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC3SM;
import asaM1.Role_Fourni_RPC3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Fourni RPC3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.Role_Fourni_RPC3Impl#getAttachementrpc3sm <em>Attachementrpc3sm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Role_Fourni_RPC3Impl extends RoleFourniImpl implements Role_Fourni_RPC3 {
	/**
	 * The cached value of the '{@link #getAttachementrpc3sm() <em>Attachementrpc3sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc3sm()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC3SM attachementrpc3sm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Fourni_RPC3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ROLE_FOURNI_RPC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC3SM getAttachementrpc3sm() {
		if (attachementrpc3sm != null && attachementrpc3sm.eIsProxy()) {
			InternalEObject oldAttachementrpc3sm = (InternalEObject)attachementrpc3sm;
			attachementrpc3sm = (AttachementRPC3SM)eResolveProxy(oldAttachementrpc3sm);
			if (attachementrpc3sm != oldAttachementrpc3sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM, oldAttachementrpc3sm, attachementrpc3sm));
			}
		}
		return attachementrpc3sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementRPC3SM basicGetAttachementrpc3sm() {
		return attachementrpc3sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachementrpc3sm(AttachementRPC3SM newAttachementrpc3sm) {
		AttachementRPC3SM oldAttachementrpc3sm = attachementrpc3sm;
		attachementrpc3sm = newAttachementrpc3sm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM, oldAttachementrpc3sm, attachementrpc3sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM:
				if (resolve) return getAttachementrpc3sm();
				return basicGetAttachementrpc3sm();
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
			case AsaM1Package.ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM:
				setAttachementrpc3sm((AttachementRPC3SM)newValue);
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
			case AsaM1Package.ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM:
				setAttachementrpc3sm((AttachementRPC3SM)null);
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
			case AsaM1Package.ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM:
				return attachementrpc3sm != null;
		}
		return super.eIsSet(featureID);
	}

} //Role_Fourni_RPC3Impl
