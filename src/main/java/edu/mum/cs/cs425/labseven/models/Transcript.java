package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;
import java.util.StringJoiner;

/**
 * The type Transcript.
 * @author nduwayofabrice
 */
@Entity
@Table(name = "TRANSCRIPTS")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transcript_id")
    private Long transcriptId;

    @Column(name = "degree_title")
    private String degreeTitle;

    /**
     * Gets transcript id.
     *
     * @return the transcript id
     */
    public Long getTranscriptId() {
        return transcriptId;
    }

    /**
     * Sets transcript id.
     *
     * @param transcriptId the transcript id
     */
    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    /**
     * Gets degree title.
     *
     * @return the degree title
     */
    public String getDegreeTitle() {
        return degreeTitle;
    }

    /**
     * Sets degree title.
     *
     * @param degreeTitle the degree title
     */
    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    /**
     * Instantiates a new Transcript.
     *
     * @param degreeTitle the degree title
     */
    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Transcript.class.getSimpleName() + "[", "]")
                .add("transcriptId=" + transcriptId)
                .add("degreeTitle='" + degreeTitle + "'")
                .toString();
    }

}
