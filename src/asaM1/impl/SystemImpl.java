/**
 */
package asaM1.impl;

import aSA.impl.ConfigurationImpl;

import asaM1.AsaM1Package;
import asaM1.AttacheClientRPC;
import asaM1.AttacheServeurRPC;
import asaM1.Client;
import asaM1.RPC;
import asaM1.Server;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.SystemImpl#getRpc <em>Rpc</em>}</li>
 *   <li>{@link asaM1.impl.SystemImpl#getClient <em>Client</em>}</li>
 *   <li>{@link asaM1.impl.SystemImpl#getServeur <em>Serveur</em>}</li>
 *   <li>{@link asaM1.impl.SystemImpl#getAttacheserveurrpc <em>Attacheserveurrpc</em>}</li>
 *   <li>{@link asaM1.impl.SystemImpl#getAttacheclientrpc <em>Attacheclientrpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ConfigurationImpl implements asaM1.System {
	/**
	 * The cached value of the '{@link #getRpc() <em>Rpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc()
	 * @generated
	 * @ordered
	 */
	protected RPC rpc;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The cached value of the '{@link #getServeur() <em>Serveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur()
	 * @generated
	 * @ordered
	 */
	protected Server serveur;

	/**
	 * The cached value of the '{@link #getAttacheserveurrpc() <em>Attacheserveurrpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacheserveurrpc()
	 * @generated
	 * @ordered
	 */
	protected AttacheServeurRPC attacheserveurrpc;

	/**
	 * The cached value of the '{@link #getAttacheclientrpc() <em>Attacheclientrpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacheclientrpc()
	 * @generated
	 * @ordered
	 */
	protected AttacheClientRPC attacheclientrpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemImpl() {
		super();
		client = new ClientImpl(this);
		serveur = new ServerImpl(this);
		rpc = new RPCImpl(this);
		attacheclientrpc = new AttacheClientRPCImpl(client.getClient_port_fourni(), rpc.getRpc_role_requis(), serveur.getServeur_port_requis(), rpc.getRpc_role_fourni());
		attacheserveurrpc = new AttacheServeurRPCImpl(serveur.getServeur_port_fourni(), rpc.getRpc_role_requis(), client.getClient_port_requis(), rpc.getRpc_role_fourni());
		
	}
	
	public void start() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC getRpc() {
		if (rpc != null && rpc.eIsProxy()) {
			InternalEObject oldRpc = (InternalEObject)rpc;
			rpc = (RPC)eResolveProxy(oldRpc);
			if (rpc != oldRpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SYSTEM__RPC, oldRpc, rpc));
			}
		}
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC basicGetRpc() {
		return rpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpc(RPC newRpc) {
		RPC oldRpc = rpc;
		rpc = newRpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SYSTEM__RPC, oldRpc, rpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Client)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SYSTEM__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClient(Client newClient) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SYSTEM__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server getServeur() {
		if (serveur != null && serveur.eIsProxy()) {
			InternalEObject oldServeur = (InternalEObject)serveur;
			serveur = (Server)eResolveProxy(oldServeur);
			if (serveur != oldServeur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SYSTEM__SERVEUR, oldServeur, serveur));
			}
		}
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServeur() {
		return serveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServeur(Server newServeur) {
		Server oldServeur = serveur;
		serveur = newServeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SYSTEM__SERVEUR, oldServeur, serveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttacheServeurRPC getAttacheserveurrpc() {
		if (attacheserveurrpc != null && attacheserveurrpc.eIsProxy()) {
			InternalEObject oldAttacheserveurrpc = (InternalEObject)attacheserveurrpc;
			attacheserveurrpc = (AttacheServeurRPC)eResolveProxy(oldAttacheserveurrpc);
			if (attacheserveurrpc != oldAttacheserveurrpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SYSTEM__ATTACHESERVEURRPC, oldAttacheserveurrpc, attacheserveurrpc));
			}
		}
		return attacheserveurrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttacheServeurRPC basicGetAttacheserveurrpc() {
		return attacheserveurrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttacheserveurrpc(AttacheServeurRPC newAttacheserveurrpc) {
		AttacheServeurRPC oldAttacheserveurrpc = attacheserveurrpc;
		attacheserveurrpc = newAttacheserveurrpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SYSTEM__ATTACHESERVEURRPC, oldAttacheserveurrpc, attacheserveurrpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttacheClientRPC getAttacheclientrpc() {
		if (attacheclientrpc != null && attacheclientrpc.eIsProxy()) {
			InternalEObject oldAttacheclientrpc = (InternalEObject)attacheclientrpc;
			attacheclientrpc = (AttacheClientRPC)eResolveProxy(oldAttacheclientrpc);
			if (attacheclientrpc != oldAttacheclientrpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SYSTEM__ATTACHECLIENTRPC, oldAttacheclientrpc, attacheclientrpc));
			}
		}
		return attacheclientrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttacheClientRPC basicGetAttacheclientrpc() {
		return attacheclientrpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttacheclientrpc(AttacheClientRPC newAttacheclientrpc) {
		AttacheClientRPC oldAttacheclientrpc = attacheclientrpc;
		attacheclientrpc = newAttacheclientrpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SYSTEM__ATTACHECLIENTRPC, oldAttacheclientrpc, attacheclientrpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.SYSTEM__RPC:
				if (resolve) return getRpc();
				return basicGetRpc();
			case AsaM1Package.SYSTEM__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case AsaM1Package.SYSTEM__SERVEUR:
				if (resolve) return getServeur();
				return basicGetServeur();
			case AsaM1Package.SYSTEM__ATTACHESERVEURRPC:
				if (resolve) return getAttacheserveurrpc();
				return basicGetAttacheserveurrpc();
			case AsaM1Package.SYSTEM__ATTACHECLIENTRPC:
				if (resolve) return getAttacheclientrpc();
				return basicGetAttacheclientrpc();
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
			case AsaM1Package.SYSTEM__RPC:
				setRpc((RPC)newValue);
				return;
			case AsaM1Package.SYSTEM__CLIENT:
				setClient((Client)newValue);
				return;
			case AsaM1Package.SYSTEM__SERVEUR:
				setServeur((Server)newValue);
				return;
			case AsaM1Package.SYSTEM__ATTACHESERVEURRPC:
				setAttacheserveurrpc((AttacheServeurRPC)newValue);
				return;
			case AsaM1Package.SYSTEM__ATTACHECLIENTRPC:
				setAttacheclientrpc((AttacheClientRPC)newValue);
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
			case AsaM1Package.SYSTEM__RPC:
				setRpc((RPC)null);
				return;
			case AsaM1Package.SYSTEM__CLIENT:
				setClient((Client)null);
				return;
			case AsaM1Package.SYSTEM__SERVEUR:
				setServeur((Server)null);
				return;
			case AsaM1Package.SYSTEM__ATTACHESERVEURRPC:
				setAttacheserveurrpc((AttacheServeurRPC)null);
				return;
			case AsaM1Package.SYSTEM__ATTACHECLIENTRPC:
				setAttacheclientrpc((AttacheClientRPC)null);
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
			case AsaM1Package.SYSTEM__RPC:
				return rpc != null;
			case AsaM1Package.SYSTEM__CLIENT:
				return client != null;
			case AsaM1Package.SYSTEM__SERVEUR:
				return serveur != null;
			case AsaM1Package.SYSTEM__ATTACHESERVEURRPC:
				return attacheserveurrpc != null;
			case AsaM1Package.SYSTEM__ATTACHECLIENTRPC:
				return attacheclientrpc != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
