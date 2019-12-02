/**
 */
package asaM1;

import aSA.PortRequis;
import asaM1.impl.ConnectionImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getConnection_PortRequis()
 * @model
 * @generated
 */
public interface Connection_PortRequis extends PortRequis {

	void notifyConnectionManager(String message);

	void addObserver(Connection connectionImpl);

} // Connection_PortRequis
