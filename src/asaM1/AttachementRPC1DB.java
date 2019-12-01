/**
 */
package asaM1;

import aSA.Attachement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachement RPC1DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.AttachementRPC1DB#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}</li>
 *   <li>{@link asaM1.AttachementRPC1DB#getRole_requis_rpc1 <em>Role requis rpc1</em>}</li>
 *   <li>{@link asaM1.AttachementRPC1DB#getDatabase_port_requis <em>Database port requis</em>}</li>
 *   <li>{@link asaM1.AttachementRPC1DB#getDatabase_portfourni <em>Database portfourni</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getAttachementRPC1DB()
 * @model
 * @generated
 */
public interface AttachementRPC1DB extends Attachement {
	/**
	 * Returns the value of the '<em><b>Role fourni rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role fourni rpc1</em>' reference.
	 * @see #setRole_fourni_rpc1(Role_fourni_RPC1)
	 * @see asaM1.AsaM1Package#getAttachementRPC1DB_Role_fourni_rpc1()
	 * @model required="true"
	 * @generated
	 */
	Role_fourni_RPC1 getRole_fourni_rpc1();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1DB#getRole_fourni_rpc1 <em>Role fourni rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role fourni rpc1</em>' reference.
	 * @see #getRole_fourni_rpc1()
	 * @generated
	 */
	void setRole_fourni_rpc1(Role_fourni_RPC1 value);

	/**
	 * Returns the value of the '<em><b>Role requis rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role requis rpc1</em>' reference.
	 * @see #setRole_requis_rpc1(Role_Requis_RPC1)
	 * @see asaM1.AsaM1Package#getAttachementRPC1DB_Role_requis_rpc1()
	 * @model required="true"
	 * @generated
	 */
	Role_Requis_RPC1 getRole_requis_rpc1();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1DB#getRole_requis_rpc1 <em>Role requis rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role requis rpc1</em>' reference.
	 * @see #getRole_requis_rpc1()
	 * @generated
	 */
	void setRole_requis_rpc1(Role_Requis_RPC1 value);

	/**
	 * Returns the value of the '<em><b>Database port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database port requis</em>' reference.
	 * @see #setDatabase_port_requis(Database_PortRequis)
	 * @see asaM1.AsaM1Package#getAttachementRPC1DB_Database_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Database_PortRequis getDatabase_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1DB#getDatabase_port_requis <em>Database port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database port requis</em>' reference.
	 * @see #getDatabase_port_requis()
	 * @generated
	 */
	void setDatabase_port_requis(Database_PortRequis value);

	/**
	 * Returns the value of the '<em><b>Database portfourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database portfourni</em>' reference.
	 * @see #setDatabase_portfourni(Database_PortFourni)
	 * @see asaM1.AsaM1Package#getAttachementRPC1DB_Database_portfourni()
	 * @model required="true"
	 * @generated
	 */
	Database_PortFourni getDatabase_portfourni();

	/**
	 * Sets the value of the '{@link asaM1.AttachementRPC1DB#getDatabase_portfourni <em>Database portfourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database portfourni</em>' reference.
	 * @see #getDatabase_portfourni()
	 * @generated
	 */
	void setDatabase_portfourni(Database_PortFourni value);

} // AttachementRPC1DB
