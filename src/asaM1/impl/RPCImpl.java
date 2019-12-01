/**
 */
package asaM1.impl;

import aSA.impl.ConnecteurImpl;

import asaM1.AsaM1Package;
import asaM1.RPC;
import asaM1.RPC_Role_Fourni;
import asaM1.RPC_Role_Requis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.RPCImpl#getRrpc_ole_requis <em>Rrpc ole requis</em>}</li>
 *   <li>{@link asaM1.impl.RPCImpl#getRpc_role_fourni <em>Rpc role fourni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPCImpl extends ConnecteurImpl implements RPC {
	/**
	 * The cached value of the '{@link #getRpc_role_requis() <em>Rrpc ole requis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc_role_requis()
	 * @generated
	 * @ordered
	 */
	protected RPC_Role_Requis rpc_role_requis;

	/**
	 * The cached value of the '{@link #getRpc_role_fourni() <em>Rpc role fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc_role_fourni()
	 * @generated
	 * @ordered
	 */
	protected RPC_Role_Fourni rpc_role_fourni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.RPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC_Role_Requis getRpc_role_requis() {
		if (rpc_role_requis != null && rpc_role_requis.eIsProxy()) {
			InternalEObject oldRrpc_ole_requis = (InternalEObject)rpc_role_requis;
			rpc_role_requis = (RPC_Role_Requis)eResolveProxy(oldRrpc_ole_requis);
			if (rpc_role_requis != oldRrpc_ole_requis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC__RRPC_OLE_REQUIS, oldRrpc_ole_requis, rpc_role_requis));
			}
		}
		return rpc_role_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC_Role_Requis basicGetRrpc_ole_requis() {
		return rpc_role_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRrpc_ole_requis(RPC_Role_Requis newRrpc_ole_requis) {
		RPC_Role_Requis oldRrpc_ole_requis = rpc_role_requis;
		rpc_role_requis = newRrpc_ole_requis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC__RRPC_OLE_REQUIS, oldRrpc_ole_requis, rpc_role_requis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPC_Role_Fourni getRpc_role_fourni() {
		if (rpc_role_fourni != null && rpc_role_fourni.eIsProxy()) {
			InternalEObject oldRpc_role_fourni = (InternalEObject)rpc_role_fourni;
			rpc_role_fourni = (RPC_Role_Fourni)eResolveProxy(oldRpc_role_fourni);
			if (rpc_role_fourni != oldRpc_role_fourni) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.RPC__RPC_ROLE_FOURNI, oldRpc_role_fourni, rpc_role_fourni));
			}
		}
		return rpc_role_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPC_Role_Fourni basicGetRpc_role_fourni() {
		return rpc_role_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpc_role_fourni(RPC_Role_Fourni newRpc_role_fourni) {
		RPC_Role_Fourni oldRpc_role_fourni = rpc_role_fourni;
		rpc_role_fourni = newRpc_role_fourni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.RPC__RPC_ROLE_FOURNI, oldRpc_role_fourni, rpc_role_fourni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.RPC__RRPC_OLE_REQUIS:
				if (resolve) return getRpc_role_requis();
				return basicGetRrpc_ole_requis();
			case AsaM1Package.RPC__RPC_ROLE_FOURNI:
				if (resolve) return getRpc_role_fourni();
				return basicGetRpc_role_fourni();
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
			case AsaM1Package.RPC__RRPC_OLE_REQUIS:
				setRrpc_ole_requis((RPC_Role_Requis)newValue);
				return;
			case AsaM1Package.RPC__RPC_ROLE_FOURNI:
				setRpc_role_fourni((RPC_Role_Fourni)newValue);
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
			case AsaM1Package.RPC__RRPC_OLE_REQUIS:
				setRrpc_ole_requis((RPC_Role_Requis)null);
				return;
			case AsaM1Package.RPC__RPC_ROLE_FOURNI:
				setRpc_role_fourni((RPC_Role_Fourni)null);
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
			case AsaM1Package.RPC__RRPC_OLE_REQUIS:
				return rpc_role_requis != null;
			case AsaM1Package.RPC__RPC_ROLE_FOURNI:
				return rpc_role_fourni != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCImpl
