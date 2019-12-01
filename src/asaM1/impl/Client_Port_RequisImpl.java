/**
 */
package asaM1.impl;

import aSA.impl.PortRequisImpl;

import asaM1.AsaM1Package;
import asaM1.Client_Port_Requis;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Client_Port_RequisImpl extends PortRequisImpl implements Client_Port_Requis {
	
	ClientImpl observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Client_Port_RequisImpl() {
		super();
	}

	@Override
	public void addObserver(ClientImpl observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyClient(String message) {
		this.observer.receptionReponse(message);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.CLIENT_PORT_REQUIS;
	}

} //Client_Port_RequisImpl
