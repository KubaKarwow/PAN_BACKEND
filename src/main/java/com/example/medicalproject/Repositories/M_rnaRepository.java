package com.example.medicalproject.Repositories;

import com.example.medicalproject.models.Circ_rna;
import com.example.medicalproject.models.M_rna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface M_rnaRepository extends JpaRepository<M_rna, Long> {
    List<M_rna> findByGeneSymbol(String geneSymbol);

}
