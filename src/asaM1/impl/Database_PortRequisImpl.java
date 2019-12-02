/**
 */
package asaM1.impl;

import aSA.impl.PortRequisImpl;

import asaM1.AsaM1Package;
import asaM1.Database;
import asaM1.Database_PortRequis;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Port Requis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Database_PortRequisImpl extends PortRequisImpl implements Database_PortRequis {
	Database observer;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Database_PortRequisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.DATABASE_PORT_REQUIS;
	}

	@Override
	public void addObserver(Database observer) {
		this.observer = observer;
		
	}

	@Override
	public void notifyDB(String message) {
		this.observer.receiveNotify(message);
	}
} //Database_PortRequisImpl
