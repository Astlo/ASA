/**
 */
package aSA.impl;

import aSA.*;

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
public class ASAFactoryImpl extends EFactoryImpl implements ASAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ASAFactory init() {
		try {
			ASAFactory theASAFactory = (ASAFactory) EPackage.Registry.INSTANCE.getEFactory(ASAPackage.eNS_URI);
			if (theASAFactory != null) {
				return theASAFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ASAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASAFactoryImpl() {
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
		case ASAPackage.CONFIGURATION:
			return createConfiguration();
		case ASAPackage.COMPOSANT:
			return createComposant();
		case ASAPackage.CONNECTEUR:
			return createConnecteur();
		case ASAPackage.ATTACHEMENT:
			return createAttachement();
		case ASAPackage.PORT_FOURNI:
			return createPortFourni();
		case ASAPackage.SERVICE_REQUIS:
			return createServiceRequis();
		case ASAPackage.SERVICE_FOURNI:
			return createServiceFourni();
		case ASAPackage.PORT_REQUIS:
			return createPortRequis();
		case ASAPackage.ROLE_REQUIS:
			return createRoleRequis();
		case ASAPackage.ROLE_FOURNI:
			return createRoleFourni();
		case ASAPackage.GLUE:
			return createGlue();
		case ASAPackage.CONTRAINTE:
			return createContrainte();
		case ASAPackage.BINDING:
			return createBinding();
		case ASAPackage.PROPRIETE:
			return createPropriete();
		case ASAPackage.NAMED_ELEMENT:
			return createNamedElement();
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
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connecteur createConnecteur() {
		ConnecteurImpl connecteur = new ConnecteurImpl();
		return connecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attachement createAttachement() {
		AttachementImpl attachement = new AttachementImpl();
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortFourni createPortFourni() {
		PortFourniImpl portFourni = new PortFourniImpl();
		return portFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRequis createServiceRequis() {
		ServiceRequisImpl serviceRequis = new ServiceRequisImpl();
		return serviceRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceFourni createServiceFourni() {
		ServiceFourniImpl serviceFourni = new ServiceFourniImpl();
		return serviceFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortRequis createPortRequis() {
		PortRequisImpl portRequis = new PortRequisImpl();
		return portRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleRequis createRoleRequis() {
		RoleRequisImpl roleRequis = new RoleRequisImpl();
		return roleRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleFourni createRoleFourni() {
		RoleFourniImpl roleFourni = new RoleFourniImpl();
		return roleFourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte createContrainte() {
		ContrainteImpl contrainte = new ContrainteImpl();
		return contrainte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Propriete createPropriete() {
		ProprieteImpl propriete = new ProprieteImpl();
		return propriete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASAPackage getASAPackage() {
		return (ASAPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ASAPackage getPackage() {
		return ASAPackage.eINSTANCE;
	}

} //ASAFactoryImpl
