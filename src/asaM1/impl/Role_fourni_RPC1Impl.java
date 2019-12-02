/**
 */
package asaM1.impl;

import aSA.impl.RoleFourniImpl;

import asaM1.AsaM1Package;
import asaM1.Role_fourni_RPC1;
import asaM1.Server_Detail;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role fourni RPC1</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Role_fourni_RPC1Impl extends RoleFourniImpl implements Role_fourni_RPC1 {
	private Server_Detail observer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_fourni_RPC1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ROLE_FOURNI_RPC1;
	}
	@Override
	public void addObserver(Server_Detail observer) {
		this.observer = observer;
	}

	@Override
	public void notifyServeur(Role_fourni_RPC1 newrole, String message) {
		this.observer.transfert(this, message);
		
	}
	
} //Role_fourni_RPC1Impl
