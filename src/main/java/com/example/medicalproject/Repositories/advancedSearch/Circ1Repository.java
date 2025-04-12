package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Circ1Repository extends JpaRepository<Circ1, String> {
    default List<Circ1> getAllRecords() {
        return findAll();
    }
}