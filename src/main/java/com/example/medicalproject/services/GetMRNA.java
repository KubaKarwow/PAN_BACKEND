package com.example.medicalproject.services;

import com.example.medicalproject.Repositories.M_rnaRepository;
import com.example.medicalproject.models.Lnc_rna;
import com.example.medicalproject.models.M_rna;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetMRNA {

    private final M_rnaRepository mRnaRepository;

    public GetMRNA(M_rnaRepository mRnaRepository) {
        this.mRnaRepository = mRnaRepository;
    }

    public M_rna getMRNA(Long id) {

        Optional<M_rna> mRna = mRnaRepository.findById(id);

        return mRna.get();
    }

    public List<M_rna> getLNCRNAsByGeneSymbol(String geneName) {
        return mRnaRepository.findByGeneSymbol(geneName);
    }
}
