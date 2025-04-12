package com.example.medicalproject.models.advancedSearch;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lnc_4")
public class Lnc4 {
    @Id
    @Column(name = "\"Transcript ID\"", length = Integer.MAX_VALUE)
    private String transcriptID;

    @Column(name = "\"P-value\"", length = Integer.MAX_VALUE)
    private String pValue;

    @Column(name = "\"-Log10(pvalue)\"", length = Integer.MAX_VALUE)
    private String Log10Pvalue;

    @Column(name = "\"Fold Change\"", length = Integer.MAX_VALUE)
    private String foldChange;

    @Column(name = "log2fc", length = Integer.MAX_VALUE)
    private String log2fc;

    @Column(name = "regulation", length = Integer.MAX_VALUE)
    private String regulation;

    @Column(name = "\"Probe name\"", length = Integer.MAX_VALUE)
    private String probeName;

    @Column(name = "\"Gene ID\"", length = Integer.MAX_VALUE)
    private String geneID;

    @Column(name = "\"Gene symbol\"", length = Integer.MAX_VALUE)
    private String geneSymbol;

    @Column(name = "\"RNA type\"", length = Integer.MAX_VALUE)
    private String rNAType;

    @Column(name = "\"DHS type\"", length = Integer.MAX_VALUE)
    private String dHSType;

    @Column(name = "canonical", length = Integer.MAX_VALUE)
    private String canonical;

    @Column(name = "locus", length = Integer.MAX_VALUE)
    private String locus;

    @Column(name = "\"Subcellular localization\"", length = Integer.MAX_VALUE)
    private String subcellularLocalization;

    @Column(name = "source", length = Integer.MAX_VALUE)
    private String source;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "\"RNA length\"")
    private Integer rNALength;

    @Column(name = "\"Probe sequence\"", length = Integer.MAX_VALUE)
    private String probeSequence;

    @Column(name = "\"Transcription initiation regions conservation\"", length = Integer.MAX_VALUE)
    private String transcriptionInitiationRegionsConservation;

    @Column(name = "\"Exon conservation\"", length = Integer.MAX_VALUE)
    private String exonConservation;

    @Column(name = "relationship", length = Integer.MAX_VALUE)
    private String relationship;

    @Column(name = "\"Pleural metastasis and Breast-to-Brain metastasis\"", length = Integer.MAX_VALUE)
    private String pleuralMetastasisAndBreastToBrainMetastasis;

    @Column(name = "\"Primary cancer\"", length = Integer.MAX_VALUE)
    private String primaryCancer;

    @Column(name = "b02", length = Integer.MAX_VALUE)
    private String b02;

    @Column(name = "b05", length = Integer.MAX_VALUE)
    private String b05;

    @Column(name = "mda361", length = Integer.MAX_VALUE)
    private String mda361;

    @Column(name = "mda468", length = Integer.MAX_VALUE)
    private String mda468;

    @Column(name = "mda157", length = Integer.MAX_VALUE)
    private String mda157;

    @Column(name = "skbr3", length = Integer.MAX_VALUE)
    private String skbr3;

    @Column(name = "bt549", length = Integer.MAX_VALUE)
    private String bt549;

    @Column(name = "hs578t", length = Integer.MAX_VALUE)
    private String hs578t;

    @Column(name = "bt474", length = Integer.MAX_VALUE)
    private String bt474;

}