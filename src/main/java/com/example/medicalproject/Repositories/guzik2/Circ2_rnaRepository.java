package com.example.medicalproject.Repositories.guzik2;

import com.example.medicalproject.models.guzik2.Circ2guzik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Circ2_rnaRepository extends JpaRepository<Circ2guzik, Long> {
    List<Circ2guzik> findByCircrnaOrAliasCircBase(String circRna, String alias);
    List<Circ2guzik> findByHostGene(String geneSymbol);
    List<Circ2guzik> findByChromosomeAndStartSiteAndEndSite(String chrom, Long txStart, Long txEnd);
   // List<Circ_rna> findBy(String geneSymbol);
}
