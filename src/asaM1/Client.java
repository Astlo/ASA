/**
 */
package asaM1;

import aSA.Composant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.Client#getClient_port_fourni <em>Client port fourni</em>}</li>
 *   <li>{@link asaM1.Client#getClient_port_requis <em>Client port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getClient()
 * @model
 * @generated
 */
public interface Client extends Composant {
	/**
	 * Returns the value of the '<em><b>Client port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client port fourni</em>' reference.
	 * @see #setClient_port_fourni(Client_Port_Fourni)
	 * @see asaM1.AsaM1Package#getClient_Client_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Client_Port_Fourni getClient_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.Client#getClient_port_fourni <em>Client port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client port fourni</em>' reference.
	 * @see #getClient_port_fourni()
	 * @generated
	 */
	void setClient_port_fourni(Client_Port_Fourni value);

	/**
	 * Returns the value of the '<em><b>Client port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client port requis</em>' reference.
	 * @see #setClient_port_requis(Client_Port_Requis)
	 * @see asaM1.AsaM1Package#getClient_Client_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Client_Port_Requis getClient_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.Client#getClient_port_requis <em>Client port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client port requis</em>' reference.
	 * @see #getClient_port_requis()
	 * @generated
	 */
	void setClient_port_requis(Client_Port_Requis value);

	void envoieRequeteClient(Client_Port_Fourni client_port_fourni, String string);

	void receptionReponse(String message);

} // Client
