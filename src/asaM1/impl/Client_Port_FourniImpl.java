/**
 */
package asaM1.impl;

import aSA.impl.PortFourniImpl;

import asaM1.AsaM1Package;
import asaM1.Client_Port_Fourni;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Client_Port_FourniImpl extends PortFourniImpl implements Client_Port_Fourni {
	SystemImpl observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Client_Port_FourniImpl() {
		super();
	}

	@Override
	public void addObserver(SystemImpl observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyConfig(String message) {
		this.observer.transfert(this, message);
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.CLIENT_PORT_FOURNI;
	}

} //Client_Port_FourniImpl
