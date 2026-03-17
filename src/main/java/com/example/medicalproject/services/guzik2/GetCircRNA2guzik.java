package com.example.medicalproject.services.guzik2;

import com.example.medicalproject.Repositories.guzik2.Circ2_rnaRepository;
import com.example.medicalproject.models.Circ_rna;
import com.example.medicalproject.models.guzik2.Circ2guzik;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetCircRNA2guzik {

    private final Circ2_rnaRepository circRnaRepository;

    public GetCircRNA2guzik(Circ2_rnaRepository circRnaRepository) {
        this.circRnaRepository = circRnaRepository;
    }

    public Circ2guzik getCircRNA(Long id) {

        Optional<Circ2guzik> circ_rna = circRnaRepository.findById(id);

        return circ_rna.get();
    }

    public List<Circ2guzik> getCircRNAsByGenomicPosition(String chrom, Long tx_start, Long tx_end) {
        return circRnaRepository.findByChromosomeAndStartSiteAndEndSite(chrom,tx_start,tx_end);
    }

    public List<Circ2guzik> getCircRNAsByCircRnaOrAlias(String circRna) {
        return circRnaRepository.findByCircrnaOrAliasCircBase(circRna,circRna);
    }

    public List<Circ2guzik> getCircRNAsByGeneSymbol(String geneName) {
        return circRnaRepository.findByHostGene(geneName);
    }
}
