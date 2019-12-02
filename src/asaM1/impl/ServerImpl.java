/**
 */
package asaM1.impl;

import aSA.Attachement;
import aSA.Binding;
import aSA.Composant;
import aSA.Connecteur;
import aSA.Interface;
import aSA.impl.ComposantImpl;

import asaM1.AsaM1Package;
import asaM1.AttachementRPC1CM;
import asaM1.AttachementRPC1DB;
import asaM1.AttachementRPC2DB;
import asaM1.AttachementRPC2SM;
import asaM1.AttachementRPC3CM;
import asaM1.AttachementRPC3SM;
import asaM1.BindingServeur;
import asaM1.Connection;
import asaM1.Connection_PortRequis;
import asaM1.Database;
import asaM1.RPC1;
import asaM1.RPC2;
import asaM1.RPC3;
import asaM1.Security;
import asaM1.Server;
import asaM1.Server_Detail;
import asaM1.Serveur_Port_Fourni;
import asaM1.Serveur_Port_Requis;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.ServerImpl#getServeur_port_requis <em>Serveur port requis</em>}</li>
 *   <li>{@link asaM1.impl.ServerImpl#getServeur_port_fourni <em>Serveur port fourni</em>}</li>
 *   <li>{@link asaM1.impl.ServerImpl#getServer_detail <em>Server detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends ComposantImpl implements Server {
	/**
	 * The cached value of the '{@link #getServeur_port_requis() <em>Serveur port requis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_port_requis()
	 * @generated
	 * @ordered
	 */
	protected EList<Serveur_Port_Requis> serveur_port_requis;

	/**
	 * The cached value of the '{@link #getServeur_port_fourni() <em>Serveur port fourni</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServeur_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected EList<Serveur_Port_Fourni> serveur_port_fourni;

	/**
	 * The cached value of the '{@link #getServer_detail() <em>Server detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer_detail()
	 * @generated
	 * @ordered
	 */
	protected Server_Detail server_detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}
	
	protected ServerImpl(SystemImpl observer) {
		super();
		
		Serveur_Port_Fourni fourni_rpc = new Serveur_Port_FourniImpl();
		Serveur_Port_Requis requis_rpc = new Serveur_Port_RequisImpl();
		Serveur_Port_Fourni fourni_binding = new Serveur_Port_FourniImpl();
		Serveur_Port_Requis requis_binding = new Serveur_Port_RequisImpl();
		
		fourni_rpc.addObserver(observer);
		requis_rpc.addObserver(this);
		fourni_binding.addObserver(observer);
		requis_binding.addObserver(this);
		

			

		serveur_port_requis = new BasicEList<Serveur_Port_Requis>();
		serveur_port_fourni = new BasicEList<Serveur_Port_Fourni>();
		serveur_port_requis.add(requis_rpc);
		serveur_port_requis.add(requis_binding);
		serveur_port_fourni.add(fourni_rpc);
		serveur_port_fourni.add(fourni_binding);
		
		server_detail = new Server_DetailImpl(this); 
	}

	@Override
	public void transfert(Serveur_Port_Requis serveur_Port_RequisImpl, String message) {
		server_detail.getBindingserveur().getExternal_socket_requis().notifyConnectionManager(message);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Serveur_Port_Requis> getServeur_port_requis() {
		if (serveur_port_requis == null) {
			serveur_port_requis = new EObjectResolvingEList<Serveur_Port_Requis>(Serveur_Port_Requis.class, this, AsaM1Package.SERVER__SERVEUR_PORT_REQUIS);
		}
		return serveur_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Serveur_Port_Fourni> getServeur_port_fourni() {
		if (serveur_port_fourni == null) {
			serveur_port_fourni = new EObjectResolvingEList<Serveur_Port_Fourni>(Serveur_Port_Fourni.class, this, AsaM1Package.SERVER__SERVEUR_PORT_FOURNI);
		}
		return serveur_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server_Detail getServer_detail() {
		if (server_detail != null && server_detail.eIsProxy()) {
			InternalEObject oldServer_detail = (InternalEObject)server_detail;
			server_detail = (Server_Detail)eResolveProxy(oldServer_detail);
			if (server_detail != oldServer_detail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsaM1Package.SERVER__SERVER_DETAIL, oldServer_detail, server_detail));
			}
		}
		return server_detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server_Detail basicGetServer_detail() {
		return server_detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServer_detail(Server_Detail newServer_detail) {
		Server_Detail oldServer_detail = server_detail;
		server_detail = newServer_detail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaM1Package.SERVER__SERVER_DETAIL, oldServer_detail, server_detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.SERVER__SERVEUR_PORT_REQUIS:
				return getServeur_port_requis();
			case AsaM1Package.SERVER__SERVEUR_PORT_FOURNI:
				return getServeur_port_fourni();
			case AsaM1Package.SERVER__SERVER_DETAIL:
				if (resolve) return getServer_detail();
				return basicGetServer_detail();
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
			case AsaM1Package.SERVER__SERVEUR_PORT_REQUIS:
				getServeur_port_requis().clear();
				getServeur_port_requis().addAll((Collection<? extends Serveur_Port_Requis>)newValue);
				return;
			case AsaM1Package.SERVER__SERVEUR_PORT_FOURNI:
				getServeur_port_fourni().clear();
				getServeur_port_fourni().addAll((Collection<? extends Serveur_Port_Fourni>)newValue);
				return;
			case AsaM1Package.SERVER__SERVER_DETAIL:
				setServer_detail((Server_Detail)newValue);
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
			case AsaM1Package.SERVER__SERVEUR_PORT_REQUIS:
				getServeur_port_requis().clear();
				return;
			case AsaM1Package.SERVER__SERVEUR_PORT_FOURNI:
				getServeur_port_fourni().clear();
				return;
			case AsaM1Package.SERVER__SERVER_DETAIL:
				setServer_detail((Server_Detail)null);
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
			case AsaM1Package.SERVER__SERVEUR_PORT_REQUIS:
				return serveur_port_requis != null && !serveur_port_requis.isEmpty();
			case AsaM1Package.SERVER__SERVEUR_PORT_FOURNI:
				return serveur_port_fourni != null && !serveur_port_fourni.isEmpty();
			case AsaM1Package.SERVER__SERVER_DETAIL:
				return server_detail != null;
		}
		return super.eIsSet(featureID);
	}


} //ServerImpl
