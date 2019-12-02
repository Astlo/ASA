/**
 */
package asaM1;

import aSA.PortFourni;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getDatabase_PortFourni()
 * @model
 * @generated
 */
public interface Database_PortFourni extends PortFourni {

	void addObserver(Server_Detail observer);

	void notifyServeur(String string);
} // Database_PortFourni
