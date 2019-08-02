package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * The type Class room.
 * @author nduwayofabrice
 */
@Entity
@Table(name = "CLASS_ROOMS")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_room_id")
    private Long classRoomId;

    @Column(name = "building_name")
    private String buildingName;

    @Column(name = "room_number")
    private String roomNumber;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Student> students = new ArrayList<>();

    /**
     * Gets class room id.
     *
     * @return the class room id
     */
    public Long getClassRoomId() {
        return classRoomId;
    }

    /**
     * Sets class room id.
     *
     * @param classRoomId the class room id
     */
    public void setClassRoomId(Long classRoomId) {
        this.classRoomId = classRoomId;
    }

    /**
     * Gets building name.
     *
     * @return the building name
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets building name.
     *
     * @param buildingName the building name
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Gets room number.
     *
     * @return the room number
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets room number.
     *
     * @param roomNumber the room number
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Gets students.
     *
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Sets students.
     *
     * @param students the students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Instantiates a new Class room.
     *
     * @param buildingName the building name
     * @param roomNumber   the room number
     */
    public ClassRoom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ClassRoom.class.getSimpleName() + "[", "]")
                .add("classRoomId=" + classRoomId)
                .add("buildingName='" + buildingName + "'")
                .add("roomNumber='" + roomNumber + "'")
                .toString();
    }
}
