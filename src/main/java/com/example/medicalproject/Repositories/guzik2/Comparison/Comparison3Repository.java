package com.example.medicalproject.Repositories.guzik2.Comparison;

import com.example.medicalproject.models.guzik2.comparison.Comparison3;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Comparison3Repository extends JpaRepository<Comparison3, String> {
    default List<Comparison3> getAllRecords() {
        return findAll();
    }
}