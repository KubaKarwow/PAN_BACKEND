package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation3;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Differentiation4Repository extends JpaRepository<Differentiation4, String> {
    default List<Differentiation4> getAllRecords() {
        return findAll();
    }
}