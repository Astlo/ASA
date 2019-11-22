/**
 */
package aSA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Configuration#getComposant <em>Composant</em>}</li>
 *   <li>{@link aSA.Configuration#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link aSA.Configuration#getAttachements <em>Attachements</em>}</li>
 *   <li>{@link aSA.Configuration#getInterface <em>Interface</em>}</li>
 *   <li>{@link aSA.Configuration#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Composant}.
	 * It is bidirectional and its opposite is '{@link aSA.Composant#getSystem_pere <em>System pere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Composant()
	 * @see aSA.Composant#getSystem_pere
	 * @model opposite="system_pere" containment="true" lower="2"
	 * @generated
	 */
	EList<Composant> getComposant();

	/**
	 * Returns the value of the '<em><b>Connecteur</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Connecteur}.
	 * It is bidirectional and its opposite is '{@link aSA.Connecteur#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteur</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Connecteur()
	 * @see aSA.Connecteur#getSystem
	 * @model opposite="system" containment="true" required="true"
	 * @generated
	 */
	EList<Connecteur> getConnecteur();

	/**
	 * Returns the value of the '<em><b>Attachements</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Attachement}.
	 * It is bidirectional and its opposite is '{@link aSA.Attachement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachements</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Attachements()
	 * @see aSA.Attachement#getSystem
	 * @model opposite="system" containment="true" lower="2"
	 * @generated
	 */
	EList<Attachement> getAttachements();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link aSA.Interface#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Interface)
	 * @see aSA.ASAPackage#getConfiguration_Interface()
	 * @see aSA.Interface#getConfiguration
	 * @model opposite="configuration" containment="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link aSA.Configuration#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link aSA.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see aSA.ASAPackage#getConfiguration_Binding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBinding();

} // Configuration
