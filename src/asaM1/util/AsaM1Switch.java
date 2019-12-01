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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see asaM1.AsaM1Package
 * @generated
 */
public class AsaM1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsaM1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsaM1Switch() {
		if (modelPackage == null) {
			modelPackage = AsaM1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AsaM1Package.SYSTEM: {
				asaM1.System system = (asaM1.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseConfiguration(system);
				if (result == null) result = caseNamedElement(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseComposant(client);
				if (result == null) result = caseNamedElement(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseComposant(server);
				if (result == null) result = caseNamedElement(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.RPC: {
				RPC rpc = (RPC)theEObject;
				T result = caseRPC(rpc);
				if (result == null) result = caseConnecteur(rpc);
				if (result == null) result = caseNamedElement(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.RPC_ROLE_REQUIS: {
				RPC_Role_Requis rpC_Role_Requis = (RPC_Role_Requis)theEObject;
				T result = caseRPC_Role_Requis(rpC_Role_Requis);
				if (result == null) result = caseRoleRequis(rpC_Role_Requis);
				if (result == null) result = caseRole(rpC_Role_Requis);
				if (result == null) result = caseInterface(rpC_Role_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.RPC_ROLE_FOURNI: {
				RPC_Role_Fourni rpC_Role_Fourni = (RPC_Role_Fourni)theEObject;
				T result = caseRPC_Role_Fourni(rpC_Role_Fourni);
				if (result == null) result = caseRoleFourni(rpC_Role_Fourni);
				if (result == null) result = caseRole(rpC_Role_Fourni);
				if (result == null) result = caseInterface(rpC_Role_Fourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.CLIENT_PORT_FOURNI: {
				Client_Port_Fourni client_Port_Fourni = (Client_Port_Fourni)theEObject;
				T result = caseClient_Port_Fourni(client_Port_Fourni);
				if (result == null) result = casePortFourni(client_Port_Fourni);
				if (result == null) result = casePort(client_Port_Fourni);
				if (result == null) result = caseInterface(client_Port_Fourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SERVEUR_PORT_REQUIS: {
				Serveur_Port_Requis serveur_Port_Requis = (Serveur_Port_Requis)theEObject;
				T result = caseServeur_Port_Requis(serveur_Port_Requis);
				if (result == null) result = casePortRequis(serveur_Port_Requis);
				if (result == null) result = casePort(serveur_Port_Requis);
				if (result == null) result = caseInterface(serveur_Port_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHE_SERVEUR_RPC: {
				AttacheServeurRPC attacheServeurRPC = (AttacheServeurRPC)theEObject;
				T result = caseAttacheServeurRPC(attacheServeurRPC);
				if (result == null) result = caseAttachement(attacheServeurRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHE_CLIENT_RPC: {
				AttacheClientRPC attacheClientRPC = (AttacheClientRPC)theEObject;
				T result = caseAttacheClientRPC(attacheClientRPC);
				if (result == null) result = caseAttachement(attacheClientRPC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseComposant(database);
				if (result == null) result = caseNamedElement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseComposant(connection);
				if (result == null) result = caseNamedElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = caseComposant(security);
				if (result == null) result = caseNamedElement(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SERVER_DETAIL: {
				Server_Detail server_Detail = (Server_Detail)theEObject;
				T result = caseServer_Detail(server_Detail);
				if (result == null) result = caseConfiguration(server_Detail);
				if (result == null) result = caseNamedElement(server_Detail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.RPC1: {
				RPC1 rpc1 = (RPC1)theEObject;
				T result = caseRPC1(rpc1);
				if (result == null) result = caseConnecteur(rpc1);
				if (result == null) result = caseNamedElement(rpc1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.RPC2: {
				RPC2 rpc2 = (RPC2)theEObject;
				T result = caseRPC2(rpc2);
				if (result == null) result = caseConnecteur(rpc2);
				if (result == null) result = caseNamedElement(rpc2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.RPC3: {
				RPC3 rpc3 = (RPC3)theEObject;
				T result = caseRPC3(rpc3);
				if (result == null) result = caseConnecteur(rpc3);
				if (result == null) result = caseNamedElement(rpc3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHEMENT_RPC1DB: {
				AttachementRPC1DB attachementRPC1DB = (AttachementRPC1DB)theEObject;
				T result = caseAttachementRPC1DB(attachementRPC1DB);
				if (result == null) result = caseAttachement(attachementRPC1DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHEMENT_RPC1CM: {
				AttachementRPC1CM attachementRPC1CM = (AttachementRPC1CM)theEObject;
				T result = caseAttachementRPC1CM(attachementRPC1CM);
				if (result == null) result = caseAttachement(attachementRPC1CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHEMENT_RPC2DB: {
				AttachementRPC2DB attachementRPC2DB = (AttachementRPC2DB)theEObject;
				T result = caseAttachementRPC2DB(attachementRPC2DB);
				if (result == null) result = caseAttachement(attachementRPC2DB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHEMENT_RPC2SM: {
				AttachementRPC2SM attachementRPC2SM = (AttachementRPC2SM)theEObject;
				T result = caseAttachementRPC2SM(attachementRPC2SM);
				if (result == null) result = caseAttachement(attachementRPC2SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHEMENT_RPC3CM: {
				AttachementRPC3CM attachementRPC3CM = (AttachementRPC3CM)theEObject;
				T result = caseAttachementRPC3CM(attachementRPC3CM);
				if (result == null) result = caseAttachement(attachementRPC3CM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ATTACHEMENT_RPC3SM: {
				AttachementRPC3SM attachementRPC3SM = (AttachementRPC3SM)theEObject;
				T result = caseAttachementRPC3SM(attachementRPC3SM);
				if (result == null) result = caseAttachement(attachementRPC3SM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.CONNECTION_PORT_FOURNI: {
				Connection_PortFourni connection_PortFourni = (Connection_PortFourni)theEObject;
				T result = caseConnection_PortFourni(connection_PortFourni);
				if (result == null) result = casePortFourni(connection_PortFourni);
				if (result == null) result = casePort(connection_PortFourni);
				if (result == null) result = caseInterface(connection_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SECURITY_PORT_FOURNI: {
				Security_PortFourni security_PortFourni = (Security_PortFourni)theEObject;
				T result = caseSecurity_PortFourni(security_PortFourni);
				if (result == null) result = casePortFourni(security_PortFourni);
				if (result == null) result = casePort(security_PortFourni);
				if (result == null) result = caseInterface(security_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.DATABASE_PORT_FOURNI: {
				Database_PortFourni database_PortFourni = (Database_PortFourni)theEObject;
				T result = caseDatabase_PortFourni(database_PortFourni);
				if (result == null) result = casePortFourni(database_PortFourni);
				if (result == null) result = casePort(database_PortFourni);
				if (result == null) result = caseInterface(database_PortFourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ROLE_FOURNI_RPC1: {
				Role_fourni_RPC1 role_fourni_RPC1 = (Role_fourni_RPC1)theEObject;
				T result = caseRole_fourni_RPC1(role_fourni_RPC1);
				if (result == null) result = caseRoleFourni(role_fourni_RPC1);
				if (result == null) result = caseRole(role_fourni_RPC1);
				if (result == null) result = caseInterface(role_fourni_RPC1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ROLE_REQUIS_RPC1: {
				Role_Requis_RPC1 role_Requis_RPC1 = (Role_Requis_RPC1)theEObject;
				T result = caseRole_Requis_RPC1(role_Requis_RPC1);
				if (result == null) result = caseRoleRequis(role_Requis_RPC1);
				if (result == null) result = caseRole(role_Requis_RPC1);
				if (result == null) result = caseInterface(role_Requis_RPC1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ROLE_FOURNI_RPC2: {
				Role_Fourni_RPC2 role_Fourni_RPC2 = (Role_Fourni_RPC2)theEObject;
				T result = caseRole_Fourni_RPC2(role_Fourni_RPC2);
				if (result == null) result = caseRoleFourni(role_Fourni_RPC2);
				if (result == null) result = caseRole(role_Fourni_RPC2);
				if (result == null) result = caseInterface(role_Fourni_RPC2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ROLE_REQUIS_RPC2: {
				Role_Requis_RPC2 role_Requis_RPC2 = (Role_Requis_RPC2)theEObject;
				T result = caseRole_Requis_RPC2(role_Requis_RPC2);
				if (result == null) result = caseRoleRequis(role_Requis_RPC2);
				if (result == null) result = caseRole(role_Requis_RPC2);
				if (result == null) result = caseInterface(role_Requis_RPC2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ROLE_FOURNI_RPC3: {
				Role_Fourni_RPC3 role_Fourni_RPC3 = (Role_Fourni_RPC3)theEObject;
				T result = caseRole_Fourni_RPC3(role_Fourni_RPC3);
				if (result == null) result = caseRoleFourni(role_Fourni_RPC3);
				if (result == null) result = caseRole(role_Fourni_RPC3);
				if (result == null) result = caseInterface(role_Fourni_RPC3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.ROLE_REQUIS_RPC3: {
				Role_Requis_RPC3 role_Requis_RPC3 = (Role_Requis_RPC3)theEObject;
				T result = caseRole_Requis_RPC3(role_Requis_RPC3);
				if (result == null) result = caseRoleRequis(role_Requis_RPC3);
				if (result == null) result = caseRole(role_Requis_RPC3);
				if (result == null) result = caseInterface(role_Requis_RPC3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.BINDING_SERVEUR: {
				BindingServeur bindingServeur = (BindingServeur)theEObject;
				T result = caseBindingServeur(bindingServeur);
				if (result == null) result = caseBinding(bindingServeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SECURITY_PORT_REQUIS: {
				Security_PortRequis security_PortRequis = (Security_PortRequis)theEObject;
				T result = caseSecurity_PortRequis(security_PortRequis);
				if (result == null) result = casePortRequis(security_PortRequis);
				if (result == null) result = casePort(security_PortRequis);
				if (result == null) result = caseInterface(security_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.DATABASE_PORT_REQUIS: {
				Database_PortRequis database_PortRequis = (Database_PortRequis)theEObject;
				T result = caseDatabase_PortRequis(database_PortRequis);
				if (result == null) result = casePortRequis(database_PortRequis);
				if (result == null) result = casePort(database_PortRequis);
				if (result == null) result = caseInterface(database_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.CONNECTION_PORT_REQUIS: {
				Connection_PortRequis connection_PortRequis = (Connection_PortRequis)theEObject;
				T result = caseConnection_PortRequis(connection_PortRequis);
				if (result == null) result = casePortRequis(connection_PortRequis);
				if (result == null) result = casePort(connection_PortRequis);
				if (result == null) result = caseInterface(connection_PortRequis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.CLIENT_PORT_REQUIS: {
				Client_Port_Requis client_Port_Requis = (Client_Port_Requis)theEObject;
				T result = caseClient_Port_Requis(client_Port_Requis);
				if (result == null) result = casePortRequis(client_Port_Requis);
				if (result == null) result = casePort(client_Port_Requis);
				if (result == null) result = caseInterface(client_Port_Requis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.SERVEUR_PORT_FOURNI: {
				Serveur_Port_Fourni serveur_Port_Fourni = (Serveur_Port_Fourni)theEObject;
				T result = caseServeur_Port_Fourni(serveur_Port_Fourni);
				if (result == null) result = casePortFourni(serveur_Port_Fourni);
				if (result == null) result = casePort(serveur_Port_Fourni);
				if (result == null) result = caseInterface(serveur_Port_Fourni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsaM1Package.NEW_ECLASS40: {
				NewEClass40 newEClass40 = (NewEClass40)theEObject;
				T result = caseNewEClass40(newEClass40);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(asaM1.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC(RPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC Role Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC_Role_Requis(RPC_Role_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC Role Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC_Role_Fourni(RPC_Role_Fourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient_Port_Fourni(Client_Port_Fourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur_Port_Requis(Serveur_Port_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attache Serveur RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attache Serveur RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttacheServeurRPC(AttacheServeurRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attache Client RPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attache Client RPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttacheClientRPC(AttacheClientRPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer_Detail(Server_Detail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC1(RPC1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC2(RPC2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPC3(RPC3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement RPC1DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement RPC1DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementRPC1DB(AttachementRPC1DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement RPC1CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement RPC1CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementRPC1CM(AttachementRPC1CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement RPC2DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement RPC2DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementRPC2DB(AttachementRPC2DB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement RPC2SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement RPC2SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementRPC2SM(AttachementRPC2SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement RPC3CM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement RPC3CM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementRPC3CM(AttachementRPC3CM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement RPC3SM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement RPC3SM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachementRPC3SM(AttachementRPC3SM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_PortFourni(Connection_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity_PortFourni(Security_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase_PortFourni(Database_PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role fourni RPC1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role fourni RPC1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_fourni_RPC1(Role_fourni_RPC1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis RPC1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis RPC1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_RPC1(Role_Requis_RPC1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni RPC2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni RPC2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_RPC2(Role_Fourni_RPC2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis RPC2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis RPC2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_RPC2(Role_Requis_RPC2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni RPC3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni RPC3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Fourni_RPC3(Role_Fourni_RPC3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis RPC3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis RPC3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole_Requis_RPC3(Role_Requis_RPC3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Serveur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingServeur(BindingServeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity_PortRequis(Security_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase_PortRequis(Database_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection_PortRequis(Connection_PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient_Port_Requis(Client_Port_Requis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serveur Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serveur Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServeur_Port_Fourni(Serveur_Port_Fourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass40</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass40</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass40(NewEClass40 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecteur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnecteur(Connecteur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequis(RoleRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFourni(RoleFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Fourni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortFourni(PortFourni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Requis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRequis(PortRequis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachement(Attachement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AsaM1Switch
