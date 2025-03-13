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
    private Long index;
    @Column(name = "circ_rna")
    private String circRNA;
    @Column(name = "bt549_ctrl_raw")
    private String bt549CtrlRaw;
    @Column(name = "bt474_ctrl_raw")
    private String bt474CtrlRaw;
    @Column(name = "mda468_ctrl_raw")
    private String mda468CtrlRaw;
    @Column(name = "mda157_ctrl_raw")
    private String mda157CtrlRaw;
    @Column(name = "skbr3_ctrl_raw")
    private String skbr3CtrlRaw;
    @Column(name = "b02_ctrl_raw")
    private String b02CtrlRaw;
    @Column(name = "b05_ctrl_raw")
    private String b05CtrlRaw;
    @Column(name = "mda361_ctrl_raw")
    private String mda361CtrlRaw;
    @Column(name = "mcf10a_ctrl_raw")
    private String mcf10aCtrlRaw;
    @Column(name = "bt549_ctrl_norm")
    private String bt549CtrlNorm;
    @Column(name = "bt474_ctrl_norm")
    private String bt474CtrlNorm;
    @Column(name = "mda468_ctrl_norm")
    private String mda468CtrlNorm;
    @Column(name = "mda157_ctrl_norm")
    private String mda157CtrlNorm;
    @Column(name = "skbr3_ctrl_norm")
    private String skbr3CtrlNorm;
    @Column(name = "b02_ctrl_norm")
    private String b02CtrlNorm;
    @Column(name = "b05_ctrl_norm")
    private String b05CtrlNorm;
    @Column(name = "mda361_ctrl_norm")
    private String mda361CtrlNorm;
    @Column(name = "mcf10a_ctrl_norm")
    private String mcf10aCtrlNorm;
    @Column(name = "probe_id")
    private String probeId;
    private String alias;
    private String source;
    private String strand;
    @Column(name = "tx_start")
    private String txStart;
    @Column(name = "tx_end")
    private String txEnd;
    @Column(name = "circrna_type")
    private String circrnaType;
    @Column(name = "best_transcript")
    private String bestTranscript;
    @Column(name = "gene_symbol")
    private String geneSymbol;
    @Column(name = "probe_sequence")
    private String probeSequence;
    @Column(name = "circrna_length")
    private Long circrnaLength;
    private String mre1;
    private String mre2;
    private String mre3;
    private String mre4;
    private String mre5;


}
