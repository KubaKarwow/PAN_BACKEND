package com.example.medicalproject.Repositories.guzik2.Comparison;

import com.example.medicalproject.models.guzik2.comparison.Comparison2;
import com.example.medicalproject.models.guzik2.comparison.Comparison3;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Comparison2Repository extends JpaRepository<Comparison2, String> {
    default List<Comparison2> getAllRecords() {
        return findAll();
    }
}