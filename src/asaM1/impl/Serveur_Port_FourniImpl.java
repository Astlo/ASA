/**
 */
package asaM1.impl;

import aSA.impl.PortFourniImpl;

import asaM1.AsaM1Package;
import asaM1.Serveur_Port_Fourni;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Serveur_Port_FourniImpl extends PortFourniImpl implements Serveur_Port_Fourni {
	SystemImpl observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Serveur_Port_FourniImpl() {
		super();
	}
	
	@Override
	public void addObserver(SystemImpl observer) {
		// TODO Auto-generated method stub
		this.observer = observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.SERVEUR_PORT_FOURNI;
	}

	@Override
	public void notifyConfig(String message) {
		this.observer.transfert(this, message);
	}


} //Serveur_Port_FourniImpl
