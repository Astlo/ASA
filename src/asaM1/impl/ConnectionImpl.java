/**
 */
package asaM1.impl;

import aSA.impl.ComposantImpl;

import asaM1.AsaM1Package;
import asaM1.Connection;
import asaM1.Connection_PortFourni;
import asaM1.Connection_PortRequis;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.ConnectionImpl#getConnection_port_fourni <em>Connection port fourni</em>}</li>
 *   <li>{@link asaM1.impl.ConnectionImpl#getConnection_port_requis <em>Connection port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends ComposantImpl implements Connection {
	/**
	 * The cached value of the '{@link #getConnection_port_fourni() <em>Connection port fourni</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_PortFourni> connection_port_fourni;

	/**
	 * The cached value of the '{@link #getConnection_port_requis() <em>Connection port requis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection_port_requis()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection_PortRequis> connection_port_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection_PortFourni> getConnection_port_fourni() {
		if (connection_port_fourni == null) {
			connection_port_fourni = new EObjectResolvingEList<Connection_PortFourni>(Connection_PortFourni.class, this, AsaM1Package.CONNECTION__CONNECTION_PORT_FOURNI);
		}
		return connection_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection_PortRequis> getConnection_port_requis() {
		if (connection_port_requis == null) {
			connection_port_requis = new EObjectResolvingEList<Connection_PortRequis>(Connection_PortRequis.class, this, AsaM1Package.CONNECTION__CONNECTION_PORT_REQUIS);
		}
		return connection_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.CONNECTION__CONNECTION_PORT_FOURNI:
				return getConnection_port_fourni();
			case AsaM1Package.CONNECTION__CONNECTION_PORT_REQUIS:
				return getConnection_port_requis();
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
			case AsaM1Package.CONNECTION__CONNECTION_PORT_FOURNI:
				getConnection_port_fourni().clear();
				getConnection_port_fourni().addAll((Collection<? extends Connection_PortFourni>)newValue);
				return;
			case AsaM1Package.CONNECTION__CONNECTION_PORT_REQUIS:
				getConnection_port_requis().clear();
				getConnection_port_requis().addAll((Collection<? extends Connection_PortRequis>)newValue);
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
			case AsaM1Package.CONNECTION__CONNECTION_PORT_FOURNI:
				getConnection_port_fourni().clear();
				return;
			case AsaM1Package.CONNECTION__CONNECTION_PORT_REQUIS:
				getConnection_port_requis().clear();
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
			case AsaM1Package.CONNECTION__CONNECTION_PORT_FOURNI:
				return connection_port_fourni != null && !connection_port_fourni.isEmpty();
			case AsaM1Package.CONNECTION__CONNECTION_PORT_REQUIS:
				return connection_port_requis != null && !connection_port_requis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
