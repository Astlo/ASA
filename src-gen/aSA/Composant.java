/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Composant#getSystem_pere <em>System pere</em>}</li>
 *   <li>{@link aSA.Composant#getSystem_fils <em>System fils</em>}</li>
 *   <li>{@link aSA.Composant#getInterface <em>Interface</em>}</li>
 *   <li>{@link aSA.Composant#getContrainte <em>Contrainte</em>}</li>
 *   <li>{@link aSA.Composant#getPropriete <em>Propriete</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>System pere</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aSA.Configuration#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System pere</em>' container reference.
	 * @see #setSystem_pere(Configuration)
	 * @see aSA.ASAPackage#getComposant_System_pere()
	 * @see aSA.Configuration#getComposant
	 * @model opposite="composant" required="true" transient="false"
	 * @generated
	 */
	Configuration getSystem_pere();

	/**
	 * Sets the value of the '{@link aSA.Composant#getSystem_pere <em>System pere</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System pere</em>' container reference.
	 * @see #getSystem_pere()
	 * @generated
	 */
	void setSystem_pere(Configuration value);

	/**
	 * Returns the value of the '<em><b>System fils</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System fils</em>' containment reference list.
	 * @see aSA.ASAPackage#getComposant_System_fils()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getSystem_fils();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Interface}.
	 * It is bidirectional and its opposite is '{@link aSA.Interface#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see aSA.ASAPackage#getComposant_Interface()
	 * @see aSA.Interface#getComposant
	 * @model opposite="composant" containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Contrainte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aSA.Contrainte#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrainte</em>' reference.
	 * @see #setContrainte(Contrainte)
	 * @see aSA.ASAPackage#getComposant_Contrainte()
	 * @see aSA.Contrainte#getComposant
	 * @model opposite="composant"
	 * @generated
	 */
	Contrainte getContrainte();

	/**
	 * Sets the value of the '{@link aSA.Composant#getContrainte <em>Contrainte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrainte</em>' reference.
	 * @see #getContrainte()
	 * @generated
	 */
	void setContrainte(Contrainte value);

	/**
	 * Returns the value of the '<em><b>Propriete</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aSA.Propriete#getComposant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propriete</em>' reference.
	 * @see #setPropriete(Propriete)
	 * @see aSA.ASAPackage#getComposant_Propriete()
	 * @see aSA.Propriete#getComposant
	 * @model opposite="composant"
	 * @generated
	 */
	Propriete getPropriete();

	/**
	 * Sets the value of the '{@link aSA.Composant#getPropriete <em>Propriete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propriete</em>' reference.
	 * @see #getPropriete()
	 * @generated
	 */
	void setPropriete(Propriete value);

} // Composant
