/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attache Serveur RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttacheServeurRPC#getRole_fourni <em>Role fourni</em>}</li>
 *   <li>{@link asaM1.AttacheServeurRPC#getRole_requis <em>Role requis</em>}</li>
 *   <li>{@link asaM1.AttacheServeurRPC#getServeur_port_fourni <em>Serveur port fourni</em>}</li>
 *   <li>{@link asaM1.AttacheServeurRPC#getServeur_port_requis <em>Serveur port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttacheServeurRPC()
 * @model
 * @generated
 */
public interface AttacheServeurRPC extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni</em>' reference.
	 * @see #setRole_fourni(RPC_Role_Fourni)
	 * @see asaM1.AsaM1Package#getAttacheServeurRPC_Role_fourni()
	 * @model required="true"
	 * @generated
	 */
	RPC_Role_Fourni getRole_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttacheServeurRPC#getRole_fourni <em>Role fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni</em>' reference.
	 * @see #getRole_fourni()
	 * @generated
	 */
	void setRole_fourni(RPC_Role_Fourni value);

	/**
	 * Returns the value of the '<em><b>Role requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis</em>' reference.
	 * @see #setRole_requis(RPC_Role_Requis)
	 * @see asaM1.AsaM1Package#getAttacheServeurRPC_Role_requis()
	 * @model required="true"
	 * @generated
	 */
	RPC_Role_Requis getRole_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttacheServeurRPC#getRole_requis <em>Role requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis</em>' reference.
	 * @see #getRole_requis()
	 * @generated
	 */
	void setRole_requis(RPC_Role_Requis value);

	/**
	 * Returns the value of the '<em><b>Serveur port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur port fourni</em>' reference.
	 * @see #setServeur_port_fourni(Serveur_Port_Fourni)
	 * @see asaM1.AsaM1Package#getAttacheServeurRPC_Serveur_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Serveur_Port_Fourni getServeur_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttacheServeurRPC#getServeur_port_fourni <em>Serveur port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur port fourni</em>' reference.
	 * @see #getServeur_port_fourni()
	 * @generated
	 */
	void setServeur_port_fourni(Serveur_Port_Fourni value);

	/**
	 * Returns the value of the '<em><b>Serveur port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur port requis</em>' reference.
	 * @see #setServeur_port_requis(Serveur_Port_Requis)
	 * @see asaM1.AsaM1Package#getAttacheServeurRPC_Serveur_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Serveur_Port_Requis getServeur_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttacheServeurRPC#getServeur_port_requis <em>Serveur port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur port requis</em>' reference.
	 * @see #getServeur_port_requis()
	 * @generated
	 */
	void setServeur_port_requis(Serveur_Port_Requis value);

} // AttacheServeurRPC
