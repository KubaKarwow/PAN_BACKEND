package com.example.medicalproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "circ_rna")
@Data
public class Circ_rna {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "index")
    private Long index;

    @Column(name = "circ_rna", columnDefinition = "TEXT")
    private String circRna;

    @Column(name = "bt549_ctrl_raw", columnDefinition = "TEXT")
    private String bt549CtrlRaw;

    @Column(name = "hs578t_ctrl_raw", columnDefinition = "TEXT")
    private String hs578tCtrlRaw;

    @Column(name = "bt474_ctrl_raw", columnDefinition = "TEXT")
    private String bt474CtrlRaw;

    @Column(name = "mda468_ctrl_raw", columnDefinition = "TEXT")
    private String mda468CtrlRaw;

    @Column(name = "mda157_ctrl_raw", columnDefinition = "TEXT")
    private String mda157CtrlRaw;

    @Column(name = "skbr3_ctrl_raw", columnDefinition = "TEXT")
    private String skbr3CtrlRaw;

    @Column(name = "b02_ctrl_raw", columnDefinition = "TEXT")
    private String b02CtrlRaw;

    @Column(name = "b05_ctrl_raw", columnDefinition = "TEXT")
    private String b05CtrlRaw;

    @Column(name = "mda361_ctrl_raw", columnDefinition = "TEXT")
    private String mda361CtrlRaw;

    @Column(name = "mcf10a_ctrl_raw", columnDefinition = "TEXT")
    private String mcf10aCtrlRaw;

    @Column(name = "bt549_ctrl_norm", columnDefinition = "TEXT")
    private String bt549CtrlNorm;

    @Column(name = "hs578t_ctrl_norm", columnDefinition = "TEXT")
    private String hs578tCtrlNorm;

    @Column(name = "bt474_ctrl_norm", columnDefinition = "TEXT")
    private String bt474CtrlNorm;

    @Column(name = "mda468_ctrl_norm", columnDefinition = "TEXT")
    private String mda468CtrlNorm;

    @Column(name = "mda157_ctrl_norm", columnDefinition = "TEXT")
    private String mda157CtrlNorm;

    @Column(name = "skbr3_ctrl_norm", columnDefinition = "TEXT")
    private String skbr3CtrlNorm;

    @Column(name = "b02_ctrl_norm", columnDefinition = "TEXT")
    private String b02CtrlNorm;

    @Column(name = "b05_ctrl_norm", columnDefinition = "TEXT")
    private String b05CtrlNorm;

    @Column(name = "mda361_ctrl_norm", columnDefinition = "TEXT")
    private String mda361CtrlNorm;

    @Column(name = "mcf10a_ctrl_norm", columnDefinition = "TEXT")
    private String mcf10aCtrlNorm;

    @Column(name = "probe_id", columnDefinition = "TEXT")
    private String probeId;

    @Column(columnDefinition = "TEXT")
    private String alias;

    @Column(columnDefinition = "TEXT")
    private String source;

    @Column(columnDefinition = "TEXT")
    private String chrom;

    @Column(columnDefinition = "TEXT")
    private String strand;

    @Column(name = "tx_start")
    private Long txStart;

    @Column(name = "tx_end")
    private Long txEnd;

    @Column(name = "circrna_type", columnDefinition = "TEXT")
    private String circrnaType;

    @Column(name = "best_transcript", columnDefinition = "TEXT")
    private String bestTranscript;

    @Column(name = "gene_symbol", columnDefinition = "TEXT")
    private String geneSymbol;

    @Column(name = "probe_sequence", columnDefinition = "TEXT")
    private String probeSequence;

    @Column(name = "circrna_length")
    private Long circrnaLength;

    @Column(name = "mre1", columnDefinition = "TEXT")
    private String mre1;

    @Column(name = "mre2", columnDefinition = "TEXT")
    private String mre2;

    @Column(name = "mre3", columnDefinition = "TEXT")
    private String mre3;

    @Column(name = "mre4", columnDefinition = "TEXT")
    private String mre4;

    @Column(name = "mre5", columnDefinition = "TEXT")
    private String mre5;
}