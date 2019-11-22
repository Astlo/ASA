/**
 */
package aSA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aSA.Interface#getComposant <em>Composant</em>}</li>
 *   <li>{@link aSA.Interface#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link aSA.Interface#getConnecteur <em>Connecteur</em>}</li>
 *   <li>{@link aSA.Interface#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see aSA.ASAPackage#getInterface()
 * @model abstract="true"
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Composant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aSA.Composant#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composant</em>' container reference.
	 * @see #setComposant(Composant)
	 * @see aSA.ASAPackage#getInterface_Composant()
	 * @see aSA.Composant#getInterface
	 * @model opposite="interface" transient="false"
	 * @generated
	 */
	Composant getComposant();

	/**
	 * Sets the value of the '{@link aSA.Interface#getComposant <em>Composant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composant</em>' container reference.
	 * @see #getComposant()
	 * @generated
	 */
	void setComposant(Composant value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aSA.Configuration#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see aSA.ASAPackage#getInterface_Configuration()
	 * @see aSA.Configuration#getInterface
	 * @model opposite="interface" transient="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link aSA.Interface#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Connecteur</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aSA.Connecteur#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connecteur</em>' container reference.
	 * @see #setConnecteur(Connecteur)
	 * @see aSA.ASAPackage#getInterface_Connecteur()
	 * @see aSA.Connecteur#getInterface
	 * @model opposite="interface" transient="false"
	 * @generated
	 */
	Connecteur getConnecteur();

	/**
	 * Sets the value of the '{@link aSA.Interface#getConnecteur <em>Connecteur</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connecteur</em>' container reference.
	 * @see #getConnecteur()
	 * @generated
	 */
	void setConnecteur(Connecteur value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aSA.ASAPackage#getInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aSA.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Interface
