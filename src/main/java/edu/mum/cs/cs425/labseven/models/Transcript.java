package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;
import java.util.StringJoiner;

@Entity
@Table(name = "TRANSCRIPTS")
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transcript_id")
    private Long transcriptId;

    @Column(name = "degree_title")
    private String degreeTitle;


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
