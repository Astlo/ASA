/**
 */
package asaM1.util;

import aSA.Attachement;
import aSA.Binding;
import aSA.Composant;
import aSA.Configuration;
import aSA.Connecteur;
import aSA.Interface;
import aSA.NamedElement;
import aSA.Port;
import aSA.PortFourni;
import aSA.PortRequis;
import aSA.Role;
import aSA.RoleFourni;
import aSA.RoleRequis;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see asaM1.AsaM1Package
 * @generated
 */
public class AsaM1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsaM1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsaM1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AsaM1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsaM1Switch<Adapter> modelSwitch =
		new AsaM1Switch<Adapter>() {
			@Override
			public Adapter caseSystem(asaM1.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseRPC(RPC object) {
				return createRPCAdapter();
			}
			@Override
			public Adapter caseRPC_Role_Requis(RPC_Role_Requis object) {
				return createRPC_Role_RequisAdapter();
			}
			@Override
			public Adapter caseRPC_Role_Fourni(RPC_Role_Fourni object) {
				return createRPC_Role_FourniAdapter();
			}
			@Override
			public Adapter caseClient_Port_Fourni(Client_Port_Fourni object) {
				return createClient_Port_FourniAdapter();
			}
			@Override
			public Adapter caseServeur_Port_Requis(Serveur_Port_Requis object) {
				return createServeur_Port_RequisAdapter();
			}
			@Override
			public Adapter caseAttacheServeurRPC(AttacheServeurRPC object) {
				return createAttacheServeurRPCAdapter();
			}
			@Override
			public Adapter caseAttacheClientRPC(AttacheClientRPC object) {
				return createAttacheClientRPCAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseSecurity(Security object) {
				return createSecurityAdapter();
			}
			@Override
			public Adapter caseServer_Detail(Server_Detail object) {
				return createServer_DetailAdapter();
			}
			@Override
			public Adapter caseRPC1(RPC1 object) {
				return createRPC1Adapter();
			}
			@Override
			public Adapter caseRPC2(RPC2 object) {
				return createRPC2Adapter();
			}
			@Override
			public Adapter caseRPC3(RPC3 object) {
				return createRPC3Adapter();
			}
			@Override
			public Adapter caseAttachementRPC1DB(AttachementRPC1DB object) {
				return createAttachementRPC1DBAdapter();
			}
			@Override
			public Adapter caseAttachementRPC1CM(AttachementRPC1CM object) {
				return createAttachementRPC1CMAdapter();
			}
			@Override
			public Adapter caseAttachementRPC2DB(AttachementRPC2DB object) {
				return createAttachementRPC2DBAdapter();
			}
			@Override
			public Adapter caseAttachementRPC2SM(AttachementRPC2SM object) {
				return createAttachementRPC2SMAdapter();
			}
			@Override
			public Adapter caseAttachementRPC3CM(AttachementRPC3CM object) {
				return createAttachementRPC3CMAdapter();
			}
			@Override
			public Adapter caseAttachementRPC3SM(AttachementRPC3SM object) {
				return createAttachementRPC3SMAdapter();
			}
			@Override
			public Adapter caseConnection_PortFourni(Connection_PortFourni object) {
				return createConnection_PortFourniAdapter();
			}
			@Override
			public Adapter caseSecurity_PortFourni(Security_PortFourni object) {
				return createSecurity_PortFourniAdapter();
			}
			@Override
			public Adapter caseDatabase_PortFourni(Database_PortFourni object) {
				return createDatabase_PortFourniAdapter();
			}
			@Override
			public Adapter caseRole_fourni_RPC1(Role_fourni_RPC1 object) {
				return createRole_fourni_RPC1Adapter();
			}
			@Override
			public Adapter caseRole_Requis_RPC1(Role_Requis_RPC1 object) {
				return createRole_Requis_RPC1Adapter();
			}
			@Override
			public Adapter caseRole_Fourni_RPC2(Role_Fourni_RPC2 object) {
				return createRole_Fourni_RPC2Adapter();
			}
			@Override
			public Adapter caseRole_Requis_RPC2(Role_Requis_RPC2 object) {
				return createRole_Requis_RPC2Adapter();
			}
			@Override
			public Adapter caseRole_Fourni_RPC3(Role_Fourni_RPC3 object) {
				return createRole_Fourni_RPC3Adapter();
			}
			@Override
			public Adapter caseRole_Requis_RPC3(Role_Requis_RPC3 object) {
				return createRole_Requis_RPC3Adapter();
			}
			@Override
			public Adapter caseBindingServeur(BindingServeur object) {
				return createBindingServeurAdapter();
			}
			@Override
			public Adapter caseSecurity_PortRequis(Security_PortRequis object) {
				return createSecurity_PortRequisAdapter();
			}
			@Override
			public Adapter caseDatabase_PortRequis(Database_PortRequis object) {
				return createDatabase_PortRequisAdapter();
			}
			@Override
			public Adapter caseConnection_PortRequis(Connection_PortRequis object) {
				return createConnection_PortRequisAdapter();
			}
			@Override
			public Adapter caseClient_Port_Requis(Client_Port_Requis object) {
				return createClient_Port_RequisAdapter();
			}
			@Override
			public Adapter caseServeur_Port_Fourni(Serveur_Port_Fourni object) {
				return createServeur_Port_FourniAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseConnecteur(Connecteur object) {
				return createConnecteurAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseRoleRequis(RoleRequis object) {
				return createRoleRequisAdapter();
			}
			@Override
			public Adapter caseRoleFourni(RoleFourni object) {
				return createRoleFourniAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortFourni(PortFourni object) {
				return createPortFourniAdapter();
			}
			@Override
			public Adapter casePortRequis(PortRequis object) {
				return createPortRequisAdapter();
			}
			@Override
			public Adapter caseAttachement(Attachement object) {
				return createAttachementAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link asaM1.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.RPC
	 * @generated
	 */
	public Adapter createRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.RPC_Role_Requis <em>RPC Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.RPC_Role_Requis
	 * @generated
	 */
	public Adapter createRPC_Role_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.RPC_Role_Fourni <em>RPC Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.RPC_Role_Fourni
	 * @generated
	 */
	public Adapter createRPC_Role_FourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Client_Port_Fourni <em>Client Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Client_Port_Fourni
	 * @generated
	 */
	public Adapter createClient_Port_FourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Serveur_Port_Requis <em>Serveur Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Serveur_Port_Requis
	 * @generated
	 */
	public Adapter createServeur_Port_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttacheServeurRPC <em>Attache Serveur RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttacheServeurRPC
	 * @generated
	 */
	public Adapter createAttacheServeurRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttacheClientRPC <em>Attache Client RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttacheClientRPC
	 * @generated
	 */
	public Adapter createAttacheClientRPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Server_Detail <em>Server Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Server_Detail
	 * @generated
	 */
	public Adapter createServer_DetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.RPC1 <em>RPC1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.RPC1
	 * @generated
	 */
	public Adapter createRPC1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.RPC2 <em>RPC2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.RPC2
	 * @generated
	 */
	public Adapter createRPC2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.RPC3 <em>RPC3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.RPC3
	 * @generated
	 */
	public Adapter createRPC3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttachementRPC1DB <em>Attachement RPC1DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttachementRPC1DB
	 * @generated
	 */
	public Adapter createAttachementRPC1DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttachementRPC1CM <em>Attachement RPC1CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttachementRPC1CM
	 * @generated
	 */
	public Adapter createAttachementRPC1CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttachementRPC2DB <em>Attachement RPC2DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttachementRPC2DB
	 * @generated
	 */
	public Adapter createAttachementRPC2DBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttachementRPC2SM <em>Attachement RPC2SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttachementRPC2SM
	 * @generated
	 */
	public Adapter createAttachementRPC2SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttachementRPC3CM <em>Attachement RPC3CM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttachementRPC3CM
	 * @generated
	 */
	public Adapter createAttachementRPC3CMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.AttachementRPC3SM <em>Attachement RPC3SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.AttachementRPC3SM
	 * @generated
	 */
	public Adapter createAttachementRPC3SMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Connection_PortFourni <em>Connection Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Connection_PortFourni
	 * @generated
	 */
	public Adapter createConnection_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Security_PortFourni <em>Security Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Security_PortFourni
	 * @generated
	 */
	public Adapter createSecurity_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Database_PortFourni <em>Database Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Database_PortFourni
	 * @generated
	 */
	public Adapter createDatabase_PortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Role_fourni_RPC1 <em>Role fourni RPC1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Role_fourni_RPC1
	 * @generated
	 */
	public Adapter createRole_fourni_RPC1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Role_Requis_RPC1 <em>Role Requis RPC1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Role_Requis_RPC1
	 * @generated
	 */
	public Adapter createRole_Requis_RPC1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Role_Fourni_RPC2 <em>Role Fourni RPC2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Role_Fourni_RPC2
	 * @generated
	 */
	public Adapter createRole_Fourni_RPC2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Role_Requis_RPC2 <em>Role Requis RPC2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Role_Requis_RPC2
	 * @generated
	 */
	public Adapter createRole_Requis_RPC2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Role_Fourni_RPC3 <em>Role Fourni RPC3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Role_Fourni_RPC3
	 * @generated
	 */
	public Adapter createRole_Fourni_RPC3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Role_Requis_RPC3 <em>Role Requis RPC3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Role_Requis_RPC3
	 * @generated
	 */
	public Adapter createRole_Requis_RPC3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.BindingServeur <em>Binding Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.BindingServeur
	 * @generated
	 */
	public Adapter createBindingServeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Security_PortRequis <em>Security Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Security_PortRequis
	 * @generated
	 */
	public Adapter createSecurity_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Database_PortRequis <em>Database Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Database_PortRequis
	 * @generated
	 */
	public Adapter createDatabase_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Connection_PortRequis <em>Connection Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Connection_PortRequis
	 * @generated
	 */
	public Adapter createConnection_PortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Client_Port_Requis <em>Client Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Client_Port_Requis
	 * @generated
	 */
	public Adapter createClient_Port_RequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.Serveur_Port_Fourni <em>Serveur Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.Serveur_Port_Fourni
	 * @generated
	 */
	public Adapter createServeur_Port_FourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asaM1.NewEClass40 <em>New EClass40</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asaM1.NewEClass40
	 * @generated
	 */
	public Adapter createNewEClass40Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Connecteur
	 * @generated
	 */
	public Adapter createConnecteurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleRequis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	public Adapter createRoleRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.RoleFourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	public Adapter createRoleFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortFourni <em>Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortFourni
	 * @generated
	 */
	public Adapter createPortFourniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.PortRequis <em>Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.PortRequis
	 * @generated
	 */
	public Adapter createPortRequisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Attachement
	 * @generated
	 */
	public Adapter createAttachementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aSA.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aSA.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AsaM1AdapterFactory
