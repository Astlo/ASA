/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC2SM;
import asaM1.Role_Fourni_RPC2;
import asaM1.Role_Requis_RPC2;
import asaM1.Security_PortFourni;
import asaM1.Security_PortRequis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement RPC2SM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttachementRPC2SMImpl#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC2SMImpl#getSecurity_portfourni <em>Security portfourni</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC2SMImpl#getSecurity_port_requis <em>Security port requis</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC2SMImpl#getRole_requis_rpc2 <em>Role requis rpc2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementRPC2SMImpl extends AttachementImpl implements AttachementRPC2SM {
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
	 * The cached value of the '{@link #getSecurity_portfourni() <em>Security portfourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_portfourni()
	 * @generated
	 * @ordered
	 */
	protected Security_PortFourni security_portfourni;

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
	protected AttachementRPC2SMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHEMENT_RPC2SM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2, oldRole_fourni_rpc2, role_fourni_rpc2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2, oldRole_fourni_rpc2, role_fourni_rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security_PortFourni getSecurity_portfourni() {
		if (security_portfourni != null && security_portfourni.eIsProxy()) {
			InternalEObject oldSecurity_portfourni = (InternalEObject)security_portfourni;
			security_portfourni = (Security_PortFourni)eResolveProxy(oldSecurity_portfourni);
			if (security_portfourni != oldSecurity_portfourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI, oldSecurity_portfourni, security_portfourni));
			}
		}
		return security_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security_PortFourni basicGetSecurity_portfourni() {
		return security_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity_portfourni(Security_PortFourni newSecurity_portfourni) {
		Security_PortFourni oldSecurity_portfourni = security_portfourni;
		security_portfourni = newSecurity_portfourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI, oldSecurity_portfourni, security_portfourni));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS, oldSecurity_port_requis, security_port_requis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS, oldSecurity_port_requis, security_port_requis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2, oldRole_requis_rpc2, role_requis_rpc2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2, oldRole_requis_rpc2, role_requis_rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2:
				if (resolve) return getRole_fourni_rpc2();
				return basicGetRole_fourni_rpc2();
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI:
				if (resolve) return getSecurity_portfourni();
				return basicGetSecurity_portfourni();
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS:
				if (resolve) return getSecurity_port_requis();
				return basicGetSecurity_port_requis();
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2:
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
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2:
				setRole_fourni_rpc2((Role_Fourni_RPC2)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI:
				setSecurity_portfourni((Security_PortFourni)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS:
				setSecurity_port_requis((Security_PortRequis)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2:
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
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2:
				setRole_fourni_rpc2((Role_Fourni_RPC2)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI:
				setSecurity_portfourni((Security_PortFourni)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS:
				setSecurity_port_requis((Security_PortRequis)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2:
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
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2:
				return role_fourni_rpc2 != null;
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI:
				return security_portfourni != null;
			case AsaM1Package.ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS:
				return security_port_requis != null;
			case AsaM1Package.ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2:
				return role_requis_rpc2 != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachementRPC2SMImpl
