/**
 */
package asaM1;

import aSA.PortRequis;
import asaM1.impl.ClientImpl;
import asaM1.impl.SystemImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getClient_Port_Requis()
 * @model
 * @generated
 */
public interface Client_Port_Requis extends PortRequis {

	void notifyClient(String message);

	void addObserver(ClientImpl observer);
} // Client_Port_Requis
