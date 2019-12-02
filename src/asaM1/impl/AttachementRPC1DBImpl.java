/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC1DB;
import asaM1.Client_Port_Requis;
import asaM1.Connection_PortFourni;
import asaM1.Database_PortFourni;
import asaM1.Database_PortRequis;
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
 * An implementation of the model object '<em><b>Attachement RPC1DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttachementRPC1DBImpl#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC1DBImpl#getRole_requis_rpc1 <em>Role requis rpc1</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC1DBImpl#getDatabase_port_requis <em>Database port requis</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC1DBImpl#getDatabase_portfourni <em>Database portfourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementRPC1DBImpl extends AttachementImpl implements AttachementRPC1DB {
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
	 * The cached value of the '{@link #getRole_requis_rpc1() <em>Role requis rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc1()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC1 role_requis_rpc1;

	/**
	 * The cached value of the '{@link #getDatabase_port_requis() <em>Database port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Database_PortRequis database_port_requis;

	/**
	 * The cached value of the '{@link #getDatabase_portfourni() <em>Database portfourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_portfourni()
	 * @generated
	 * @ordered
	 */
	protected Database_PortFourni database_portfourni;

	private Database_PortFourni database_PortFourni;

	private Database_PortRequis database_PortRequis;

	private Role_fourni_RPC1 rpc_role_fournidb;

	private Role_Requis_RPC1 rpc_role_requisdb;

	private HashMap<Database_PortFourni, Role_Requis_RPC1> correspondance_fourni;

	private HashMap<Role_fourni_RPC1, Database_PortRequis> correspondance_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementRPC1DBImpl() {
		super();
	}

	public AttachementRPC1DBImpl(Database_PortFourni database_PortFourni, Role_Requis_RPC1 rpc_role_requisdb,
			Database_PortRequis database_PortRequis, Role_fourni_RPC1 rpc_role_fournidb) {
		super();
		this.database_PortFourni = database_PortFourni;
		this.database_PortRequis = database_PortRequis;
		this.rpc_role_fournidb = rpc_role_fournidb;
		this.rpc_role_requisdb = rpc_role_requisdb;
		
		correspondance_fourni = new HashMap<Database_PortFourni, Role_Requis_RPC1>();
		correspondance_requis = new HashMap<Role_fourni_RPC1,Database_PortRequis >();
		
		correspondance_fourni.put(database_PortFourni, rpc_role_requisdb);
		correspondance_requis.put(rpc_role_fournidb, database_PortRequis);
	}

	@Override
	public Database_PortRequis getCorrespondance(Role_fourni_RPC1 role) {	
		return correspondance_requis.get(role);
	}
	
	@Override
	public Role_Requis_RPC1 getCorrespondance(Database_PortFourni port) {
		return correspondance_fourni.get(port);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHEMENT_RPC1DB;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1, oldRole_fourni_rpc1, role_fourni_rpc1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1, oldRole_fourni_rpc1, role_fourni_rpc1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1, oldRole_requis_rpc1, role_requis_rpc1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1, oldRole_requis_rpc1, role_requis_rpc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database_PortRequis getDatabase_port_requis() {
		if (database_port_requis != null && database_port_requis.eIsProxy()) {
			InternalEObject oldDatabase_port_requis = (InternalEObject)database_port_requis;
			database_port_requis = (Database_PortRequis)eResolveProxy(oldDatabase_port_requis);
			if (database_port_requis != oldDatabase_port_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS, oldDatabase_port_requis, database_port_requis));
			}
		}
		return database_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database_PortRequis basicGetDatabase_port_requis() {
		return database_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase_port_requis(Database_PortRequis newDatabase_port_requis) {
		Database_PortRequis oldDatabase_port_requis = database_port_requis;
		database_port_requis = newDatabase_port_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS, oldDatabase_port_requis, database_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database_PortFourni getDatabase_portfourni() {
		if (database_portfourni != null && database_portfourni.eIsProxy()) {
			InternalEObject oldDatabase_portfourni = (InternalEObject)database_portfourni;
			database_portfourni = (Database_PortFourni)eResolveProxy(oldDatabase_portfourni);
			if (database_portfourni != oldDatabase_portfourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI, oldDatabase_portfourni, database_portfourni));
			}
		}
		return database_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database_PortFourni basicGetDatabase_portfourni() {
		return database_portfourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase_portfourni(Database_PortFourni newDatabase_portfourni) {
		Database_PortFourni oldDatabase_portfourni = database_portfourni;
		database_portfourni = newDatabase_portfourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI, oldDatabase_portfourni, database_portfourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1:
				if (resolve) return getRole_fourni_rpc1();
				return basicGetRole_fourni_rpc1();
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1:
				if (resolve) return getRole_requis_rpc1();
				return basicGetRole_requis_rpc1();
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS:
				if (resolve) return getDatabase_port_requis();
				return basicGetDatabase_port_requis();
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI:
				if (resolve) return getDatabase_portfourni();
				return basicGetDatabase_portfourni();
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
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1:
				setRole_fourni_rpc1((Role_fourni_RPC1)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1:
				setRole_requis_rpc1((Role_Requis_RPC1)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS:
				setDatabase_port_requis((Database_PortRequis)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI:
				setDatabase_portfourni((Database_PortFourni)newValue);
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
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1:
				setRole_fourni_rpc1((Role_fourni_RPC1)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1:
				setRole_requis_rpc1((Role_Requis_RPC1)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS:
				setDatabase_port_requis((Database_PortRequis)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI:
				setDatabase_portfourni((Database_PortFourni)null);
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
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1:
				return role_fourni_rpc1 != null;
			case AsaM1Package.ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1:
				return role_requis_rpc1 != null;
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS:
				return database_port_requis != null;
			case AsaM1Package.ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI:
				return database_portfourni != null;
		}
		return super.eIsSet(featureID);
	}


} //AttachementRPC1DBImpl
