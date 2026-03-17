package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.Stemness.Stemness1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stemness1Repository extends JpaRepository<Stemness1, String> {
    default List<Stemness1> getAllRecords() {
        return findAll();
    }
}