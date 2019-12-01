/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttacheClientRPC;
import asaM1.Client_Port_Fourni;
import asaM1.Client_Port_Requis;
import asaM1.RPC_Role_Fourni;
import asaM1.RPC_Role_Requis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attache Client RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttacheClientRPCImpl#getClient_port_fourni <em>Client port fourni</em>}</li>
 *   <li>{@link asaM1.impl.AttacheClientRPCImpl#getRole_requis <em>Role requis</em>}</li>
 *   <li>{@link asaM1.impl.AttacheClientRPCImpl#getRole_fourni <em>Role fourni</em>}</li>
 *   <li>{@link asaM1.impl.AttacheClientRPCImpl#getClient_port_requis <em>Client port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttacheClientRPCImpl extends AttachementImpl implements AttacheClientRPC {
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
	 * The cached value of the '{@link #getRole_requis() <em>Role requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis()
	 * @generated
	 * @ordered
	 */
	protected RPC_Role_Requis role_requis;

	/**
	 * The cached value of the '{@link #getRole_fourni() <em>Role fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_fourni()
	 * @generated
	 * @ordered
	 */
	protected RPC_Role_Fourni role_fourni;

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
	protected AttacheClientRPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHE_CLIENT_RPC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI, oldClient_port_fourni, client_port_fourni));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI, oldClient_port_fourni, client_port_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC_Role_Requis getRole_requis() {
		if (role_requis != null && role_requis.eIsProxy()) {
			InternalEObject oldRole_requis = (InternalEObject)role_requis;
			role_requis = (RPC_Role_Requis)eResolveProxy(oldRole_requis);
			if (role_requis != oldRole_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_REQUIS, oldRole_requis, role_requis));
			}
		}
		return role_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC_Role_Requis basicGetRole_requis() {
		return role_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_requis(RPC_Role_Requis newRole_requis) {
		RPC_Role_Requis oldRole_requis = role_requis;
		role_requis = newRole_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_REQUIS, oldRole_requis, role_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC_Role_Fourni getRole_fourni() {
		if (role_fourni != null && role_fourni.eIsProxy()) {
			InternalEObject oldRole_fourni = (InternalEObject)role_fourni;
			role_fourni = (RPC_Role_Fourni)eResolveProxy(oldRole_fourni);
			if (role_fourni != oldRole_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_FOURNI, oldRole_fourni, role_fourni));
			}
		}
		return role_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC_Role_Fourni basicGetRole_fourni() {
		return role_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole_fourni(RPC_Role_Fourni newRole_fourni) {
		RPC_Role_Fourni oldRole_fourni = role_fourni;
		role_fourni = newRole_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_FOURNI, oldRole_fourni, role_fourni));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS, oldClient_port_requis, client_port_requis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS, oldClient_port_requis, client_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI:
				if (resolve) return getClient_port_fourni();
				return basicGetClient_port_fourni();
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_REQUIS:
				if (resolve) return getRole_requis();
				return basicGetRole_requis();
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_FOURNI:
				if (resolve) return getRole_fourni();
				return basicGetRole_fourni();
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS:
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
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI:
				setClient_port_fourni((Client_Port_Fourni)newValue);
				return;
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_REQUIS:
				setRole_requis((RPC_Role_Requis)newValue);
				return;
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_FOURNI:
				setRole_fourni((RPC_Role_Fourni)newValue);
				return;
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS:
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
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI:
				setClient_port_fourni((Client_Port_Fourni)null);
				return;
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_REQUIS:
				setRole_requis((RPC_Role_Requis)null);
				return;
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_FOURNI:
				setRole_fourni((RPC_Role_Fourni)null);
				return;
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS:
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
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_FOURNI:
				return client_port_fourni != null;
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_REQUIS:
				return role_requis != null;
			case AsaM1Package.ATTACHE_CLIENT_RPC__ROLE_FOURNI:
				return role_fourni != null;
			case AsaM1Package.ATTACHE_CLIENT_RPC__CLIENT_PORT_REQUIS:
				return client_port_requis != null;
		}
		return super.eIsSet(featureID);
	}

} //AttacheClientRPCImpl
