/**
 */
package asaM1.impl;

import aSA.ASAPackage;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsaM1PackageImpl extends EPackageImpl implements AsaM1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpC_Role_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpC_Role_FourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass client_Port_FourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveur_Port_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attacheServeurRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attacheClientRPCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass server_DetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpc1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpc2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpc3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementRPC1DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementRPC1CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementRPC2DBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementRPC2SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementRPC3CMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachementRPC3SMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass security_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass database_PortFourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_fourni_RPC1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_RPC1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_RPC2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_RPC2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Fourni_RPC3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass role_Requis_RPC3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingServeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass security_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass database_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connection_PortRequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass client_Port_RequisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serveur_Port_FourniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass40EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see asaM1.AsaM1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AsaM1PackageImpl() {
		super(eNS_URI, AsaM1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AsaM1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AsaM1Package init() {
		if (isInited) return (AsaM1Package)EPackage.Registry.INSTANCE.getEPackage(AsaM1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredAsaM1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		AsaM1PackageImpl theAsaM1Package = registeredAsaM1Package instanceof AsaM1PackageImpl ? (AsaM1PackageImpl)registeredAsaM1Package : new AsaM1PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ASAPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAsaM1Package.createPackageContents();

		// Initialize created meta-data
		theAsaM1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAsaM1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AsaM1Package.eNS_URI, theAsaM1Package);
		return theAsaM1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Rpc() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Client() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Serveur() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Attacheserveurrpc() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystem_Attacheclientrpc() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClient_Client_port_fourni() {
		return (EReference)clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClient_Client_port_requis() {
		return (EReference)clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Serveur_port_requis() {
		return (EReference)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Serveur_port_fourni() {
		return (EReference)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Server_detail() {
		return (EReference)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPC() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC_Rrpc_ole_requis() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC_Rpc_role_fourni() {
		return (EReference)rpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPC_Role_Requis() {
		return rpC_Role_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPC_Role_Fourni() {
		return rpC_Role_FourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClient_Port_Fourni() {
		return client_Port_FourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServeur_Port_Requis() {
		return serveur_Port_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttacheServeurRPC() {
		return attacheServeurRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheServeurRPC_Role_fourni() {
		return (EReference)attacheServeurRPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheServeurRPC_Role_requis() {
		return (EReference)attacheServeurRPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheServeurRPC_Serveur_port_fourni() {
		return (EReference)attacheServeurRPCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheServeurRPC_Serveur_port_requis() {
		return (EReference)attacheServeurRPCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttacheClientRPC() {
		return attacheClientRPCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheClientRPC_Client_port_fourni() {
		return (EReference)attacheClientRPCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheClientRPC_Role_requis() {
		return (EReference)attacheClientRPCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheClientRPC_Role_fourni() {
		return (EReference)attacheClientRPCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttacheClientRPC_Client_port_requis() {
		return (EReference)attacheClientRPCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Database_port_fourni() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Database_port_requis() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Connection_port_fourni() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Connection_port_requis() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurity_Security_port_fourni() {
		return (EReference)securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurity_Security_port_requis() {
		return (EReference)securityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer_Detail() {
		return server_DetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Security() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Connection() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Database() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Rpc2() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Rpc3() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Rpc1() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Attachementrpc3cm() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Attachementrpc3sm() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Attachementrpc2sm() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Attachementrpc2db() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Attachementrpc1cm() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Attachementrpc1db() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Detail_Bindingserveur() {
		return (EReference)server_DetailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPC1() {
		return rpc1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC1_Role_requis_rpc1() {
		return (EReference)rpc1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC1_Role_fourni_rpc1() {
		return (EReference)rpc1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPC2() {
		return rpc2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC2_Role_fourni_rpc2() {
		return (EReference)rpc2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC2_Role_requis_rpc2() {
		return (EReference)rpc2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPC3() {
		return rpc3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC3_Role_requis_rpc3() {
		return (EReference)rpc3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRPC3_Role_fourni_rpc3() {
		return (EReference)rpc3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachementRPC1DB() {
		return attachementRPC1DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1DB_Role_fourni_rpc1() {
		return (EReference)attachementRPC1DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1DB_Role_requis_rpc1() {
		return (EReference)attachementRPC1DBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1DB_Database_port_requis() {
		return (EReference)attachementRPC1DBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1DB_Database_portfourni() {
		return (EReference)attachementRPC1DBEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachementRPC1CM() {
		return attachementRPC1CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1CM_Role_requis_rpc1() {
		return (EReference)attachementRPC1CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1CM_Connection_port_fourni() {
		return (EReference)attachementRPC1CMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1CM_Connection_port_requis() {
		return (EReference)attachementRPC1CMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC1CM_Role_fourni_rpc1() {
		return (EReference)attachementRPC1CMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachementRPC2DB() {
		return attachementRPC2DBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2DB_Role_requis_rpc2() {
		return (EReference)attachementRPC2DBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2DB_Role_fourni_rpc2() {
		return (EReference)attachementRPC2DBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2DB_Database_port_fourni() {
		return (EReference)attachementRPC2DBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2DB_Database_port_requis() {
		return (EReference)attachementRPC2DBEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachementRPC2SM() {
		return attachementRPC2SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2SM_Role_fourni_rpc2() {
		return (EReference)attachementRPC2SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2SM_Security_portfourni() {
		return (EReference)attachementRPC2SMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2SM_Security_port_requis() {
		return (EReference)attachementRPC2SMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC2SM_Role_requis_rpc2() {
		return (EReference)attachementRPC2SMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachementRPC3CM() {
		return attachementRPC3CMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC3CM_Role_fourni_rpc3() {
		return (EReference)attachementRPC3CMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC3CM_Connection_portrequis() {
		return (EReference)attachementRPC3CMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC3CM_Connection_portfourni() {
		return (EReference)attachementRPC3CMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachementRPC3SM() {
		return attachementRPC3SMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC3SM_Role_requis_rpc3() {
		return (EReference)attachementRPC3SMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC3SM_Security_port_requis() {
		return (EReference)attachementRPC3SMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachementRPC3SM_Security_port_fourni() {
		return (EReference)attachementRPC3SMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection_PortFourni() {
		return connection_PortFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurity_PortFourni() {
		return security_PortFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase_PortFourni() {
		return database_PortFourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole_fourni_RPC1() {
		return role_fourni_RPC1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole_Requis_RPC1() {
		return role_Requis_RPC1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole_Fourni_RPC2() {
		return role_Fourni_RPC2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole_Requis_RPC2() {
		return role_Requis_RPC2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole_Fourni_RPC3() {
		return role_Fourni_RPC3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Fourni_RPC3_Attachementrpc3sm() {
		return (EReference)role_Fourni_RPC3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole_Requis_RPC3() {
		return role_Requis_RPC3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Requis_RPC3_Attachementrpc3cm() {
		return (EReference)role_Requis_RPC3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBindingServeur() {
		return bindingServeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBindingServeur_External_socket_fourni() {
		return (EReference)bindingServeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBindingServeur_External_socket_requis() {
		return (EReference)bindingServeurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBindingServeur_Serveur_port_requis() {
		return (EReference)bindingServeurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBindingServeur_Serveur_port_fourni() {
		return (EReference)bindingServeurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurity_PortRequis() {
		return security_PortRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase_PortRequis() {
		return database_PortRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection_PortRequis() {
		return connection_PortRequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClient_Port_Requis() {
		return client_Port_RequisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServeur_Port_Fourni() {
		return serveur_Port_FourniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNewEClass40() {
		return newEClass40EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsaM1Factory getAsaM1Factory() {
		return (AsaM1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__RPC);
		createEReference(systemEClass, SYSTEM__CLIENT);
		createEReference(systemEClass, SYSTEM__SERVEUR);
		createEReference(systemEClass, SYSTEM__ATTACHESERVEURRPC);
		createEReference(systemEClass, SYSTEM__ATTACHECLIENTRPC);

		clientEClass = createEClass(CLIENT);
		createEReference(clientEClass, CLIENT__CLIENT_PORT_FOURNI);
		createEReference(clientEClass, CLIENT__CLIENT_PORT_REQUIS);

		serverEClass = createEClass(SERVER);
		createEReference(serverEClass, SERVER__SERVEUR_PORT_REQUIS);
		createEReference(serverEClass, SERVER__SERVEUR_PORT_FOURNI);
		createEReference(serverEClass, SERVER__SERVER_DETAIL);

		rpcEClass = createEClass(RPC);
		createEReference(rpcEClass, RPC__RRPC_OLE_REQUIS);
		createEReference(rpcEClass, RPC__RPC_ROLE_FOURNI);

		rpC_Role_RequisEClass = createEClass(RPC_ROLE_REQUIS);

		rpC_Role_FourniEClass = createEClass(RPC_ROLE_FOURNI);

		client_Port_FourniEClass = createEClass(CLIENT_PORT_FOURNI);

		serveur_Port_RequisEClass = createEClass(SERVEUR_PORT_REQUIS);

		attacheServeurRPCEClass = createEClass(ATTACHE_SERVEUR_RPC);
		createEReference(attacheServeurRPCEClass, ATTACHE_SERVEUR_RPC__ROLE_FOURNI);
		createEReference(attacheServeurRPCEClass, ATTACHE_SERVEUR_RPC__ROLE_REQUIS);
		createEReference(attacheServeurRPCEClass, ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI);
		createEReference(attacheServeurRPCEClass, ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS);

		attacheClientRPCEClass = createEClass(ATTACHE_CLIENT_RPC);
		createEReference(attacheClientRPCEClass, ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI);
		createEReference(attacheClientRPCEClass, ATTACHE_CLIENT_RPC__ROLE_REQUIS);
		createEReference(attacheClientRPCEClass, ATTACHE_CLIENT_RPC__ROLE_FOURNI);
		createEReference(attacheClientRPCEClass, ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__DATABASE_PORT_FOURNI);
		createEReference(databaseEClass, DATABASE__DATABASE_PORT_REQUIS);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__CONNECTION_PORT_FOURNI);
		createEReference(connectionEClass, CONNECTION__CONNECTION_PORT_REQUIS);

		securityEClass = createEClass(SECURITY);
		createEReference(securityEClass, SECURITY__SECURITY_PORT_FOURNI);
		createEReference(securityEClass, SECURITY__SECURITY_PORT_REQUIS);

		server_DetailEClass = createEClass(SERVER_DETAIL);
		createEReference(server_DetailEClass, SERVER_DETAIL__SECURITY);
		createEReference(server_DetailEClass, SERVER_DETAIL__CONNECTION);
		createEReference(server_DetailEClass, SERVER_DETAIL__DATABASE);
		createEReference(server_DetailEClass, SERVER_DETAIL__RPC2);
		createEReference(server_DetailEClass, SERVER_DETAIL__RPC3);
		createEReference(server_DetailEClass, SERVER_DETAIL__RPC1);
		createEReference(server_DetailEClass, SERVER_DETAIL__ATTACHEMENTRPC3CM);
		createEReference(server_DetailEClass, SERVER_DETAIL__ATTACHEMENTRPC3SM);
		createEReference(server_DetailEClass, SERVER_DETAIL__ATTACHEMENTRPC2SM);
		createEReference(server_DetailEClass, SERVER_DETAIL__ATTACHEMENTRPC2DB);
		createEReference(server_DetailEClass, SERVER_DETAIL__ATTACHEMENTRPC1CM);
		createEReference(server_DetailEClass, SERVER_DETAIL__ATTACHEMENTRPC1DB);
		createEReference(server_DetailEClass, SERVER_DETAIL__BINDINGSERVEUR);

		rpc1EClass = createEClass(RPC1);
		createEReference(rpc1EClass, RPC1__ROLE_REQUIS_RPC1);
		createEReference(rpc1EClass, RPC1__ROLE_FOURNI_RPC1);

		rpc2EClass = createEClass(RPC2);
		createEReference(rpc2EClass, RPC2__ROLE_FOURNI_RPC2);
		createEReference(rpc2EClass, RPC2__ROLE_REQUIS_RPC2);

		rpc3EClass = createEClass(RPC3);
		createEReference(rpc3EClass, RPC3__ROLE_REQUIS_RPC3);
		createEReference(rpc3EClass, RPC3__ROLE_FOURNI_RPC3);

		attachementRPC1DBEClass = createEClass(ATTACHEMENT_RPC1DB);
		createEReference(attachementRPC1DBEClass, ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1);
		createEReference(attachementRPC1DBEClass, ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1);
		createEReference(attachementRPC1DBEClass, ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS);
		createEReference(attachementRPC1DBEClass, ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI);

		attachementRPC1CMEClass = createEClass(ATTACHEMENT_RPC1CM);
		createEReference(attachementRPC1CMEClass, ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1);
		createEReference(attachementRPC1CMEClass, ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI);
		createEReference(attachementRPC1CMEClass, ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS);
		createEReference(attachementRPC1CMEClass, ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1);

		attachementRPC2DBEClass = createEClass(ATTACHEMENT_RPC2DB);
		createEReference(attachementRPC2DBEClass, ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2);
		createEReference(attachementRPC2DBEClass, ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2);
		createEReference(attachementRPC2DBEClass, ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI);
		createEReference(attachementRPC2DBEClass, ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS);

		attachementRPC2SMEClass = createEClass(ATTACHEMENT_RPC2SM);
		createEReference(attachementRPC2SMEClass, ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2);
		createEReference(attachementRPC2SMEClass, ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI);
		createEReference(attachementRPC2SMEClass, ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS);
		createEReference(attachementRPC2SMEClass, ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2);

		attachementRPC3CMEClass = createEClass(ATTACHEMENT_RPC3CM);
		createEReference(attachementRPC3CMEClass, ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3);
		createEReference(attachementRPC3CMEClass, ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS);
		createEReference(attachementRPC3CMEClass, ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI);

		attachementRPC3SMEClass = createEClass(ATTACHEMENT_RPC3SM);
		createEReference(attachementRPC3SMEClass, ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3);
		createEReference(attachementRPC3SMEClass, ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS);
		createEReference(attachementRPC3SMEClass, ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI);

		connection_PortFourniEClass = createEClass(CONNECTION_PORT_FOURNI);

		security_PortFourniEClass = createEClass(SECURITY_PORT_FOURNI);

		database_PortFourniEClass = createEClass(DATABASE_PORT_FOURNI);

		role_fourni_RPC1EClass = createEClass(ROLE_FOURNI_RPC1);

		role_Requis_RPC1EClass = createEClass(ROLE_REQUIS_RPC1);

		role_Fourni_RPC2EClass = createEClass(ROLE_FOURNI_RPC2);

		role_Requis_RPC2EClass = createEClass(ROLE_REQUIS_RPC2);

		role_Fourni_RPC3EClass = createEClass(ROLE_FOURNI_RPC3);
		createEReference(role_Fourni_RPC3EClass, ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM);

		role_Requis_RPC3EClass = createEClass(ROLE_REQUIS_RPC3);
		createEReference(role_Requis_RPC3EClass, ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM);

		bindingServeurEClass = createEClass(BINDING_SERVEUR);
		createEReference(bindingServeurEClass, BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI);
		createEReference(bindingServeurEClass, BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS);
		createEReference(bindingServeurEClass, BINDING_SERVEUR__SERVEUR_PORT_REQUIS);
		createEReference(bindingServeurEClass, BINDING_SERVEUR__SERVEUR_PORT_FOURNI);

		security_PortRequisEClass = createEClass(SECURITY_PORT_REQUIS);

		database_PortRequisEClass = createEClass(DATABASE_PORT_REQUIS);

		connection_PortRequisEClass = createEClass(CONNECTION_PORT_REQUIS);

		client_Port_RequisEClass = createEClass(CLIENT_PORT_REQUIS);

		serveur_Port_FourniEClass = createEClass(SERVEUR_PORT_FOURNI);

		newEClass40EClass = createEClass(NEW_ECLASS40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ASAPackage theASAPackage = (ASAPackage)EPackage.Registry.INSTANCE.getEPackage(ASAPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEClass.getESuperTypes().add(theASAPackage.getConfiguration());
		clientEClass.getESuperTypes().add(theASAPackage.getComposant());
		serverEClass.getESuperTypes().add(theASAPackage.getComposant());
		rpcEClass.getESuperTypes().add(theASAPackage.getConnecteur());
		rpC_Role_RequisEClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		rpC_Role_FourniEClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		client_Port_FourniEClass.getESuperTypes().add(theASAPackage.getPortFourni());
		serveur_Port_RequisEClass.getESuperTypes().add(theASAPackage.getPortRequis());
		attacheServeurRPCEClass.getESuperTypes().add(theASAPackage.getAttachement());
		attacheClientRPCEClass.getESuperTypes().add(theASAPackage.getAttachement());
		databaseEClass.getESuperTypes().add(theASAPackage.getComposant());
		connectionEClass.getESuperTypes().add(theASAPackage.getComposant());
		securityEClass.getESuperTypes().add(theASAPackage.getComposant());
		server_DetailEClass.getESuperTypes().add(theASAPackage.getConfiguration());
		rpc1EClass.getESuperTypes().add(theASAPackage.getConnecteur());
		rpc2EClass.getESuperTypes().add(theASAPackage.getConnecteur());
		rpc3EClass.getESuperTypes().add(theASAPackage.getConnecteur());
		attachementRPC1DBEClass.getESuperTypes().add(theASAPackage.getAttachement());
		attachementRPC1CMEClass.getESuperTypes().add(theASAPackage.getAttachement());
		attachementRPC2DBEClass.getESuperTypes().add(theASAPackage.getAttachement());
		attachementRPC2SMEClass.getESuperTypes().add(theASAPackage.getAttachement());
		attachementRPC3CMEClass.getESuperTypes().add(theASAPackage.getAttachement());
		attachementRPC3SMEClass.getESuperTypes().add(theASAPackage.getAttachement());
		connection_PortFourniEClass.getESuperTypes().add(theASAPackage.getPortFourni());
		security_PortFourniEClass.getESuperTypes().add(theASAPackage.getPortFourni());
		database_PortFourniEClass.getESuperTypes().add(theASAPackage.getPortFourni());
		role_fourni_RPC1EClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		role_Requis_RPC1EClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		role_Fourni_RPC2EClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		role_Requis_RPC2EClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		role_Fourni_RPC3EClass.getESuperTypes().add(theASAPackage.getRoleFourni());
		role_Requis_RPC3EClass.getESuperTypes().add(theASAPackage.getRoleRequis());
		bindingServeurEClass.getESuperTypes().add(theASAPackage.getBinding());
		security_PortRequisEClass.getESuperTypes().add(theASAPackage.getPortRequis());
		database_PortRequisEClass.getESuperTypes().add(theASAPackage.getPortRequis());
		connection_PortRequisEClass.getESuperTypes().add(theASAPackage.getPortRequis());
		client_Port_RequisEClass.getESuperTypes().add(theASAPackage.getPortRequis());
		serveur_Port_FourniEClass.getESuperTypes().add(theASAPackage.getPortFourni());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, asaM1.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Rpc(), this.getRPC(), null, "rpc", null, 1, 1, asaM1.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Client(), this.getClient(), null, "client", null, 1, 1, asaM1.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Serveur(), this.getServer(), null, "serveur", null, 1, 1, asaM1.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Attacheserveurrpc(), this.getAttacheServeurRPC(), null, "attacheserveurrpc", null, 1, 1, asaM1.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Attacheclientrpc(), this.getAttacheClientRPC(), null, "attacheclientrpc", null, 1, 1, asaM1.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClient_Client_port_fourni(), this.getClient_Port_Fourni(), null, "client_port_fourni", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Client_port_requis(), this.getClient_Port_Requis(), null, "client_port_requis", null, 1, 1, Client.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServer_Serveur_port_requis(), this.getServeur_Port_Requis(), null, "serveur_port_requis", null, 2, 2, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Serveur_port_fourni(), this.getServeur_Port_Fourni(), null, "serveur_port_fourni", null, 2, 2, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Server_detail(), this.getServer_Detail(), null, "server_detail", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpcEClass, asaM1.RPC.class, "RPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC_Rrpc_ole_requis(), this.getRPC_Role_Requis(), null, "rrpc_ole_requis", null, 1, 1, asaM1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC_Rpc_role_fourni(), this.getRPC_Role_Fourni(), null, "rpc_role_fourni", null, 1, 1, asaM1.RPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpC_Role_RequisEClass, RPC_Role_Requis.class, "RPC_Role_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpC_Role_FourniEClass, RPC_Role_Fourni.class, "RPC_Role_Fourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(client_Port_FourniEClass, Client_Port_Fourni.class, "Client_Port_Fourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serveur_Port_RequisEClass, Serveur_Port_Requis.class, "Serveur_Port_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attacheServeurRPCEClass, AttacheServeurRPC.class, "AttacheServeurRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttacheServeurRPC_Role_fourni(), this.getRPC_Role_Fourni(), null, "role_fourni", null, 1, 1, AttacheServeurRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacheServeurRPC_Role_requis(), this.getRPC_Role_Requis(), null, "role_requis", null, 1, 1, AttacheServeurRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacheServeurRPC_Serveur_port_fourni(), this.getServeur_Port_Fourni(), null, "serveur_port_fourni", null, 1, 1, AttacheServeurRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacheServeurRPC_Serveur_port_requis(), this.getServeur_Port_Requis(), null, "serveur_port_requis", null, 1, 1, AttacheServeurRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attacheClientRPCEClass, AttacheClientRPC.class, "AttacheClientRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttacheClientRPC_Client_port_fourni(), this.getClient_Port_Fourni(), null, "client_port_fourni", null, 1, 1, AttacheClientRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacheClientRPC_Role_requis(), this.getRPC_Role_Requis(), null, "role_requis", null, 1, 1, AttacheClientRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacheClientRPC_Role_fourni(), this.getRPC_Role_Fourni(), null, "role_fourni", null, 1, 1, AttacheClientRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttacheClientRPC_Client_port_requis(), this.getClient_Port_Requis(), null, "client_port_requis", null, 1, 1, AttacheClientRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Database_port_fourni(), this.getDatabase_PortFourni(), null, "database_port_fourni", null, 2, 2, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Database_port_requis(), this.getDatabase_PortRequis(), null, "database_port_requis", null, 2, 2, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Connection_port_fourni(), this.getConnection_PortFourni(), null, "connection_port_fourni", null, 3, 3, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Connection_port_requis(), this.getConnection_PortRequis(), null, "connection_port_requis", null, 3, 3, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurity_Security_port_fourni(), this.getSecurity_PortFourni(), null, "security_port_fourni", null, 2, 2, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurity_Security_port_requis(), this.getSecurity_PortRequis(), null, "security_port_requis", null, 2, 2, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(server_DetailEClass, Server_Detail.class, "Server_Detail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServer_Detail_Security(), this.getSecurity(), null, "security", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Connection(), this.getConnection(), null, "connection", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Database(), this.getDatabase(), null, "database", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Rpc2(), this.getRPC2(), null, "rpc2", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Rpc3(), this.getRPC3(), null, "rpc3", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Rpc1(), this.getRPC1(), null, "rpc1", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Attachementrpc3cm(), this.getAttachementRPC3CM(), null, "attachementrpc3cm", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Attachementrpc3sm(), this.getAttachementRPC3SM(), null, "attachementrpc3sm", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Attachementrpc2sm(), this.getAttachementRPC2SM(), null, "attachementrpc2sm", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Attachementrpc2db(), this.getAttachementRPC2DB(), null, "attachementrpc2db", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Attachementrpc1cm(), this.getAttachementRPC1CM(), null, "attachementrpc1cm", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Attachementrpc1db(), this.getAttachementRPC1DB(), null, "attachementrpc1db", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Detail_Bindingserveur(), this.getBindingServeur(), null, "bindingserveur", null, 1, 1, Server_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpc1EClass, asaM1.RPC1.class, "RPC1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC1_Role_requis_rpc1(), this.getRole_Requis_RPC1(), null, "role_requis_rpc1", null, 1, 1, asaM1.RPC1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC1_Role_fourni_rpc1(), this.getRole_fourni_RPC1(), null, "role_fourni_rpc1", null, 1, 1, asaM1.RPC1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpc2EClass, asaM1.RPC2.class, "RPC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC2_Role_fourni_rpc2(), this.getRole_Fourni_RPC2(), null, "role_fourni_rpc2", null, 1, 1, asaM1.RPC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC2_Role_requis_rpc2(), this.getRole_Requis_RPC2(), null, "role_requis_rpc2", null, 1, 1, asaM1.RPC2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpc3EClass, asaM1.RPC3.class, "RPC3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPC3_Role_requis_rpc3(), this.getRole_Requis_RPC3(), null, "role_requis_rpc3", null, 1, 1, asaM1.RPC3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRPC3_Role_fourni_rpc3(), this.getRole_Fourni_RPC3(), null, "role_fourni_rpc3", null, 1, 1, asaM1.RPC3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementRPC1DBEClass, AttachementRPC1DB.class, "AttachementRPC1DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachementRPC1DB_Role_fourni_rpc1(), this.getRole_fourni_RPC1(), null, "role_fourni_rpc1", null, 1, 1, AttachementRPC1DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC1DB_Role_requis_rpc1(), this.getRole_Requis_RPC1(), null, "role_requis_rpc1", null, 1, 1, AttachementRPC1DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC1DB_Database_port_requis(), this.getDatabase_PortRequis(), null, "database_port_requis", null, 1, 1, AttachementRPC1DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC1DB_Database_portfourni(), this.getDatabase_PortFourni(), null, "database_portfourni", null, 1, 1, AttachementRPC1DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementRPC1CMEClass, AttachementRPC1CM.class, "AttachementRPC1CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachementRPC1CM_Role_requis_rpc1(), this.getRole_Requis_RPC1(), null, "role_requis_rpc1", null, 1, 1, AttachementRPC1CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC1CM_Connection_port_fourni(), this.getConnection_PortFourni(), null, "connection_port_fourni", null, 1, 1, AttachementRPC1CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC1CM_Connection_port_requis(), this.getConnection_PortRequis(), null, "connection_port_requis", null, 1, 1, AttachementRPC1CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC1CM_Role_fourni_rpc1(), this.getRole_fourni_RPC1(), null, "role_fourni_rpc1", null, 1, 1, AttachementRPC1CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementRPC2DBEClass, AttachementRPC2DB.class, "AttachementRPC2DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachementRPC2DB_Role_requis_rpc2(), this.getRole_Requis_RPC2(), null, "role_requis_rpc2", null, 1, 1, AttachementRPC2DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC2DB_Role_fourni_rpc2(), this.getRole_Fourni_RPC2(), null, "role_fourni_rpc2", null, 1, 1, AttachementRPC2DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC2DB_Database_port_fourni(), this.getDatabase_PortFourni(), null, "database_port_fourni", null, 1, 1, AttachementRPC2DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC2DB_Database_port_requis(), this.getDatabase_PortRequis(), null, "database_port_requis", null, 1, 1, AttachementRPC2DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementRPC2SMEClass, AttachementRPC2SM.class, "AttachementRPC2SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachementRPC2SM_Role_fourni_rpc2(), this.getRole_Fourni_RPC2(), null, "role_fourni_rpc2", null, 1, 1, AttachementRPC2SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC2SM_Security_portfourni(), this.getSecurity_PortFourni(), null, "security_portfourni", null, 0, 1, AttachementRPC2SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC2SM_Security_port_requis(), this.getSecurity_PortRequis(), null, "security_port_requis", null, 1, 1, AttachementRPC2SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC2SM_Role_requis_rpc2(), this.getRole_Requis_RPC2(), null, "role_requis_rpc2", null, 1, 1, AttachementRPC2SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementRPC3CMEClass, AttachementRPC3CM.class, "AttachementRPC3CM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachementRPC3CM_Role_fourni_rpc3(), this.getRole_Fourni_RPC3(), null, "role_fourni_rpc3", null, 1, 1, AttachementRPC3CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC3CM_Connection_portrequis(), this.getConnection_PortRequis(), null, "connection_portrequis", null, 0, 1, AttachementRPC3CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC3CM_Connection_portfourni(), this.getConnection_PortFourni(), null, "connection_portfourni", null, 0, 1, AttachementRPC3CM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachementRPC3SMEClass, AttachementRPC3SM.class, "AttachementRPC3SM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachementRPC3SM_Role_requis_rpc3(), this.getRole_Requis_RPC3(), null, "role_requis_rpc3", null, 1, 1, AttachementRPC3SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC3SM_Security_port_requis(), this.getSecurity_PortRequis(), null, "security_port_requis", null, 1, 1, AttachementRPC3SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachementRPC3SM_Security_port_fourni(), this.getSecurity_PortFourni(), null, "security_port_fourni", null, 1, 1, AttachementRPC3SM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connection_PortFourniEClass, Connection_PortFourni.class, "Connection_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(security_PortFourniEClass, Security_PortFourni.class, "Security_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(database_PortFourniEClass, Database_PortFourni.class, "Database_PortFourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(role_fourni_RPC1EClass, Role_fourni_RPC1.class, "Role_fourni_RPC1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(role_Requis_RPC1EClass, Role_Requis_RPC1.class, "Role_Requis_RPC1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(role_Fourni_RPC2EClass, Role_Fourni_RPC2.class, "Role_Fourni_RPC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(role_Requis_RPC2EClass, Role_Requis_RPC2.class, "Role_Requis_RPC2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(role_Fourni_RPC3EClass, Role_Fourni_RPC3.class, "Role_Fourni_RPC3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Fourni_RPC3_Attachementrpc3sm(), this.getAttachementRPC3SM(), null, "attachementrpc3sm", null, 1, 1, Role_Fourni_RPC3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(role_Requis_RPC3EClass, Role_Requis_RPC3.class, "Role_Requis_RPC3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Requis_RPC3_Attachementrpc3cm(), this.getAttachementRPC3CM(), null, "attachementrpc3cm", null, 1, 1, Role_Requis_RPC3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingServeurEClass, BindingServeur.class, "BindingServeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingServeur_External_socket_fourni(), this.getConnection_PortFourni(), null, "external_socket_fourni", null, 1, 1, BindingServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeur_External_socket_requis(), this.getConnection_PortRequis(), null, "external_socket_requis", null, 1, 1, BindingServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeur_Serveur_port_requis(), this.getServeur_Port_Requis(), null, "serveur_port_requis", null, 1, 1, BindingServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingServeur_Serveur_port_fourni(), this.getServeur_Port_Fourni(), null, "serveur_port_fourni", null, 1, 1, BindingServeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(security_PortRequisEClass, Security_PortRequis.class, "Security_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(database_PortRequisEClass, Database_PortRequis.class, "Database_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connection_PortRequisEClass, Connection_PortRequis.class, "Connection_PortRequis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(client_Port_RequisEClass, Client_Port_Requis.class, "Client_Port_Requis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serveur_Port_FourniEClass, Serveur_Port_Fourni.class, "Serveur_Port_Fourni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(newEClass40EClass, NewEClass40.class, "NewEClass40", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AsaM1PackageImpl
