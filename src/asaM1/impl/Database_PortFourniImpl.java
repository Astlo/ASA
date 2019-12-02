/**
 */
package asaM1.impl;

import aSA.impl.PortFourniImpl;

import asaM1.AsaM1Package;
import asaM1.Database_PortFourni;
import asaM1.Server_Detail;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Port Fourni</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Database_PortFourniImpl extends PortFourniImpl implements Database_PortFourni {
	Server_Detail observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Database_PortFourniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.DATABASE_PORT_FOURNI;
	}

	@Override
	public void addObserver(Server_Detail observer) {
		this.observer = observer;
	}

	@Override
	public void notifyServeur(String message) {
		this.observer.transfert(this, message);
	}

} //Database_PortFourniImpl
