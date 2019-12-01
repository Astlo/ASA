/**
 */
package asaM1.impl;

import aSA.impl.ComposantImpl;

import asaM1.AsaM1Package;
import asaM1.Database;
import asaM1.Database_PortFourni;
import asaM1.Database_PortRequis;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.DatabaseImpl#getDatabase_port_fourni <em>Database port fourni</em>}</li>
 *   <li>{@link asaM1.impl.DatabaseImpl#getDatabase_port_requis <em>Database port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends ComposantImpl implements Database {
	/**
	 * The cached value of the '{@link #getDatabase_port_fourni() <em>Database port fourni</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected EList<Database_PortFourni> database_port_fourni;

	/**
	 * The cached value of the '{@link #getDatabase_port_requis() <em>Database port requis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_port_requis()
	 * @generated
	 * @ordered
	 */
	protected EList<Database_PortRequis> database_port_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	protected DatabaseImpl(Server_DetailImpl server_DetailImpl) {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database_PortFourni> getDatabase_port_fourni() {
		if (database_port_fourni == null) {
			database_port_fourni = new EObjectResolvingEList<Database_PortFourni>(Database_PortFourni.class, this, AsaM1Package.DATABASE__DATABASE_PORT_FOURNI);
		}
		return database_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database_PortRequis> getDatabase_port_requis() {
		if (database_port_requis == null) {
			database_port_requis = new EObjectResolvingEList<Database_PortRequis>(Database_PortRequis.class, this, AsaM1Package.DATABASE__DATABASE_PORT_REQUIS);
		}
		return database_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.DATABASE__DATABASE_PORT_FOURNI:
				return getDatabase_port_fourni();
			case AsaM1Package.DATABASE__DATABASE_PORT_REQUIS:
				return getDatabase_port_requis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AsaM1Package.DATABASE__DATABASE_PORT_FOURNI:
				getDatabase_port_fourni().clear();
				getDatabase_port_fourni().addAll((Collection<? extends Database_PortFourni>)newValue);
				return;
			case AsaM1Package.DATABASE__DATABASE_PORT_REQUIS:
				getDatabase_port_requis().clear();
				getDatabase_port_requis().addAll((Collection<? extends Database_PortRequis>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AsaM1Package.DATABASE__DATABASE_PORT_FOURNI:
				getDatabase_port_fourni().clear();
				return;
			case AsaM1Package.DATABASE__DATABASE_PORT_REQUIS:
				getDatabase_port_requis().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AsaM1Package.DATABASE__DATABASE_PORT_FOURNI:
				return database_port_fourni != null && !database_port_fourni.isEmpty();
			case AsaM1Package.DATABASE__DATABASE_PORT_REQUIS:
				return database_port_requis != null && !database_port_requis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
