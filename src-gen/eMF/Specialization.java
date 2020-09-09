/**
 */
package eMF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eMF.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link eMF.Specialization#getSpecializationInSemester <em>Specialization In Semester</em>}</li>
 *   <li>{@link eMF.Specialization#getRequiredSpecialization <em>Required Specialization</em>}</li>
 *   <li>{@link eMF.Specialization#getSpecializationInProgramme <em>Specialization In Programme</em>}</li>
 * </ul>
 *
 * @see eMF.EMFPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eMF.EMFPackage#getSpecialization_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eMF.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialization In Semester</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eMF.Semester#getSpecializtaion <em>Specializtaion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization In Semester</em>' reference.
	 * @see #setSpecializationInSemester(Semester)
	 * @see eMF.EMFPackage#getSpecialization_SpecializationInSemester()
	 * @see eMF.Semester#getSpecializtaion
	 * @model opposite="specializtaion"
	 * @generated
	 */
	Semester getSpecializationInSemester();

	/**
	 * Sets the value of the '{@link eMF.Specialization#getSpecializationInSemester <em>Specialization In Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization In Semester</em>' reference.
	 * @see #getSpecializationInSemester()
	 * @generated
	 */
	void setSpecializationInSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Required Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Specialization</em>' reference.
	 * @see #setRequiredSpecialization(Specialization)
	 * @see eMF.EMFPackage#getSpecialization_RequiredSpecialization()
	 * @model
	 * @generated
	 */
	Specialization getRequiredSpecialization();

	/**
	 * Sets the value of the '{@link eMF.Specialization#getRequiredSpecialization <em>Required Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Specialization</em>' reference.
	 * @see #getRequiredSpecialization()
	 * @generated
	 */
	void setRequiredSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Specialization In Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization In Programme</em>' reference.
	 * @see #setSpecializationInProgramme(Programme)
	 * @see eMF.EMFPackage#getSpecialization_SpecializationInProgramme()
	 * @model
	 * @generated
	 */
	Programme getSpecializationInProgramme();

	/**
	 * Sets the value of the '{@link eMF.Specialization#getSpecializationInProgramme <em>Specialization In Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization In Programme</em>' reference.
	 * @see #getSpecializationInProgramme()
	 * @generated
	 */
	void setSpecializationInProgramme(Programme value);

} // Specialization
