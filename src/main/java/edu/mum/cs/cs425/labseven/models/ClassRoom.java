package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;
import java.util.StringJoiner;

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
