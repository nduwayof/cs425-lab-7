package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * The type Student.
 * @author nduwayofabrice
 */
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_number", nullable = false)
    private String studentNumber;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "cgpa")
    private Double cgpa;

    @Column(name = "date_of_enrollment")
    private LocalDate dateOfEnrollment;

    @OneToOne(fetch = FetchType.LAZY)
    private Transcript transcript;


    /**
     * Gets student id.
     *
     * @return the student id
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * Sets student id.
     *
     * @param studentId the student id
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets student number.
     *
     * @return the student number
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Sets student number.
     *
     * @param studentNumber the student number
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets middle name.
     *
     * @return the middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets middle name.
     *
     * @param middleName the middle name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets cgpa.
     *
     * @return the cgpa
     */
    public Double getCgpa() {
        return cgpa;
    }

    /**
     * Sets cgpa.
     *
     * @param cgpa the cgpa
     */
    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    /**
     * Gets date of enrollment.
     *
     * @return the date of enrollment
     */
    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    /**
     * Sets date of enrollment.
     *
     * @param dateOfEnrollment the date of enrollment
     */
    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    /**
     * Gets transcript.
     *
     * @return the transcript
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * Sets transcript.
     *
     * @param transcript the transcript
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * Instantiates a new Student.
     *
     * @param studentNumber the student number
     * @param firstName     the first name
     * @param lastName      the last name
     * @param transcript    the transcript
     */
    public Student(String studentNumber, String firstName,
                   String lastName, Transcript transcript) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.transcript = transcript;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("studentId=" + studentId)
                .add("studentNumber='" + studentNumber + "'")
                .add("firstName='" + firstName + "'")
                .add("middleName='" + middleName + "'")
                .add("lastName='" + lastName + "'")
                .add("cgpa=" + cgpa)
                .add("dateOfEnrollment=" + dateOfEnrollment)
                .add("transcript=" + transcript.toString())
                .toString();
    }
}
