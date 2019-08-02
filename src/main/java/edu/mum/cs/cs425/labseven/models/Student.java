package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.StringJoiner;

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

    @OneToOne(fetch = FetchType.LAZY)
    private ClassRoom classRoom;


    public Student(String studentNumber, String firstName,
                   String lastName, Transcript transcript,
                   ClassRoom classRoom) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.transcript = transcript;
        this.classRoom = classRoom;
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
                .add("transcript=" + transcript)
                .add("classRoom=" + classRoom)
                .toString();
    }
}
