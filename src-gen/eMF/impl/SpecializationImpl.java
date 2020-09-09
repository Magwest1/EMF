/**
 */
package eMF.impl;

import eMF.EMFPackage;
import eMF.Programme;
import eMF.Semester;
import eMF.Specialization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eMF.impl.SpecializationImpl#getSpecializationInSemester <em>Specialization In Semester</em>}</li>
 *   <li>{@link eMF.impl.SpecializationImpl#getRequiredSpecialization <em>Required Specialization</em>}</li>
 *   <li>{@link eMF.impl.SpecializationImpl#getSpecializationInProgramme <em>Specialization In Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializationInSemester() <em>Specialization In Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationInSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester specializationInSemester;

	/**
	 * The cached value of the '{@link #getRequiredSpecialization() <em>Required Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization requiredSpecialization;

	/**
	 * The cached value of the '{@link #getSpecializationInProgramme() <em>Specialization In Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationInProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme specializationInProgramme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSpecializationInSemester() {
		if (specializationInSemester != null && specializationInSemester.eIsProxy()) {
			InternalEObject oldSpecializationInSemester = (InternalEObject) specializationInSemester;
			specializationInSemester = (Semester) eResolveProxy(oldSpecializationInSemester);
			if (specializationInSemester != oldSpecializationInSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER, oldSpecializationInSemester,
							specializationInSemester));
			}
		}
		return specializationInSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetSpecializationInSemester() {
		return specializationInSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializationInSemester(Semester newSpecializationInSemester,
			NotificationChain msgs) {
		Semester oldSpecializationInSemester = specializationInSemester;
		specializationInSemester = newSpecializationInSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER, oldSpecializationInSemester,
					newSpecializationInSemester);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializationInSemester(Semester newSpecializationInSemester) {
		if (newSpecializationInSemester != specializationInSemester) {
			NotificationChain msgs = null;
			if (specializationInSemester != null)
				msgs = ((InternalEObject) specializationInSemester).eInverseRemove(this,
						EMFPackage.SEMESTER__SPECIALIZTAION, Semester.class, msgs);
			if (newSpecializationInSemester != null)
				msgs = ((InternalEObject) newSpecializationInSemester).eInverseAdd(this,
						EMFPackage.SEMESTER__SPECIALIZTAION, Semester.class, msgs);
			msgs = basicSetSpecializationInSemester(newSpecializationInSemester, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER,
					newSpecializationInSemester, newSpecializationInSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getRequiredSpecialization() {
		if (requiredSpecialization != null && requiredSpecialization.eIsProxy()) {
			InternalEObject oldRequiredSpecialization = (InternalEObject) requiredSpecialization;
			requiredSpecialization = (Specialization) eResolveProxy(oldRequiredSpecialization);
			if (requiredSpecialization != oldRequiredSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION, oldRequiredSpecialization,
							requiredSpecialization));
			}
		}
		return requiredSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetRequiredSpecialization() {
		return requiredSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredSpecialization(Specialization newRequiredSpecialization) {
		Specialization oldRequiredSpecialization = requiredSpecialization;
		requiredSpecialization = newRequiredSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION,
					oldRequiredSpecialization, requiredSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getSpecializationInProgramme() {
		if (specializationInProgramme != null && specializationInProgramme.eIsProxy()) {
			InternalEObject oldSpecializationInProgramme = (InternalEObject) specializationInProgramme;
			specializationInProgramme = (Programme) eResolveProxy(oldSpecializationInProgramme);
			if (specializationInProgramme != oldSpecializationInProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME, oldSpecializationInProgramme,
							specializationInProgramme));
			}
		}
		return specializationInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetSpecializationInProgramme() {
		return specializationInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecializationInProgramme(Programme newSpecializationInProgramme) {
		Programme oldSpecializationInProgramme = specializationInProgramme;
		specializationInProgramme = newSpecializationInProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME, oldSpecializationInProgramme,
					specializationInProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER:
			if (specializationInSemester != null)
				msgs = ((InternalEObject) specializationInSemester).eInverseRemove(this,
						EMFPackage.SEMESTER__SPECIALIZTAION, Semester.class, msgs);
			return basicSetSpecializationInSemester((Semester) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER:
			return basicSetSpecializationInSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EMFPackage.SPECIALIZATION__NAME:
			return getName();
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER:
			if (resolve)
				return getSpecializationInSemester();
			return basicGetSpecializationInSemester();
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			if (resolve)
				return getRequiredSpecialization();
			return basicGetRequiredSpecialization();
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			if (resolve)
				return getSpecializationInProgramme();
			return basicGetSpecializationInProgramme();
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
		case EMFPackage.SPECIALIZATION__NAME:
			setName((String) newValue);
			return;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER:
			setSpecializationInSemester((Semester) newValue);
			return;
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			setRequiredSpecialization((Specialization) newValue);
			return;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			setSpecializationInProgramme((Programme) newValue);
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
		case EMFPackage.SPECIALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER:
			setSpecializationInSemester((Semester) null);
			return;
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			setRequiredSpecialization((Specialization) null);
			return;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			setSpecializationInProgramme((Programme) null);
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
		case EMFPackage.SPECIALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_SEMESTER:
			return specializationInSemester != null;
		case EMFPackage.SPECIALIZATION__REQUIRED_SPECIALIZATION:
			return requiredSpecialization != null;
		case EMFPackage.SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME:
			return specializationInProgramme != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
