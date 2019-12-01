/**
 */
package asaM1;

import aSA.Configuration;
import asaM1.impl.Connection_PortFourniImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.Server_Detail#getSecurity <em>Security</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getConnection <em>Connection</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getDatabase <em>Database</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getRpc2 <em>Rpc2</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getRpc3 <em>Rpc3</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getRpc1 <em>Rpc1</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getAttachementrpc3cm <em>Attachementrpc3cm</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getAttachementrpc3sm <em>Attachementrpc3sm</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getAttachementrpc2sm <em>Attachementrpc2sm</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getAttachementrpc2db <em>Attachementrpc2db</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getAttachementrpc1cm <em>Attachementrpc1cm</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getAttachementrpc1db <em>Attachementrpc1db</em>}</li>
 *   <li>{@link asaM1.Server_Detail#getBindingserveur <em>Bindingserveur</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getServer_Detail()
 * @model
 * @generated
 */
public interface Server_Detail extends Configuration {
	/**
	 * Returns the value of the '<em><b>Security</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' reference.
	 * @see #setSecurity(Security)
	 * @see asaM1.AsaM1Package#getServer_Detail_Security()
	 * @model required="true"
	 * @generated
	 */
	Security getSecurity();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getSecurity <em>Security</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Security value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see asaM1.AsaM1Package#getServer_Detail_Connection()
	 * @model required="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see asaM1.AsaM1Package#getServer_Detail_Database()
	 * @model required="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Rpc2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc2</em>' reference.
	 * @see #setRpc2(RPC2)
	 * @see asaM1.AsaM1Package#getServer_Detail_Rpc2()
	 * @model required="true"
	 * @generated
	 */
	RPC2 getRpc2();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getRpc2 <em>Rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc2</em>' reference.
	 * @see #getRpc2()
	 * @generated
	 */
	void setRpc2(RPC2 value);

	/**
	 * Returns the value of the '<em><b>Rpc3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc3</em>' reference.
	 * @see #setRpc3(RPC3)
	 * @see asaM1.AsaM1Package#getServer_Detail_Rpc3()
	 * @model required="true"
	 * @generated
	 */
	RPC3 getRpc3();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getRpc3 <em>Rpc3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc3</em>' reference.
	 * @see #getRpc3()
	 * @generated
	 */
	void setRpc3(RPC3 value);

	/**
	 * Returns the value of the '<em><b>Rpc1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc1</em>' reference.
	 * @see #setRpc1(RPC1)
	 * @see asaM1.AsaM1Package#getServer_Detail_Rpc1()
	 * @model required="true"
	 * @generated
	 */
	RPC1 getRpc1();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getRpc1 <em>Rpc1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc1</em>' reference.
	 * @see #getRpc1()
	 * @generated
	 */
	void setRpc1(RPC1 value);

	/**
	 * Returns the value of the '<em><b>Attachementrpc3cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementrpc3cm</em>' reference.
	 * @see #setAttachementrpc3cm(AttachementRPC3CM)
	 * @see asaM1.AsaM1Package#getServer_Detail_Attachementrpc3cm()
	 * @model required="true"
	 * @generated
	 */
	AttachementRPC3CM getAttachementrpc3cm();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getAttachementrpc3cm <em>Attachementrpc3cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementrpc3cm</em>' reference.
	 * @see #getAttachementrpc3cm()
	 * @generated
	 */
	void setAttachementrpc3cm(AttachementRPC3CM value);

	/**
	 * Returns the value of the '<em><b>Attachementrpc3sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementrpc3sm</em>' reference.
	 * @see #setAttachementrpc3sm(AttachementRPC3SM)
	 * @see asaM1.AsaM1Package#getServer_Detail_Attachementrpc3sm()
	 * @model required="true"
	 * @generated
	 */
	AttachementRPC3SM getAttachementrpc3sm();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getAttachementrpc3sm <em>Attachementrpc3sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementrpc3sm</em>' reference.
	 * @see #getAttachementrpc3sm()
	 * @generated
	 */
	void setAttachementrpc3sm(AttachementRPC3SM value);

	/**
	 * Returns the value of the '<em><b>Attachementrpc2sm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementrpc2sm</em>' reference.
	 * @see #setAttachementrpc2sm(AttachementRPC2SM)
	 * @see asaM1.AsaM1Package#getServer_Detail_Attachementrpc2sm()
	 * @model required="true"
	 * @generated
	 */
	AttachementRPC2SM getAttachementrpc2sm();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getAttachementrpc2sm <em>Attachementrpc2sm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementrpc2sm</em>' reference.
	 * @see #getAttachementrpc2sm()
	 * @generated
	 */
	void setAttachementrpc2sm(AttachementRPC2SM value);

	/**
	 * Returns the value of the '<em><b>Attachementrpc2db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementrpc2db</em>' reference.
	 * @see #setAttachementrpc2db(AttachementRPC2DB)
	 * @see asaM1.AsaM1Package#getServer_Detail_Attachementrpc2db()
	 * @model required="true"
	 * @generated
	 */
	AttachementRPC2DB getAttachementrpc2db();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getAttachementrpc2db <em>Attachementrpc2db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementrpc2db</em>' reference.
	 * @see #getAttachementrpc2db()
	 * @generated
	 */
	void setAttachementrpc2db(AttachementRPC2DB value);

	/**
	 * Returns the value of the '<em><b>Attachementrpc1cm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementrpc1cm</em>' reference.
	 * @see #setAttachementrpc1cm(AttachementRPC1CM)
	 * @see asaM1.AsaM1Package#getServer_Detail_Attachementrpc1cm()
	 * @model required="true"
	 * @generated
	 */
	AttachementRPC1CM getAttachementrpc1cm();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getAttachementrpc1cm <em>Attachementrpc1cm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementrpc1cm</em>' reference.
	 * @see #getAttachementrpc1cm()
	 * @generated
	 */
	void setAttachementrpc1cm(AttachementRPC1CM value);

	/**
	 * Returns the value of the '<em><b>Attachementrpc1db</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachementrpc1db</em>' reference.
	 * @see #setAttachementrpc1db(AttachementRPC1DB)
	 * @see asaM1.AsaM1Package#getServer_Detail_Attachementrpc1db()
	 * @model required="true"
	 * @generated
	 */
	AttachementRPC1DB getAttachementrpc1db();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getAttachementrpc1db <em>Attachementrpc1db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachementrpc1db</em>' reference.
	 * @see #getAttachementrpc1db()
	 * @generated
	 */
	void setAttachementrpc1db(AttachementRPC1DB value);

	/**
	 * Returns the value of the '<em><b>Bindingserveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindingserveur</em>' reference.
	 * @see #setBindingserveur(BindingServeur)
	 * @see asaM1.AsaM1Package#getServer_Detail_Bindingserveur()
	 * @model required="true"
	 * @generated
	 */
	BindingServeur getBindingserveur();

	/**
	 * Sets the value of the '{@link asaM1.Server_Detail#getBindingserveur <em>Bindingserveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindingserveur</em>' reference.
	 * @see #getBindingserveur()
	 * @generated
	 */
	void setBindingserveur(BindingServeur value);

	void transfert(Connection_PortFourni connection_PortFourniImpl, String message);

} // Server_Detail
