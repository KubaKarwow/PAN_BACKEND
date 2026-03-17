package com.example.medicalproject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_rna")
public class M_rna {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long index;
    @Column(name = "transcript_id")
    private String transcriptId;
    @Column(name = "bt549_ctrl_raw")
    private String bt549_ctrl_raw;
    @Column(name = "hs578t_ctrl_raw")
    private String hs578t_ctrl_raw;
    @Column(name = "bt474_ctrl_norm")
    private String bt474_ctrl_norm;
    @Column(name = "mda468_ctrl_raw")
    private String mda468_ctrl_raw;
    @Column(name = "mda157_ctrl_raw")
    private String mda157_ctrl_raw;
    @Column(name = "skbr3_ctrl_raw")
    private String skbr3_ctrl_raw;
    @Column(name = "b02_ctrl_raw")
    private String b02_ctrl_raw;
    @Column(name = "b05_ctrl_raw")
    private String b05_ctrl_raw;
    @Column(name = "mda361_ctrl_raw")
    private String mda361_ctrl_raw;
    @Column(name = "mcf10a_ctrl_raw")
    private String mcf10a_ctrl_raw;
    @Column(name = "bt549_ctrl_norm")
    private String bt549_ctrl_norm;
    @Column(name = "hs578t_ctrl_norm")
    private String hs578t_ctrl_norm;
    @Column(name = "mda468_ctrl_norm")
    private String mda468_ctrl_norm;
    @Column(name = "mda157_ctrl_norm")
    private String mda157_ctrl_norm;
    @Column(name = "skbr3_ctrl_norm")
    private String skbr3_ctrl_norm;
    @Column(name = "b02_ctrl_norm")
    private String b02_ctrl_norm;
    @Column(name = "b05_ctrl_norm")
    private String b05_ctrl_norm;
    @Column(name = "mda361_ctrl_norm")
    private String mda361_ctrl_norm;
    @Column(name = "mcf10a_ctrl_norm")
    private String mcf10a_ctrl_norm;
    @Column(name = "probe_name")
    private String probe_name;
    @Column(name = "gene_id")
    private String gene_id;
    @Column(name = "gene_symbol", columnDefinition = "TEXT")
    private String geneSymbol;
    @Column(name = "lnc_rna_completeness")
    private String lnc_rna_completeness;
    @Column(name = "dhs_type")
    private String dhs_type;
    @Column(name = "canonical")
    private String canonical;
    @Column(name = "locus")
    private String locus;
    @Column(name = "chrom")
    private String chrom;
    @Column(name = "strand")
    private String strand;
    @Column(name = "tx_start")
    private String tx_start;
    @Column(name = "tx_end")
    private String tx_end;
    @Column(name = "disease_name")
    private String disease_name;
    @Column(name = "associated_cell_or_tissue")
    private String associated_cell_or_tissue;
    @Column(name = "subcellular_localization")
    private String subcellular_localization;
    @Column(name = "source")
    private String source;
    @Column(name = "description")
    private String description;
    @Column(name = "rna_length")
    private String rna_length;
    @Column(name = "sequence")
    private String sequence;
    @Column(name = "tir_conservation")
    private String tir_conservation;
    @Column(name = "exon_conservation")
    private String exon_conservation;
    @Column(name = "refseq_id")
    private String refseq_id;
}
