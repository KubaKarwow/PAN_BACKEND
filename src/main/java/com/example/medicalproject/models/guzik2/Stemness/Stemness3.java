package com.example.medicalproject.models.guzik2.Stemness;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stemness_3")
public class Stemness3 {
    @Id
    @Column(name = "circrna", length = Integer.MAX_VALUE)
    private String circrna;

    @Column(name = "\"P-value\"", length = Integer.MAX_VALUE)
    private String pValue;

    @Column(name = "\"-Log10(pvalue)\"", length = Integer.MAX_VALUE)
    private String Log10Pvalue;

    @Column(name = "\"FC (abs)\"", length = Integer.MAX_VALUE)
    private String fCAbs;

    @Column(name = "log2fc", length = Integer.MAX_VALUE)
    private String log2fc;

    @Column(name = "regulation", length = Integer.MAX_VALUE)
    private String regulation;

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
    private Integer startSite;

    @Column(name = "\"End site\"")
    private Integer endSite;

    @Column(name = "\"circRNA type\"", length = Integer.MAX_VALUE)
    private String circRNAType;

    @Column(name = "\"Best transcript\"", length = Integer.MAX_VALUE)
    private String bestTranscript;

    @Column(name = "\"Host gene\"", length = Integer.MAX_VALUE)
    private String hostGene;

    @Column(name = "\"Probe sequence\"", length = Integer.MAX_VALUE)
    private String probeSequence;

    @Column(name = "\"circRNA length\"", length = Integer.MAX_VALUE)
    private String circRNALength;

    @Column(name = "\"Breast-to-Brain metastasis_stem\"", length = Integer.MAX_VALUE)
    private String breastToBrainMetastasisStem;

    @Column(name = "\"Pleural metastasis_stem\"", length = Integer.MAX_VALUE)
    private String pleuralMetastasisStem;

    @Column(name = "b02_stem", length = Integer.MAX_VALUE)
    private String b02Stem;

    @Column(name = "b05_stem", length = Integer.MAX_VALUE)
    private String b05Stem;

    @Column(name = "mda361_stem", length = Integer.MAX_VALUE)
    private String mda361Stem;

    @Column(name = "mda468_stem", length = Integer.MAX_VALUE)
    private String mda468Stem;

    @Column(name = "mda157_stem", length = Integer.MAX_VALUE)
    private String mda157Stem;

    @Column(name = "skbr3_stem", length = Integer.MAX_VALUE)
    private String skbr3Stem;

}