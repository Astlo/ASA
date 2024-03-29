/**
 */
package asaM1;

import aSA.Connecteur;
import asaM1.impl.Role_Requis_RPC1Impl;
import asaM1.impl.Role_fourni_RPC1Impl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.RPC1#getRole_requis_rpc1 <em>Role requis rpc1</em>}</li>
 *   <li>{@link asaM1.RPC1#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getRPC1()
 * @model
 * @generated
 */
public interface RPC1 extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Role requis rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc1</em>' reference.
	 * @see #setRole_requis_rpc1(Role_Requis_RPC1)
	 * @see asaM1.AsaM1Package#getRPC1_Role_requis_rpc1()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC1 getRole_requis_rpc1();

	/**
	 * Sets the value of the '{@link asaM1.RPC1#getRole_requis_rpc1 <em>Role requis rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc1</em>' reference.
	 * @see #getRole_requis_rpc1()
	 * @generated
	 */
	void setRole_requis_rpc1(Role_Requis_RPC1 value);

	/**
	 * Returns the value of the '<em><b>Role fourni rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc1</em>' reference.
	 * @see #setRole_fourni_rpc1(Role_fourni_RPC1)
	 * @see asaM1.AsaM1Package#getRPC1_Role_fourni_rpc1()
	 * @model required="true"
	 * @generated
	 */
	Role_fourni_RPC1 getRole_fourni_rpc1();

	/**
	 * Sets the value of the '{@link asaM1.RPC1#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc1</em>' reference.
	 * @see #getRole_fourni_rpc1()
	 * @generated
	 */
	void setRole_fourni_rpc1(Role_fourni_RPC1 value);

	void setRpc_role_fournidb(Role_fourni_RPC1Impl rpc_role_fournidb);

	Role_fourni_RPC1Impl getRpc_role_fournidb();

	void setRpc_role_fournicm(Role_fourni_RPC1Impl rpc_role_fournicm);

	Role_fourni_RPC1Impl getRpc_role_fournicm();

	void setRpc_role_requisdb(Role_Requis_RPC1Impl rpc_role_requisdb);

	Role_Requis_RPC1Impl getRpc_role_requisdb();

	void setRpc_role_requiscm(Role_Requis_RPC1Impl rpc_role_requiscm);

	Role_Requis_RPC1Impl getRpc_role_requiscm();

	void transfertMessageDB(Role_Requis_RPC1 role_Requis_RPC1Impl, String message);

} // RPC1
