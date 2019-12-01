/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC2DB;
import asaM1.Database_PortFourni;
import asaM1.Database_PortRequis;
import asaM1.Role_Fourni_RPC2;
import asaM1.Role_Requis_RPC2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachement RPC2DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttachementRPC2DBImpl#getRole_requis_rpc2 <em>Role requis rpc2</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC2DBImpl#getRole_fourni_rpc2 <em>Role fourni rpc2</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC2DBImpl#getDatabase_port_fourni <em>Database port fourni</em>}</li>
 *   <li>{@link asaM1.impl.AttachementRPC2DBImpl#getDatabase_port_requis <em>Database port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachementRPC2DBImpl extends AttachementImpl implements AttachementRPC2DB {
	/**
	 * The cached value of the '{@link #getRole_requis_rpc2() <em>Role requis rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis_rpc2()
	 * @generated
	 * @ordered
	 */
	protected Role_Requis_RPC2 role_requis_rpc2;

	/**
	 * The cached value of the '{@link #getRole_fourni_rpc2() <em>Role fourni rpc2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni_rpc2()
	 * @generated
	 * @ordered
	 */
	protected Role_Fourni_RPC2 role_fourni_rpc2;

	/**
	 * The cached value of the '{@link #getDatabase_port_fourni() <em>Database port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected Database_PortFourni database_port_fourni;

	/**
	 * The cached value of the '{@link #getDatabase_port_requis() <em>Database port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Database_PortRequis database_port_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementRPC2DBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHEMENT_RPC2DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Requis_RPC2 getRole_requis_rpc2() {
		if (role_requis_rpc2 != null && role_requis_rpc2.eIsProxy()) {
			InternalEObject oldRole_requis_rpc2 = (InternalEObject)role_requis_rpc2;
			role_requis_rpc2 = (Role_Requis_RPC2)eResolveProxy(oldRole_requis_rpc2);
			if (role_requis_rpc2 != oldRole_requis_rpc2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2, oldRole_requis_rpc2, role_requis_rpc2));
			}
		}
		return role_requis_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Requis_RPC2 basicGetRole_requis_rpc2() {
		return role_requis_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_requis_rpc2(Role_Requis_RPC2 newRole_requis_rpc2) {
		Role_Requis_RPC2 oldRole_requis_rpc2 = role_requis_rpc2;
		role_requis_rpc2 = newRole_requis_rpc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2, oldRole_requis_rpc2, role_requis_rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role_Fourni_RPC2 getRole_fourni_rpc2() {
		if (role_fourni_rpc2 != null && role_fourni_rpc2.eIsProxy()) {
			InternalEObject oldRole_fourni_rpc2 = (InternalEObject)role_fourni_rpc2;
			role_fourni_rpc2 = (Role_Fourni_RPC2)eResolveProxy(oldRole_fourni_rpc2);
			if (role_fourni_rpc2 != oldRole_fourni_rpc2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2, oldRole_fourni_rpc2, role_fourni_rpc2));
			}
		}
		return role_fourni_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role_Fourni_RPC2 basicGetRole_fourni_rpc2() {
		return role_fourni_rpc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_fourni_rpc2(Role_Fourni_RPC2 newRole_fourni_rpc2) {
		Role_Fourni_RPC2 oldRole_fourni_rpc2 = role_fourni_rpc2;
		role_fourni_rpc2 = newRole_fourni_rpc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2, oldRole_fourni_rpc2, role_fourni_rpc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database_PortFourni getDatabase_port_fourni() {
		if (database_port_fourni != null && database_port_fourni.eIsProxy()) {
			InternalEObject oldDatabase_port_fourni = (InternalEObject)database_port_fourni;
			database_port_fourni = (Database_PortFourni)eResolveProxy(oldDatabase_port_fourni);
			if (database_port_fourni != oldDatabase_port_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI, oldDatabase_port_fourni, database_port_fourni));
			}
		}
		return database_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database_PortFourni basicGetDatabase_port_fourni() {
		return database_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase_port_fourni(Database_PortFourni newDatabase_port_fourni) {
		Database_PortFourni oldDatabase_port_fourni = database_port_fourni;
		database_port_fourni = newDatabase_port_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI, oldDatabase_port_fourni, database_port_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database_PortRequis getDatabase_port_requis() {
		if (database_port_requis != null && database_port_requis.eIsProxy()) {
			InternalEObject oldDatabase_port_requis = (InternalEObject)database_port_requis;
			database_port_requis = (Database_PortRequis)eResolveProxy(oldDatabase_port_requis);
			if (database_port_requis != oldDatabase_port_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS, oldDatabase_port_requis, database_port_requis));
			}
		}
		return database_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database_PortRequis basicGetDatabase_port_requis() {
		return database_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase_port_requis(Database_PortRequis newDatabase_port_requis) {
		Database_PortRequis oldDatabase_port_requis = database_port_requis;
		database_port_requis = newDatabase_port_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS, oldDatabase_port_requis, database_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2:
				if (resolve) return getRole_requis_rpc2();
				return basicGetRole_requis_rpc2();
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2:
				if (resolve) return getRole_fourni_rpc2();
				return basicGetRole_fourni_rpc2();
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI:
				if (resolve) return getDatabase_port_fourni();
				return basicGetDatabase_port_fourni();
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS:
				if (resolve) return getDatabase_port_requis();
				return basicGetDatabase_port_requis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2:
				setRole_requis_rpc2((Role_Requis_RPC2)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2:
				setRole_fourni_rpc2((Role_Fourni_RPC2)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI:
				setDatabase_port_fourni((Database_PortFourni)newValue);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS:
				setDatabase_port_requis((Database_PortRequis)newValue);
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
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2:
				setRole_requis_rpc2((Role_Requis_RPC2)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2:
				setRole_fourni_rpc2((Role_Fourni_RPC2)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI:
				setDatabase_port_fourni((Database_PortFourni)null);
				return;
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS:
				setDatabase_port_requis((Database_PortRequis)null);
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
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_REQUIS_RPC2:
				return role_requis_rpc2 != null;
			case AsaM1Package.ATTACHEMENT_RPC2DB__ROLE_FOURNI_RPC2:
				return role_fourni_rpc2 != null;
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_FOURNI:
				return database_port_fourni != null;
			case AsaM1Package.ATTACHEMENT_RPC2DB__DATABASE_PORT_REQUIS:
				return database_port_requis != null;
		}
		return super.eIsSet(featureID);
	}

} //AttachementRPC2DBImpl
