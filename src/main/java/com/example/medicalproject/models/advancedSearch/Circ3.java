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
@Table(name = "circ_3")
public class Circ3 {
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

    @Column(name = "\"Breast-to-Brain metastasis\"", length = Integer.MAX_VALUE)
    private String breastToBrainMetastasis;

    @Column(name = "\"Pleural metastasis\"", length = Integer.MAX_VALUE)
    private String pleuralMetastasis;

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

}