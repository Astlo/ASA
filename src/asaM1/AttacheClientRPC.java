/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attache Client RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttacheClientRPC#getClient_port_fourni <em>Client port fourni</em>}</li>
 *   <li>{@link asaM1.AttacheClientRPC#getRole_requis <em>Role requis</em>}</li>
 *   <li>{@link asaM1.AttacheClientRPC#getRole_fourni <em>Role fourni</em>}</li>
 *   <li>{@link asaM1.AttacheClientRPC#getClient_port_requis <em>Client port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttacheClientRPC()
 * @model
 * @generated
 */
public interface AttacheClientRPC extends Attachement {
	/**
	 * Returns the value of the '<em><b>Client port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client port fourni</em>' reference.
	 * @see #setClient_port_fourni(Client_Port_Fourni)
	 * @see asaM1.AsaM1Package#getAttacheClientRPC_Client_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Client_Port_Fourni getClient_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttacheClientRPC#getClient_port_fourni <em>Client port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client port fourni</em>' reference.
	 * @see #getClient_port_fourni()
	 * @generated
	 */
	void setClient_port_fourni(Client_Port_Fourni value);

	/**
	 * Returns the value of the '<em><b>Role requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis</em>' reference.
	 * @see #setRole_requis(RPC_Role_Requis)
	 * @see asaM1.AsaM1Package#getAttacheClientRPC_Role_requis()
	 * @model required="true"
	 * @generated
	 */
	RPC_Role_Requis getRole_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttacheClientRPC#getRole_requis <em>Role requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis</em>' reference.
	 * @see #getRole_requis()
	 * @generated
	 */
	void setRole_requis(RPC_Role_Requis value);

	/**
	 * Returns the value of the '<em><b>Role fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni</em>' reference.
	 * @see #setRole_fourni(RPC_Role_Fourni)
	 * @see asaM1.AsaM1Package#getAttacheClientRPC_Role_fourni()
	 * @model required="true"
	 * @generated
	 */
	RPC_Role_Fourni getRole_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttacheClientRPC#getRole_fourni <em>Role fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni</em>' reference.
	 * @see #getRole_fourni()
	 * @generated
	 */
	void setRole_fourni(RPC_Role_Fourni value);

	/**
	 * Returns the value of the '<em><b>Client port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client port requis</em>' reference.
	 * @see #setClient_port_requis(Client_Port_Requis)
	 * @see asaM1.AsaM1Package#getAttacheClientRPC_Client_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Client_Port_Requis getClient_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttacheClientRPC#getClient_port_requis <em>Client port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client port requis</em>' reference.
	 * @see #getClient_port_requis()
	 * @generated
	 */
	void setClient_port_requis(Client_Port_Requis value);

} // AttacheClientRPC
