/**
 */
package eMF.impl;

import eMF.Course;
import eMF.EMFPackage;
import eMF.Programme;
import eMF.Specialization;
import eMF.courseInSemester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.CourseImpl#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link eMF.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link eMF.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link eMF.impl.CourseImpl#getMandatoryInSpecialization <em>Mandatory In Specialization</em>}</li>
 *   <li>{@link eMF.impl.CourseImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link eMF.impl.CourseImpl#getMandatoryInProgramme <em>Mandatory In Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseName() <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseName()
	 * @generated
	 * @ordered
	 */
	protected String courseName = COURSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final Float CREDITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected Float credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandatoryInSpecialization() <em>Mandatory In Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryInSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization mandatoryInSpecialization;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<courseInSemester> course;

	/**
	 * The cached value of the '{@link #getMandatoryInProgramme() <em>Mandatory In Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryInProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme mandatoryInProgramme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseName() {
		return courseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseName(String newCourseName) {
		String oldCourseName = courseName;
		courseName = newCourseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE__COURSE_NAME, oldCourseName,
					courseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE__COURSE_CODE, oldCourseCode,
					courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(Float newCredits) {
		Float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getMandatoryInSpecialization() {
		if (mandatoryInSpecialization != null && mandatoryInSpecialization.eIsProxy()) {
			InternalEObject oldMandatoryInSpecialization = (InternalEObject) mandatoryInSpecialization;
			mandatoryInSpecialization = (Specialization) eResolveProxy(oldMandatoryInSpecialization);
			if (mandatoryInSpecialization != oldMandatoryInSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EMFPackage.COURSE__MANDATORY_IN_SPECIALIZATION, oldMandatoryInSpecialization,
							mandatoryInSpecialization));
			}
		}
		return mandatoryInSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetMandatoryInSpecialization() {
		return mandatoryInSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatoryInSpecialization(Specialization newMandatoryInSpecialization) {
		Specialization oldMandatoryInSpecialization = mandatoryInSpecialization;
		mandatoryInSpecialization = newMandatoryInSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE__MANDATORY_IN_SPECIALIZATION,
					oldMandatoryInSpecialization, mandatoryInSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<courseInSemester> getCourse() {
		if (course == null) {
			course = new EObjectWithInverseResolvingEList<courseInSemester>(courseInSemester.class, this,
					EMFPackage.COURSE__COURSE, EMFPackage.COURSE_IN_SEMESTER__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getMandatoryInProgramme() {
		if (mandatoryInProgramme != null && mandatoryInProgramme.eIsProxy()) {
			InternalEObject oldMandatoryInProgramme = (InternalEObject) mandatoryInProgramme;
			mandatoryInProgramme = (Programme) eResolveProxy(oldMandatoryInProgramme);
			if (mandatoryInProgramme != oldMandatoryInProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFPackage.COURSE__MANDATORY_IN_PROGRAMME,
							oldMandatoryInProgramme, mandatoryInProgramme));
			}
		}
		return mandatoryInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetMandatoryInProgramme() {
		return mandatoryInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatoryInProgramme(Programme newMandatoryInProgramme) {
		Programme oldMandatoryInProgramme = mandatoryInProgramme;
		mandatoryInProgramme = newMandatoryInProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.COURSE__MANDATORY_IN_PROGRAMME,
					oldMandatoryInProgramme, mandatoryInProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EMFPackage.COURSE__COURSE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCourse()).basicAdd(otherEnd, msgs);
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
		case EMFPackage.COURSE__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
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
		case EMFPackage.COURSE__COURSE_NAME:
			return getCourseName();
		case EMFPackage.COURSE__COURSE_CODE:
			return getCourseCode();
		case EMFPackage.COURSE__CREDITS:
			return getCredits();
		case EMFPackage.COURSE__MANDATORY_IN_SPECIALIZATION:
			if (resolve)
				return getMandatoryInSpecialization();
			return basicGetMandatoryInSpecialization();
		case EMFPackage.COURSE__COURSE:
			return getCourse();
		case EMFPackage.COURSE__MANDATORY_IN_PROGRAMME:
			if (resolve)
				return getMandatoryInProgramme();
			return basicGetMandatoryInProgramme();
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
		case EMFPackage.COURSE__COURSE_NAME:
			setCourseName((String) newValue);
			return;
		case EMFPackage.COURSE__COURSE_CODE:
			setCourseCode((String) newValue);
			return;
		case EMFPackage.COURSE__CREDITS:
			setCredits((Float) newValue);
			return;
		case EMFPackage.COURSE__MANDATORY_IN_SPECIALIZATION:
			setMandatoryInSpecialization((Specialization) newValue);
			return;
		case EMFPackage.COURSE__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends courseInSemester>) newValue);
			return;
		case EMFPackage.COURSE__MANDATORY_IN_PROGRAMME:
			setMandatoryInProgramme((Programme) newValue);
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
		case EMFPackage.COURSE__COURSE_NAME:
			setCourseName(COURSE_NAME_EDEFAULT);
			return;
		case EMFPackage.COURSE__COURSE_CODE:
			setCourseCode(COURSE_CODE_EDEFAULT);
			return;
		case EMFPackage.COURSE__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case EMFPackage.COURSE__MANDATORY_IN_SPECIALIZATION:
			setMandatoryInSpecialization((Specialization) null);
			return;
		case EMFPackage.COURSE__COURSE:
			getCourse().clear();
			return;
		case EMFPackage.COURSE__MANDATORY_IN_PROGRAMME:
			setMandatoryInProgramme((Programme) null);
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
		case EMFPackage.COURSE__COURSE_NAME:
			return COURSE_NAME_EDEFAULT == null ? courseName != null : !COURSE_NAME_EDEFAULT.equals(courseName);
		case EMFPackage.COURSE__COURSE_CODE:
			return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
		case EMFPackage.COURSE__CREDITS:
			return CREDITS_EDEFAULT == null ? credits != null : !CREDITS_EDEFAULT.equals(credits);
		case EMFPackage.COURSE__MANDATORY_IN_SPECIALIZATION:
			return mandatoryInSpecialization != null;
		case EMFPackage.COURSE__COURSE:
			return course != null && !course.isEmpty();
		case EMFPackage.COURSE__MANDATORY_IN_PROGRAMME:
			return mandatoryInProgramme != null;
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
		result.append(" (courseName: ");
		result.append(courseName);
		result.append(", courseCode: ");
		result.append(courseCode);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
