/**
 */
package asaM1;

import aSA.PortFourni;
import asaM1.impl.SystemImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getServeur_Port_Fourni()
 * @model
 * @generated
 */
public interface Serveur_Port_Fourni extends PortFourni {

	void addObserver(SystemImpl observer);

	void notifyConfig(String message);
} // Serveur_Port_Fourni
