/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement RPC3CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttachementRPC3CM#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}</li>
 *   <li>{@link asaM1.AttachementRPC3CM#getConnection_portrequis <em>Connection portrequis</em>}</li>
 *   <li>{@link asaM1.AttachementRPC3CM#getConnection_portfourni <em>Connection portfourni</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttachementRPC3CM()
 * @model
 * @generated
 */
public interface AttachementRPC3CM extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role fourni rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc3</em>' reference.
	 * @see #setRole_fourni_rpc3(Role_Fourni_RPC3)
	 * @see asaM1.AsaM1Package#getAttachementRPC3CM_Role_fourni_rpc3()
	 * @model required="true"
	 * @generated
	 */
	Role_Fourni_RPC3 getRole_fourni_rpc3();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC3CM#getRole_fourni_rpc3 <em>Role fourni rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc3</em>' reference.
	 * @see #getRole_fourni_rpc3()
	 * @generated
	 */
	void setRole_fourni_rpc3(Role_Fourni_RPC3 value);

	/**
	 * Returns the value of the '<em><b>Connection portrequis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection portrequis</em>' reference.
	 * @see #setConnection_portrequis(Connection_PortRequis)
	 * @see asaM1.AsaM1Package#getAttachementRPC3CM_Connection_portrequis()
	 * @model
	 * @generated
	 */
	Connection_PortRequis getConnection_portrequis();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC3CM#getConnection_portrequis <em>Connection portrequis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection portrequis</em>' reference.
	 * @see #getConnection_portrequis()
	 * @generated
	 */
	void setConnection_portrequis(Connection_PortRequis value);

	/**
	 * Returns the value of the '<em><b>Connection portfourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection portfourni</em>' reference.
	 * @see #setConnection_portfourni(Connection_PortFourni)
	 * @see asaM1.AsaM1Package#getAttachementRPC3CM_Connection_portfourni()
	 * @model
	 * @generated
	 */
	Connection_PortFourni getConnection_portfourni();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC3CM#getConnection_portfourni <em>Connection portfourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection portfourni</em>' reference.
	 * @see #getConnection_portfourni()
	 * @generated
	 */
	void setConnection_portfourni(Connection_PortFourni value);

} // AttachementRPC3CM
