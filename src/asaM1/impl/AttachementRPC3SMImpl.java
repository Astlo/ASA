/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC3SM;
import asaM1.Role_Requis_RPC3;
import asaM1.Security_PortFourni;
import asaM1.Security_PortRequis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement RPC3SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttachementRPC3SMImpl#getRole_requis_rpc3 <em>Role requis rpc3</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC3SMImpl#getSecurity_port_requis <em>Security port requis</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC3SMImpl#getSecurity_port_fourni <em>Security port fourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementRPC3SMImpl extends AttachementImpl implements AttachementRPC3SM {
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
	 * The cached value of the '{@link #getSecurity_port_requis() <em>Security port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Security_PortRequis security_port_requis;

	/**
	 * The cached value of the '{@link #getSecurity_port_fourni() <em>Security port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected Security_PortFourni security_port_fourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementRPC3SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHEMENT_RPC3SM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3, oldRole_requis_rpc3, role_requis_rpc3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3, oldRole_requis_rpc3, role_requis_rpc3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security_PortRequis getSecurity_port_requis() {
		if (security_port_requis != null && security_port_requis.eIsProxy()) {
			InternalEObject oldSecurity_port_requis = (InternalEObject)security_port_requis;
			security_port_requis = (Security_PortRequis)eResolveProxy(oldSecurity_port_requis);
			if (security_port_requis != oldSecurity_port_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS, oldSecurity_port_requis, security_port_requis));
			}
		}
		return security_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_PortRequis basicGetSecurity_port_requis() {
		return security_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity_port_requis(Security_PortRequis newSecurity_port_requis) {
		Security_PortRequis oldSecurity_port_requis = security_port_requis;
		security_port_requis = newSecurity_port_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS, oldSecurity_port_requis, security_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security_PortFourni getSecurity_port_fourni() {
		if (security_port_fourni != null && security_port_fourni.eIsProxy()) {
			InternalEObject oldSecurity_port_fourni = (InternalEObject)security_port_fourni;
			security_port_fourni = (Security_PortFourni)eResolveProxy(oldSecurity_port_fourni);
			if (security_port_fourni != oldSecurity_port_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI, oldSecurity_port_fourni, security_port_fourni));
			}
		}
		return security_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_PortFourni basicGetSecurity_port_fourni() {
		return security_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity_port_fourni(Security_PortFourni newSecurity_port_fourni) {
		Security_PortFourni oldSecurity_port_fourni = security_port_fourni;
		security_port_fourni = newSecurity_port_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI, oldSecurity_port_fourni, security_port_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3:
				if (resolve) return getRole_requis_rpc3();
				return basicGetRole_requis_rpc3();
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS:
				if (resolve) return getSecurity_port_requis();
				return basicGetSecurity_port_requis();
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI:
				if (resolve) return getSecurity_port_fourni();
				return basicGetSecurity_port_fourni();
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
			case AsaM1Package.ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3:
				setRole_requis_rpc3((Role_Requis_RPC3)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS:
				setSecurity_port_requis((Security_PortRequis)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI:
				setSecurity_port_fourni((Security_PortFourni)newValue);
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
			case AsaM1Package.ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3:
				setRole_requis_rpc3((Role_Requis_RPC3)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS:
				setSecurity_port_requis((Security_PortRequis)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI:
				setSecurity_port_fourni((Security_PortFourni)null);
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
			case AsaM1Package.ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3:
				return role_requis_rpc3 != null;
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS:
				return security_port_requis != null;
			case AsaM1Package.ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI:
				return security_port_fourni != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachementRPC3SMImpl
