package com.example.medicalproject.models.guzik2.differentiation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "differentiation_4")
public class Differentiation4 {
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

    @Column(name = "\"circRNA length\"")
    private Integer circRNALength;

    @Column(name = "\"Pleural metastasis and Breast-to-Brain metastasis_diff\"", length = Integer.MAX_VALUE)
    private String pleuralMetastasisAndBreastToBrainMetastasisDiff;

    @Column(name = "\"Primary cancer_diff\"", length = Integer.MAX_VALUE)
    private String primaryCancerDiff;

    @Column(name = "mda468_diff", length = Integer.MAX_VALUE)
    private String mda468Diff;

    @Column(name = "mda157_diff", length = Integer.MAX_VALUE)
    private String mda157Diff;

    @Column(name = "skbr3_diff", length = Integer.MAX_VALUE)
    private String skbr3Diff;

    @Column(name = "b02_diff", length = Integer.MAX_VALUE)
    private String b02Diff;

    @Column(name = "b05_diff", length = Integer.MAX_VALUE)
    private String b05Diff;

    @Column(name = "mda361_diff", length = Integer.MAX_VALUE)
    private String mda361Diff;

    @Column(name = "bt549_diff", length = Integer.MAX_VALUE)
    private String bt549Diff;

    @Column(name = "hs578t_diff", length = Integer.MAX_VALUE)
    private String hs578tDiff;

    @Column(name = "bt474_diff", length = Integer.MAX_VALUE)
    private String bt474Diff;

}