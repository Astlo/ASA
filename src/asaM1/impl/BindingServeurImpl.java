/**
 */
package asaM1.impl;

import aSA.impl.BindingImpl;

import asaM1.AsaM1Package;
import asaM1.BindingServeur;
import asaM1.Connection_PortFourni;
import asaM1.Connection_PortRequis;
import asaM1.Serveur_Port_Fourni;
import asaM1.Serveur_Port_Requis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Serveur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.BindingServeurImpl#getExternal_socket_fourni <em>External socket fourni</em>}</li>
 *   <li>{@link asaM1.impl.BindingServeurImpl#getExternal_socket_requis <em>External socket requis</em>}</li>
 *   <li>{@link asaM1.impl.BindingServeurImpl#getServeur_port_requis <em>Serveur port requis</em>}</li>
 *   <li>{@link asaM1.impl.BindingServeurImpl#getServeur_port_fourni <em>Serveur port fourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingServeurImpl extends BindingImpl implements BindingServeur {
	/**
	 * The cached value of the '{@link #getExternal_socket_fourni() <em>External socket fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_socket_fourni()
	 * @generated
	 * @ordered
	 */
	protected Connection_PortFourni external_socket_fourni;

	/**
	 * The cached value of the '{@link #getExternal_socket_requis() <em>External socket requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternal_socket_requis()
	 * @generated
	 * @ordered
	 */
	protected Connection_PortRequis external_socket_requis;

	/**
	 * The cached value of the '{@link #getServeur_port_requis() <em>Serveur port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Serveur_Port_Requis serveur_port_requis;

	/**
	 * The cached value of the '{@link #getServeur_port_fourni() <em>Serveur port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected Serveur_Port_Fourni serveur_port_fourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingServeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.BINDING_SERVEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortFourni getExternal_socket_fourni() {
		if (external_socket_fourni != null && external_socket_fourni.eIsProxy()) {
			InternalEObject oldExternal_socket_fourni = (InternalEObject)external_socket_fourni;
			external_socket_fourni = (Connection_PortFourni)eResolveProxy(oldExternal_socket_fourni);
			if (external_socket_fourni != oldExternal_socket_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI, oldExternal_socket_fourni, external_socket_fourni));
			}
		}
		return external_socket_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_PortFourni basicGetExternal_socket_fourni() {
		return external_socket_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal_socket_fourni(Connection_PortFourni newExternal_socket_fourni) {
		Connection_PortFourni oldExternal_socket_fourni = external_socket_fourni;
		external_socket_fourni = newExternal_socket_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI, oldExternal_socket_fourni, external_socket_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection_PortRequis getExternal_socket_requis() {
		if (external_socket_requis != null && external_socket_requis.eIsProxy()) {
			InternalEObject oldExternal_socket_requis = (InternalEObject)external_socket_requis;
			external_socket_requis = (Connection_PortRequis)eResolveProxy(oldExternal_socket_requis);
			if (external_socket_requis != oldExternal_socket_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS, oldExternal_socket_requis, external_socket_requis));
			}
		}
		return external_socket_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection_PortRequis basicGetExternal_socket_requis() {
		return external_socket_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal_socket_requis(Connection_PortRequis newExternal_socket_requis) {
		Connection_PortRequis oldExternal_socket_requis = external_socket_requis;
		external_socket_requis = newExternal_socket_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS, oldExternal_socket_requis, external_socket_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Serveur_Port_Requis getServeur_port_requis() {
		if (serveur_port_requis != null && serveur_port_requis.eIsProxy()) {
			InternalEObject oldServeur_port_requis = (InternalEObject)serveur_port_requis;
			serveur_port_requis = (Serveur_Port_Requis)eResolveProxy(oldServeur_port_requis);
			if (serveur_port_requis != oldServeur_port_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_REQUIS, oldServeur_port_requis, serveur_port_requis));
			}
		}
		return serveur_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur_Port_Requis basicGetServeur_port_requis() {
		return serveur_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServeur_port_requis(Serveur_Port_Requis newServeur_port_requis) {
		Serveur_Port_Requis oldServeur_port_requis = serveur_port_requis;
		serveur_port_requis = newServeur_port_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_REQUIS, oldServeur_port_requis, serveur_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Serveur_Port_Fourni getServeur_port_fourni() {
		if (serveur_port_fourni != null && serveur_port_fourni.eIsProxy()) {
			InternalEObject oldServeur_port_fourni = (InternalEObject)serveur_port_fourni;
			serveur_port_fourni = (Serveur_Port_Fourni)eResolveProxy(oldServeur_port_fourni);
			if (serveur_port_fourni != oldServeur_port_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_FOURNI, oldServeur_port_fourni, serveur_port_fourni));
			}
		}
		return serveur_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serveur_Port_Fourni basicGetServeur_port_fourni() {
		return serveur_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServeur_port_fourni(Serveur_Port_Fourni newServeur_port_fourni) {
		Serveur_Port_Fourni oldServeur_port_fourni = serveur_port_fourni;
		serveur_port_fourni = newServeur_port_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_FOURNI, oldServeur_port_fourni, serveur_port_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI:
				if (resolve) return getExternal_socket_fourni();
				return basicGetExternal_socket_fourni();
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS:
				if (resolve) return getExternal_socket_requis();
				return basicGetExternal_socket_requis();
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_REQUIS:
				if (resolve) return getServeur_port_requis();
				return basicGetServeur_port_requis();
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_FOURNI:
				if (resolve) return getServeur_port_fourni();
				return basicGetServeur_port_fourni();
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
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI:
				setExternal_socket_fourni((Connection_PortFourni)newValue);
				return;
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS:
				setExternal_socket_requis((Connection_PortRequis)newValue);
				return;
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_REQUIS:
				setServeur_port_requis((Serveur_Port_Requis)newValue);
				return;
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_FOURNI:
				setServeur_port_fourni((Serveur_Port_Fourni)newValue);
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
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI:
				setExternal_socket_fourni((Connection_PortFourni)null);
				return;
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS:
				setExternal_socket_requis((Connection_PortRequis)null);
				return;
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_REQUIS:
				setServeur_port_requis((Serveur_Port_Requis)null);
				return;
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_FOURNI:
				setServeur_port_fourni((Serveur_Port_Fourni)null);
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
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_FOURNI:
				return external_socket_fourni != null;
			case AsaM1Package.BINDING_SERVEUR__EXTERNAL_SOCKET_REQUIS:
				return external_socket_requis != null;
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_REQUIS:
				return serveur_port_requis != null;
			case AsaM1Package.BINDING_SERVEUR__SERVEUR_PORT_FOURNI:
				return serveur_port_fourni != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingServeurImpl
