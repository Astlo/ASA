/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement RPC2DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttachementRPC2DB#getRole_requis_rpc2 <em>Role requis rpc2</em>}</li>
 *   <li>{@link asaM1.AttachementRPC2DB#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}</li>
 *   <li>{@link asaM1.AttachementRPC2DB#getDatabase_port_fourni <em>Database port fourni</em>}</li>
 *   <li>{@link asaM1.AttachementRPC2DB#getDatabase_port_requis <em>Database port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttachementRPC2DB()
 * @model
 * @generated
 */
public interface AttachementRPC2DB extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role requis rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc2</em>' reference.
	 * @see #setRole_requis_rpc2(Role_Requis_RPC2)
	 * @see asaM1.AsaM1Package#getAttachementRPC2DB_Role_requis_rpc2()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC2 getRole_requis_rpc2();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2DB#getRole_requis_rpc2 <em>Role requis rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc2</em>' reference.
	 * @see #getRole_requis_rpc2()
	 * @generated
	 */
	void setRole_requis_rpc2(Role_Requis_RPC2 value);

	/**
	 * Returns the value of the '<em><b>Role fourni rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc2</em>' reference.
	 * @see #setRole_fourni_rpc2(Role_Fourni_RPC2)
	 * @see asaM1.AsaM1Package#getAttachementRPC2DB_Role_fourni_rpc2()
	 * @model required="true"
	 * @generated
	 */
	Role_Fourni_RPC2 getRole_fourni_rpc2();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2DB#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc2</em>' reference.
	 * @see #getRole_fourni_rpc2()
	 * @generated
	 */
	void setRole_fourni_rpc2(Role_Fourni_RPC2 value);

	/**
	 * Returns the value of the '<em><b>Database port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database port fourni</em>' reference.
	 * @see #setDatabase_port_fourni(Database_PortFourni)
	 * @see asaM1.AsaM1Package#getAttachementRPC2DB_Database_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Database_PortFourni getDatabase_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2DB#getDatabase_port_fourni <em>Database port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database port fourni</em>' reference.
	 * @see #getDatabase_port_fourni()
	 * @generated
	 */
	void setDatabase_port_fourni(Database_PortFourni value);

	/**
	 * Returns the value of the '<em><b>Database port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database port requis</em>' reference.
	 * @see #setDatabase_port_requis(Database_PortRequis)
	 * @see asaM1.AsaM1Package#getAttachementRPC2DB_Database_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Database_PortRequis getDatabase_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC2DB#getDatabase_port_requis <em>Database port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database port requis</em>' reference.
	 * @see #getDatabase_port_requis()
	 * @generated
	 */
	void setDatabase_port_requis(Database_PortRequis value);

} // AttachementRPC2DB
