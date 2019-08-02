package edu.mum.cs.cs425.labseven.repository;

import edu.mum.cs.cs425.labseven.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Student repository.
 * @author nduwayofabrice
 */
@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {
}
