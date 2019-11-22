/**
 */
package aSA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aSA.ASAPackage
 * @generated
 */
public interface ASAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASAFactory eINSTANCE = aSA.impl.ASAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant</em>'.
	 * @generated
	 */
	Composant createComposant();

	/**
	 * Returns a new object of class '<em>Connecteur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connecteur</em>'.
	 * @generated
	 */
	Connecteur createConnecteur();

	/**
	 * Returns a new object of class '<em>Attachement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachement</em>'.
	 * @generated
	 */
	Attachement createAttachement();

	/**
	 * Returns a new object of class '<em>Port Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Fourni</em>'.
	 * @generated
	 */
	PortFourni createPortFourni();

	/**
	 * Returns a new object of class '<em>Service Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Requis</em>'.
	 * @generated
	 */
	ServiceRequis createServiceRequis();

	/**
	 * Returns a new object of class '<em>Service Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Fourni</em>'.
	 * @generated
	 */
	ServiceFourni createServiceFourni();

	/**
	 * Returns a new object of class '<em>Port Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Requis</em>'.
	 * @generated
	 */
	PortRequis createPortRequis();

	/**
	 * Returns a new object of class '<em>Role Requis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requis</em>'.
	 * @generated
	 */
	RoleRequis createRoleRequis();

	/**
	 * Returns a new object of class '<em>Role Fourni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Fourni</em>'.
	 * @generated
	 */
	RoleFourni createRoleFourni();

	/**
	 * Returns a new object of class '<em>Glue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glue</em>'.
	 * @generated
	 */
	Glue createGlue();

	/**
	 * Returns a new object of class '<em>Contrainte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contrainte</em>'.
	 * @generated
	 */
	Contrainte createContrainte();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Propriete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Propriete</em>'.
	 * @generated
	 */
	Propriete createPropriete();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ASAPackage getASAPackage();

} //ASAFactory
