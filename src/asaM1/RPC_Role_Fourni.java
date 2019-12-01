/**
 */
package asaM1;

import aSA.RoleFourni;
import asaM1.impl.RPC_Role_FourniImpl;
import asaM1.impl.SystemImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC Role Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see asaM1.AsaM1Package#getRPC_Role_Fourni()
 * @model
 * @generated
 */
public interface RPC_Role_Fourni extends RoleFourni {

	void addObserver(SystemImpl observer);

	void notifyConfig(RPC_Role_Fourni role, String message);

} // RPC_Role_Fourni
