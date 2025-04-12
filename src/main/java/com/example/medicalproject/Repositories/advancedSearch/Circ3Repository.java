package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.advancedSearch.Circ2;
import com.example.medicalproject.models.advancedSearch.Circ3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Circ3Repository extends JpaRepository<Circ3, String> {
    default List<Circ3> getAllRecords() {
        return findAll();
    }
}