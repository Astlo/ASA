/**
 */
package asaM1;

import aSA.PortRequis;
import asaM1.impl.ServerImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serveur Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getServeur_Port_Requis()
 * @model
 * @generated
 */
public interface Serveur_Port_Requis extends PortRequis {

	void addObserver(ServerImpl serverImpl);

	void notifyServeur(String message);
} // Serveur_Port_Requis
