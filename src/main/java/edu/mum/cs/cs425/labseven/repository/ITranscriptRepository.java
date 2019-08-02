package edu.mum.cs.cs425.labseven.repository;

import edu.mum.cs.cs425.labseven.models.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Transcript repository.
 * @author nduwayofabrice
 */
@Repository
public interface ITranscriptRepository extends JpaRepository<Transcript, Long> {
}
