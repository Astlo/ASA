/**
 */
package asaM1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see asaM1.AsaM1Package
 * @generated
 */
public interface AsaM1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsaM1Factory eINSTANCE = asaM1.impl.AsaM1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC</em>'.
	 * @generated
	 */
	RPC createRPC();

	/**
	 * Returns a new object of class '<em>RPC Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Role Requis</em>'.
	 * @generated
	 */
	RPC_Role_Requis createRPC_Role_Requis();

	/**
	 * Returns a new object of class '<em>RPC Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Role Fourni</em>'.
	 * @generated
	 */
	RPC_Role_Fourni createRPC_Role_Fourni();

	/**
	 * Returns a new object of class '<em>Client Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Port Fourni</em>'.
	 * @generated
	 */
	Client_Port_Fourni createClient_Port_Fourni();

	/**
	 * Returns a new object of class '<em>Serveur Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Port Requis</em>'.
	 * @generated
	 */
	Serveur_Port_Requis createServeur_Port_Requis();

	/**
	 * Returns a new object of class '<em>Attache Serveur RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attache Serveur RPC</em>'.
	 * @generated
	 */
	AttacheServeurRPC createAttacheServeurRPC();

	/**
	 * Returns a new object of class '<em>Attache Client RPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attache Client RPC</em>'.
	 * @generated
	 */
	AttacheClientRPC createAttacheClientRPC();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security</em>'.
	 * @generated
	 */
	Security createSecurity();

	/**
	 * Returns a new object of class '<em>Server Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Detail</em>'.
	 * @generated
	 */
	Server_Detail createServer_Detail();

	/**
	 * Returns a new object of class '<em>RPC1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC1</em>'.
	 * @generated
	 */
	RPC1 createRPC1();

	/**
	 * Returns a new object of class '<em>RPC2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC2</em>'.
	 * @generated
	 */
	RPC2 createRPC2();

	/**
	 * Returns a new object of class '<em>RPC3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC3</em>'.
	 * @generated
	 */
	RPC3 createRPC3();

	/**
	 * Returns a new object of class '<em>Attachement RPC1DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement RPC1DB</em>'.
	 * @generated
	 */
	AttachementRPC1DB createAttachementRPC1DB();

	/**
	 * Returns a new object of class '<em>Attachement RPC1CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement RPC1CM</em>'.
	 * @generated
	 */
	AttachementRPC1CM createAttachementRPC1CM();

	/**
	 * Returns a new object of class '<em>Attachement RPC2DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement RPC2DB</em>'.
	 * @generated
	 */
	AttachementRPC2DB createAttachementRPC2DB();

	/**
	 * Returns a new object of class '<em>Attachement RPC2SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement RPC2SM</em>'.
	 * @generated
	 */
	AttachementRPC2SM createAttachementRPC2SM();

	/**
	 * Returns a new object of class '<em>Attachement RPC3CM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement RPC3CM</em>'.
	 * @generated
	 */
	AttachementRPC3CM createAttachementRPC3CM();

	/**
	 * Returns a new object of class '<em>Attachement RPC3SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement RPC3SM</em>'.
	 * @generated
	 */
	AttachementRPC3SM createAttachementRPC3SM();

	/**
	 * Returns a new object of class '<em>Connection Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Port Fourni</em>'.
	 * @generated
	 */
	Connection_PortFourni createConnection_PortFourni();

	/**
	 * Returns a new object of class '<em>Security Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Port Fourni</em>'.
	 * @generated
	 */
	Security_PortFourni createSecurity_PortFourni();

	/**
	 * Returns a new object of class '<em>Database Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Port Fourni</em>'.
	 * @generated
	 */
	Database_PortFourni createDatabase_PortFourni();

	/**
	 * Returns a new object of class '<em>Role fourni RPC1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role fourni RPC1</em>'.
	 * @generated
	 */
	Role_fourni_RPC1 createRole_fourni_RPC1();

	/**
	 * Returns a new object of class '<em>Role Requis RPC1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis RPC1</em>'.
	 * @generated
	 */
	Role_Requis_RPC1 createRole_Requis_RPC1();

	/**
	 * Returns a new object of class '<em>Role Fourni RPC2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni RPC2</em>'.
	 * @generated
	 */
	Role_Fourni_RPC2 createRole_Fourni_RPC2();

	/**
	 * Returns a new object of class '<em>Role Requis RPC2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis RPC2</em>'.
	 * @generated
	 */
	Role_Requis_RPC2 createRole_Requis_RPC2();

	/**
	 * Returns a new object of class '<em>Role Fourni RPC3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni RPC3</em>'.
	 * @generated
	 */
	Role_Fourni_RPC3 createRole_Fourni_RPC3();

	/**
	 * Returns a new object of class '<em>Role Requis RPC3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis RPC3</em>'.
	 * @generated
	 */
	Role_Requis_RPC3 createRole_Requis_RPC3();

	/**
	 * Returns a new object of class '<em>Binding Serveur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Serveur</em>'.
	 * @generated
	 */
	BindingServeur createBindingServeur();

	/**
	 * Returns a new object of class '<em>Security Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Port Requis</em>'.
	 * @generated
	 */
	Security_PortRequis createSecurity_PortRequis();

	/**
	 * Returns a new object of class '<em>Database Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Port Requis</em>'.
	 * @generated
	 */
	Database_PortRequis createDatabase_PortRequis();

	/**
	 * Returns a new object of class '<em>Connection Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Port Requis</em>'.
	 * @generated
	 */
	Connection_PortRequis createConnection_PortRequis();

	/**
	 * Returns a new object of class '<em>Client Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Port Requis</em>'.
	 * @generated
	 */
	Client_Port_Requis createClient_Port_Requis();

	/**
	 * Returns a new object of class '<em>Serveur Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serveur Port Fourni</em>'.
	 * @generated
	 */
	Serveur_Port_Fourni createServeur_Port_Fourni();

	/**
	 * Returns a new object of class '<em>New EClass40</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass40</em>'.
	 * @generated
	 */
	NewEClass40 createNewEClass40();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AsaM1Package getAsaM1Package();

} //AsaM1Factory
