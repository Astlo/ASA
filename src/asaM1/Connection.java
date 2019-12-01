/**
 */
package asaM1;

import aSA.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.Connection#getConnection_port_fourni <em>Connection port fourni</em>}</li>
 *   <li>{@link asaM1.Connection#getConnection_port_requis <em>Connection port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Composant {
	/**
	 * Returns the value of the '<em><b>Connection port fourni</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Connection_PortFourni}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection port fourni</em>' reference list.
	 * @see asaM1.AsaM1Package#getConnection_Connection_port_fourni()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Connection_PortFourni> getConnection_port_fourni();

	/**
	 * Returns the value of the '<em><b>Connection port requis</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Connection_PortRequis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection port requis</em>' reference list.
	 * @see asaM1.AsaM1Package#getConnection_Connection_port_requis()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Connection_PortRequis> getConnection_port_requis();

} // Connection
