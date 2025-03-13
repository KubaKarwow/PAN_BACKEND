package com.example.medicalproject.services;

import com.example.medicalproject.Repositories.Circ_rnaRepository;
import com.example.medicalproject.models.Circ_rna;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetCircRNA {

    private final Circ_rnaRepository circRnaRepository;

    public GetCircRNA(Circ_rnaRepository circRnaRepository) {
        this.circRnaRepository = circRnaRepository;
    }

    public Circ_rna getCircRNA(Long id){

        Optional<Circ_rna> circ_rna = circRnaRepository.findById(id);

        return circ_rna.get();
    }
}
