/**
 */
package asaM1;

import aSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.RPC2#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}</li>
 *   <li>{@link asaM1.RPC2#getRole_requis_rpc2 <em>Role requis rpc2</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getRPC2()
 * @model
 * @generated
 */
public interface RPC2 extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Role fourni rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc2</em>' reference.
	 * @see #setRole_fourni_rpc2(Role_Fourni_RPC2)
	 * @see asaM1.AsaM1Package#getRPC2_Role_fourni_rpc2()
	 * @model required="true"
	 * @generated
	 */
	Role_Fourni_RPC2 getRole_fourni_rpc2();

	/**
	 * Sets the value of the '{@link asaM1.RPC2#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc2</em>' reference.
	 * @see #getRole_fourni_rpc2()
	 * @generated
	 */
	void setRole_fourni_rpc2(Role_Fourni_RPC2 value);

	/**
	 * Returns the value of the '<em><b>Role requis rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc2</em>' reference.
	 * @see #setRole_requis_rpc2(Role_Requis_RPC2)
	 * @see asaM1.AsaM1Package#getRPC2_Role_requis_rpc2()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC2 getRole_requis_rpc2();

	/**
	 * Sets the value of the '{@link asaM1.RPC2#getRole_requis_rpc2 <em>Role requis rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc2</em>' reference.
	 * @see #getRole_requis_rpc2()
	 * @generated
	 */
	void setRole_requis_rpc2(Role_Requis_RPC2 value);

} // RPC2
