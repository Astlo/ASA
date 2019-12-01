/**
 */
package asaM1;

import aSA.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaM1.Database#getDatabase_port_fourni <em>Database port fourni</em>}</li>
 *   <li>{@link asaM1.Database#getDatabase_port_requis <em>Database port requis</em>}</li>
 * </ul>
 *
 * @see asaM1.AsaM1Package#getDatabase()
 * @model
 * @generated
 */
public interface Database extends Composant {
	/**
	 * Returns the value of the '<em><b>Database port fourni</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Database_PortFourni}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database port fourni</em>' reference list.
	 * @see asaM1.AsaM1Package#getDatabase_Database_port_fourni()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Database_PortFourni> getDatabase_port_fourni();

	/**
	 * Returns the value of the '<em><b>Database port requis</b></em>' reference list.
	 * The list contents are of type {@link asaM1.Database_PortRequis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database port requis</em>' reference list.
	 * @see asaM1.AsaM1Package#getDatabase_Database_port_requis()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Database_PortRequis> getDatabase_port_requis();

} // Database
