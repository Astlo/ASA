/**
 */
package asaM1.impl;

import aSA.impl.ConfigurationImpl;

import asaM1.AsaM1Package;
import asaM1.AttacheClientRPC;
import asaM1.AttacheServeurRPC;
import asaM1.AttachementRPC1CM;
import asaM1.AttachementRPC1DB;
import asaM1.AttachementRPC2DB;
import asaM1.AttachementRPC2SM;
import asaM1.AttachementRPC3CM;
import asaM1.AttachementRPC3SM;
import asaM1.BindingServeur;
import asaM1.Connection;
import asaM1.Connection_PortFourni;
import asaM1.Database;
import asaM1.RPC1;
import asaM1.RPC2;
import asaM1.RPC3;
import asaM1.RPC_Role_Fourni;
import asaM1.Role_fourni_RPC1;
import asaM1.Security;
import asaM1.Server;
import asaM1.Server_Detail;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getRpc2 <em>Rpc2</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getRpc3 <em>Rpc3</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getRpc1 <em>Rpc1</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getAttachementrpc3cm <em>Attachementrpc3cm</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getAttachementrpc3sm <em>Attachementrpc3sm</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getAttachementrpc2sm <em>Attachementrpc2sm</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getAttachementrpc2db <em>Attachementrpc2db</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getAttachementrpc1cm <em>Attachementrpc1cm</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getAttachementrpc1db <em>Attachementrpc1db</em>}</li>
 *   <li>{@link asaM1.impl.Server_DetailImpl#getBindingserveur <em>Bindingserveur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Server_DetailImpl extends ConfigurationImpl implements Server_Detail {
	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected Security security;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getRpc2() <em>Rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc2()
	 * @generated
	 * @ordered
	 */
	protected RPC2 rpc2;

	/**
	 * The cached value of the '{@link #getRpc3() <em>Rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc3()
	 * @generated
	 * @ordered
	 */
	protected RPC3 rpc3;

	/**
	 * The cached value of the '{@link #getRpc1() <em>Rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc1()
	 * @generated
	 * @ordered
	 */
	protected RPC1 rpc1;

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
	 * The cached value of the '{@link #getAttachementrpc3sm() <em>Attachementrpc3sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc3sm()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC3SM attachementrpc3sm;

	/**
	 * The cached value of the '{@link #getAttachementrpc2sm() <em>Attachementrpc2sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc2sm()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC2SM attachementrpc2sm;

	/**
	 * The cached value of the '{@link #getAttachementrpc2db() <em>Attachementrpc2db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc2db()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC2DB attachementrpc2db;

	/**
	 * The cached value of the '{@link #getAttachementrpc1cm() <em>Attachementrpc1cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc1cm()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC1CM attachementrpc1cm;

	/**
	 * The cached value of the '{@link #getAttachementrpc1db() <em>Attachementrpc1db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachementrpc1db()
	 * @generated
	 * @ordered
	 */
	protected AttachementRPC1DB attachementrpc1db;

	/**
	 * The cached value of the '{@link #getBindingserveur() <em>Bindingserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingserveur()
	 * @generated
	 * @ordered
	 */
	protected BindingServeur bindingserveur;

	HashMap<Role_fourni_RPC1, AttachementRPC1CM> rolesCorrespondanceCM;
	HashMap<Role_fourni_RPC1, AttachementRPC1DB> rolesCorrespondanceDB;
	
	private Server observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Server_DetailImpl() {
		super();
	}

	protected Server_DetailImpl(Server observer) {
		super();
		connection = new ConnectionImpl(this);
		database = new DatabaseImpl(this);
		security = new SecurityImpl();
		
		rpc1 = new RPC1Impl();
		rpc2 = new RPC2Impl();
		rpc3 = new RPC3Impl();
		
		attachementrpc1cm = new AttachementRPC1CMImpl(connection.getConnection_port_fourni().get(0), rpc1.getRpc_role_requiscm(), connection.getConnection_port_requis().get(0), rpc1.getRpc_role_fournicm());
		attachementrpc1db = new AttachementRPC1DBImpl(database.getDatabase_port_fourni().get(0), rpc1.getRpc_role_requisdb(), database.getDatabase_port_requis().get(0), rpc1.getRpc_role_fournidb());
		attachementrpc2db = new AttachementRPC2DBImpl();
		attachementrpc2sm = new AttachementRPC2SMImpl();
		attachementrpc3cm = new AttachementRPC3CMImpl();
		attachementrpc3sm = new AttachementRPC3SMImpl();
		
		rolesCorrespondanceCM = new HashMap<Role_fourni_RPC1, AttachementRPC1CM>();
		rolesCorrespondanceDB = new HashMap<Role_fourni_RPC1, AttachementRPC1DB>();

		rolesCorrespondanceCM.put(rpc1.getRpc_role_fournicm(), attachementrpc1cm);
		rolesCorrespondanceDB.put(rpc1.getRpc_role_fournidb(), attachementrpc1db);
		
		bindingserveur = new BindingServeurImpl();
	}
	
	@Override
	public void transfert(Connection_PortFourni port, String message) {
		if(rolesCorrespondanceCM.containsKey(port))
		{
			attachementrpc1cm.getCorrespondance(port).notifyClient(message);
		}
		else if (rolesCorrespondanceDB.containsKey(port))
		{
			attachementrpc1db.getCorrespondance(port).notifyDB(message);
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.SERVER_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security getSecurity() {
		if (security != null && security.eIsProxy()) {
			InternalEObject oldSecurity = (InternalEObject)security;
			security = (Security)eResolveProxy(oldSecurity);
			if (security != oldSecurity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__SECURITY, oldSecurity, security));
			}
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security basicGetSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurity(Security newSecurity) {
		Security oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC2 getRpc2() {
		if (rpc2 != null && rpc2.eIsProxy()) {
			InternalEObject oldRpc2 = (InternalEObject)rpc2;
			rpc2 = (RPC2)eResolveProxy(oldRpc2);
			if (rpc2 != oldRpc2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__RPC2, oldRpc2, rpc2));
			}
		}
		return rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC2 basicGetRpc2() {
		return rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpc2(RPC2 newRpc2) {
		RPC2 oldRpc2 = rpc2;
		rpc2 = newRpc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__RPC2, oldRpc2, rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC3 getRpc3() {
		if (rpc3 != null && rpc3.eIsProxy()) {
			InternalEObject oldRpc3 = (InternalEObject)rpc3;
			rpc3 = (RPC3)eResolveProxy(oldRpc3);
			if (rpc3 != oldRpc3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__RPC3, oldRpc3, rpc3));
			}
		}
		return rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC3 basicGetRpc3() {
		return rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpc3(RPC3 newRpc3) {
		RPC3 oldRpc3 = rpc3;
		rpc3 = newRpc3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__RPC3, oldRpc3, rpc3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC1 getRpc1() {
		if (rpc1 != null && rpc1.eIsProxy()) {
			InternalEObject oldRpc1 = (InternalEObject)rpc1;
			rpc1 = (RPC1)eResolveProxy(oldRpc1);
			if (rpc1 != oldRpc1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__RPC1, oldRpc1, rpc1));
			}
		}
		return rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC1 basicGetRpc1() {
		return rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpc1(RPC1 newRpc1) {
		RPC1 oldRpc1 = rpc1;
		rpc1 = newRpc1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__RPC1, oldRpc1, rpc1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3CM, oldAttachementrpc3cm, attachementrpc3cm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3CM, oldAttachementrpc3cm, attachementrpc3cm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3SM, oldAttachementrpc3sm, attachementrpc3sm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3SM, oldAttachementrpc3sm, attachementrpc3sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC2SM getAttachementrpc2sm() {
		if (attachementrpc2sm != null && attachementrpc2sm.eIsProxy()) {
			InternalEObject oldAttachementrpc2sm = (InternalEObject)attachementrpc2sm;
			attachementrpc2sm = (AttachementRPC2SM)eResolveProxy(oldAttachementrpc2sm);
			if (attachementrpc2sm != oldAttachementrpc2sm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2SM, oldAttachementrpc2sm, attachementrpc2sm));
			}
		}
		return attachementrpc2sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementRPC2SM basicGetAttachementrpc2sm() {
		return attachementrpc2sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachementrpc2sm(AttachementRPC2SM newAttachementrpc2sm) {
		AttachementRPC2SM oldAttachementrpc2sm = attachementrpc2sm;
		attachementrpc2sm = newAttachementrpc2sm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2SM, oldAttachementrpc2sm, attachementrpc2sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC2DB getAttachementrpc2db() {
		if (attachementrpc2db != null && attachementrpc2db.eIsProxy()) {
			InternalEObject oldAttachementrpc2db = (InternalEObject)attachementrpc2db;
			attachementrpc2db = (AttachementRPC2DB)eResolveProxy(oldAttachementrpc2db);
			if (attachementrpc2db != oldAttachementrpc2db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2DB, oldAttachementrpc2db, attachementrpc2db));
			}
		}
		return attachementrpc2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementRPC2DB basicGetAttachementrpc2db() {
		return attachementrpc2db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachementrpc2db(AttachementRPC2DB newAttachementrpc2db) {
		AttachementRPC2DB oldAttachementrpc2db = attachementrpc2db;
		attachementrpc2db = newAttachementrpc2db;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2DB, oldAttachementrpc2db, attachementrpc2db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC1CM getAttachementrpc1cm() {
		if (attachementrpc1cm != null && attachementrpc1cm.eIsProxy()) {
			InternalEObject oldAttachementrpc1cm = (InternalEObject)attachementrpc1cm;
			attachementrpc1cm = (AttachementRPC1CM)eResolveProxy(oldAttachementrpc1cm);
			if (attachementrpc1cm != oldAttachementrpc1cm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1CM, oldAttachementrpc1cm, attachementrpc1cm));
			}
		}
		return attachementrpc1cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementRPC1CM basicGetAttachementrpc1cm() {
		return attachementrpc1cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachementrpc1cm(AttachementRPC1CM newAttachementrpc1cm) {
		AttachementRPC1CM oldAttachementrpc1cm = attachementrpc1cm;
		attachementrpc1cm = newAttachementrpc1cm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1CM, oldAttachementrpc1cm, attachementrpc1cm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC1DB getAttachementrpc1db() {
		if (attachementrpc1db != null && attachementrpc1db.eIsProxy()) {
			InternalEObject oldAttachementrpc1db = (InternalEObject)attachementrpc1db;
			attachementrpc1db = (AttachementRPC1DB)eResolveProxy(oldAttachementrpc1db);
			if (attachementrpc1db != oldAttachementrpc1db) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1DB, oldAttachementrpc1db, attachementrpc1db));
			}
		}
		return attachementrpc1db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachementRPC1DB basicGetAttachementrpc1db() {
		return attachementrpc1db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachementrpc1db(AttachementRPC1DB newAttachementrpc1db) {
		AttachementRPC1DB oldAttachementrpc1db = attachementrpc1db;
		attachementrpc1db = newAttachementrpc1db;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1DB, oldAttachementrpc1db, attachementrpc1db));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingServeur getBindingserveur() {
		if (bindingserveur != null && bindingserveur.eIsProxy()) {
			InternalEObject oldBindingserveur = (InternalEObject)bindingserveur;
			bindingserveur = (BindingServeur)eResolveProxy(oldBindingserveur);
			if (bindingserveur != oldBindingserveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER_DETAIL__BINDINGSERVEUR, oldBindingserveur, bindingserveur));
			}
		}
		return bindingserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingServeur basicGetBindingserveur() {
		return bindingserveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingserveur(BindingServeur newBindingserveur) {
		BindingServeur oldBindingserveur = bindingserveur;
		bindingserveur = newBindingserveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER_DETAIL__BINDINGSERVEUR, oldBindingserveur, bindingserveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.SERVER_DETAIL__SECURITY:
				if (resolve) return getSecurity();
				return basicGetSecurity();
			case AsaM1Package.SERVER_DETAIL__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case AsaM1Package.SERVER_DETAIL__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case AsaM1Package.SERVER_DETAIL__RPC2:
				if (resolve) return getRpc2();
				return basicGetRpc2();
			case AsaM1Package.SERVER_DETAIL__RPC3:
				if (resolve) return getRpc3();
				return basicGetRpc3();
			case AsaM1Package.SERVER_DETAIL__RPC1:
				if (resolve) return getRpc1();
				return basicGetRpc1();
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3CM:
				if (resolve) return getAttachementrpc3cm();
				return basicGetAttachementrpc3cm();
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3SM:
				if (resolve) return getAttachementrpc3sm();
				return basicGetAttachementrpc3sm();
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2SM:
				if (resolve) return getAttachementrpc2sm();
				return basicGetAttachementrpc2sm();
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2DB:
				if (resolve) return getAttachementrpc2db();
				return basicGetAttachementrpc2db();
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1CM:
				if (resolve) return getAttachementrpc1cm();
				return basicGetAttachementrpc1cm();
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1DB:
				if (resolve) return getAttachementrpc1db();
				return basicGetAttachementrpc1db();
			case AsaM1Package.SERVER_DETAIL__BINDINGSERVEUR:
				if (resolve) return getBindingserveur();
				return basicGetBindingserveur();
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
			case AsaM1Package.SERVER_DETAIL__SECURITY:
				setSecurity((Security)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__CONNECTION:
				setConnection((Connection)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__DATABASE:
				setDatabase((Database)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__RPC2:
				setRpc2((RPC2)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__RPC3:
				setRpc3((RPC3)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__RPC1:
				setRpc1((RPC1)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3CM:
				setAttachementrpc3cm((AttachementRPC3CM)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3SM:
				setAttachementrpc3sm((AttachementRPC3SM)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2SM:
				setAttachementrpc2sm((AttachementRPC2SM)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2DB:
				setAttachementrpc2db((AttachementRPC2DB)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1CM:
				setAttachementrpc1cm((AttachementRPC1CM)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1DB:
				setAttachementrpc1db((AttachementRPC1DB)newValue);
				return;
			case AsaM1Package.SERVER_DETAIL__BINDINGSERVEUR:
				setBindingserveur((BindingServeur)newValue);
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
			case AsaM1Package.SERVER_DETAIL__SECURITY:
				setSecurity((Security)null);
				return;
			case AsaM1Package.SERVER_DETAIL__CONNECTION:
				setConnection((Connection)null);
				return;
			case AsaM1Package.SERVER_DETAIL__DATABASE:
				setDatabase((Database)null);
				return;
			case AsaM1Package.SERVER_DETAIL__RPC2:
				setRpc2((RPC2)null);
				return;
			case AsaM1Package.SERVER_DETAIL__RPC3:
				setRpc3((RPC3)null);
				return;
			case AsaM1Package.SERVER_DETAIL__RPC1:
				setRpc1((RPC1)null);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3CM:
				setAttachementrpc3cm((AttachementRPC3CM)null);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3SM:
				setAttachementrpc3sm((AttachementRPC3SM)null);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2SM:
				setAttachementrpc2sm((AttachementRPC2SM)null);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2DB:
				setAttachementrpc2db((AttachementRPC2DB)null);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1CM:
				setAttachementrpc1cm((AttachementRPC1CM)null);
				return;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1DB:
				setAttachementrpc1db((AttachementRPC1DB)null);
				return;
			case AsaM1Package.SERVER_DETAIL__BINDINGSERVEUR:
				setBindingserveur((BindingServeur)null);
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
			case AsaM1Package.SERVER_DETAIL__SECURITY:
				return security != null;
			case AsaM1Package.SERVER_DETAIL__CONNECTION:
				return connection != null;
			case AsaM1Package.SERVER_DETAIL__DATABASE:
				return database != null;
			case AsaM1Package.SERVER_DETAIL__RPC2:
				return rpc2 != null;
			case AsaM1Package.SERVER_DETAIL__RPC3:
				return rpc3 != null;
			case AsaM1Package.SERVER_DETAIL__RPC1:
				return rpc1 != null;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3CM:
				return attachementrpc3cm != null;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC3SM:
				return attachementrpc3sm != null;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2SM:
				return attachementrpc2sm != null;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC2DB:
				return attachementrpc2db != null;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1CM:
				return attachementrpc1cm != null;
			case AsaM1Package.SERVER_DETAIL__ATTACHEMENTRPC1DB:
				return attachementrpc1db != null;
			case AsaM1Package.SERVER_DETAIL__BINDINGSERVEUR:
				return bindingserveur != null;
		}
		return super.eIsSet(featureID);
	}

} //Server_DetailImpl
