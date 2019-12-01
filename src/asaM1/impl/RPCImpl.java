/**
 */
package asaM1.impl;

import aSA.impl.ConnecteurImpl;

import asaM1.AsaM1Package;
import asaM1.RPC;
import asaM1.RPC_Role_Fourni;
import asaM1.RPC_Role_Requis;

import java.util.HashMap;

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
	protected RPC_Role_Requis rpc_role_requisclient;
	protected RPC_Role_Requis rpc_role_requisserveur;

	/**
	 * The cached value of the '{@link #getRpc_role_fourni() <em>Rpc role fourni</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpc_role_fourni()
	 * @generated
	 * @ordered
	 */
	protected RPC_Role_Fourni rpc_role_fourniclient;
	protected RPC_Role_Fourni rpc_role_fourniserveur;


	private HashMap<RPC_Role_Requis, RPC_Role_Fourni> glueRPC;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCImpl() {
		super();
	}
	
	protected RPCImpl(SystemImpl observer) {
		super();
		
		rpc_role_requisclient = new RPC_Role_RequisImpl();
		rpc_role_requisserveur = new RPC_Role_RequisImpl();
		rpc_role_fourniclient = new RPC_Role_FourniImpl();
		rpc_role_fourniserveur = new RPC_Role_FourniImpl();
		
		rpc_role_requisclient.addObserver(this);
		rpc_role_requisserveur.addObserver(this);
		rpc_role_fourniclient.addObserver(observer);
		rpc_role_fourniserveur.addObserver(observer);
		
		glueRPC.put(rpc_role_requisclient, rpc_role_fourniserveur);
		glueRPC.put(rpc_role_requisserveur, rpc_role_fourniclient);
		
	}

	public void transfertMessageRPC(RPC_Role_Requis role, String message) {
		RPC_Role_Fourni newrole = glueRPC.get(role);
		newrole.notifyConfig(newrole, message);
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
	
	

	@Override
	public RPC_Role_Requis getRpc_role_requisclient() {
		return rpc_role_requisclient;
	}

	@Override
	public void setRpc_role_requisclient(RPC_Role_Requis rpc_role_requisclient) {
		this.rpc_role_requisclient = rpc_role_requisclient;
	}

	@Override
	public RPC_Role_Requis getRpc_role_requisserveur() {
		return rpc_role_requisserveur;
	}

	@Override
	public void setRpc_role_requisserveur(RPC_Role_Requis rpc_role_requisserveur) {
		this.rpc_role_requisserveur = rpc_role_requisserveur;
	}

	@Override
	public RPC_Role_Fourni getRpc_role_fourniclient() {
		return rpc_role_fourniclient;
	}

	@Override
	public void setRpc_role_fourniclient(RPC_Role_Fourni rpc_role_fourniclient) {
		this.rpc_role_fourniclient = rpc_role_fourniclient;
	}

	@Override
	public RPC_Role_Fourni getRpc_role_fourniserveur() {
		return rpc_role_fourniserveur;
	}

	@Override
	public void setRpc_role_fourniserveur(RPC_Role_Fourni rpc_role_fourniserveur) {
		this.rpc_role_fourniserveur = rpc_role_fourniserveur;
	}



} //RPCImpl
