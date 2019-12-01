/**
 */
package asaM1.impl;

import aSA.impl.PortRequisImpl;

import asaM1.AsaM1Package;
import asaM1.Server;
import asaM1.Serveur_Port_Requis;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serveur Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Serveur_Port_RequisImpl extends PortRequisImpl implements Serveur_Port_Requis {
	Server observer;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Serveur_Port_RequisImpl() {
		super();
	}
	
	@Override
	public void addObserver(ServerImpl serverImpl) {
		this.observer= serverImpl;
	}

	@Override
	public void notifyServeur(String message) {
		this.observer.transfert(this, message);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.SERVEUR_PORT_REQUIS;
	}


} //Serveur_Port_RequisImpl
