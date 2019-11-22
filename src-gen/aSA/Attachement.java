/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Attachement#getSystem <em>System</em>}</li>
 *   <li>{@link aSA.Attachement#getRoles <em>Roles</em>}</li>
 *   <li>{@link aSA.Attachement#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getAttachement()
 * @model
 * @generated
 */
public interface Attachement extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aSA.Configuration#getAttachements <em>Attachements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(Configuration)
	 * @see aSA.ASAPackage#getAttachement_System()
	 * @see aSA.Configuration#getAttachements
	 * @model opposite="attachements" transient="false"
	 * @generated
	 */
	Configuration getSystem();

	/**
	 * Sets the value of the '{@link aSA.Attachement#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Configuration value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link aSA.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see aSA.ASAPackage#getAttachement_Roles()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link aSA.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see aSA.ASAPackage#getAttachement_Ports()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getPorts();

} // Attachement
