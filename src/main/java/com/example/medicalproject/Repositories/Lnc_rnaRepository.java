package com.example.medicalproject.Repositories;

import com.example.medicalproject.models.Lnc_rna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Lnc_rnaRepository extends JpaRepository<Lnc_rna, Long> {
    List<Lnc_rna> findByGeneSymbol(String geneName);
}
