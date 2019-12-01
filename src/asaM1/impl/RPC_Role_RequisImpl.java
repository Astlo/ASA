/**
 */
package asaM1.impl;

import aSA.impl.RoleRequisImpl;

import asaM1.AsaM1Package;
import asaM1.RPC;
import asaM1.RPC_Role_Requis;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC Role Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RPC_Role_RequisImpl extends RoleRequisImpl implements RPC_Role_Requis {
	RPC observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPC_Role_RequisImpl() {
		super();
	}


	@Override
	public void addObserver(RPC observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyRPC(String message) {
		this.observer.transfertMessageRPC(this, message);
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.RPC_ROLE_REQUIS;
	}

} //RPC_Role_RequisImpl
