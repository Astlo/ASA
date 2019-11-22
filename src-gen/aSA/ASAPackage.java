/**
 */
package aSA;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see aSA.ASAFactory
 * @model kind="package"
 * @generated
 */
public interface ASAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aSA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/aSA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aSA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASAPackage eINSTANCE = aSA.impl.ASAPackageImpl.init();

	/**
	 * The meta object id for the '{@link aSA.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.NamedElementImpl
	 * @see aSA.impl.ASAPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ConfigurationImpl
	 * @see aSA.impl.ASAPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPOSANT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTEUR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attachements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ATTACHEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BINDING = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ComposantImpl
	 * @see aSA.impl.ASAPackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>System pere</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__SYSTEM_PERE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System fils</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__SYSTEM_FILS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contrainte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CONTRAINTE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Propriete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PROPRIETE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ConnecteurImpl <em>Connecteur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ConnecteurImpl
	 * @see aSA.impl.ASAPackageImpl#getConnecteur()
	 * @generated
	 */
	int CONNECTEUR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR__GLUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connecteur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTEUR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.AttachementImpl <em>Attachement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.AttachementImpl
	 * @see aSA.impl.ASAPackageImpl#getAttachement()
	 * @generated
	 */
	int ATTACHEMENT = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT__PORTS = 2;

	/**
	 * The number of structural features of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.InterfaceImpl
	 * @see aSA.impl.ASAPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__COMPOSANT = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONNECTEUR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortImpl
	 * @see aSA.impl.ASAPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPOSANT = INTERFACE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONFIGURATION = INTERFACE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTEUR = INTERFACE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ServiceImpl
	 * @see aSA.impl.ASAPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMPOSANT = INTERFACE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONFIGURATION = INTERFACE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONNECTEUR = INTERFACE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortFourniImpl <em>Port Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getPortFourni()
	 * @generated
	 */
	int PORT_FOURNI = 7;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__COMPOSANT = PORT__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__CONFIGURATION = PORT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__CONNECTEUR = PORT__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FOURNI_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ServiceRequisImpl <em>Service Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ServiceRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getServiceRequis()
	 * @generated
	 */
	int SERVICE_REQUIS = 8;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__COMPOSANT = SERVICE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__CONFIGURATION = SERVICE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__CONNECTEUR = SERVICE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS__NAME = SERVICE__NAME;

	/**
	 * The number of structural features of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUIS_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ServiceFourniImpl <em>Service Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ServiceFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getServiceFourni()
	 * @generated
	 */
	int SERVICE_FOURNI = 9;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__COMPOSANT = SERVICE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__CONFIGURATION = SERVICE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__CONNECTEUR = SERVICE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI__NAME = SERVICE__NAME;

	/**
	 * The number of structural features of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FOURNI_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.PortRequisImpl <em>Port Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.PortRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getPortRequis()
	 * @generated
	 */
	int PORT_REQUIS = 10;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__COMPOSANT = PORT__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__CONFIGURATION = PORT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__CONNECTEUR = PORT__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REQUIS_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.RoleImpl
	 * @see aSA.impl.ASAPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 11;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COMPOSANT = INTERFACE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONFIGURATION = INTERFACE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTEUR = INTERFACE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.RoleRequisImpl <em>Role Requis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.RoleRequisImpl
	 * @see aSA.impl.ASAPackageImpl#getRoleRequis()
	 * @generated
	 */
	int ROLE_REQUIS = 12;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__COMPOSANT = ROLE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__CONFIGURATION = ROLE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__CONNECTEUR = ROLE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Requis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIS_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.RoleFourniImpl <em>Role Fourni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.RoleFourniImpl
	 * @see aSA.impl.ASAPackageImpl#getRoleFourni()
	 * @generated
	 */
	int ROLE_FOURNI = 13;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__COMPOSANT = ROLE__COMPOSANT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__CONFIGURATION = ROLE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Connecteur</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__CONNECTEUR = ROLE__CONNECTEUR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI__NAME = ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Fourni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FOURNI_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aSA.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.GlueImpl
	 * @see aSA.impl.ASAPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 14;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ContrainteImpl
	 * @see aSA.impl.ASAPackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 15;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__COMPOSANT = 0;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.BindingImpl
	 * @see aSA.impl.ASAPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 16;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORT = 0;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aSA.impl.ProprieteImpl <em>Propriete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aSA.impl.ProprieteImpl
	 * @see aSA.impl.ASAPackageImpl#getPropriete()
	 * @generated
	 */
	int PROPRIETE = 17;

	/**
	 * The feature id for the '<em><b>Composant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE__COMPOSANT = 0;

	/**
	 * The number of structural features of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Propriete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRIETE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link aSA.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see aSA.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composant</em>'.
	 * @see aSA.Configuration#getComposant()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Composant();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connecteur</em>'.
	 * @see aSA.Configuration#getConnecteur()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connecteur();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getAttachements <em>Attachements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachements</em>'.
	 * @see aSA.Configuration#getAttachements()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Attachements();

	/**
	 * Returns the meta object for the containment reference '{@link aSA.Configuration#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see aSA.Configuration#getInterface()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Configuration#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see aSA.Configuration#getBinding()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Binding();

	/**
	 * Returns the meta object for class '{@link aSA.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see aSA.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the container reference '{@link aSA.Composant#getSystem_pere <em>System pere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System pere</em>'.
	 * @see aSA.Composant#getSystem_pere()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_System_pere();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Composant#getSystem_fils <em>System fils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System fils</em>'.
	 * @see aSA.Composant#getSystem_fils()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_System_fils();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Composant#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see aSA.Composant#getInterface()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Interface();

	/**
	 * Returns the meta object for the reference '{@link aSA.Composant#getContrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contrainte</em>'.
	 * @see aSA.Composant#getContrainte()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Contrainte();

	/**
	 * Returns the meta object for the reference '{@link aSA.Composant#getPropriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Propriete</em>'.
	 * @see aSA.Composant#getPropriete()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Propriete();

	/**
	 * Returns the meta object for class '{@link aSA.Connecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecteur</em>'.
	 * @see aSA.Connecteur
	 * @generated
	 */
	EClass getConnecteur();

	/**
	 * Returns the meta object for the container reference '{@link aSA.Connecteur#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see aSA.Connecteur#getSystem()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_System();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Connecteur#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see aSA.Connecteur#getInterface()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link aSA.Connecteur#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Glue</em>'.
	 * @see aSA.Connecteur#getGlue()
	 * @see #getConnecteur()
	 * @generated
	 */
	EReference getConnecteur_Glue();

	/**
	 * Returns the meta object for class '{@link aSA.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement</em>'.
	 * @see aSA.Attachement
	 * @generated
	 */
	EClass getAttachement();

	/**
	 * Returns the meta object for the container reference '{@link aSA.Attachement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System</em>'.
	 * @see aSA.Attachement#getSystem()
	 * @see #getAttachement()
	 * @generated
	 */
	EReference getAttachement_System();

	/**
	 * Returns the meta object for the reference list '{@link aSA.Attachement#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see aSA.Attachement#getRoles()
	 * @see #getAttachement()
	 * @generated
	 */
	EReference getAttachement_Roles();

	/**
	 * Returns the meta object for the reference list '{@link aSA.Attachement#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see aSA.Attachement#getPorts()
	 * @see #getAttachement()
	 * @generated
	 */
	EReference getAttachement_Ports();

	/**
	 * Returns the meta object for class '{@link aSA.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see aSA.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the container reference '{@link aSA.Interface#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Composant</em>'.
	 * @see aSA.Interface#getComposant()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Composant();

	/**
	 * Returns the meta object for the container reference '{@link aSA.Interface#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see aSA.Interface#getConfiguration()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Configuration();

	/**
	 * Returns the meta object for the container reference '{@link aSA.Interface#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connecteur</em>'.
	 * @see aSA.Interface#getConnecteur()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Connecteur();

	/**
	 * Returns the meta object for the attribute '{@link aSA.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aSA.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for class '{@link aSA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see aSA.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link aSA.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see aSA.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link aSA.PortFourni <em>Port Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Fourni</em>'.
	 * @see aSA.PortFourni
	 * @generated
	 */
	EClass getPortFourni();

	/**
	 * Returns the meta object for class '{@link aSA.ServiceRequis <em>Service Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Requis</em>'.
	 * @see aSA.ServiceRequis
	 * @generated
	 */
	EClass getServiceRequis();

	/**
	 * Returns the meta object for class '{@link aSA.ServiceFourni <em>Service Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Fourni</em>'.
	 * @see aSA.ServiceFourni
	 * @generated
	 */
	EClass getServiceFourni();

	/**
	 * Returns the meta object for class '{@link aSA.PortRequis <em>Port Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Requis</em>'.
	 * @see aSA.PortRequis
	 * @generated
	 */
	EClass getPortRequis();

	/**
	 * Returns the meta object for class '{@link aSA.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see aSA.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link aSA.RoleRequis <em>Role Requis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requis</em>'.
	 * @see aSA.RoleRequis
	 * @generated
	 */
	EClass getRoleRequis();

	/**
	 * Returns the meta object for class '{@link aSA.RoleFourni <em>Role Fourni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Fourni</em>'.
	 * @see aSA.RoleFourni
	 * @generated
	 */
	EClass getRoleFourni();

	/**
	 * Returns the meta object for class '{@link aSA.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see aSA.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for class '{@link aSA.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see aSA.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for the reference '{@link aSA.Contrainte#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composant</em>'.
	 * @see aSA.Contrainte#getComposant()
	 * @see #getContrainte()
	 * @generated
	 */
	EReference getContrainte_Composant();

	/**
	 * Returns the meta object for class '{@link aSA.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see aSA.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference list '{@link aSA.Binding#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see aSA.Binding#getPort()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Port();

	/**
	 * Returns the meta object for class '{@link aSA.Propriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propriete</em>'.
	 * @see aSA.Propriete
	 * @generated
	 */
	EClass getPropriete();

	/**
	 * Returns the meta object for the reference '{@link aSA.Propriete#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composant</em>'.
	 * @see aSA.Propriete#getComposant()
	 * @see #getPropriete()
	 * @generated
	 */
	EReference getPropriete_Composant();

	/**
	 * Returns the meta object for class '{@link aSA.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see aSA.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link aSA.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aSA.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASAFactory getASAFactory();

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
		 * The meta object literal for the '{@link aSA.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ConfigurationImpl
		 * @see aSA.impl.ASAPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPOSANT = eINSTANCE.getConfiguration_Composant();

		/**
		 * The meta object literal for the '<em><b>Connecteur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTEUR = eINSTANCE.getConfiguration_Connecteur();

		/**
		 * The meta object literal for the '<em><b>Attachements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__ATTACHEMENTS = eINSTANCE.getConfiguration_Attachements();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACE = eINSTANCE.getConfiguration_Interface();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BINDING = eINSTANCE.getConfiguration_Binding();

		/**
		 * The meta object literal for the '{@link aSA.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ComposantImpl
		 * @see aSA.impl.ASAPackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>System pere</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__SYSTEM_PERE = eINSTANCE.getComposant_System_pere();

		/**
		 * The meta object literal for the '<em><b>System fils</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__SYSTEM_FILS = eINSTANCE.getComposant_System_fils();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__INTERFACE = eINSTANCE.getComposant_Interface();

		/**
		 * The meta object literal for the '<em><b>Contrainte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__CONTRAINTE = eINSTANCE.getComposant_Contrainte();

		/**
		 * The meta object literal for the '<em><b>Propriete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__PROPRIETE = eINSTANCE.getComposant_Propriete();

		/**
		 * The meta object literal for the '{@link aSA.impl.ConnecteurImpl <em>Connecteur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ConnecteurImpl
		 * @see aSA.impl.ASAPackageImpl#getConnecteur()
		 * @generated
		 */
		EClass CONNECTEUR = eINSTANCE.getConnecteur();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__SYSTEM = eINSTANCE.getConnecteur_System();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__INTERFACE = eINSTANCE.getConnecteur_Interface();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTEUR__GLUE = eINSTANCE.getConnecteur_Glue();

		/**
		 * The meta object literal for the '{@link aSA.impl.AttachementImpl <em>Attachement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.AttachementImpl
		 * @see aSA.impl.ASAPackageImpl#getAttachement()
		 * @generated
		 */
		EClass ATTACHEMENT = eINSTANCE.getAttachement();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT__SYSTEM = eINSTANCE.getAttachement_System();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT__ROLES = eINSTANCE.getAttachement_Roles();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHEMENT__PORTS = eINSTANCE.getAttachement_Ports();

		/**
		 * The meta object literal for the '{@link aSA.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.InterfaceImpl
		 * @see aSA.impl.ASAPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__COMPOSANT = eINSTANCE.getInterface_Composant();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CONFIGURATION = eINSTANCE.getInterface_Configuration();

		/**
		 * The meta object literal for the '<em><b>Connecteur</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CONNECTEUR = eINSTANCE.getInterface_Connecteur();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortImpl
		 * @see aSA.impl.ASAPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link aSA.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ServiceImpl
		 * @see aSA.impl.ASAPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortFourniImpl <em>Port Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getPortFourni()
		 * @generated
		 */
		EClass PORT_FOURNI = eINSTANCE.getPortFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.ServiceRequisImpl <em>Service Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ServiceRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getServiceRequis()
		 * @generated
		 */
		EClass SERVICE_REQUIS = eINSTANCE.getServiceRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.ServiceFourniImpl <em>Service Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ServiceFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getServiceFourni()
		 * @generated
		 */
		EClass SERVICE_FOURNI = eINSTANCE.getServiceFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.PortRequisImpl <em>Port Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.PortRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getPortRequis()
		 * @generated
		 */
		EClass PORT_REQUIS = eINSTANCE.getPortRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.RoleImpl
		 * @see aSA.impl.ASAPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link aSA.impl.RoleRequisImpl <em>Role Requis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.RoleRequisImpl
		 * @see aSA.impl.ASAPackageImpl#getRoleRequis()
		 * @generated
		 */
		EClass ROLE_REQUIS = eINSTANCE.getRoleRequis();

		/**
		 * The meta object literal for the '{@link aSA.impl.RoleFourniImpl <em>Role Fourni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.RoleFourniImpl
		 * @see aSA.impl.ASAPackageImpl#getRoleFourni()
		 * @generated
		 */
		EClass ROLE_FOURNI = eINSTANCE.getRoleFourni();

		/**
		 * The meta object literal for the '{@link aSA.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.GlueImpl
		 * @see aSA.impl.ASAPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '{@link aSA.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ContrainteImpl
		 * @see aSA.impl.ASAPackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRAINTE__COMPOSANT = eINSTANCE.getContrainte_Composant();

		/**
		 * The meta object literal for the '{@link aSA.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.BindingImpl
		 * @see aSA.impl.ASAPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORT = eINSTANCE.getBinding_Port();

		/**
		 * The meta object literal for the '{@link aSA.impl.ProprieteImpl <em>Propriete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.ProprieteImpl
		 * @see aSA.impl.ASAPackageImpl#getPropriete()
		 * @generated
		 */
		EClass PROPRIETE = eINSTANCE.getPropriete();

		/**
		 * The meta object literal for the '<em><b>Composant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPRIETE__COMPOSANT = eINSTANCE.getPropriete_Composant();

		/**
		 * The meta object literal for the '{@link aSA.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aSA.impl.NamedElementImpl
		 * @see aSA.impl.ASAPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //ASAPackage
