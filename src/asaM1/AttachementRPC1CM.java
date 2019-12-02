/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement RPC1CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttachementRPC1CM#getRole_requis_rpc1 <em>Role requis rpc1</em>}</li>
 *   <li>{@link asaM1.AttachementRPC1CM#getConnection_port_fourni <em>Connection port fourni</em>}</li>
 *   <li>{@link asaM1.AttachementRPC1CM#getConnection_port_requis <em>Connection port requis</em>}</li>
 *   <li>{@link asaM1.AttachementRPC1CM#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttachementRPC1CM()
 * @model
 * @generated
 */
public interface AttachementRPC1CM extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role requis rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc1</em>' reference.
	 * @see #setRole_requis_rpc1(Role_Requis_RPC1)
	 * @see asaM1.AsaM1Package#getAttachementRPC1CM_Role_requis_rpc1()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC1 getRole_requis_rpc1();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1CM#getRole_requis_rpc1 <em>Role requis rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc1</em>' reference.
	 * @see #getRole_requis_rpc1()
	 * @generated
	 */
	void setRole_requis_rpc1(Role_Requis_RPC1 value);

	/**
	 * Returns the value of the '<em><b>Connection port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection port fourni</em>' reference.
	 * @see #setConnection_port_fourni(Connection_PortFourni)
	 * @see asaM1.AsaM1Package#getAttachementRPC1CM_Connection_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Connection_PortFourni getConnection_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1CM#getConnection_port_fourni <em>Connection port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection port fourni</em>' reference.
	 * @see #getConnection_port_fourni()
	 * @generated
	 */
	void setConnection_port_fourni(Connection_PortFourni value);

	/**
	 * Returns the value of the '<em><b>Connection port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection port requis</em>' reference.
	 * @see #setConnection_port_requis(Connection_PortRequis)
	 * @see asaM1.AsaM1Package#getAttachementRPC1CM_Connection_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Connection_PortRequis getConnection_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1CM#getConnection_port_requis <em>Connection port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection port requis</em>' reference.
	 * @see #getConnection_port_requis()
	 * @generated
	 */
	void setConnection_port_requis(Connection_PortRequis value);

	/**
	 * Returns the value of the '<em><b>Role fourni rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc1</em>' reference.
	 * @see #setRole_fourni_rpc1(Role_fourni_RPC1)
	 * @see asaM1.AsaM1Package#getAttachementRPC1CM_Role_fourni_rpc1()
	 * @model required="true"
	 * @generated
	 */
	Role_fourni_RPC1 getRole_fourni_rpc1();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1CM#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc1</em>' reference.
	 * @see #getRole_fourni_rpc1()
	 * @generated
	 */
	void setRole_fourni_rpc1(Role_fourni_RPC1 value);

	Role_Requis_RPC1 getCorrespondance(Connection_PortFourni port);

	Connection_PortRequis getCorrespondance(Role_fourni_RPC1 role);

} // AttachementRPC1CM
