/**
 */
package asaM1;

import aSA.Connecteur;
import asaM1.impl.RPC_Role_RequisImpl;

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

	RPC_Role_Requis getRpc_role_requisclient();

	void setRpc_role_requisclient(RPC_Role_Requis rpc_role_requisclient);

	RPC_Role_Requis getRpc_role_requisserveur();

	void setRpc_role_requisserveur(RPC_Role_Requis rpc_role_requisserveur);

	RPC_Role_Fourni getRpc_role_fourniclient();

	void setRpc_role_fourniclient(RPC_Role_Fourni rpc_role_fourniclient);

	void setRpc_role_fourniserveur(RPC_Role_Fourni rpc_role_fourniserveur);

	RPC_Role_Fourni getRpc_role_fourniserveur();

	void transfertMessageRPC(RPC_Role_Requis rpc_Role_Requis, String message);

	

} // RPC
