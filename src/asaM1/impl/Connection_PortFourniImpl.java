/**
 */
package asaM1.impl;

import aSA.impl.PortFourniImpl;

import asaM1.AsaM1Package;
import asaM1.Connection_PortFourni;
import asaM1.Server_Detail;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Connection_PortFourniImpl extends PortFourniImpl implements Connection_PortFourni {
	Server_Detail observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Connection_PortFourniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.CONNECTION_PORT_FOURNI;
	}

	@Override
	public void addObserver(Server_Detail observer) {
		// TODO Auto-generated method stub
		this.observer = observer;
	}

	@Override
	public void notifyServeur(String message) {
		this.observer.transfert(this, message);		
	}

} //Connection_PortFourniImpl
