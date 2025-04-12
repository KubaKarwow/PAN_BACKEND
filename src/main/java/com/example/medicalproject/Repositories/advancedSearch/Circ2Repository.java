package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.advancedSearch.Circ2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Circ2Repository extends JpaRepository<Circ2, String> {
    default List<Circ2> getAllRecords() {
        return findAll();
    }
}