/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement RPC2SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttachementRPC2SM#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}</li>
 *   <li>{@link asaM1.AttachementRPC2SM#getSecurity_portfourni <em>Security portfourni</em>}</li>
 *   <li>{@link asaM1.AttachementRPC2SM#getSecurity_port_requis <em>Security port requis</em>}</li>
 *   <li>{@link asaM1.AttachementRPC2SM#getRole_requis_rpc2 <em>Role requis rpc2</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttachementRPC2SM()
 * @model
 * @generated
 */
public interface AttachementRPC2SM extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role fourni rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc2</em>' reference.
	 * @see #setRole_fourni_rpc2(Role_Fourni_RPC2)
	 * @see asaM1.AsaM1Package#getAttachementRPC2SM_Role_fourni_rpc2()
	 * @model required="true"
	 * @generated
	 */
	Role_Fourni_RPC2 getRole_fourni_rpc2();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2SM#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc2</em>' reference.
	 * @see #getRole_fourni_rpc2()
	 * @generated
	 */
	void setRole_fourni_rpc2(Role_Fourni_RPC2 value);

	/**
	 * Returns the value of the '<em><b>Security portfourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security portfourni</em>' reference.
	 * @see #setSecurity_portfourni(Security_PortFourni)
	 * @see asaM1.AsaM1Package#getAttachementRPC2SM_Security_portfourni()
	 * @model
	 * @generated
	 */
	Security_PortFourni getSecurity_portfourni();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2SM#getSecurity_portfourni <em>Security portfourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security portfourni</em>' reference.
	 * @see #getSecurity_portfourni()
	 * @generated
	 */
	void setSecurity_portfourni(Security_PortFourni value);

	/**
	 * Returns the value of the '<em><b>Security port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security port requis</em>' reference.
	 * @see #setSecurity_port_requis(Security_PortRequis)
	 * @see asaM1.AsaM1Package#getAttachementRPC2SM_Security_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Security_PortRequis getSecurity_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2SM#getSecurity_port_requis <em>Security port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security port requis</em>' reference.
	 * @see #getSecurity_port_requis()
	 * @generated
	 */
	void setSecurity_port_requis(Security_PortRequis value);

	/**
	 * Returns the value of the '<em><b>Role requis rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc2</em>' reference.
	 * @see #setRole_requis_rpc2(Role_Requis_RPC2)
	 * @see asaM1.AsaM1Package#getAttachementRPC2SM_Role_requis_rpc2()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC2 getRole_requis_rpc2();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2SM#getRole_requis_rpc2 <em>Role requis rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc2</em>' reference.
	 * @see #getRole_requis_rpc2()
	 * @generated
	 */
	void setRole_requis_rpc2(Role_Requis_RPC2 value);

} // AttachementRPC2SM
