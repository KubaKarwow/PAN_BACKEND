package com.example.medicalproject.services;

import com.example.medicalproject.Repositories.Lnc_rnaRepository;
import com.example.medicalproject.models.Circ_rna;
import com.example.medicalproject.models.Lnc_rna;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetLncRNA {

    private final Lnc_rnaRepository lncRnaRepository;

    public GetLncRNA(Lnc_rnaRepository lncRnaRepository) {
        this.lncRnaRepository = lncRnaRepository;
    }

    public Lnc_rna getLnc(Long id){

        Optional<Lnc_rna> lncRna = lncRnaRepository.findById(id);

        return lncRna.get();
    }
    public List<Lnc_rna> getLNCRNAsByGeneSymbol(String geneName) {
        return lncRnaRepository.findByGeneSymbol(geneName);
    }
}
