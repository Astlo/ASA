/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement RPC3SM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttachementRPC3SM#getRole_requis_rpc3 <em>Role requis rpc3</em>}</li>
 *   <li>{@link asaM1.AttachementRPC3SM#getSecurity_port_requis <em>Security port requis</em>}</li>
 *   <li>{@link asaM1.AttachementRPC3SM#getSecurity_port_fourni <em>Security port fourni</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttachementRPC3SM()
 * @model
 * @generated
 */
public interface AttachementRPC3SM extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role requis rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc3</em>' reference.
	 * @see #setRole_requis_rpc3(Role_Requis_RPC3)
	 * @see asaM1.AsaM1Package#getAttachementRPC3SM_Role_requis_rpc3()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC3 getRole_requis_rpc3();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC3SM#getRole_requis_rpc3 <em>Role requis rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc3</em>' reference.
	 * @see #getRole_requis_rpc3()
	 * @generated
	 */
	void setRole_requis_rpc3(Role_Requis_RPC3 value);

	/**
	 * Returns the value of the '<em><b>Security port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security port requis</em>' reference.
	 * @see #setSecurity_port_requis(Security_PortRequis)
	 * @see asaM1.AsaM1Package#getAttachementRPC3SM_Security_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Security_PortRequis getSecurity_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC3SM#getSecurity_port_requis <em>Security port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security port requis</em>' reference.
	 * @see #getSecurity_port_requis()
	 * @generated
	 */
	void setSecurity_port_requis(Security_PortRequis value);

	/**
	 * Returns the value of the '<em><b>Security port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security port fourni</em>' reference.
	 * @see #setSecurity_port_fourni(Security_PortFourni)
	 * @see asaM1.AsaM1Package#getAttachementRPC3SM_Security_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Security_PortFourni getSecurity_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC3SM#getSecurity_port_fourni <em>Security port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security port fourni</em>' reference.
	 * @see #getSecurity_port_fourni()
	 * @generated
	 */
	void setSecurity_port_fourni(Security_PortFourni value);

} // AttachementRPC3SM
