package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.Stemness.Stemness1;
import com.example.medicalproject.models.guzik2.Stemness.Stemness2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stemness2Repository extends JpaRepository<Stemness2, String> {
    default List<Stemness2> getAllRecords() {
        return findAll();
    }
}