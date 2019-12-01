/**
 */
package asaM1.impl;

import aSA.impl.RoleRequisImpl;

import asaM1.AsaM1Package;
import asaM1.RPC1;
import asaM1.Role_Requis_RPC1;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Requis RPC1</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Role_Requis_RPC1Impl extends RoleRequisImpl implements Role_Requis_RPC1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Role_Requis_RPC1Impl() {
		super();
	}
	private RPC1 observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ROLE_REQUIS_RPC1;
	}
	@Override
	public void addObserver(RPC1 rpc1Impl) {
		this.observer = observer;		
	}

} //Role_Requis_RPC1Impl
