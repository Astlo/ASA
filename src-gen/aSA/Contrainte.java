/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrainte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Contrainte#getComposant <em>Composant</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getContrainte()
 * @model
 * @generated
 */
public interface Contrainte extends EObject {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link aSA.Composant#getContrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' reference.
	 * @see #setComposant(Composant)
	 * @see aSA.ASAPackage#getContrainte_Composant()
	 * @see aSA.Composant#getContrainte
	 * @model opposite="contrainte" required="true"
	 * @generated
	 */
	Composant getComposant();

	/**
	 * Sets the value of the '{@link aSA.Contrainte#getComposant <em>Composant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composant</em>' reference.
	 * @see #getComposant()
	 * @generated
	 */
	void setComposant(Composant value);

} // Contrainte
