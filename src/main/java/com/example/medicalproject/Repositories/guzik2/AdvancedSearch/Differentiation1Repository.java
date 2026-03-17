package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.differentiation.Differentiation1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Differentiation1Repository extends JpaRepository<Differentiation1, String> {
    default List<Differentiation1> getAllRecords() {
        return findAll();
    }
}