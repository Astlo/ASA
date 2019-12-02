/**
 */
package asaM1.impl;

import aSA.impl.AttachementImpl;

import asaM1.AsaM1Package;
import asaM1.AttacheServeurRPC;
import asaM1.Client_Port_Fourni;
import asaM1.Client_Port_Requis;
import asaM1.RPC_Role_Fourni;
import asaM1.RPC_Role_Requis;
import asaM1.Serveur_Port_Fourni;
import asaM1.Serveur_Port_Requis;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attache Serveur RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.AttacheServeurRPCImpl#getRole_fourni <em>Role fourni</em>}</li>
 *   <li>{@link asaM1.impl.AttacheServeurRPCImpl#getRole_requis <em>Role requis</em>}</li>
 *   <li>{@link asaM1.impl.AttacheServeurRPCImpl#getServeur_port_fourni <em>Serveur port fourni</em>}</li>
 *   <li>{@link asaM1.impl.AttacheServeurRPCImpl#getServeur_port_requis <em>Serveur port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttacheServeurRPCImpl extends AttachementImpl implements AttacheServeurRPC {
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
	 * The cached value of the '{@link #getRole_requis() <em>Role requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_requis()
	 * @generated
	 * @ordered
	 */
	protected RPC_Role_Requis role_requis;

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
	 * The cached value of the '{@link #getServeur_port_requis() <em>Serveur port requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_port_requis()
	 * @generated
	 * @ordered
	 */
	protected Serveur_Port_Requis serveur_port_requis;

	private HashMap<Serveur_Port_Fourni, RPC_Role_Requis> correspondance_fourni;
	private HashMap<RPC_Role_Fourni, Serveur_Port_Requis> correspondance_requis;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttacheServeurRPCImpl() {
		super();
	}

	protected AttacheServeurRPCImpl(Serveur_Port_Fourni serveur_port_fourni,
			RPC_Role_Requis rpc_role_requisserveur, Serveur_Port_Requis serveur_port_requis,
			RPC_Role_Fourni rpc_role_fourniserveur) {
		super();
		this.serveur_port_fourni = serveur_port_fourni;
		this.serveur_port_requis = serveur_port_requis;
		this.role_fourni = rpc_role_fourniserveur;
		this.role_requis = rpc_role_requisserveur;
		
		correspondance_fourni = new HashMap<Serveur_Port_Fourni, RPC_Role_Requis>();
		correspondance_requis = new HashMap<RPC_Role_Fourni,Serveur_Port_Requis >();
		System.out.println(serveur_port_fourni);
		correspondance_fourni.put(serveur_port_fourni, role_requis);
		correspondance_requis.put(role_fourni, serveur_port_requis);
	}

	@Override
	public Serveur_Port_Requis getCorrespondance(RPC_Role_Fourni role) {
		return correspondance_requis.get(role);
	}

	@Override
	public RPC_Role_Requis getCorrespondance(Serveur_Port_Fourni port) {
		System.out.println("attach" + correspondance_fourni.get(port));
		return correspondance_fourni.get(port);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.ATTACHE_SERVEUR_RPC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_FOURNI, oldRole_fourni, role_fourni));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_FOURNI, oldRole_fourni, role_fourni));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_REQUIS, oldRole_requis, role_requis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_REQUIS, oldRole_requis, role_requis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI, oldServeur_port_fourni, serveur_port_fourni));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI, oldServeur_port_fourni, serveur_port_fourni));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS, oldServeur_port_requis, serveur_port_requis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS, oldServeur_port_requis, serveur_port_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_FOURNI:
				if (resolve) return getRole_fourni();
				return basicGetRole_fourni();
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_REQUIS:
				if (resolve) return getRole_requis();
				return basicGetRole_requis();
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI:
				if (resolve) return getServeur_port_fourni();
				return basicGetServeur_port_fourni();
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS:
				if (resolve) return getServeur_port_requis();
				return basicGetServeur_port_requis();
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
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_FOURNI:
				setRole_fourni((RPC_Role_Fourni)newValue);
				return;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_REQUIS:
				setRole_requis((RPC_Role_Requis)newValue);
				return;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI:
				setServeur_port_fourni((Serveur_Port_Fourni)newValue);
				return;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS:
				setServeur_port_requis((Serveur_Port_Requis)newValue);
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
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_FOURNI:
				setRole_fourni((RPC_Role_Fourni)null);
				return;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_REQUIS:
				setRole_requis((RPC_Role_Requis)null);
				return;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI:
				setServeur_port_fourni((Serveur_Port_Fourni)null);
				return;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS:
				setServeur_port_requis((Serveur_Port_Requis)null);
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
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_FOURNI:
				return role_fourni != null;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__ROLE_REQUIS:
				return role_requis != null;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_FOURNI:
				return serveur_port_fourni != null;
			case AsaM1Package.ATTACHE_SERVEUR_RPC__SERVEUR_PORT_REQUIS:
				return serveur_port_requis != null;
		}
		return super.eIsSet(featureID);
	}


} //AttacheServeurRPCImpl
