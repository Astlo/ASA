/**
 */
package asaM1.impl;

import asaM1.AsaM1Factory;
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
import asaM1.Client;
import asaM1.Client_Port_Fourni;
import asaM1.Client_Port_Requis;
import asaM1.Connection;
import asaM1.Connection_PortFourni;
import asaM1.Connection_PortRequis;
import asaM1.Database;
import asaM1.Database_PortFourni;
import asaM1.Database_PortRequis;
import asaM1.NewEClass40;
import asaM1.RPC;
import asaM1.RPC1;
import asaM1.RPC2;
import asaM1.RPC3;
import asaM1.RPC_Role_Fourni;
import asaM1.RPC_Role_Requis;
import asaM1.Role_Fourni_RPC2;
import asaM1.Role_Fourni_RPC3;
import asaM1.Role_Requis_RPC1;
import asaM1.Role_Requis_RPC2;
import asaM1.Role_Requis_RPC3;
import asaM1.Role_fourni_RPC1;
import asaM1.Security;
import asaM1.Security_PortFourni;
import asaM1.Security_PortRequis;
import asaM1.Server;
import asaM1.Server_Detail;
import asaM1.Serveur_Port_Fourni;
import asaM1.Serveur_Port_Requis;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsaM1FactoryImpl extends EFactoryImpl implements AsaM1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AsaM1Factory init() {
		try {
			AsaM1Factory theAsaM1Factory = (AsaM1Factory)EPackage.Registry.INSTANCE.getEFactory(AsaM1Package.eNS_URI);
			if (theAsaM1Factory != null) {
				return theAsaM1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsaM1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsaM1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AsaM1Package.SYSTEM: return createSystem();
			case AsaM1Package.CLIENT: return createClient();
			case AsaM1Package.SERVER: return createServer();
			case AsaM1Package.RPC: return createRPC();
			case AsaM1Package.RPC_ROLE_REQUIS: return createRPC_Role_Requis();
			case AsaM1Package.RPC_ROLE_FOURNI: return createRPC_Role_Fourni();
			case AsaM1Package.CLIENT_PORT_FOURNI: return createClient_Port_Fourni();
			case AsaM1Package.SERVEUR_PORT_REQUIS: return createServeur_Port_Requis();
			case AsaM1Package.ATTACHE_SERVEUR_RPC: return createAttacheServeurRPC();
			case AsaM1Package.ATTACHE_CLIENT_RPC: return createAttacheClientRPC();
			case AsaM1Package.DATABASE: return createDatabase();
			case AsaM1Package.CONNECTION: return createConnection();
			case AsaM1Package.SECURITY: return createSecurity();
			case AsaM1Package.SERVER_DETAIL: return createServer_Detail();
			case AsaM1Package.RPC1: return createRPC1();
			case AsaM1Package.RPC2: return createRPC2();
			case AsaM1Package.RPC3: return createRPC3();
			case AsaM1Package.ATTACHEMENT_RPC1DB: return createAttachementRPC1DB();
			case AsaM1Package.ATTACHEMENT_RPC1CM: return createAttachementRPC1CM();
			case AsaM1Package.ATTACHEMENT_RPC2DB: return createAttachementRPC2DB();
			case AsaM1Package.ATTACHEMENT_RPC2SM: return createAttachementRPC2SM();
			case AsaM1Package.ATTACHEMENT_RPC3CM: return createAttachementRPC3CM();
			case AsaM1Package.ATTACHEMENT_RPC3SM: return createAttachementRPC3SM();
			case AsaM1Package.CONNECTION_PORT_FOURNI: return createConnection_PortFourni();
			case AsaM1Package.SECURITY_PORT_FOURNI: return createSecurity_PortFourni();
			case AsaM1Package.DATABASE_PORT_FOURNI: return createDatabase_PortFourni();
			case AsaM1Package.ROLE_FOURNI_RPC1: return createRole_fourni_RPC1();
			case AsaM1Package.ROLE_REQUIS_RPC1: return createRole_Requis_RPC1();
			case AsaM1Package.ROLE_FOURNI_RPC2: return createRole_Fourni_RPC2();
			case AsaM1Package.ROLE_REQUIS_RPC2: return createRole_Requis_RPC2();
			case AsaM1Package.ROLE_FOURNI_RPC3: return createRole_Fourni_RPC3();
			case AsaM1Package.ROLE_REQUIS_RPC3: return createRole_Requis_RPC3();
			case AsaM1Package.BINDING_SERVEUR: return createBindingServeur();
			case AsaM1Package.SECURITY_PORT_REQUIS: return createSecurity_PortRequis();
			case AsaM1Package.DATABASE_PORT_REQUIS: return createDatabase_PortRequis();
			case AsaM1Package.CONNECTION_PORT_REQUIS: return createConnection_PortRequis();
			case AsaM1Package.CLIENT_PORT_REQUIS: return createClient_Port_Requis();
			case AsaM1Package.SERVEUR_PORT_FOURNI: return createServeur_Port_Fourni();
			case AsaM1Package.NEW_ECLASS40: return createNewEClass40();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public asaM1.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC createRPC() {
		RPCImpl rpc = new RPCImpl();
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC_Role_Requis createRPC_Role_Requis() {
		RPC_Role_RequisImpl rpC_Role_Requis = new RPC_Role_RequisImpl();
		return rpC_Role_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC_Role_Fourni createRPC_Role_Fourni() {
		RPC_Role_FourniImpl rpC_Role_Fourni = new RPC_Role_FourniImpl();
		return rpC_Role_Fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client_Port_Fourni createClient_Port_Fourni() {
		Client_Port_FourniImpl client_Port_Fourni = new Client_Port_FourniImpl();
		return client_Port_Fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Serveur_Port_Requis createServeur_Port_Requis() {
		Serveur_Port_RequisImpl serveur_Port_Requis = new Serveur_Port_RequisImpl();
		return serveur_Port_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttacheServeurRPC createAttacheServeurRPC() {
		AttacheServeurRPCImpl attacheServeurRPC = new AttacheServeurRPCImpl();
		return attacheServeurRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttacheClientRPC createAttacheClientRPC() {
		AttacheClientRPCImpl attacheClientRPC = new AttacheClientRPCImpl();
		return attacheClientRPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server_Detail createServer_Detail() {
		Server_DetailImpl server_Detail = new Server_DetailImpl();
		return server_Detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC1 createRPC1() {
		RPC1Impl rpc1 = new RPC1Impl();
		return rpc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC2 createRPC2() {
		RPC2Impl rpc2 = new RPC2Impl();
		return rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC3 createRPC3() {
		RPC3Impl rpc3 = new RPC3Impl();
		return rpc3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC1DB createAttachementRPC1DB() {
		AttachementRPC1DBImpl attachementRPC1DB = new AttachementRPC1DBImpl();
		return attachementRPC1DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC1CM createAttachementRPC1CM() {
		AttachementRPC1CMImpl attachementRPC1CM = new AttachementRPC1CMImpl();
		return attachementRPC1CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC2DB createAttachementRPC2DB() {
		AttachementRPC2DBImpl attachementRPC2DB = new AttachementRPC2DBImpl();
		return attachementRPC2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC2SM createAttachementRPC2SM() {
		AttachementRPC2SMImpl attachementRPC2SM = new AttachementRPC2SMImpl();
		return attachementRPC2SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC3CM createAttachementRPC3CM() {
		AttachementRPC3CMImpl attachementRPC3CM = new AttachementRPC3CMImpl();
		return attachementRPC3CM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachementRPC3SM createAttachementRPC3SM() {
		AttachementRPC3SMImpl attachementRPC3SM = new AttachementRPC3SMImpl();
		return attachementRPC3SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortFourni createConnection_PortFourni() {
		Connection_PortFourniImpl connection_PortFourni = new Connection_PortFourniImpl();
		return connection_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security_PortFourni createSecurity_PortFourni() {
		Security_PortFourniImpl security_PortFourni = new Security_PortFourniImpl();
		return security_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database_PortFourni createDatabase_PortFourni() {
		Database_PortFourniImpl database_PortFourni = new Database_PortFourniImpl();
		return database_PortFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_fourni_RPC1 createRole_fourni_RPC1() {
		Role_fourni_RPC1Impl role_fourni_RPC1 = new Role_fourni_RPC1Impl();
		return role_fourni_RPC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC1 createRole_Requis_RPC1() {
		Role_Requis_RPC1Impl role_Requis_RPC1 = new Role_Requis_RPC1Impl();
		return role_Requis_RPC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Fourni_RPC2 createRole_Fourni_RPC2() {
		Role_Fourni_RPC2Impl role_Fourni_RPC2 = new Role_Fourni_RPC2Impl();
		return role_Fourni_RPC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC2 createRole_Requis_RPC2() {
		Role_Requis_RPC2Impl role_Requis_RPC2 = new Role_Requis_RPC2Impl();
		return role_Requis_RPC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Fourni_RPC3 createRole_Fourni_RPC3() {
		Role_Fourni_RPC3Impl role_Fourni_RPC3 = new Role_Fourni_RPC3Impl();
		return role_Fourni_RPC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC3 createRole_Requis_RPC3() {
		Role_Requis_RPC3Impl role_Requis_RPC3 = new Role_Requis_RPC3Impl();
		return role_Requis_RPC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingServeur createBindingServeur() {
		BindingServeurImpl bindingServeur = new BindingServeurImpl();
		return bindingServeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security_PortRequis createSecurity_PortRequis() {
		Security_PortRequisImpl security_PortRequis = new Security_PortRequisImpl();
		return security_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database_PortRequis createDatabase_PortRequis() {
		Database_PortRequisImpl database_PortRequis = new Database_PortRequisImpl();
		return database_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortRequis createConnection_PortRequis() {
		Connection_PortRequisImpl connection_PortRequis = new Connection_PortRequisImpl();
		return connection_PortRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client_Port_Requis createClient_Port_Requis() {
		Client_Port_RequisImpl client_Port_Requis = new Client_Port_RequisImpl();
		return client_Port_Requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Serveur_Port_Fourni createServeur_Port_Fourni() {
		Serveur_Port_FourniImpl serveur_Port_Fourni = new Serveur_Port_FourniImpl();
		return serveur_Port_Fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NewEClass40 createNewEClass40() {
		NewEClass40Impl newEClass40 = new NewEClass40Impl();
		return newEClass40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsaM1Package getAsaM1Package() {
		return (AsaM1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AsaM1Package getPackage() {
		return AsaM1Package.eINSTANCE;
	}

} //AsaM1FactoryImpl
