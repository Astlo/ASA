/**
 */
package asaM1;

import aSA.Configuration;
import asaM1.impl.RPCImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.System#getRpc <em>Rpc</em>}</li>
 *   <li>{@link asaM1.System#getClient <em>Client</em>}</li>
 *   <li>{@link asaM1.System#getServeur <em>Serveur</em>}</li>
 *   <li>{@link asaM1.System#getAttacheserveurrpc <em>Attacheserveurrpc</em>}</li>
 *   <li>{@link asaM1.System#getAttacheclientrpc <em>Attacheclientrpc</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getSystem()
 * @model
 * @generated
 */
public interface System extends Configuration {
	/**
	 * Returns the value of the '<em><b>Rpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc</em>' reference.
	 * @see #setRpc(RPC)
	 * @see asaM1.AsaM1Package#getSystem_Rpc()
	 * @model required="true"
	 * @generated
	 */
	RPC getRpc();

	/**
	 * Sets the value of the '{@link asaM1.System#getRpc <em>Rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc</em>' reference.
	 * @see #getRpc()
	 * @generated
	 */
	void setRpc(RPC value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see asaM1.AsaM1Package#getSystem_Client()
	 * @model required="true"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link asaM1.System#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Serveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur</em>' reference.
	 * @see #setServeur(Server)
	 * @see asaM1.AsaM1Package#getSystem_Serveur()
	 * @model required="true"
	 * @generated
	 */
	Server getServeur();

	/**
	 * Sets the value of the '{@link asaM1.System#getServeur <em>Serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur</em>' reference.
	 * @see #getServeur()
	 * @generated
	 */
	void setServeur(Server value);

	/**
	 * Returns the value of the '<em><b>Attacheserveurrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacheserveurrpc</em>' reference.
	 * @see #setAttacheserveurrpc(AttacheServeurRPC)
	 * @see asaM1.AsaM1Package#getSystem_Attacheserveurrpc()
	 * @model required="true"
	 * @generated
	 */
	AttacheServeurRPC getAttacheserveurrpc();

	/**
	 * Sets the value of the '{@link asaM1.System#getAttacheserveurrpc <em>Attacheserveurrpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacheserveurrpc</em>' reference.
	 * @see #getAttacheserveurrpc()
	 * @generated
	 */
	void setAttacheserveurrpc(AttacheServeurRPC value);

	/**
	 * Returns the value of the '<em><b>Attacheclientrpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacheclientrpc</em>' reference.
	 * @see #setAttacheclientrpc(AttacheClientRPC)
	 * @see asaM1.AsaM1Package#getSystem_Attacheclientrpc()
	 * @model required="true"
	 * @generated
	 */
	AttacheClientRPC getAttacheclientrpc();

	/**
	 * Sets the value of the '{@link asaM1.System#getAttacheclientrpc <em>Attacheclientrpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacheclientrpc</em>' reference.
	 * @see #getAttacheclientrpc()
	 * @generated
	 */
	void setAttacheclientrpc(AttacheClientRPC value);
	
	void start();

	void setRpc(RPCImpl newRpc);

} // System
