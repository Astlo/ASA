/**
 */
package asaM1;

import aSA.PortRequis;
import asaM1.impl.DatabaseImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getDatabase_PortRequis()
 * @model
 * @generated
 */
public interface Database_PortRequis extends PortRequis {

	void addObserver(Database observer);

	void notifyDB(String message);
} // Database_PortRequis
