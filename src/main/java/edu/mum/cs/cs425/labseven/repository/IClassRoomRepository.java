package edu.mum.cs.cs425.labseven.repository;

import edu.mum.cs.cs425.labseven.models.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassRoomRepository extends JpaRepository<ClassRoom, Long> {
}
