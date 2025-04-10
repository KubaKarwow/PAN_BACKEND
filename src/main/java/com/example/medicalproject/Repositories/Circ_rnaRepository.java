package com.example.medicalproject.Repositories;

import com.example.medicalproject.models.Circ_rna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Circ_rnaRepository extends JpaRepository<Circ_rna, Long> {
    List<Circ_rna> findByCircRna(String circRna);
    List<Circ_rna> findByGeneSymbol(String geneSymbol);
    List<Circ_rna> findByChromAndTxStartAndTxEnd(String chrom, long txStart, long txEnd);
   // List<Circ_rna> findBy(String geneSymbol);
}
