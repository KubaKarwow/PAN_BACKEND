package com.example.medicalproject.Repositories;

import com.example.medicalproject.models.Circ_rna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Circ_rnaRepository extends JpaRepository<Circ_rna, Long> {
}
