/**
 */
package asaM1;

import aSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.RPC#getRrpc_ole_requis <em>Rrpc ole requis</em>}</li>
 *   <li>{@link asaM1.RPC#getRpc_role_fourni <em>Rpc role fourni</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getRPC()
 * @model
 * @generated
 */
public interface RPC extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Rrpc ole requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rrpc ole requis</em>' reference.
	 * @see #setRrpc_ole_requis(RPC_Role_Requis)
	 * @see asaM1.AsaM1Package#getRPC_Rrpc_ole_requis()
	 * @model required="true"
	 * @generated
	 */
	RPC_Role_Requis getRpc_role_requis();

	/**
	 * Sets the value of the '{@link asaM1.RPC#getRrpc_ole_requis <em>Rrpc ole requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rrpc ole requis</em>' reference.
	 * @see #getRpc_role_requis()
	 * @generated
	 */
	void setRrpc_ole_requis(RPC_Role_Requis value);

	/**
	 * Returns the value of the '<em><b>Rpc role fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc role fourni</em>' reference.
	 * @see #setRpc_role_fourni(RPC_Role_Fourni)
	 * @see asaM1.AsaM1Package#getRPC_Rpc_role_fourni()
	 * @model required="true"
	 * @generated
	 */
	RPC_Role_Fourni getRpc_role_fourni();

	/**
	 * Sets the value of the '{@link asaM1.RPC#getRpc_role_fourni <em>Rpc role fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc role fourni</em>' reference.
	 * @see #getRpc_role_fourni()
	 * @generated
	 */
	void setRpc_role_fourni(RPC_Role_Fourni value);

} // RPC
