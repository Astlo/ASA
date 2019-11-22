/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connecteur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Connecteur#getSystem <em>System</em>}</li>
 *   <li>{@link aSA.Connecteur#getInterface <em>Interface</em>}</li>
 *   <li>{@link aSA.Connecteur#getGlue <em>Glue</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getConnecteur()
 * @model
 * @generated
 */
public interface Connecteur extends NamedElement {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aSA.Configuration#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(Configuration)
	 * @see aSA.ASAPackage#getConnecteur_System()
	 * @see aSA.Configuration#getConnecteur
	 * @model opposite="connecteur" transient="false"
	 * @generated
	 */
	Configuration getSystem();

	/**
	 * Sets the value of the '{@link aSA.Connecteur#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Configuration value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Interface}.
	 * It is bidirectional and its opposite is '{@link aSA.Interface#getConnecteur <em>Connecteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see aSA.ASAPackage#getConnecteur_Interface()
	 * @see aSA.Interface#getConnecteur
	 * @model opposite="connecteur" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Glue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference list.
	 * @see aSA.ASAPackage#getConnecteur_Glue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Glue> getGlue();

} // Connecteur
