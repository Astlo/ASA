/**
 */
package asaM1;

import aSA.Connecteur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.RPC3#getRole_requis_rpc3 <em>Role requis rpc3</em>}</li>
 *   <li>{@link asaM1.RPC3#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getRPC3()
 * @model
 * @generated
 */
public interface RPC3 extends Connecteur {
	/**
	 * Returns the value of the '<em><b>Role requis rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc3</em>' reference.
	 * @see #setRole_requis_rpc3(Role_Requis_RPC3)
	 * @see asaM1.AsaM1Package#getRPC3_Role_requis_rpc3()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC3 getRole_requis_rpc3();

	/**
	 * Sets the value of the '{@link asaM1.RPC3#getRole_requis_rpc3 <em>Role requis rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc3</em>' reference.
	 * @see #getRole_requis_rpc3()
	 * @generated
	 */
	void setRole_requis_rpc3(Role_Requis_RPC3 value);

	/**
	 * Returns the value of the '<em><b>Role fourni rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc3</em>' reference.
	 * @see #setRole_fourni_rpc3(Role_Fourni_RPC3)
	 * @see asaM1.AsaM1Package#getRPC3_Role_fourni_rpc3()
	 * @model required="true"
	 * @generated
	 */
	Role_Fourni_RPC3 getRole_fourni_rpc3();

	/**
	 * Sets the value of the '{@link asaM1.RPC3#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc3</em>' reference.
	 * @see #getRole_fourni_rpc3()
	 * @generated
	 */
	void setRole_fourni_rpc3(Role_Fourni_RPC3 value);

} // RPC3
