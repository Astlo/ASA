/**
 */
package asaM1.impl;

import aSA.impl.PortRequisImpl;

import asaM1.AsaM1Package;
import asaM1.Connection;
import asaM1.Connection_PortRequis;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Connection_PortRequisImpl extends PortRequisImpl implements Connection_PortRequis {
	Connection observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_PortRequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.CONNECTION_PORT_REQUIS;
	}

	@Override
	public void notifyConnectionManager(String message) {
		this.observer.transfert(this, message);		
	}

	@Override
	public void addObserver(Connection observer) {
		this.observer = observer;
	}

} //Connection_PortRequisImpl
