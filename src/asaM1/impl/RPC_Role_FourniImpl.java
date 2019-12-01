/**
 */
package asaM1.impl;

import aSA.impl.RoleFourniImpl;

import asaM1.AsaM1Package;
import asaM1.RPC_Role_Fourni;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC Role Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RPC_Role_FourniImpl extends RoleFourniImpl implements RPC_Role_Fourni {
	SystemImpl observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPC_Role_FourniImpl() {
		super();
	}
	
	@Override
	public void addObserver(SystemImpl observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyConfig(RPC_Role_Fourni role, String message) {
		this.observer.transfert(role, message);
		
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.RPC_ROLE_FOURNI;
	}

} //RPC_Role_FourniImpl
