/**
 */
package asaM1.impl;

import aSA.impl.ComposantImpl;

import asaM1.AsaM1Package;
import asaM1.Client;
import asaM1.Client_Port_Fourni;
import asaM1.Client_Port_Requis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.ClientImpl#getClient_port_fourni <em>Client port fourni</em>}</li>
 *   <li>{@link asaM1.impl.ClientImpl#getClient_port_requis <em>Client port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends ComposantImpl implements Client {
	/**
	 * The cached value of the '{@link #getClient_port_fourni() <em>Client port fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected Client_Port_Fourni client_port_fourni;

	/**
	 * The cached value of the '{@link #getClient_port_requis() <em>Client port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Client_Port_Requis client_port_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	protected ClientImpl(SystemImpl observer) {
		super();
		client_port_fourni = new Client_Port_FourniImpl();
		client_port_requis = new Client_Port_RequisImpl();
		
		client_port_requis.addObserver(this);
		client_port_fourni.addObserver(observer);
	}
	@Override
	public void envoieRequeteClient(Client_Port_Fourni port, String message) {
		port.notifyConfig(message);
	}
	
	@Override
	public void receptionReponse(String message) {
		System.out.println(message);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client_Port_Fourni getClient_port_fourni() {
		if (client_port_fourni != null && client_port_fourni.eIsProxy()) {
			InternalEObject oldClient_port_fourni = (InternalEObject)client_port_fourni;
			client_port_fourni = (Client_Port_Fourni)eResolveProxy(oldClient_port_fourni);
			if (client_port_fourni != oldClient_port_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.CLIENT__CLIENT_PORT_FOURNI, oldClient_port_fourni, client_port_fourni));
			}
		}
		return client_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_Port_Fourni basicGetClient_port_fourni() {
		return client_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClient_port_fourni(Client_Port_Fourni newClient_port_fourni) {
		Client_Port_Fourni oldClient_port_fourni = client_port_fourni;
		client_port_fourni = newClient_port_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.CLIENT__CLIENT_PORT_FOURNI, oldClient_port_fourni, client_port_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client_Port_Requis getClient_port_requis() {
		if (client_port_requis != null && client_port_requis.eIsProxy()) {
			InternalEObject oldClient_port_requis = (InternalEObject)client_port_requis;
			client_port_requis = (Client_Port_Requis)eResolveProxy(oldClient_port_requis);
			if (client_port_requis != oldClient_port_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.CLIENT__CLIENT_PORT_REQUIS, oldClient_port_requis, client_port_requis));
			}
		}
		return client_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client_Port_Requis basicGetClient_port_requis() {
		return client_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClient_port_requis(Client_Port_Requis newClient_port_requis) {
		Client_Port_Requis oldClient_port_requis = client_port_requis;
		client_port_requis = newClient_port_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.CLIENT__CLIENT_PORT_REQUIS, oldClient_port_requis, client_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.CLIENT__CLIENT_PORT_FOURNI:
				if (resolve) return getClient_port_fourni();
				return basicGetClient_port_fourni();
			case AsaM1Package.CLIENT__CLIENT_PORT_REQUIS:
				if (resolve) return getClient_port_requis();
				return basicGetClient_port_requis();
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
			case AsaM1Package.CLIENT__CLIENT_PORT_FOURNI:
				setClient_port_fourni((Client_Port_Fourni)newValue);
				return;
			case AsaM1Package.CLIENT__CLIENT_PORT_REQUIS:
				setClient_port_requis((Client_Port_Requis)newValue);
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
			case AsaM1Package.CLIENT__CLIENT_PORT_FOURNI:
				setClient_port_fourni((Client_Port_Fourni)null);
				return;
			case AsaM1Package.CLIENT__CLIENT_PORT_REQUIS:
				setClient_port_requis((Client_Port_Requis)null);
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
			case AsaM1Package.CLIENT__CLIENT_PORT_FOURNI:
				return client_port_fourni != null;
			case AsaM1Package.CLIENT__CLIENT_PORT_REQUIS:
				return client_port_requis != null;
		}
		return super.eIsSet(featureID);
	}



} //ClientImpl
