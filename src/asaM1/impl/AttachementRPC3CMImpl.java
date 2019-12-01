/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC3CM;
import asaM1.Connection_PortFourni;
import asaM1.Connection_PortRequis;
import asaM1.Role_Fourni_RPC3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement RPC3CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttachementRPC3CMImpl#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC3CMImpl#getConnection_portrequis <em>Connection portrequis</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC3CMImpl#getConnection_portfourni <em>Connection portfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementRPC3CMImpl extends AttachementImpl implements AttachementRPC3CM {
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
	 * The cached value of the '{@link #getConnection_portrequis() <em>Connection portrequis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_portrequis()
	 * @generated
	 * @ordered
	 */
	protected Connection_PortRequis connection_portrequis;

	/**
	 * The cached value of the '{@link #getConnection_portfourni() <em>Connection portfourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_portfourni()
	 * @generated
	 * @ordered
	 */
	protected Connection_PortFourni connection_portfourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementRPC3CMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHEMENT_RPC3CM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3, oldRole_fourni_rpc3, role_fourni_rpc3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3, oldRole_fourni_rpc3, role_fourni_rpc3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortRequis getConnection_portrequis() {
		if (connection_portrequis != null && connection_portrequis.eIsProxy()) {
			InternalEObject oldConnection_portrequis = (InternalEObject)connection_portrequis;
			connection_portrequis = (Connection_PortRequis)eResolveProxy(oldConnection_portrequis);
			if (connection_portrequis != oldConnection_portrequis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS, oldConnection_portrequis, connection_portrequis));
			}
		}
		return connection_portrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_PortRequis basicGetConnection_portrequis() {
		return connection_portrequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection_portrequis(Connection_PortRequis newConnection_portrequis) {
		Connection_PortRequis oldConnection_portrequis = connection_portrequis;
		connection_portrequis = newConnection_portrequis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS, oldConnection_portrequis, connection_portrequis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortFourni getConnection_portfourni() {
		if (connection_portfourni != null && connection_portfourni.eIsProxy()) {
			InternalEObject oldConnection_portfourni = (InternalEObject)connection_portfourni;
			connection_portfourni = (Connection_PortFourni)eResolveProxy(oldConnection_portfourni);
			if (connection_portfourni != oldConnection_portfourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI, oldConnection_portfourni, connection_portfourni));
			}
		}
		return connection_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_PortFourni basicGetConnection_portfourni() {
		return connection_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection_portfourni(Connection_PortFourni newConnection_portfourni) {
		Connection_PortFourni oldConnection_portfourni = connection_portfourni;
		connection_portfourni = newConnection_portfourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI, oldConnection_portfourni, connection_portfourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3:
				if (resolve) return getRole_fourni_rpc3();
				return basicGetRole_fourni_rpc3();
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS:
				if (resolve) return getConnection_portrequis();
				return basicGetConnection_portrequis();
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI:
				if (resolve) return getConnection_portfourni();
				return basicGetConnection_portfourni();
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
			case AsaM1Package.ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3:
				setRole_fourni_rpc3((Role_Fourni_RPC3)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS:
				setConnection_portrequis((Connection_PortRequis)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI:
				setConnection_portfourni((Connection_PortFourni)newValue);
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
			case AsaM1Package.ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3:
				setRole_fourni_rpc3((Role_Fourni_RPC3)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS:
				setConnection_portrequis((Connection_PortRequis)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI:
				setConnection_portfourni((Connection_PortFourni)null);
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
			case AsaM1Package.ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3:
				return role_fourni_rpc3 != null;
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS:
				return connection_portrequis != null;
			case AsaM1Package.ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI:
				return connection_portfourni != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachementRPC3CMImpl
