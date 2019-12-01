/**
 */
package asaM1;

import aSA.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.Security#getSecurity_port_fourni <em>Security port fourni</em>}</li>
 *   <li>{@link asaM1.Security#getSecurity_port_requis <em>Security port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getSecurity()
 * @model
 * @generated
 */
public interface Security extends Composant {
	/**
	 * Returns the value of the '<em><b>Security port fourni</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Security_PortFourni}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security port fourni</em>' reference list.
	 * @see asaM1.AsaM1Package#getSecurity_Security_port_fourni()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Security_PortFourni> getSecurity_port_fourni();

	/**
	 * Returns the value of the '<em><b>Security port requis</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Security_PortRequis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security port requis</em>' reference list.
	 * @see asaM1.AsaM1Package#getSecurity_Security_port_requis()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Security_PortRequis> getSecurity_port_requis();

} // Security
