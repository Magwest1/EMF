/**
 */
package eMF.impl;

import eMF.EMFPackage;
import eMF.Programme;
import eMF.Year;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eMF.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link eMF.impl.ProgrammeImpl#getYears <em>Years</em>}</li>
 *   <li>{@link eMF.impl.ProgrammeImpl#getNumberOfYears <em>Number Of Years</em>}</li>
 *   <li>{@link eMF.impl.ProgrammeImpl#getAchievedCredits <em>Achieved Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
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
	 * The cached value of the '{@link #getYears() <em>Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYears()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> years;

	/**
	 * The default value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfYears() <em>Number Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfYears()
	 * @generated
	 * @ordered
	 */
	protected int numberOfYears = NUMBER_OF_YEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAchievedCredits() <em>Achieved Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievedCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float ACHIEVED_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAchievedCredits() <em>Achieved Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAchievedCredits()
	 * @generated
	 * @ordered
	 */
	protected float achievedCredits = ACHIEVED_CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFPackage.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Year> getYears() {
		if (years == null) {
			years = new EObjectContainmentWithInverseEList<Year>(Year.class, this, EMFPackage.PROGRAMME__YEARS,
					EMFPackage.YEAR__YEAR_IN_PROGRAMME);
		}
		return years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfYears(int newNumberOfYears) {
		int oldNumberOfYears = numberOfYears;
		numberOfYears = newNumberOfYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.PROGRAMME__NUMBER_OF_YEARS,
					oldNumberOfYears, numberOfYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAchievedCredits() {
		return achievedCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAchievedCredits(float newAchievedCredits) {
		float oldAchievedCredits = achievedCredits;
		achievedCredits = newAchievedCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFPackage.PROGRAMME__ACHIEVED_CREDITS,
					oldAchievedCredits, achievedCredits));
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
		case EMFPackage.PROGRAMME__YEARS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getYears()).basicAdd(otherEnd, msgs);
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
		case EMFPackage.PROGRAMME__YEARS:
			return ((InternalEList<?>) getYears()).basicRemove(otherEnd, msgs);
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
		case EMFPackage.PROGRAMME__NAME:
			return getName();
		case EMFPackage.PROGRAMME__YEARS:
			return getYears();
		case EMFPackage.PROGRAMME__NUMBER_OF_YEARS:
			return getNumberOfYears();
		case EMFPackage.PROGRAMME__ACHIEVED_CREDITS:
			return getAchievedCredits();
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
		case EMFPackage.PROGRAMME__NAME:
			setName((String) newValue);
			return;
		case EMFPackage.PROGRAMME__YEARS:
			getYears().clear();
			getYears().addAll((Collection<? extends Year>) newValue);
			return;
		case EMFPackage.PROGRAMME__NUMBER_OF_YEARS:
			setNumberOfYears((Integer) newValue);
			return;
		case EMFPackage.PROGRAMME__ACHIEVED_CREDITS:
			setAchievedCredits((Float) newValue);
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
		case EMFPackage.PROGRAMME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EMFPackage.PROGRAMME__YEARS:
			getYears().clear();
			return;
		case EMFPackage.PROGRAMME__NUMBER_OF_YEARS:
			setNumberOfYears(NUMBER_OF_YEARS_EDEFAULT);
			return;
		case EMFPackage.PROGRAMME__ACHIEVED_CREDITS:
			setAchievedCredits(ACHIEVED_CREDITS_EDEFAULT);
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
		case EMFPackage.PROGRAMME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EMFPackage.PROGRAMME__YEARS:
			return years != null && !years.isEmpty();
		case EMFPackage.PROGRAMME__NUMBER_OF_YEARS:
			return numberOfYears != NUMBER_OF_YEARS_EDEFAULT;
		case EMFPackage.PROGRAMME__ACHIEVED_CREDITS:
			return achievedCredits != ACHIEVED_CREDITS_EDEFAULT;
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
		result.append(", numberOfYears: ");
		result.append(numberOfYears);
		result.append(", achievedCredits: ");
		result.append(achievedCredits);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
