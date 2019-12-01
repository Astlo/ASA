/**
 */
package asaM1;

import aSA.PortFourni;
import asaM1.impl.SystemImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getClient_Port_Fourni()
 * @model
 * @generated
 */
public interface Client_Port_Fourni extends PortFourni {

	void notifyConfig(String message);

	void addObserver(SystemImpl observer);
} // Client_Port_Fourni
