/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propriete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Propriete#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getPropriete()
 * @model
 * @generated
 */
public interface Propriete extends EObject {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aSA.Composant#getPropriete <em>Propriete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' reference.
	 * @see #setComposant(Composant)
	 * @see aSA.ASAPackage#getPropriete_Composant()
	 * @see aSA.Composant#getPropriete
	 * @model opposite="propriete" required="true"
	 * @generated
	 */
	Composant getComposant();

	/**
	 * Sets the value of the '{@link aSA.Propriete#getComposant <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composant</em>' reference.
	 * @see #getComposant()
	 * @generated
	 */
	void setComposant(Composant value);

} // Propriete
