package com.example.medicalproject.Repositories.guzik2.Comparison;

import com.example.medicalproject.models.guzik2.comparison.Comparison1;
import com.example.medicalproject.models.guzik2.comparison.Comparison2;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Comparison1Repository extends JpaRepository<Comparison1, String> {
    default List<Comparison1> getAllRecords() {
        return findAll();
    }
}