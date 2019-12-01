/**
 */
package asaM1.impl;

import aSA.impl.ComposantImpl;

import asaM1.AsaM1Package;
import asaM1.Security;
import asaM1.Security_PortFourni;
import asaM1.Security_PortRequis;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaM1.impl.SecurityImpl#getSecurity_port_fourni <em>Security port fourni</em>}</li>
 *   <li>{@link asaM1.impl.SecurityImpl#getSecurity_port_requis <em>Security port requis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityImpl extends ComposantImpl implements Security {
	/**
	 * The cached value of the '{@link #getSecurity_port_fourni() <em>Security port fourni</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_port_fourni()
	 * @generated
	 * @ordered
	 */
	protected EList<Security_PortFourni> security_port_fourni;

	/**
	 * The cached value of the '{@link #getSecurity_port_requis() <em>Security port requis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_port_requis()
	 * @generated
	 * @ordered
	 */
	protected EList<Security_PortRequis> security_port_requis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaM1Package.Literals.SECURITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Security_PortFourni> getSecurity_port_fourni() {
		if (security_port_fourni == null) {
			security_port_fourni = new EObjectResolvingEList<Security_PortFourni>(Security_PortFourni.class, this, AsaM1Package.SECURITY__SECURITY_PORT_FOURNI);
		}
		return security_port_fourni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Security_PortRequis> getSecurity_port_requis() {
		if (security_port_requis == null) {
			security_port_requis = new EObjectResolvingEList<Security_PortRequis>(Security_PortRequis.class, this, AsaM1Package.SECURITY__SECURITY_PORT_REQUIS);
		}
		return security_port_requis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsaM1Package.SECURITY__SECURITY_PORT_FOURNI:
				return getSecurity_port_fourni();
			case AsaM1Package.SECURITY__SECURITY_PORT_REQUIS:
				return getSecurity_port_requis();
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
			case AsaM1Package.SECURITY__SECURITY_PORT_FOURNI:
				getSecurity_port_fourni().clear();
				getSecurity_port_fourni().addAll((Collection<? extends Security_PortFourni>)newValue);
				return;
			case AsaM1Package.SECURITY__SECURITY_PORT_REQUIS:
				getSecurity_port_requis().clear();
				getSecurity_port_requis().addAll((Collection<? extends Security_PortRequis>)newValue);
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
			case AsaM1Package.SECURITY__SECURITY_PORT_FOURNI:
				getSecurity_port_fourni().clear();
				return;
			case AsaM1Package.SECURITY__SECURITY_PORT_REQUIS:
				getSecurity_port_requis().clear();
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
			case AsaM1Package.SECURITY__SECURITY_PORT_FOURNI:
				return security_port_fourni != null && !security_port_fourni.isEmpty();
			case AsaM1Package.SECURITY__SECURITY_PORT_REQUIS:
				return security_port_requis != null && !security_port_requis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityImpl
