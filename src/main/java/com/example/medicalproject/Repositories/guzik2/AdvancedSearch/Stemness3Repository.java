package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.Stemness.Stemness2;
import com.example.medicalproject.models.guzik2.Stemness.Stemness3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stemness3Repository extends JpaRepository<Stemness3, String> {
    default List<Stemness3> getAllRecords() {
        return findAll();
    }
}