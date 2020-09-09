/**
 */
package eMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eMF.EMFFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface EMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eMF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eMF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFPackage eINSTANCE = eMF.impl.EMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link eMF.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.impl.ProgrammeImpl
	 * @see eMF.impl.EMFPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__YEARS = 1;

	/**
	 * The feature id for the '<em><b>Number Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NUMBER_OF_YEARS = 2;

	/**
	 * The feature id for the '<em><b>Achieved Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__ACHIEVED_CREDITS = 3;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMF.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.impl.SemesterImpl
	 * @see eMF.impl.EMFPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Semester In Year</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_IN_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Specializtaion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SPECIALIZTAION = 3;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMF.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.impl.YearImpl
	 * @see eMF.impl.EMFPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 2;

	/**
	 * The feature id for the '<em><b>Year Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__YEAR_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Number Of Semesters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__NUMBER_OF_SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Year In Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__YEAR_IN_PROGRAMME = 3;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMF.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.impl.CourseImpl
	 * @see eMF.impl.EMFPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Mandatory In Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MANDATORY_IN_SPECIALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE = 4;

	/**
	 * The feature id for the '<em><b>Mandatory In Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MANDATORY_IN_PROGRAMME = 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMF.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.impl.SpecializationImpl
	 * @see eMF.impl.EMFPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialization In Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATION_IN_SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Required Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__REQUIRED_SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Specialization In Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME = 3;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eMF.impl.courseInSemesterImpl <em>course In Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eMF.impl.courseInSemesterImpl
	 * @see eMF.impl.EMFPackageImpl#getcourseInSemester()
	 * @generated
	 */
	int COURSE_IN_SEMESTER = 5;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Course In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__COURSE_IN = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__COURSE = 3;

	/**
	 * The number of structural features of the '<em>course In Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>course In Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Grade</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see eMF.impl.EMFPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 6;

	/**
	 * Returns the meta object for class '{@link eMF.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see eMF.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eMF.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eMF.Programme#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Years</em>'.
	 * @see eMF.Programme#getYears()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Years();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Programme#getNumberOfYears <em>Number Of Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Years</em>'.
	 * @see eMF.Programme#getNumberOfYears()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_NumberOfYears();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Programme#getAchievedCredits <em>Achieved Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Achieved Credits</em>'.
	 * @see eMF.Programme#getAchievedCredits()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_AchievedCredits();

	/**
	 * Returns the meta object for class '{@link eMF.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see eMF.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Semester#getSemesterNumber <em>Semester Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Number</em>'.
	 * @see eMF.Semester#getSemesterNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterNumber();

	/**
	 * Returns the meta object for the reference list '{@link eMF.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see eMF.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for the container reference '{@link eMF.Semester#getSemesterInYear <em>Semester In Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester In Year</em>'.
	 * @see eMF.Semester#getSemesterInYear()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_SemesterInYear();

	/**
	 * Returns the meta object for the reference '{@link eMF.Semester#getSpecializtaion <em>Specializtaion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializtaion</em>'.
	 * @see eMF.Semester#getSpecializtaion()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Specializtaion();

	/**
	 * Returns the meta object for class '{@link eMF.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see eMF.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Year#getYearNumber <em>Year Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Number</em>'.
	 * @see eMF.Year#getYearNumber()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_YearNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link eMF.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see eMF.Year#getSemesters()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Year#getNumberOfSemesters <em>Number Of Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Semesters</em>'.
	 * @see eMF.Year#getNumberOfSemesters()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_NumberOfSemesters();

	/**
	 * Returns the meta object for the container reference '{@link eMF.Year#getYearInProgramme <em>Year In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Year In Programme</em>'.
	 * @see eMF.Year#getYearInProgramme()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_YearInProgramme();

	/**
	 * Returns the meta object for class '{@link eMF.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see eMF.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see eMF.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see eMF.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see eMF.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the reference '{@link eMF.Course#getMandatoryInSpecialization <em>Mandatory In Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory In Specialization</em>'.
	 * @see eMF.Course#getMandatoryInSpecialization()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_MandatoryInSpecialization();

	/**
	 * Returns the meta object for the reference list '{@link eMF.Course#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see eMF.Course#getCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Course();

	/**
	 * Returns the meta object for the reference '{@link eMF.Course#getMandatoryInProgramme <em>Mandatory In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory In Programme</em>'.
	 * @see eMF.Course#getMandatoryInProgramme()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_MandatoryInProgramme();

	/**
	 * Returns the meta object for class '{@link eMF.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see eMF.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link eMF.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eMF.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the reference '{@link eMF.Specialization#getSpecializationInSemester <em>Specialization In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization In Semester</em>'.
	 * @see eMF.Specialization#getSpecializationInSemester()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SpecializationInSemester();

	/**
	 * Returns the meta object for the reference '{@link eMF.Specialization#getRequiredSpecialization <em>Required Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Specialization</em>'.
	 * @see eMF.Specialization#getRequiredSpecialization()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_RequiredSpecialization();

	/**
	 * Returns the meta object for the reference '{@link eMF.Specialization#getSpecializationInProgramme <em>Specialization In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialization In Programme</em>'.
	 * @see eMF.Specialization#getSpecializationInProgramme()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SpecializationInProgramme();

	/**
	 * Returns the meta object for class '{@link eMF.courseInSemester <em>course In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>course In Semester</em>'.
	 * @see eMF.courseInSemester
	 * @generated
	 */
	EClass getcourseInSemester();

	/**
	 * Returns the meta object for the attribute '{@link eMF.courseInSemester#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see eMF.courseInSemester#isMandatory()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EAttribute getcourseInSemester_Mandatory();

	/**
	 * Returns the meta object for the reference '{@link eMF.courseInSemester#getCourseIn <em>Course In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course In</em>'.
	 * @see eMF.courseInSemester#getCourseIn()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EReference getcourseInSemester_CourseIn();

	/**
	 * Returns the meta object for the attribute '{@link eMF.courseInSemester#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see eMF.courseInSemester#getLevel()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EAttribute getcourseInSemester_Level();

	/**
	 * Returns the meta object for the reference '{@link eMF.courseInSemester#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see eMF.courseInSemester#getCourse()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EReference getcourseInSemester_Course();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grade</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        extendedMetaData="enumeration='A B C D E F'"
	 * @generated
	 */
	EDataType getGrade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EMFFactory getEMFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eMF.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMF.impl.ProgrammeImpl
		 * @see eMF.impl.EMFPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__YEARS = eINSTANCE.getProgramme_Years();

		/**
		 * The meta object literal for the '<em><b>Number Of Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NUMBER_OF_YEARS = eINSTANCE.getProgramme_NumberOfYears();

		/**
		 * The meta object literal for the '<em><b>Achieved Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__ACHIEVED_CREDITS = eINSTANCE.getProgramme_AchievedCredits();

		/**
		 * The meta object literal for the '{@link eMF.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMF.impl.SemesterImpl
		 * @see eMF.impl.EMFPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_NUMBER = eINSTANCE.getSemester_SemesterNumber();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Semester In Year</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SEMESTER_IN_YEAR = eINSTANCE.getSemester_SemesterInYear();

		/**
		 * The meta object literal for the '<em><b>Specializtaion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SPECIALIZTAION = eINSTANCE.getSemester_Specializtaion();

		/**
		 * The meta object literal for the '{@link eMF.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMF.impl.YearImpl
		 * @see eMF.impl.EMFPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Year Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__YEAR_NUMBER = eINSTANCE.getYear_YearNumber();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__SEMESTERS = eINSTANCE.getYear_Semesters();

		/**
		 * The meta object literal for the '<em><b>Number Of Semesters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__NUMBER_OF_SEMESTERS = eINSTANCE.getYear_NumberOfSemesters();

		/**
		 * The meta object literal for the '<em><b>Year In Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__YEAR_IN_PROGRAMME = eINSTANCE.getYear_YearInProgramme();

		/**
		 * The meta object literal for the '{@link eMF.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMF.impl.CourseImpl
		 * @see eMF.impl.EMFPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Mandatory In Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__MANDATORY_IN_SPECIALIZATION = eINSTANCE.getCourse_MandatoryInSpecialization();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE = eINSTANCE.getCourse_Course();

		/**
		 * The meta object literal for the '<em><b>Mandatory In Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__MANDATORY_IN_PROGRAMME = eINSTANCE.getCourse_MandatoryInProgramme();

		/**
		 * The meta object literal for the '{@link eMF.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMF.impl.SpecializationImpl
		 * @see eMF.impl.EMFPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Specialization In Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIALIZATION_IN_SEMESTER = eINSTANCE.getSpecialization_SpecializationInSemester();

		/**
		 * The meta object literal for the '<em><b>Required Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__REQUIRED_SPECIALIZATION = eINSTANCE.getSpecialization_RequiredSpecialization();

		/**
		 * The meta object literal for the '<em><b>Specialization In Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIALIZATION_IN_PROGRAMME = eINSTANCE
				.getSpecialization_SpecializationInProgramme();

		/**
		 * The meta object literal for the '{@link eMF.impl.courseInSemesterImpl <em>course In Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eMF.impl.courseInSemesterImpl
		 * @see eMF.impl.EMFPackageImpl#getcourseInSemester()
		 * @generated
		 */
		EClass COURSE_IN_SEMESTER = eINSTANCE.getcourseInSemester();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_SEMESTER__MANDATORY = eINSTANCE.getcourseInSemester_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Course In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_IN_SEMESTER__COURSE_IN = eINSTANCE.getcourseInSemester_CourseIn();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_SEMESTER__LEVEL = eINSTANCE.getcourseInSemester_Level();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_IN_SEMESTER__COURSE = eINSTANCE.getcourseInSemester_Course();

		/**
		 * The meta object literal for the '<em>Grade</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Character
		 * @see eMF.impl.EMFPackageImpl#getGrade()
		 * @generated
		 */
		EDataType GRADE = eINSTANCE.getGrade();

	}

} //EMFPackage
