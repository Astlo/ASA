/**
 */
package asaM1;

import aSA.Composant;
import asaM1.impl.Serveur_Port_RequisImpl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.Server#getServeur_port_requis <em>Serveur port requis</em>}</li>
 *   <li>{@link asaM1.Server#getServeur_port_fourni <em>Serveur port fourni</em>}</li>
 *   <li>{@link asaM1.Server#getServer_detail <em>Server detail</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getServer()
 * @model
 * @generated
 */
public interface Server extends Composant {
	/**
	 * Returns the value of the '<em><b>Serveur port requis</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Serveur_Port_Requis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur port requis</em>' reference list.
	 * @see asaM1.AsaM1Package#getServer_Serveur_port_requis()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Serveur_Port_Requis> getServeur_port_requis();

	/**
	 * Returns the value of the '<em><b>Serveur port fourni</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Serveur_Port_Fourni}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serveur port fourni</em>' reference list.
	 * @see asaM1.AsaM1Package#getServer_Serveur_port_fourni()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Serveur_Port_Fourni> getServeur_port_fourni();

	/**
	 * Returns the value of the '<em><b>Server detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server detail</em>' reference.
	 * @see #setServer_detail(Server_Detail)
	 * @see asaM1.AsaM1Package#getServer_Server_detail()
	 * @model required="true"
	 * @generated
	 */
	Server_Detail getServer_detail();

	/**
	 * Sets the value of the '{@link asaM1.Server#getServer_detail <em>Server detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server detail</em>' reference.
	 * @see #getServer_detail()
	 * @generated
	 */
	void setServer_detail(Server_Detail value);

	void transfert(Serveur_Port_Requis serveur_Port_RequisImpl, String message);

} // Server
