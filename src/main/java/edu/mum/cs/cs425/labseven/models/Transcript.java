package edu.mum.cs.cs425.labseven.models;

import javax.persistence.*;

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
}
