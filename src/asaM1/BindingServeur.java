/**
 */
package asaM1;

import aSA.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Serveur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.BindingServeur#getExternal_socket_fourni <em>External socket fourni</em>}</li>
 *   <li>{@link asaM1.BindingServeur#getExternal_socket_requis <em>External socket requis</em>}</li>
 *   <li>{@link asaM1.BindingServeur#getServeur_port_requis <em>Serveur port requis</em>}</li>
 *   <li>{@link asaM1.BindingServeur#getServeur_port_fourni <em>Serveur port fourni</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getBindingServeur()
 * @model
 * @generated
 */
public interface BindingServeur extends Binding {
	/**
	 * Returns the value of the '<em><b>External socket fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External socket fourni</em>' reference.
	 * @see #setExternal_socket_fourni(Connection_PortFourni)
	 * @see asaM1.AsaM1Package#getBindingServeur_External_socket_fourni()
	 * @model required="true"
	 * @generated
	 */
	Connection_PortFourni getExternal_socket_fourni();

	/**
	 * Sets the value of the '{@link asaM1.BindingServeur#getExternal_socket_fourni <em>External socket fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External socket fourni</em>' reference.
	 * @see #getExternal_socket_fourni()
	 * @generated
	 */
	void setExternal_socket_fourni(Connection_PortFourni value);

	/**
	 * Returns the value of the '<em><b>External socket requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External socket requis</em>' reference.
	 * @see #setExternal_socket_requis(Connection_PortRequis)
	 * @see asaM1.AsaM1Package#getBindingServeur_External_socket_requis()
	 * @model required="true"
	 * @generated
	 */
	Connection_PortRequis getExternal_socket_requis();

	/**
	 * Sets the value of the '{@link asaM1.BindingServeur#getExternal_socket_requis <em>External socket requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External socket requis</em>' reference.
	 * @see #getExternal_socket_requis()
	 * @generated
	 */
	void setExternal_socket_requis(Connection_PortRequis value);

	/**
	 * Returns the value of the '<em><b>Serveur port requis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur port requis</em>' reference.
	 * @see #setServeur_port_requis(Serveur_Port_Requis)
	 * @see asaM1.AsaM1Package#getBindingServeur_Serveur_port_requis()
	 * @model required="true"
	 * @generated
	 */
	Serveur_Port_Requis getServeur_port_requis();

	/**
	 * Sets the value of the '{@link asaM1.BindingServeur#getServeur_port_requis <em>Serveur port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur port requis</em>' reference.
	 * @see #getServeur_port_requis()
	 * @generated
	 */
	void setServeur_port_requis(Serveur_Port_Requis value);

	/**
	 * Returns the value of the '<em><b>Serveur port fourni</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur port fourni</em>' reference.
	 * @see #setServeur_port_fourni(Serveur_Port_Fourni)
	 * @see asaM1.AsaM1Package#getBindingServeur_Serveur_port_fourni()
	 * @model required="true"
	 * @generated
	 */
	Serveur_Port_Fourni getServeur_port_fourni();

	/**
	 * Sets the value of the '{@link asaM1.BindingServeur#getServeur_port_fourni <em>Serveur port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serveur port fourni</em>' reference.
	 * @see #getServeur_port_fourni()
	 * @generated
	 */
	void setServeur_port_fourni(Serveur_Port_Fourni value);

} // BindingServeur
