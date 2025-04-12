package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.advancedSearch.Circ3;
import com.example.medicalproject.models.advancedSearch.Circ4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Circ4Repository extends JpaRepository<Circ4, String> {
    default List<Circ4> getAllRecords() {
        return findAll();
    }
}