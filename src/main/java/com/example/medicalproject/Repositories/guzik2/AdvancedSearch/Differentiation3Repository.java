package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Differentiation3Repository extends JpaRepository<Differentiation3, String> {
    default List<Differentiation3> getAllRecords() {
        return findAll();
    }
}