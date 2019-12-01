/**
 */
package asaM1;

import aSA.ASAPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asaM1.AsaM1Factory
 * @model kind="package"
 * @generated
 */
public interface AsaM1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asaM1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/asam1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asaM1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsaM1Package eINSTANCE = asaM1.impl.AsaM1PackageImpl.init();

	/**
	 * The meta object id for the '{@link asaM1.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.SystemImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = ASAPackage.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SYSTEM__CONFIGURATION = ASAPackage.CONFIGURATION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPOSANT = ASAPackage.CONFIGURATION__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTEUR = ASAPackage.CONFIGURATION__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Attachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTACHEMENTS = ASAPackage.CONFIGURATION__ATTACHEMENTS;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__BINDING = ASAPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INTERFACE = ASAPackage.CONFIGURATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RPC = ASAPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CLIENT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SERVEUR = ASAPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attacheserveurrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTACHESERVEURRPC = ASAPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attacheclientrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ATTACHECLIENTRPC = ASAPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = ASAPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.ClientImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = ASAPackage.COMPOSANT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CLIENT__CONFIGURATION = ASAPackage.COMPOSANT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System pere</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SYSTEM_PERE = ASAPackage.COMPOSANT__SYSTEM_PERE;

	/**
	 * The feature id for the '<em><b>System fils</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__SYSTEM_FILS = ASAPackage.COMPOSANT__SYSTEM_FILS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CLIENT_PORT_FOURNI = ASAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CLIENT_PORT_REQUIS = ASAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = ASAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = ASAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.ServerImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = ASAPackage.COMPOSANT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__CONFIGURATION = ASAPackage.COMPOSANT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System pere</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SYSTEM_PERE = ASAPackage.COMPOSANT__SYSTEM_PERE;

	/**
	 * The feature id for the '<em><b>System fils</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SYSTEM_FILS = ASAPackage.COMPOSANT__SYSTEM_FILS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__CONTRAINTES = ASAPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__PROPRIETES = ASAPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Servicerequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__SERVICEREQUIS = ASAPackage.COMPOSANT__SERVICEREQUIS;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__PORTFOURNI = ASAPackage.COMPOSANT__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__PORTREQUIS = ASAPackage.COMPOSANT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Servicefourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER__SERVICEFOURNI = ASAPackage.COMPOSANT__SERVICEFOURNI;

	/**
	 * The feature id for the '<em><b>Serveur port requis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVEUR_PORT_REQUIS = ASAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serveur port fourni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVEUR_PORT_FOURNI = ASAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_DETAIL = ASAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = ASAPackage.COMPOSANT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = ASAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.RPCImpl <em>RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.RPCImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getRPC()
	 * @generated
	 */
	int RPC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NAME = ASAPackage.CONNECTEUR__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC__CONFIGURATION = ASAPackage.CONNECTEUR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__SYSTEM = ASAPackage.CONNECTEUR__SYSTEM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolefourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC__ROLEFOURNI = ASAPackage.CONNECTEUR__ROLEFOURNI;

	/**
	 * The feature id for the '<em><b>Rolerequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC__ROLEREQUIS = ASAPackage.CONNECTEUR__ROLEREQUIS;

	/**
	 * The feature id for the '<em><b>Rrpc ole requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__RRPC_OLE_REQUIS = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpc role fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__RPC_ROLE_FOURNI = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.RPC_Role_RequisImpl <em>RPC Role Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.RPC_Role_RequisImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getRPC_Role_Requis()
	 * @generated
	 */
	int RPC_ROLE_REQUIS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_REQUIS__NAME = ASAPackage.ROLE_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_REQUIS__CONNECTEUR = ASAPackage.ROLE_REQUIS__CONNECTEUR;

	/**
	 * The number of structural features of the '<em>RPC Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_REQUIS_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPC Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_REQUIS_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.RPC_Role_FourniImpl <em>RPC Role Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.RPC_Role_FourniImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getRPC_Role_Fourni()
	 * @generated
	 */
	int RPC_ROLE_FOURNI = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_FOURNI__NAME = ASAPackage.ROLE_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_FOURNI__CONNECTEUR = ASAPackage.ROLE_FOURNI__CONNECTEUR;

	/**
	 * The number of structural features of the '<em>RPC Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_FOURNI_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPC Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_ROLE_FOURNI_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Client_Port_FourniImpl <em>Client Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Client_Port_FourniImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getClient_Port_Fourni()
	 * @generated
	 */
	int CLIENT_PORT_FOURNI = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_FOURNI__NAME = ASAPackage.PORT_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_FOURNI__COMPOSANT = ASAPackage.PORT_FOURNI__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Client Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_FOURNI_FEATURE_COUNT = ASAPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_FOURNI_OPERATION_COUNT = ASAPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Serveur_Port_RequisImpl <em>Serveur Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Serveur_Port_RequisImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getServeur_Port_Requis()
	 * @generated
	 */
	int SERVEUR_PORT_REQUIS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_REQUIS__NAME = ASAPackage.PORT_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_REQUIS__COMPOSANT = ASAPackage.PORT_REQUIS__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Serveur Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_REQUIS_FEATURE_COUNT = ASAPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serveur Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_REQUIS_OPERATION_COUNT = ASAPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttacheServeurRPCImpl <em>Attache Serveur RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttacheServeurRPCImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttacheServeurRPC()
	 * @generated
	 */
	int ATTACHE_SERVEUR_RPC = 8;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__ROLE_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__ROLE_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serveur port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serveur port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attache Serveur RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attache Serveur RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_SERVEUR_RPC_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttacheClientRPCImpl <em>Attache Client RPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttacheClientRPCImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttacheClientRPC()
	 * @generated
	 */
	int ATTACHE_CLIENT_RPC = 9;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Client port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__ROLE_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__ROLE_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attache Client RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attache Client RPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHE_CLIENT_RPC_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.DatabaseImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = ASAPackage.COMPOSANT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__CONFIGURATION = ASAPackage.COMPOSANT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System pere</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SYSTEM_PERE = ASAPackage.COMPOSANT__SYSTEM_PERE;

	/**
	 * The feature id for the '<em><b>System fils</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SYSTEM_FILS = ASAPackage.COMPOSANT__SYSTEM_FILS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__CONTRAINTES = ASAPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__PROPRIETES = ASAPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Servicerequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__SERVICEREQUIS = ASAPackage.COMPOSANT__SERVICEREQUIS;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__PORTFOURNI = ASAPackage.COMPOSANT__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__PORTREQUIS = ASAPackage.COMPOSANT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Servicefourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int DATABASE__SERVICEFOURNI = ASAPackage.COMPOSANT__SERVICEFOURNI;

	/**
	 * The feature id for the '<em><b>Database port fourni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATABASE_PORT_FOURNI = ASAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database port requis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATABASE_PORT_REQUIS = ASAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = ASAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = ASAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.ConnectionImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = ASAPackage.COMPOSANT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__CONFIGURATION = ASAPackage.COMPOSANT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System pere</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SYSTEM_PERE = ASAPackage.COMPOSANT__SYSTEM_PERE;

	/**
	 * The feature id for the '<em><b>System fils</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SYSTEM_FILS = ASAPackage.COMPOSANT__SYSTEM_FILS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__CONTRAINTES = ASAPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__PROPRIETES = ASAPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Servicerequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__SERVICEREQUIS = ASAPackage.COMPOSANT__SERVICEREQUIS;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__PORTFOURNI = ASAPackage.COMPOSANT__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__PORTREQUIS = ASAPackage.COMPOSANT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Servicefourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int CONNECTION__SERVICEFOURNI = ASAPackage.COMPOSANT__SERVICEFOURNI;

	/**
	 * The feature id for the '<em><b>Connection port fourni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_PORT_FOURNI = ASAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection port requis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_PORT_REQUIS = ASAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = ASAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = ASAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.SecurityImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__NAME = ASAPackage.COMPOSANT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__CONFIGURATION = ASAPackage.COMPOSANT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System pere</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__SYSTEM_PERE = ASAPackage.COMPOSANT__SYSTEM_PERE;

	/**
	 * The feature id for the '<em><b>System fils</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__SYSTEM_FILS = ASAPackage.COMPOSANT__SYSTEM_FILS;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__CONTRAINTES = ASAPackage.COMPOSANT__CONTRAINTES;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__PROPRIETES = ASAPackage.COMPOSANT__PROPRIETES;

	/**
	 * The feature id for the '<em><b>Servicerequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__SERVICEREQUIS = ASAPackage.COMPOSANT__SERVICEREQUIS;

	/**
	 * The feature id for the '<em><b>Portfourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__PORTFOURNI = ASAPackage.COMPOSANT__PORTFOURNI;

	/**
	 * The feature id for the '<em><b>Portrequis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__PORTREQUIS = ASAPackage.COMPOSANT__PORTREQUIS;

	/**
	 * The feature id for the '<em><b>Servicefourni</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SECURITY__SERVICEFOURNI = ASAPackage.COMPOSANT__SERVICEFOURNI;

	/**
	 * The feature id for the '<em><b>Security port fourni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__SECURITY_PORT_FOURNI = ASAPackage.COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security port requis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__SECURITY_PORT_REQUIS = ASAPackage.COMPOSANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = ASAPackage.COMPOSANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = ASAPackage.COMPOSANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Server_DetailImpl <em>Server Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Server_DetailImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getServer_Detail()
	 * @generated
	 */
	int SERVER_DETAIL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__NAME = ASAPackage.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int SERVER_DETAIL__CONFIGURATION = ASAPackage.CONFIGURATION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__COMPOSANT = ASAPackage.CONFIGURATION__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__CONNECTEUR = ASAPackage.CONFIGURATION__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Attachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTS = ASAPackage.CONFIGURATION__ATTACHEMENTS;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__BINDING = ASAPackage.CONFIGURATION__BINDING;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__INTERFACE = ASAPackage.CONFIGURATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__SECURITY = ASAPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__CONNECTION = ASAPackage.CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__DATABASE = ASAPackage.CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__RPC2 = ASAPackage.CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__RPC3 = ASAPackage.CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__RPC1 = ASAPackage.CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attachementrpc3cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTRPC3CM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attachementrpc3sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTRPC3SM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attachementrpc2sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTRPC2SM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attachementrpc2db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTRPC2DB = ASAPackage.CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attachementrpc1cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTRPC1CM = ASAPackage.CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attachementrpc1db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__ATTACHEMENTRPC1DB = ASAPackage.CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Bindingserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL__BINDINGSERVEUR = ASAPackage.CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Server Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL_FEATURE_COUNT = ASAPackage.CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Server Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_DETAIL_OPERATION_COUNT = ASAPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.RPC1Impl <em>RPC1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.RPC1Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRPC1()
	 * @generated
	 */
	int RPC1 = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1__NAME = ASAPackage.CONNECTEUR__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC1__CONFIGURATION = ASAPackage.CONNECTEUR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1__SYSTEM = ASAPackage.CONNECTEUR__SYSTEM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolefourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC1__ROLEFOURNI = ASAPackage.CONNECTEUR__ROLEFOURNI;

	/**
	 * The feature id for the '<em><b>Rolerequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC1__ROLEREQUIS = ASAPackage.CONNECTEUR__ROLEREQUIS;

	/**
	 * The feature id for the '<em><b>Role requis rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1__ROLE_REQUIS_RPC1 = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1__ROLE_FOURNI_RPC1 = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC1_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.RPC2Impl <em>RPC2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.RPC2Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRPC2()
	 * @generated
	 */
	int RPC2 = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2__NAME = ASAPackage.CONNECTEUR__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC2__CONFIGURATION = ASAPackage.CONNECTEUR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2__SYSTEM = ASAPackage.CONNECTEUR__SYSTEM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolefourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC2__ROLEFOURNI = ASAPackage.CONNECTEUR__ROLEFOURNI;

	/**
	 * The feature id for the '<em><b>Rolerequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC2__ROLEREQUIS = ASAPackage.CONNECTEUR__ROLEREQUIS;

	/**
	 * The feature id for the '<em><b>Role fourni rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2__ROLE_FOURNI_RPC2 = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2__ROLE_REQUIS_RPC2 = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC2_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.RPC3Impl <em>RPC3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.RPC3Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRPC3()
	 * @generated
	 */
	int RPC3 = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3__NAME = ASAPackage.CONNECTEUR__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC3__CONFIGURATION = ASAPackage.CONNECTEUR__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3__SYSTEM = ASAPackage.CONNECTEUR__SYSTEM;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3__GLUE = ASAPackage.CONNECTEUR__GLUE;

	/**
	 * The feature id for the '<em><b>Rolefourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC3__ROLEFOURNI = ASAPackage.CONNECTEUR__ROLEFOURNI;

	/**
	 * The feature id for the '<em><b>Rolerequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	//int RPC3__ROLEREQUIS = ASAPackage.CONNECTEUR__ROLEREQUIS;

	/**
	 * The feature id for the '<em><b>Role requis rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3__ROLE_REQUIS_RPC3 = ASAPackage.CONNECTEUR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3__ROLE_FOURNI_RPC3 = ASAPackage.CONNECTEUR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPC3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3_FEATURE_COUNT = ASAPackage.CONNECTEUR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPC3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC3_OPERATION_COUNT = ASAPackage.CONNECTEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttachementRPC1DBImpl <em>Attachement RPC1DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttachementRPC1DBImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC1DB()
	 * @generated
	 */
	int ATTACHEMENT_RPC1DB = 17;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role fourni rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role requis rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database portfourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attachement RPC1DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attachement RPC1DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1DB_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttachementRPC1CMImpl <em>Attachement RPC1CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttachementRPC1CMImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC1CM()
	 * @generated
	 */
	int ATTACHEMENT_RPC1CM = 18;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role requis rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role fourni rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attachement RPC1CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attachement RPC1CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC1CM_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttachementRPC2DBImpl <em>Attachement RPC2DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttachementRPC2DBImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC2DB()
	 * @generated
	 */
	int ATTACHEMENT_RPC2DB = 19;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role requis rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role fourni rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Database port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attachement RPC2DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attachement RPC2DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2DB_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttachementRPC2SMImpl <em>Attachement RPC2SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttachementRPC2SMImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC2SM()
	 * @generated
	 */
	int ATTACHEMENT_RPC2SM = 20;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role fourni rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security portfourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role requis rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attachement RPC2SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attachement RPC2SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC2SM_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttachementRPC3CMImpl <em>Attachement RPC3CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttachementRPC3CMImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC3CM()
	 * @generated
	 */
	int ATTACHEMENT_RPC3CM = 21;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role fourni rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection portrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection portfourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attachement RPC3CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attachement RPC3CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3CM_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.AttachementRPC3SMImpl <em>Attachement RPC3SM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.AttachementRPC3SMImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC3SM()
	 * @generated
	 */
	int ATTACHEMENT_RPC3SM = 22;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM__SYSTEM = ASAPackage.ATTACHEMENT__SYSTEM;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM__ROLES = ASAPackage.ATTACHEMENT__ROLES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM__PORTS = ASAPackage.ATTACHEMENT__PORTS;

	/**
	 * The feature id for the '<em><b>Role requis rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3 = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attachement RPC3SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM_FEATURE_COUNT = ASAPackage.ATTACHEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attachement RPC3SM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_RPC3SM_OPERATION_COUNT = ASAPackage.ATTACHEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Connection_PortFourniImpl <em>Connection Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Connection_PortFourniImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getConnection_PortFourni()
	 * @generated
	 */
	int CONNECTION_PORT_FOURNI = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_FOURNI__NAME = ASAPackage.PORT_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_FOURNI__COMPOSANT = ASAPackage.PORT_FOURNI__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Connection Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_FOURNI_FEATURE_COUNT = ASAPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_FOURNI_OPERATION_COUNT = ASAPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Security_PortFourniImpl <em>Security Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Security_PortFourniImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getSecurity_PortFourni()
	 * @generated
	 */
	int SECURITY_PORT_FOURNI = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_FOURNI__NAME = ASAPackage.PORT_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_FOURNI__COMPOSANT = ASAPackage.PORT_FOURNI__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Security Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_FOURNI_FEATURE_COUNT = ASAPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_FOURNI_OPERATION_COUNT = ASAPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Database_PortFourniImpl <em>Database Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Database_PortFourniImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getDatabase_PortFourni()
	 * @generated
	 */
	int DATABASE_PORT_FOURNI = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_FOURNI__NAME = ASAPackage.PORT_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_FOURNI__COMPOSANT = ASAPackage.PORT_FOURNI__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Database Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_FOURNI_FEATURE_COUNT = ASAPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_FOURNI_OPERATION_COUNT = ASAPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Role_fourni_RPC1Impl <em>Role fourni RPC1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Role_fourni_RPC1Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRole_fourni_RPC1()
	 * @generated
	 */
	int ROLE_FOURNI_RPC1 = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC1__NAME = ASAPackage.ROLE_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC1__CONNECTEUR = ASAPackage.ROLE_FOURNI__CONNECTEUR;

	/**
	 * The number of structural features of the '<em>Role fourni RPC1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC1_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role fourni RPC1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC1_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Role_Requis_RPC1Impl <em>Role Requis RPC1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Role_Requis_RPC1Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRole_Requis_RPC1()
	 * @generated
	 */
	int ROLE_REQUIS_RPC1 = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC1__NAME = ASAPackage.ROLE_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC1__CONNECTEUR = ASAPackage.ROLE_REQUIS__CONNECTEUR;

	/**
	 * The number of structural features of the '<em>Role Requis RPC1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC1_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis RPC1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC1_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Role_Fourni_RPC2Impl <em>Role Fourni RPC2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Role_Fourni_RPC2Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRole_Fourni_RPC2()
	 * @generated
	 */
	int ROLE_FOURNI_RPC2 = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC2__NAME = ASAPackage.ROLE_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC2__CONNECTEUR = ASAPackage.ROLE_FOURNI__CONNECTEUR;

	/**
	 * The number of structural features of the '<em>Role Fourni RPC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC2_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni RPC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC2_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Role_Requis_RPC2Impl <em>Role Requis RPC2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Role_Requis_RPC2Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRole_Requis_RPC2()
	 * @generated
	 */
	int ROLE_REQUIS_RPC2 = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC2__NAME = ASAPackage.ROLE_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC2__CONNECTEUR = ASAPackage.ROLE_REQUIS__CONNECTEUR;

	/**
	 * The number of structural features of the '<em>Role Requis RPC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC2_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis RPC2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC2_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Role_Fourni_RPC3Impl <em>Role Fourni RPC3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Role_Fourni_RPC3Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRole_Fourni_RPC3()
	 * @generated
	 */
	int ROLE_FOURNI_RPC3 = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC3__NAME = ASAPackage.ROLE_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC3__CONNECTEUR = ASAPackage.ROLE_FOURNI__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Attachementrpc3sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Fourni RPC3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC3_FEATURE_COUNT = ASAPackage.ROLE_FOURNI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Fourni RPC3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_RPC3_OPERATION_COUNT = ASAPackage.ROLE_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Role_Requis_RPC3Impl <em>Role Requis RPC3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Role_Requis_RPC3Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getRole_Requis_RPC3()
	 * @generated
	 */
	int ROLE_REQUIS_RPC3 = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC3__NAME = ASAPackage.ROLE_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC3__CONNECTEUR = ASAPackage.ROLE_REQUIS__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Attachementrpc3cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Requis RPC3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC3_FEATURE_COUNT = ASAPackage.ROLE_REQUIS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Requis RPC3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_RPC3_OPERATION_COUNT = ASAPackage.ROLE_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.BindingServeurImpl <em>Binding Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.BindingServeurImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getBindingServeur()
	 * @generated
	 */
	int BINDING_SERVEUR = 32;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR__PORT = ASAPackage.BINDING__PORT;

	/**
	 * The feature id for the '<em><b>External socket fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI = ASAPackage.BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External socket requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS = ASAPackage.BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serveur port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR__SERVEUR_PORT_REQUIS = ASAPackage.BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serveur port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR__SERVEUR_PORT_FOURNI = ASAPackage.BINDING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Binding Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_FEATURE_COUNT = ASAPackage.BINDING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Binding Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SERVEUR_OPERATION_COUNT = ASAPackage.BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Security_PortRequisImpl <em>Security Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Security_PortRequisImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getSecurity_PortRequis()
	 * @generated
	 */
	int SECURITY_PORT_REQUIS = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_REQUIS__NAME = ASAPackage.PORT_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_REQUIS__COMPOSANT = ASAPackage.PORT_REQUIS__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Security Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_REQUIS_FEATURE_COUNT = ASAPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PORT_REQUIS_OPERATION_COUNT = ASAPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Database_PortRequisImpl <em>Database Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Database_PortRequisImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getDatabase_PortRequis()
	 * @generated
	 */
	int DATABASE_PORT_REQUIS = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_REQUIS__NAME = ASAPackage.PORT_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_REQUIS__COMPOSANT = ASAPackage.PORT_REQUIS__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Database Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_REQUIS_FEATURE_COUNT = ASAPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_PORT_REQUIS_OPERATION_COUNT = ASAPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Connection_PortRequisImpl <em>Connection Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Connection_PortRequisImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getConnection_PortRequis()
	 * @generated
	 */
	int CONNECTION_PORT_REQUIS = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_REQUIS__NAME = ASAPackage.PORT_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_REQUIS__COMPOSANT = ASAPackage.PORT_REQUIS__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Connection Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_REQUIS_FEATURE_COUNT = ASAPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connection Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_PORT_REQUIS_OPERATION_COUNT = ASAPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Client_Port_RequisImpl <em>Client Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Client_Port_RequisImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getClient_Port_Requis()
	 * @generated
	 */
	int CLIENT_PORT_REQUIS = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_REQUIS__NAME = ASAPackage.PORT_REQUIS__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_REQUIS__COMPOSANT = ASAPackage.PORT_REQUIS__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Client Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_REQUIS_FEATURE_COUNT = ASAPackage.PORT_REQUIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_PORT_REQUIS_OPERATION_COUNT = ASAPackage.PORT_REQUIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.Serveur_Port_FourniImpl <em>Serveur Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.Serveur_Port_FourniImpl
	 * @see asaM1.impl.AsaM1PackageImpl#getServeur_Port_Fourni()
	 * @generated
	 */
	int SERVEUR_PORT_FOURNI = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_FOURNI__NAME = ASAPackage.PORT_FOURNI__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_FOURNI__COMPOSANT = ASAPackage.PORT_FOURNI__COMPOSANT;

	/**
	 * The number of structural features of the '<em>Serveur Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_FOURNI_FEATURE_COUNT = ASAPackage.PORT_FOURNI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Serveur Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_PORT_FOURNI_OPERATION_COUNT = ASAPackage.PORT_FOURNI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaM1.impl.NewEClass40Impl <em>New EClass40</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaM1.impl.NewEClass40Impl
	 * @see asaM1.impl.AsaM1PackageImpl#getNewEClass40()
	 * @generated
	 */
	int NEW_ECLASS40 = 38;

	/**
	 * The number of structural features of the '<em>New EClass40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS40_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS40_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link asaM1.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see asaM1.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the reference '{@link asaM1.System#getRpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc</em>'.
	 * @see asaM1.System#getRpc()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Rpc();

	/**
	 * Returns the meta object for the reference '{@link asaM1.System#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see asaM1.System#getClient()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Client();

	/**
	 * Returns the meta object for the reference '{@link asaM1.System#getServeur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveur</em>'.
	 * @see asaM1.System#getServeur()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Serveur();

	/**
	 * Returns the meta object for the reference '{@link asaM1.System#getAttacheserveurrpc <em>Attacheserveurrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attacheserveurrpc</em>'.
	 * @see asaM1.System#getAttacheserveurrpc()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Attacheserveurrpc();

	/**
	 * Returns the meta object for the reference '{@link asaM1.System#getAttacheclientrpc <em>Attacheclientrpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attacheclientrpc</em>'.
	 * @see asaM1.System#getAttacheclientrpc()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Attacheclientrpc();

	/**
	 * Returns the meta object for class '{@link asaM1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see asaM1.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Client#getClient_port_fourni <em>Client port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client port fourni</em>'.
	 * @see asaM1.Client#getClient_port_fourni()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Client_port_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Client#getClient_port_requis <em>Client port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client port requis</em>'.
	 * @see asaM1.Client#getClient_port_requis()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Client_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see asaM1.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Server#getServeur_port_requis <em>Serveur port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serveur port requis</em>'.
	 * @see asaM1.Server#getServeur_port_requis()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Serveur_port_requis();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Server#getServeur_port_fourni <em>Serveur port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serveur port fourni</em>'.
	 * @see asaM1.Server#getServeur_port_fourni()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Serveur_port_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server#getServer_detail <em>Server detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server detail</em>'.
	 * @see asaM1.Server#getServer_detail()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Server_detail();

	/**
	 * Returns the meta object for class '{@link asaM1.RPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC</em>'.
	 * @see asaM1.RPC
	 * @generated
	 */
	EClass getRPC();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC#getRrpc_ole_requis <em>Rrpc ole requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rrpc ole requis</em>'.
	 * @see asaM1.RPC#getRpc_role_requis()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rrpc_ole_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC#getRpc_role_fourni <em>Rpc role fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc role fourni</em>'.
	 * @see asaM1.RPC#getRpc_role_fourni()
	 * @see #getRPC()
	 * @generated
	 */
	EReference getRPC_Rpc_role_fourni();

	/**
	 * Returns the meta object for class '{@link asaM1.RPC_Role_Requis <em>RPC Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC Role Requis</em>'.
	 * @see asaM1.RPC_Role_Requis
	 * @generated
	 */
	EClass getRPC_Role_Requis();

	/**
	 * Returns the meta object for class '{@link asaM1.RPC_Role_Fourni <em>RPC Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC Role Fourni</em>'.
	 * @see asaM1.RPC_Role_Fourni
	 * @generated
	 */
	EClass getRPC_Role_Fourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Client_Port_Fourni <em>Client Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Port Fourni</em>'.
	 * @see asaM1.Client_Port_Fourni
	 * @generated
	 */
	EClass getClient_Port_Fourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Serveur_Port_Requis <em>Serveur Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Port Requis</em>'.
	 * @see asaM1.Serveur_Port_Requis
	 * @generated
	 */
	EClass getServeur_Port_Requis();

	/**
	 * Returns the meta object for class '{@link asaM1.AttacheServeurRPC <em>Attache Serveur RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attache Serveur RPC</em>'.
	 * @see asaM1.AttacheServeurRPC
	 * @generated
	 */
	EClass getAttacheServeurRPC();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheServeurRPC#getRole_fourni <em>Role fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni</em>'.
	 * @see asaM1.AttacheServeurRPC#getRole_fourni()
	 * @see #getAttacheServeurRPC()
	 * @generated
	 */
	EReference getAttacheServeurRPC_Role_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheServeurRPC#getRole_requis <em>Role requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis</em>'.
	 * @see asaM1.AttacheServeurRPC#getRole_requis()
	 * @see #getAttacheServeurRPC()
	 * @generated
	 */
	EReference getAttacheServeurRPC_Role_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheServeurRPC#getServeur_port_fourni <em>Serveur port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveur port fourni</em>'.
	 * @see asaM1.AttacheServeurRPC#getServeur_port_fourni()
	 * @see #getAttacheServeurRPC()
	 * @generated
	 */
	EReference getAttacheServeurRPC_Serveur_port_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheServeurRPC#getServeur_port_requis <em>Serveur port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveur port requis</em>'.
	 * @see asaM1.AttacheServeurRPC#getServeur_port_requis()
	 * @see #getAttacheServeurRPC()
	 * @generated
	 */
	EReference getAttacheServeurRPC_Serveur_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.AttacheClientRPC <em>Attache Client RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attache Client RPC</em>'.
	 * @see asaM1.AttacheClientRPC
	 * @generated
	 */
	EClass getAttacheClientRPC();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheClientRPC#getClient_port_fourni <em>Client port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client port fourni</em>'.
	 * @see asaM1.AttacheClientRPC#getClient_port_fourni()
	 * @see #getAttacheClientRPC()
	 * @generated
	 */
	EReference getAttacheClientRPC_Client_port_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheClientRPC#getRole_requis <em>Role requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis</em>'.
	 * @see asaM1.AttacheClientRPC#getRole_requis()
	 * @see #getAttacheClientRPC()
	 * @generated
	 */
	EReference getAttacheClientRPC_Role_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheClientRPC#getRole_fourni <em>Role fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni</em>'.
	 * @see asaM1.AttacheClientRPC#getRole_fourni()
	 * @see #getAttacheClientRPC()
	 * @generated
	 */
	EReference getAttacheClientRPC_Role_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttacheClientRPC#getClient_port_requis <em>Client port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client port requis</em>'.
	 * @see asaM1.AttacheClientRPC#getClient_port_requis()
	 * @see #getAttacheClientRPC()
	 * @generated
	 */
	EReference getAttacheClientRPC_Client_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see asaM1.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Database#getDatabase_port_fourni <em>Database port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Database port fourni</em>'.
	 * @see asaM1.Database#getDatabase_port_fourni()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Database_port_fourni();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Database#getDatabase_port_requis <em>Database port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Database port requis</em>'.
	 * @see asaM1.Database#getDatabase_port_requis()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Database_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see asaM1.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Connection#getConnection_port_fourni <em>Connection port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection port fourni</em>'.
	 * @see asaM1.Connection#getConnection_port_fourni()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Connection_port_fourni();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Connection#getConnection_port_requis <em>Connection port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection port requis</em>'.
	 * @see asaM1.Connection#getConnection_port_requis()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Connection_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see asaM1.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Security#getSecurity_port_fourni <em>Security port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security port fourni</em>'.
	 * @see asaM1.Security#getSecurity_port_fourni()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Security_port_fourni();

	/**
	 * Returns the meta object for the reference list '{@link asaM1.Security#getSecurity_port_requis <em>Security port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security port requis</em>'.
	 * @see asaM1.Security#getSecurity_port_requis()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Security_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.Server_Detail <em>Server Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Detail</em>'.
	 * @see asaM1.Server_Detail
	 * @generated
	 */
	EClass getServer_Detail();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security</em>'.
	 * @see asaM1.Server_Detail#getSecurity()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Security();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see asaM1.Server_Detail#getConnection()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Connection();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see asaM1.Server_Detail#getDatabase()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Database();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getRpc2 <em>Rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc2</em>'.
	 * @see asaM1.Server_Detail#getRpc2()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Rpc2();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getRpc3 <em>Rpc3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc3</em>'.
	 * @see asaM1.Server_Detail#getRpc3()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Rpc3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getRpc1 <em>Rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rpc1</em>'.
	 * @see asaM1.Server_Detail#getRpc1()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Rpc1();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getAttachementrpc3cm <em>Attachementrpc3cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc3cm</em>'.
	 * @see asaM1.Server_Detail#getAttachementrpc3cm()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Attachementrpc3cm();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getAttachementrpc3sm <em>Attachementrpc3sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc3sm</em>'.
	 * @see asaM1.Server_Detail#getAttachementrpc3sm()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Attachementrpc3sm();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getAttachementrpc2sm <em>Attachementrpc2sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc2sm</em>'.
	 * @see asaM1.Server_Detail#getAttachementrpc2sm()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Attachementrpc2sm();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getAttachementrpc2db <em>Attachementrpc2db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc2db</em>'.
	 * @see asaM1.Server_Detail#getAttachementrpc2db()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Attachementrpc2db();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getAttachementrpc1cm <em>Attachementrpc1cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc1cm</em>'.
	 * @see asaM1.Server_Detail#getAttachementrpc1cm()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Attachementrpc1cm();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getAttachementrpc1db <em>Attachementrpc1db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc1db</em>'.
	 * @see asaM1.Server_Detail#getAttachementrpc1db()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Attachementrpc1db();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Server_Detail#getBindingserveur <em>Bindingserveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bindingserveur</em>'.
	 * @see asaM1.Server_Detail#getBindingserveur()
	 * @see #getServer_Detail()
	 * @generated
	 */
	EReference getServer_Detail_Bindingserveur();

	/**
	 * Returns the meta object for class '{@link asaM1.RPC1 <em>RPC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC1</em>'.
	 * @see asaM1.RPC1
	 * @generated
	 */
	EClass getRPC1();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC1#getRole_requis_rpc1 <em>Role requis rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc1</em>'.
	 * @see asaM1.RPC1#getRole_requis_rpc1()
	 * @see #getRPC1()
	 * @generated
	 */
	EReference getRPC1_Role_requis_rpc1();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC1#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc1</em>'.
	 * @see asaM1.RPC1#getRole_fourni_rpc1()
	 * @see #getRPC1()
	 * @generated
	 */
	EReference getRPC1_Role_fourni_rpc1();

	/**
	 * Returns the meta object for class '{@link asaM1.RPC2 <em>RPC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC2</em>'.
	 * @see asaM1.RPC2
	 * @generated
	 */
	EClass getRPC2();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC2#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc2</em>'.
	 * @see asaM1.RPC2#getRole_fourni_rpc2()
	 * @see #getRPC2()
	 * @generated
	 */
	EReference getRPC2_Role_fourni_rpc2();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC2#getRole_requis_rpc2 <em>Role requis rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc2</em>'.
	 * @see asaM1.RPC2#getRole_requis_rpc2()
	 * @see #getRPC2()
	 * @generated
	 */
	EReference getRPC2_Role_requis_rpc2();

	/**
	 * Returns the meta object for class '{@link asaM1.RPC3 <em>RPC3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC3</em>'.
	 * @see asaM1.RPC3
	 * @generated
	 */
	EClass getRPC3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC3#getRole_requis_rpc3 <em>Role requis rpc3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc3</em>'.
	 * @see asaM1.RPC3#getRole_requis_rpc3()
	 * @see #getRPC3()
	 * @generated
	 */
	EReference getRPC3_Role_requis_rpc3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.RPC3#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc3</em>'.
	 * @see asaM1.RPC3#getRole_fourni_rpc3()
	 * @see #getRPC3()
	 * @generated
	 */
	EReference getRPC3_Role_fourni_rpc3();

	/**
	 * Returns the meta object for class '{@link asaM1.AttachementRPC1DB <em>Attachement RPC1DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement RPC1DB</em>'.
	 * @see asaM1.AttachementRPC1DB
	 * @generated
	 */
	EClass getAttachementRPC1DB();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1DB#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc1</em>'.
	 * @see asaM1.AttachementRPC1DB#getRole_fourni_rpc1()
	 * @see #getAttachementRPC1DB()
	 * @generated
	 */
	EReference getAttachementRPC1DB_Role_fourni_rpc1();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1DB#getRole_requis_rpc1 <em>Role requis rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc1</em>'.
	 * @see asaM1.AttachementRPC1DB#getRole_requis_rpc1()
	 * @see #getAttachementRPC1DB()
	 * @generated
	 */
	EReference getAttachementRPC1DB_Role_requis_rpc1();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1DB#getDatabase_port_requis <em>Database port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database port requis</em>'.
	 * @see asaM1.AttachementRPC1DB#getDatabase_port_requis()
	 * @see #getAttachementRPC1DB()
	 * @generated
	 */
	EReference getAttachementRPC1DB_Database_port_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1DB#getDatabase_portfourni <em>Database portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database portfourni</em>'.
	 * @see asaM1.AttachementRPC1DB#getDatabase_portfourni()
	 * @see #getAttachementRPC1DB()
	 * @generated
	 */
	EReference getAttachementRPC1DB_Database_portfourni();

	/**
	 * Returns the meta object for class '{@link asaM1.AttachementRPC1CM <em>Attachement RPC1CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement RPC1CM</em>'.
	 * @see asaM1.AttachementRPC1CM
	 * @generated
	 */
	EClass getAttachementRPC1CM();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1CM#getRole_requis_rpc1 <em>Role requis rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc1</em>'.
	 * @see asaM1.AttachementRPC1CM#getRole_requis_rpc1()
	 * @see #getAttachementRPC1CM()
	 * @generated
	 */
	EReference getAttachementRPC1CM_Role_requis_rpc1();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1CM#getConnection_port_fourni <em>Connection port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection port fourni</em>'.
	 * @see asaM1.AttachementRPC1CM#getConnection_port_fourni()
	 * @see #getAttachementRPC1CM()
	 * @generated
	 */
	EReference getAttachementRPC1CM_Connection_port_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1CM#getConnection_port_requis <em>Connection port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection port requis</em>'.
	 * @see asaM1.AttachementRPC1CM#getConnection_port_requis()
	 * @see #getAttachementRPC1CM()
	 * @generated
	 */
	EReference getAttachementRPC1CM_Connection_port_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC1CM#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc1</em>'.
	 * @see asaM1.AttachementRPC1CM#getRole_fourni_rpc1()
	 * @see #getAttachementRPC1CM()
	 * @generated
	 */
	EReference getAttachementRPC1CM_Role_fourni_rpc1();

	/**
	 * Returns the meta object for class '{@link asaM1.AttachementRPC2DB <em>Attachement RPC2DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement RPC2DB</em>'.
	 * @see asaM1.AttachementRPC2DB
	 * @generated
	 */
	EClass getAttachementRPC2DB();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2DB#getRole_requis_rpc2 <em>Role requis rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc2</em>'.
	 * @see asaM1.AttachementRPC2DB#getRole_requis_rpc2()
	 * @see #getAttachementRPC2DB()
	 * @generated
	 */
	EReference getAttachementRPC2DB_Role_requis_rpc2();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2DB#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc2</em>'.
	 * @see asaM1.AttachementRPC2DB#getRole_fourni_rpc2()
	 * @see #getAttachementRPC2DB()
	 * @generated
	 */
	EReference getAttachementRPC2DB_Role_fourni_rpc2();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2DB#getDatabase_port_fourni <em>Database port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database port fourni</em>'.
	 * @see asaM1.AttachementRPC2DB#getDatabase_port_fourni()
	 * @see #getAttachementRPC2DB()
	 * @generated
	 */
	EReference getAttachementRPC2DB_Database_port_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2DB#getDatabase_port_requis <em>Database port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database port requis</em>'.
	 * @see asaM1.AttachementRPC2DB#getDatabase_port_requis()
	 * @see #getAttachementRPC2DB()
	 * @generated
	 */
	EReference getAttachementRPC2DB_Database_port_requis();

	/**
	 * Returns the meta object for class '{@link asaM1.AttachementRPC2SM <em>Attachement RPC2SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement RPC2SM</em>'.
	 * @see asaM1.AttachementRPC2SM
	 * @generated
	 */
	EClass getAttachementRPC2SM();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2SM#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc2</em>'.
	 * @see asaM1.AttachementRPC2SM#getRole_fourni_rpc2()
	 * @see #getAttachementRPC2SM()
	 * @generated
	 */
	EReference getAttachementRPC2SM_Role_fourni_rpc2();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2SM#getSecurity_portfourni <em>Security portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security portfourni</em>'.
	 * @see asaM1.AttachementRPC2SM#getSecurity_portfourni()
	 * @see #getAttachementRPC2SM()
	 * @generated
	 */
	EReference getAttachementRPC2SM_Security_portfourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2SM#getSecurity_port_requis <em>Security port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security port requis</em>'.
	 * @see asaM1.AttachementRPC2SM#getSecurity_port_requis()
	 * @see #getAttachementRPC2SM()
	 * @generated
	 */
	EReference getAttachementRPC2SM_Security_port_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC2SM#getRole_requis_rpc2 <em>Role requis rpc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc2</em>'.
	 * @see asaM1.AttachementRPC2SM#getRole_requis_rpc2()
	 * @see #getAttachementRPC2SM()
	 * @generated
	 */
	EReference getAttachementRPC2SM_Role_requis_rpc2();

	/**
	 * Returns the meta object for class '{@link asaM1.AttachementRPC3CM <em>Attachement RPC3CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement RPC3CM</em>'.
	 * @see asaM1.AttachementRPC3CM
	 * @generated
	 */
	EClass getAttachementRPC3CM();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC3CM#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role fourni rpc3</em>'.
	 * @see asaM1.AttachementRPC3CM#getRole_fourni_rpc3()
	 * @see #getAttachementRPC3CM()
	 * @generated
	 */
	EReference getAttachementRPC3CM_Role_fourni_rpc3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC3CM#getConnection_portrequis <em>Connection portrequis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection portrequis</em>'.
	 * @see asaM1.AttachementRPC3CM#getConnection_portrequis()
	 * @see #getAttachementRPC3CM()
	 * @generated
	 */
	EReference getAttachementRPC3CM_Connection_portrequis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC3CM#getConnection_portfourni <em>Connection portfourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection portfourni</em>'.
	 * @see asaM1.AttachementRPC3CM#getConnection_portfourni()
	 * @see #getAttachementRPC3CM()
	 * @generated
	 */
	EReference getAttachementRPC3CM_Connection_portfourni();

	/**
	 * Returns the meta object for class '{@link asaM1.AttachementRPC3SM <em>Attachement RPC3SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement RPC3SM</em>'.
	 * @see asaM1.AttachementRPC3SM
	 * @generated
	 */
	EClass getAttachementRPC3SM();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC3SM#getRole_requis_rpc3 <em>Role requis rpc3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role requis rpc3</em>'.
	 * @see asaM1.AttachementRPC3SM#getRole_requis_rpc3()
	 * @see #getAttachementRPC3SM()
	 * @generated
	 */
	EReference getAttachementRPC3SM_Role_requis_rpc3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC3SM#getSecurity_port_requis <em>Security port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security port requis</em>'.
	 * @see asaM1.AttachementRPC3SM#getSecurity_port_requis()
	 * @see #getAttachementRPC3SM()
	 * @generated
	 */
	EReference getAttachementRPC3SM_Security_port_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.AttachementRPC3SM#getSecurity_port_fourni <em>Security port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security port fourni</em>'.
	 * @see asaM1.AttachementRPC3SM#getSecurity_port_fourni()
	 * @see #getAttachementRPC3SM()
	 * @generated
	 */
	EReference getAttachementRPC3SM_Security_port_fourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Connection_PortFourni <em>Connection Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Port Fourni</em>'.
	 * @see asaM1.Connection_PortFourni
	 * @generated
	 */
	EClass getConnection_PortFourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Security_PortFourni <em>Security Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Port Fourni</em>'.
	 * @see asaM1.Security_PortFourni
	 * @generated
	 */
	EClass getSecurity_PortFourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Database_PortFourni <em>Database Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Port Fourni</em>'.
	 * @see asaM1.Database_PortFourni
	 * @generated
	 */
	EClass getDatabase_PortFourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Role_fourni_RPC1 <em>Role fourni RPC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role fourni RPC1</em>'.
	 * @see asaM1.Role_fourni_RPC1
	 * @generated
	 */
	EClass getRole_fourni_RPC1();

	/**
	 * Returns the meta object for class '{@link asaM1.Role_Requis_RPC1 <em>Role Requis RPC1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis RPC1</em>'.
	 * @see asaM1.Role_Requis_RPC1
	 * @generated
	 */
	EClass getRole_Requis_RPC1();

	/**
	 * Returns the meta object for class '{@link asaM1.Role_Fourni_RPC2 <em>Role Fourni RPC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni RPC2</em>'.
	 * @see asaM1.Role_Fourni_RPC2
	 * @generated
	 */
	EClass getRole_Fourni_RPC2();

	/**
	 * Returns the meta object for class '{@link asaM1.Role_Requis_RPC2 <em>Role Requis RPC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis RPC2</em>'.
	 * @see asaM1.Role_Requis_RPC2
	 * @generated
	 */
	EClass getRole_Requis_RPC2();

	/**
	 * Returns the meta object for class '{@link asaM1.Role_Fourni_RPC3 <em>Role Fourni RPC3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni RPC3</em>'.
	 * @see asaM1.Role_Fourni_RPC3
	 * @generated
	 */
	EClass getRole_Fourni_RPC3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Role_Fourni_RPC3#getAttachementrpc3sm <em>Attachementrpc3sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc3sm</em>'.
	 * @see asaM1.Role_Fourni_RPC3#getAttachementrpc3sm()
	 * @see #getRole_Fourni_RPC3()
	 * @generated
	 */
	EReference getRole_Fourni_RPC3_Attachementrpc3sm();

	/**
	 * Returns the meta object for class '{@link asaM1.Role_Requis_RPC3 <em>Role Requis RPC3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis RPC3</em>'.
	 * @see asaM1.Role_Requis_RPC3
	 * @generated
	 */
	EClass getRole_Requis_RPC3();

	/**
	 * Returns the meta object for the reference '{@link asaM1.Role_Requis_RPC3#getAttachementrpc3cm <em>Attachementrpc3cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attachementrpc3cm</em>'.
	 * @see asaM1.Role_Requis_RPC3#getAttachementrpc3cm()
	 * @see #getRole_Requis_RPC3()
	 * @generated
	 */
	EReference getRole_Requis_RPC3_Attachementrpc3cm();

	/**
	 * Returns the meta object for class '{@link asaM1.BindingServeur <em>Binding Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Serveur</em>'.
	 * @see asaM1.BindingServeur
	 * @generated
	 */
	EClass getBindingServeur();

	/**
	 * Returns the meta object for the reference '{@link asaM1.BindingServeur#getExternal_socket_fourni <em>External socket fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External socket fourni</em>'.
	 * @see asaM1.BindingServeur#getExternal_socket_fourni()
	 * @see #getBindingServeur()
	 * @generated
	 */
	EReference getBindingServeur_External_socket_fourni();

	/**
	 * Returns the meta object for the reference '{@link asaM1.BindingServeur#getExternal_socket_requis <em>External socket requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External socket requis</em>'.
	 * @see asaM1.BindingServeur#getExternal_socket_requis()
	 * @see #getBindingServeur()
	 * @generated
	 */
	EReference getBindingServeur_External_socket_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.BindingServeur#getServeur_port_requis <em>Serveur port requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveur port requis</em>'.
	 * @see asaM1.BindingServeur#getServeur_port_requis()
	 * @see #getBindingServeur()
	 * @generated
	 */
	EReference getBindingServeur_Serveur_port_requis();

	/**
	 * Returns the meta object for the reference '{@link asaM1.BindingServeur#getServeur_port_fourni <em>Serveur port fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serveur port fourni</em>'.
	 * @see asaM1.BindingServeur#getServeur_port_fourni()
	 * @see #getBindingServeur()
	 * @generated
	 */
	EReference getBindingServeur_Serveur_port_fourni();

	/**
	 * Returns the meta object for class '{@link asaM1.Security_PortRequis <em>Security Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Port Requis</em>'.
	 * @see asaM1.Security_PortRequis
	 * @generated
	 */
	EClass getSecurity_PortRequis();

	/**
	 * Returns the meta object for class '{@link asaM1.Database_PortRequis <em>Database Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Port Requis</em>'.
	 * @see asaM1.Database_PortRequis
	 * @generated
	 */
	EClass getDatabase_PortRequis();

	/**
	 * Returns the meta object for class '{@link asaM1.Connection_PortRequis <em>Connection Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Port Requis</em>'.
	 * @see asaM1.Connection_PortRequis
	 * @generated
	 */
	EClass getConnection_PortRequis();

	/**
	 * Returns the meta object for class '{@link asaM1.Client_Port_Requis <em>Client Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Port Requis</em>'.
	 * @see asaM1.Client_Port_Requis
	 * @generated
	 */
	EClass getClient_Port_Requis();

	/**
	 * Returns the meta object for class '{@link asaM1.Serveur_Port_Fourni <em>Serveur Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur Port Fourni</em>'.
	 * @see asaM1.Serveur_Port_Fourni
	 * @generated
	 */
	EClass getServeur_Port_Fourni();

	/**
	 * Returns the meta object for class '{@link asaM1.NewEClass40 <em>New EClass40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass40</em>'.
	 * @see asaM1.NewEClass40
	 * @generated
	 */
	EClass getNewEClass40();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AsaM1Factory getAsaM1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link asaM1.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.SystemImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Rpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RPC = eINSTANCE.getSystem_Rpc();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CLIENT = eINSTANCE.getSystem_Client();

		/**
		 * The meta object literal for the '<em><b>Serveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SERVEUR = eINSTANCE.getSystem_Serveur();

		/**
		 * The meta object literal for the '<em><b>Attacheserveurrpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ATTACHESERVEURRPC = eINSTANCE.getSystem_Attacheserveurrpc();

		/**
		 * The meta object literal for the '<em><b>Attacheclientrpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ATTACHECLIENTRPC = eINSTANCE.getSystem_Attacheclientrpc();

		/**
		 * The meta object literal for the '{@link asaM1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.ClientImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Client port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__CLIENT_PORT_FOURNI = eINSTANCE.getClient_Client_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Client port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__CLIENT_PORT_REQUIS = eINSTANCE.getClient_Client_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.ServerImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Serveur port requis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVEUR_PORT_REQUIS = eINSTANCE.getServer_Serveur_port_requis();

		/**
		 * The meta object literal for the '<em><b>Serveur port fourni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVEUR_PORT_FOURNI = eINSTANCE.getServer_Serveur_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Server detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVER_DETAIL = eINSTANCE.getServer_Server_detail();

		/**
		 * The meta object literal for the '{@link asaM1.impl.RPCImpl <em>RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.RPCImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getRPC()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRPC();

		/**
		 * The meta object literal for the '<em><b>Rrpc ole requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__RRPC_OLE_REQUIS = eINSTANCE.getRPC_Rrpc_ole_requis();

		/**
		 * The meta object literal for the '<em><b>Rpc role fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__RPC_ROLE_FOURNI = eINSTANCE.getRPC_Rpc_role_fourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.RPC_Role_RequisImpl <em>RPC Role Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.RPC_Role_RequisImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getRPC_Role_Requis()
		 * @generated
		 */
		EClass RPC_ROLE_REQUIS = eINSTANCE.getRPC_Role_Requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.RPC_Role_FourniImpl <em>RPC Role Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.RPC_Role_FourniImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getRPC_Role_Fourni()
		 * @generated
		 */
		EClass RPC_ROLE_FOURNI = eINSTANCE.getRPC_Role_Fourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Client_Port_FourniImpl <em>Client Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Client_Port_FourniImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getClient_Port_Fourni()
		 * @generated
		 */
		EClass CLIENT_PORT_FOURNI = eINSTANCE.getClient_Port_Fourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Serveur_Port_RequisImpl <em>Serveur Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Serveur_Port_RequisImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getServeur_Port_Requis()
		 * @generated
		 */
		EClass SERVEUR_PORT_REQUIS = eINSTANCE.getServeur_Port_Requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttacheServeurRPCImpl <em>Attache Serveur RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttacheServeurRPCImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttacheServeurRPC()
		 * @generated
		 */
		EClass ATTACHE_SERVEUR_RPC = eINSTANCE.getAttacheServeurRPC();

		/**
		 * The meta object literal for the '<em><b>Role fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_SERVEUR_RPC__ROLE_FOURNI = eINSTANCE.getAttacheServeurRPC_Role_fourni();

		/**
		 * The meta object literal for the '<em><b>Role requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_SERVEUR_RPC__ROLE_REQUIS = eINSTANCE.getAttacheServeurRPC_Role_requis();

		/**
		 * The meta object literal for the '<em><b>Serveur port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI = eINSTANCE.getAttacheServeurRPC_Serveur_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Serveur port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS = eINSTANCE.getAttacheServeurRPC_Serveur_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttacheClientRPCImpl <em>Attache Client RPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttacheClientRPCImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttacheClientRPC()
		 * @generated
		 */
		EClass ATTACHE_CLIENT_RPC = eINSTANCE.getAttacheClientRPC();

		/**
		 * The meta object literal for the '<em><b>Client port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI = eINSTANCE.getAttacheClientRPC_Client_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Role requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_CLIENT_RPC__ROLE_REQUIS = eINSTANCE.getAttacheClientRPC_Role_requis();

		/**
		 * The meta object literal for the '<em><b>Role fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_CLIENT_RPC__ROLE_FOURNI = eINSTANCE.getAttacheClientRPC_Role_fourni();

		/**
		 * The meta object literal for the '<em><b>Client port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS = eINSTANCE.getAttacheClientRPC_Client_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.DatabaseImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Database port fourni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__DATABASE_PORT_FOURNI = eINSTANCE.getDatabase_Database_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Database port requis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__DATABASE_PORT_REQUIS = eINSTANCE.getDatabase_Database_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.ConnectionImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connection port fourni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_PORT_FOURNI = eINSTANCE.getConnection_Connection_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Connection port requis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_PORT_REQUIS = eINSTANCE.getConnection_Connection_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.SecurityImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Security port fourni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__SECURITY_PORT_FOURNI = eINSTANCE.getSecurity_Security_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Security port requis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__SECURITY_PORT_REQUIS = eINSTANCE.getSecurity_Security_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Server_DetailImpl <em>Server Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Server_DetailImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getServer_Detail()
		 * @generated
		 */
		EClass SERVER_DETAIL = eINSTANCE.getServer_Detail();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__SECURITY = eINSTANCE.getServer_Detail_Security();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__CONNECTION = eINSTANCE.getServer_Detail_Connection();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__DATABASE = eINSTANCE.getServer_Detail_Database();

		/**
		 * The meta object literal for the '<em><b>Rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__RPC2 = eINSTANCE.getServer_Detail_Rpc2();

		/**
		 * The meta object literal for the '<em><b>Rpc3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__RPC3 = eINSTANCE.getServer_Detail_Rpc3();

		/**
		 * The meta object literal for the '<em><b>Rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__RPC1 = eINSTANCE.getServer_Detail_Rpc1();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc3cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__ATTACHEMENTRPC3CM = eINSTANCE.getServer_Detail_Attachementrpc3cm();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc3sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__ATTACHEMENTRPC3SM = eINSTANCE.getServer_Detail_Attachementrpc3sm();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc2sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__ATTACHEMENTRPC2SM = eINSTANCE.getServer_Detail_Attachementrpc2sm();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc2db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__ATTACHEMENTRPC2DB = eINSTANCE.getServer_Detail_Attachementrpc2db();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc1cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__ATTACHEMENTRPC1CM = eINSTANCE.getServer_Detail_Attachementrpc1cm();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc1db</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__ATTACHEMENTRPC1DB = eINSTANCE.getServer_Detail_Attachementrpc1db();

		/**
		 * The meta object literal for the '<em><b>Bindingserveur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_DETAIL__BINDINGSERVEUR = eINSTANCE.getServer_Detail_Bindingserveur();

		/**
		 * The meta object literal for the '{@link asaM1.impl.RPC1Impl <em>RPC1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.RPC1Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRPC1()
		 * @generated
		 */
		EClass RPC1 = eINSTANCE.getRPC1();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC1__ROLE_REQUIS_RPC1 = eINSTANCE.getRPC1_Role_requis_rpc1();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC1__ROLE_FOURNI_RPC1 = eINSTANCE.getRPC1_Role_fourni_rpc1();

		/**
		 * The meta object literal for the '{@link asaM1.impl.RPC2Impl <em>RPC2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.RPC2Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRPC2()
		 * @generated
		 */
		EClass RPC2 = eINSTANCE.getRPC2();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC2__ROLE_FOURNI_RPC2 = eINSTANCE.getRPC2_Role_fourni_rpc2();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC2__ROLE_REQUIS_RPC2 = eINSTANCE.getRPC2_Role_requis_rpc2();

		/**
		 * The meta object literal for the '{@link asaM1.impl.RPC3Impl <em>RPC3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.RPC3Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRPC3()
		 * @generated
		 */
		EClass RPC3 = eINSTANCE.getRPC3();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC3__ROLE_REQUIS_RPC3 = eINSTANCE.getRPC3_Role_requis_rpc3();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC3__ROLE_FOURNI_RPC3 = eINSTANCE.getRPC3_Role_fourni_rpc3();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttachementRPC1DBImpl <em>Attachement RPC1DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttachementRPC1DBImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC1DB()
		 * @generated
		 */
		EClass ATTACHEMENT_RPC1DB = eINSTANCE.getAttachementRPC1DB();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1DB__ROLE_FOURNI_RPC1 = eINSTANCE.getAttachementRPC1DB_Role_fourni_rpc1();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1DB__ROLE_REQUIS_RPC1 = eINSTANCE.getAttachementRPC1DB_Role_requis_rpc1();

		/**
		 * The meta object literal for the '<em><b>Database port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1DB__DATABASE_PORT_REQUIS = eINSTANCE.getAttachementRPC1DB_Database_port_requis();

		/**
		 * The meta object literal for the '<em><b>Database portfourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1DB__DATABASE_PORTFOURNI = eINSTANCE.getAttachementRPC1DB_Database_portfourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttachementRPC1CMImpl <em>Attachement RPC1CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttachementRPC1CMImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC1CM()
		 * @generated
		 */
		EClass ATTACHEMENT_RPC1CM = eINSTANCE.getAttachementRPC1CM();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1CM__ROLE_REQUIS_RPC1 = eINSTANCE.getAttachementRPC1CM_Role_requis_rpc1();

		/**
		 * The meta object literal for the '<em><b>Connection port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1CM__CONNECTION_PORT_FOURNI = eINSTANCE.getAttachementRPC1CM_Connection_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Connection port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1CM__CONNECTION_PORT_REQUIS = eINSTANCE.getAttachementRPC1CM_Connection_port_requis();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC1CM__ROLE_FOURNI_RPC1 = eINSTANCE.getAttachementRPC1CM_Role_fourni_rpc1();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttachementRPC2DBImpl <em>Attachement RPC2DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttachementRPC2DBImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC2DB()
		 * @generated
		 */
		EClass ATTACHEMENT_RPC2DB = eINSTANCE.getAttachementRPC2DB();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2 = eINSTANCE.getAttachementRPC2DB_Role_requis_rpc2();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2 = eINSTANCE.getAttachementRPC2DB_Role_fourni_rpc2();

		/**
		 * The meta object literal for the '<em><b>Database port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI = eINSTANCE.getAttachementRPC2DB_Database_port_fourni();

		/**
		 * The meta object literal for the '<em><b>Database port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS = eINSTANCE.getAttachementRPC2DB_Database_port_requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttachementRPC2SMImpl <em>Attachement RPC2SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttachementRPC2SMImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC2SM()
		 * @generated
		 */
		EClass ATTACHEMENT_RPC2SM = eINSTANCE.getAttachementRPC2SM();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2SM__ROLE_FOURNI_RPC2 = eINSTANCE.getAttachementRPC2SM_Role_fourni_rpc2();

		/**
		 * The meta object literal for the '<em><b>Security portfourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2SM__SECURITY_PORTFOURNI = eINSTANCE.getAttachementRPC2SM_Security_portfourni();

		/**
		 * The meta object literal for the '<em><b>Security port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2SM__SECURITY_PORT_REQUIS = eINSTANCE.getAttachementRPC2SM_Security_port_requis();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC2SM__ROLE_REQUIS_RPC2 = eINSTANCE.getAttachementRPC2SM_Role_requis_rpc2();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttachementRPC3CMImpl <em>Attachement RPC3CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttachementRPC3CMImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC3CM()
		 * @generated
		 */
		EClass ATTACHEMENT_RPC3CM = eINSTANCE.getAttachementRPC3CM();

		/**
		 * The meta object literal for the '<em><b>Role fourni rpc3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC3CM__ROLE_FOURNI_RPC3 = eINSTANCE.getAttachementRPC3CM_Role_fourni_rpc3();

		/**
		 * The meta object literal for the '<em><b>Connection portrequis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC3CM__CONNECTION_PORTREQUIS = eINSTANCE.getAttachementRPC3CM_Connection_portrequis();

		/**
		 * The meta object literal for the '<em><b>Connection portfourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC3CM__CONNECTION_PORTFOURNI = eINSTANCE.getAttachementRPC3CM_Connection_portfourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.AttachementRPC3SMImpl <em>Attachement RPC3SM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.AttachementRPC3SMImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getAttachementRPC3SM()
		 * @generated
		 */
		EClass ATTACHEMENT_RPC3SM = eINSTANCE.getAttachementRPC3SM();

		/**
		 * The meta object literal for the '<em><b>Role requis rpc3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC3SM__ROLE_REQUIS_RPC3 = eINSTANCE.getAttachementRPC3SM_Role_requis_rpc3();

		/**
		 * The meta object literal for the '<em><b>Security port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC3SM__SECURITY_PORT_REQUIS = eINSTANCE.getAttachementRPC3SM_Security_port_requis();

		/**
		 * The meta object literal for the '<em><b>Security port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT_RPC3SM__SECURITY_PORT_FOURNI = eINSTANCE.getAttachementRPC3SM_Security_port_fourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Connection_PortFourniImpl <em>Connection Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Connection_PortFourniImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getConnection_PortFourni()
		 * @generated
		 */
		EClass CONNECTION_PORT_FOURNI = eINSTANCE.getConnection_PortFourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Security_PortFourniImpl <em>Security Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Security_PortFourniImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getSecurity_PortFourni()
		 * @generated
		 */
		EClass SECURITY_PORT_FOURNI = eINSTANCE.getSecurity_PortFourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Database_PortFourniImpl <em>Database Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Database_PortFourniImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getDatabase_PortFourni()
		 * @generated
		 */
		EClass DATABASE_PORT_FOURNI = eINSTANCE.getDatabase_PortFourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Role_fourni_RPC1Impl <em>Role fourni RPC1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Role_fourni_RPC1Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRole_fourni_RPC1()
		 * @generated
		 */
		EClass ROLE_FOURNI_RPC1 = eINSTANCE.getRole_fourni_RPC1();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Role_Requis_RPC1Impl <em>Role Requis RPC1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Role_Requis_RPC1Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRole_Requis_RPC1()
		 * @generated
		 */
		EClass ROLE_REQUIS_RPC1 = eINSTANCE.getRole_Requis_RPC1();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Role_Fourni_RPC2Impl <em>Role Fourni RPC2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Role_Fourni_RPC2Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRole_Fourni_RPC2()
		 * @generated
		 */
		EClass ROLE_FOURNI_RPC2 = eINSTANCE.getRole_Fourni_RPC2();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Role_Requis_RPC2Impl <em>Role Requis RPC2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Role_Requis_RPC2Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRole_Requis_RPC2()
		 * @generated
		 */
		EClass ROLE_REQUIS_RPC2 = eINSTANCE.getRole_Requis_RPC2();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Role_Fourni_RPC3Impl <em>Role Fourni RPC3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Role_Fourni_RPC3Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRole_Fourni_RPC3()
		 * @generated
		 */
		EClass ROLE_FOURNI_RPC3 = eINSTANCE.getRole_Fourni_RPC3();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc3sm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FOURNI_RPC3__ATTACHEMENTRPC3SM = eINSTANCE.getRole_Fourni_RPC3_Attachementrpc3sm();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Role_Requis_RPC3Impl <em>Role Requis RPC3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Role_Requis_RPC3Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getRole_Requis_RPC3()
		 * @generated
		 */
		EClass ROLE_REQUIS_RPC3 = eINSTANCE.getRole_Requis_RPC3();

		/**
		 * The meta object literal for the '<em><b>Attachementrpc3cm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIS_RPC3__ATTACHEMENTRPC3CM = eINSTANCE.getRole_Requis_RPC3_Attachementrpc3cm();

		/**
		 * The meta object literal for the '{@link asaM1.impl.BindingServeurImpl <em>Binding Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.BindingServeurImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getBindingServeur()
		 * @generated
		 */
		EClass BINDING_SERVEUR = eINSTANCE.getBindingServeur();

		/**
		 * The meta object literal for the '<em><b>External socket fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI = eINSTANCE.getBindingServeur_External_socket_fourni();

		/**
		 * The meta object literal for the '<em><b>External socket requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS = eINSTANCE.getBindingServeur_External_socket_requis();

		/**
		 * The meta object literal for the '<em><b>Serveur port requis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR__SERVEUR_PORT_REQUIS = eINSTANCE.getBindingServeur_Serveur_port_requis();

		/**
		 * The meta object literal for the '<em><b>Serveur port fourni</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_SERVEUR__SERVEUR_PORT_FOURNI = eINSTANCE.getBindingServeur_Serveur_port_fourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Security_PortRequisImpl <em>Security Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Security_PortRequisImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getSecurity_PortRequis()
		 * @generated
		 */
		EClass SECURITY_PORT_REQUIS = eINSTANCE.getSecurity_PortRequis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Database_PortRequisImpl <em>Database Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Database_PortRequisImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getDatabase_PortRequis()
		 * @generated
		 */
		EClass DATABASE_PORT_REQUIS = eINSTANCE.getDatabase_PortRequis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Connection_PortRequisImpl <em>Connection Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Connection_PortRequisImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getConnection_PortRequis()
		 * @generated
		 */
		EClass CONNECTION_PORT_REQUIS = eINSTANCE.getConnection_PortRequis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Client_Port_RequisImpl <em>Client Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Client_Port_RequisImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getClient_Port_Requis()
		 * @generated
		 */
		EClass CLIENT_PORT_REQUIS = eINSTANCE.getClient_Port_Requis();

		/**
		 * The meta object literal for the '{@link asaM1.impl.Serveur_Port_FourniImpl <em>Serveur Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.Serveur_Port_FourniImpl
		 * @see asaM1.impl.AsaM1PackageImpl#getServeur_Port_Fourni()
		 * @generated
		 */
		EClass SERVEUR_PORT_FOURNI = eINSTANCE.getServeur_Port_Fourni();

		/**
		 * The meta object literal for the '{@link asaM1.impl.NewEClass40Impl <em>New EClass40</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaM1.impl.NewEClass40Impl
		 * @see asaM1.impl.AsaM1PackageImpl#getNewEClass40()
		 * @generated
		 */
		EClass NEW_ECLASS40 = eINSTANCE.getNewEClass40();

	}

} //AsaM1Package
