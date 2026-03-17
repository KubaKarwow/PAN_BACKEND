package com.example.medicalproject.models.guzik2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "circ2guzik")
public class Circ2guzik {
    @Id
    @Column(name="index")
    private long index;

    @Column(name = "circrna", length = Integer.MAX_VALUE)
    private String circrna;

    @Column(name = "\"BT549 stem\"", length = Integer.MAX_VALUE)
    private String bT549Stem;

    @Column(name = "\"Hs578T stem\"", length = Integer.MAX_VALUE)
    private String hs578TStem;

    @Column(name = "\"BT474 stem\"", length = Integer.MAX_VALUE)
    private String bT474Stem;

    @Column(name = "\"BT549 diff\"", length = Integer.MAX_VALUE)
    private String bT549Diff;

    @Column(name = "\"Hs578T diff\"", length = Integer.MAX_VALUE)
    private String hs578TDiff;

    @Column(name = "\"BT474 diff\"", length = Integer.MAX_VALUE)
    private String bT474Diff;

    @Column(name = "\"MDA468 stem\"", length = Integer.MAX_VALUE)
    private String mDA468Stem;

    @Column(name = "\"MDA157 stem\"", length = Integer.MAX_VALUE)
    private String mDA157Stem;

    @Column(name = "\"SKBR3 stem\"", length = Integer.MAX_VALUE)
    private String sKBR3Stem;

    @Column(name = "\"MDA468 diff\"", length = Integer.MAX_VALUE)
    private String mDA468Diff;

    @Column(name = "\"MDA157 diff\"", length = Integer.MAX_VALUE)
    private String mDA157Diff;

    @Column(name = "\"SKBR3 diff\"", length = Integer.MAX_VALUE)
    private String sKBR3Diff;

    @Column(name = "\"B02 stem\"", length = Integer.MAX_VALUE)
    private String b02Stem;

    @Column(name = "\"B05 stem\"", length = Integer.MAX_VALUE)
    private String b05Stem;

    @Column(name = "\"MDA361 stem\"", length = Integer.MAX_VALUE)
    private String mDA361Stem;

    @Column(name = "\"B02 diff\"", length = Integer.MAX_VALUE)
    private String b02Diff;

    @Column(name = "\"B05 diff\"", length = Integer.MAX_VALUE)
    private String b05Diff;

    @Column(name = "\"MDA361 diff\"", length = Integer.MAX_VALUE)
    private String mDA361Diff;

    @Column(name = "\"MCF10A stem\"", length = Integer.MAX_VALUE)
    private String mCF10AStem;

    @Column(name = "\"MCF10A diff\"", length = Integer.MAX_VALUE)
    private String mCF10ADiff;

    @Column(name = "\"probe ID\"", length = Integer.MAX_VALUE)
    private String probeID;

    @Column(name = "\"Alias (circBase)\"", length = Integer.MAX_VALUE)
    private String aliasCircBase;

    @Column(name = "source", length = Integer.MAX_VALUE)
    private String source;

    @Column(name = "chromosome", length = Integer.MAX_VALUE)
    private String chromosome;

    @Column(name = "strand", length = Integer.MAX_VALUE)
    private String strand;

    @Column(name = "\"Start site\"")
    private Long startSite;

    @Column(name = "\"End site\"")
    private Long endSite;

    @Column(name = "\"circRNA type\"", length = Integer.MAX_VALUE)
    private String circRNAType;

    @Column(name = "\"Best transcript\"", length = Integer.MAX_VALUE)
    private String bestTranscript;

    @Column(name = "\"Host gene\"", length = Integer.MAX_VALUE)
    private String hostGene;

    @Column(name = "\"Probe Sequence\"", length = Integer.MAX_VALUE)
    private String probeSequence;

    @Column(name = "\"circRNA length\"", length = Integer.MAX_VALUE)
    private String circRNALength;

    @Column(name = "mre1", length = Integer.MAX_VALUE)
    private String mre1;

    @Column(name = "mre2", length = Integer.MAX_VALUE)
    private String mre2;

    @Column(name = "mre3", length = Integer.MAX_VALUE)
    private String mre3;

    @Column(name = "mre4", length = Integer.MAX_VALUE)
    private String mre4;

    @Column(name = "mre5", length = Integer.MAX_VALUE)
    private String mre5;

    @Column(name = "\"Genomic position\"", length = Integer.MAX_VALUE)
    private String genomicPosition;

}