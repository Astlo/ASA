/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC1CM;
import asaM1.Connection_PortFourni;
import asaM1.Connection_PortRequis;
import asaM1.RPC_Role_Fourni;
import asaM1.RPC_Role_Requis;
import asaM1.Role_Requis_RPC1;
import asaM1.Role_fourni_RPC1;
import asaM1.Serveur_Port_Fourni;
import asaM1.Serveur_Port_Requis;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement RPC1CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttachementRPC1CMImpl#getRole_requis_rpc1 <em>Role requis rpc1</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC1CMImpl#getConnection_port_fourni <em>Connection port fourni</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC1CMImpl#getConnection_port_requis <em>Connection port requis</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC1CMImpl#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementRPC1CMImpl extends AttachementImpl implements AttachementRPC1CM {
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
	 * The cached value of the '{@link #getConnection_port_fourni() <em>Connection port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected Connection_PortFourni connection_port_fourni;

	/**
	 * The cached value of the '{@link #getConnection_port_requis() <em>Connection port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Connection_PortRequis connection_port_requis;

	/**
	 * The cached value of the '{@link #getRole_fourni_rpc1() <em>Role fourni rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc1()
	 * @generated
	 * @ordered
	 */
	protected Role_fourni_RPC1 role_fourni_rpc1;

	private Role_Requis_RPC1Impl rpc_role_requiscm;

	private Role_fourni_RPC1Impl rpc_role_fournicm;

	private Connection_PortRequis connection_PortRequis;

	private Connection_PortFourni connection_PortFourni;

	private HashMap<Connection_PortFourni, Role_Requis_RPC1Impl> correspondance_fourni;

	private HashMap<Role_fourni_RPC1Impl, Connection_PortRequis> correspondance_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementRPC1CMImpl() {
		super();
	}

	public AttachementRPC1CMImpl(Connection_PortFourni connection_PortFourni, Role_Requis_RPC1Impl rpc_role_requiscm,
			Connection_PortRequis connection_PortRequis, Role_fourni_RPC1Impl rpc_role_fournicm) {
		super();
		this.connection_PortFourni = connection_PortFourni;
		this.connection_PortRequis = connection_PortRequis;
		this.rpc_role_fournicm = rpc_role_fournicm;
		this.rpc_role_requiscm = rpc_role_requiscm;
		
		correspondance_fourni = new HashMap<Connection_PortFourni, Role_Requis_RPC1Impl>();
		correspondance_requis = new HashMap<Role_fourni_RPC1Impl,Connection_PortRequis >();
		
		correspondance_fourni.put(connection_PortFourni, rpc_role_requiscm);
		correspondance_requis.put(rpc_role_fournicm, connection_PortRequis);
	}

	@Override
	public Role_Requis_RPC1 getCorrespondance(Connection_PortFourni port) {
		return correspondance_fourni.get(port);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHEMENT_RPC1CM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1, oldRole_requis_rpc1, role_requis_rpc1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1, oldRole_requis_rpc1, role_requis_rpc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortFourni getConnection_port_fourni() {
		if (connection_port_fourni != null && connection_port_fourni.eIsProxy()) {
			InternalEObject oldConnection_port_fourni = (InternalEObject)connection_port_fourni;
			connection_port_fourni = (Connection_PortFourni)eResolveProxy(oldConnection_port_fourni);
			if (connection_port_fourni != oldConnection_port_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI, oldConnection_port_fourni, connection_port_fourni));
			}
		}
		return connection_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_PortFourni basicGetConnection_port_fourni() {
		return connection_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection_port_fourni(Connection_PortFourni newConnection_port_fourni) {
		Connection_PortFourni oldConnection_port_fourni = connection_port_fourni;
		connection_port_fourni = newConnection_port_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI, oldConnection_port_fourni, connection_port_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortRequis getConnection_port_requis() {
		if (connection_port_requis != null && connection_port_requis.eIsProxy()) {
			InternalEObject oldConnection_port_requis = (InternalEObject)connection_port_requis;
			connection_port_requis = (Connection_PortRequis)eResolveProxy(oldConnection_port_requis);
			if (connection_port_requis != oldConnection_port_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS, oldConnection_port_requis, connection_port_requis));
			}
		}
		return connection_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_PortRequis basicGetConnection_port_requis() {
		return connection_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection_port_requis(Connection_PortRequis newConnection_port_requis) {
		Connection_PortRequis oldConnection_port_requis = connection_port_requis;
		connection_port_requis = newConnection_port_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS, oldConnection_port_requis, connection_port_requis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1, oldRole_fourni_rpc1, role_fourni_rpc1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1, oldRole_fourni_rpc1, role_fourni_rpc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1:
				if (resolve) return getRole_requis_rpc1();
				return basicGetRole_requis_rpc1();
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI:
				if (resolve) return getConnection_port_fourni();
				return basicGetConnection_port_fourni();
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS:
				if (resolve) return getConnection_port_requis();
				return basicGetConnection_port_requis();
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1:
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
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1:
				setRole_requis_rpc1((Role_Requis_RPC1)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI:
				setConnection_port_fourni((Connection_PortFourni)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS:
				setConnection_port_requis((Connection_PortRequis)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1:
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
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1:
				setRole_requis_rpc1((Role_Requis_RPC1)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI:
				setConnection_port_fourni((Connection_PortFourni)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS:
				setConnection_port_requis((Connection_PortRequis)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1:
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
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1:
				return role_requis_rpc1 != null;
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI:
				return connection_port_fourni != null;
			case AsaM1Package.ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS:
				return connection_port_requis != null;
			case AsaM1Package.ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1:
				return role_fourni_rpc1 != null;
		}
		return super.eIsSet(featureID);
	}


} //AttachementRPC1CMImpl
