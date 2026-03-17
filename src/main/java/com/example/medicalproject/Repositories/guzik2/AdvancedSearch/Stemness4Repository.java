package com.example.medicalproject.Repositories.guzik2.AdvancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ1;
import com.example.medicalproject.models.guzik2.Stemness.Stemness3;
import com.example.medicalproject.models.guzik2.Stemness.Stemness4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stemness4Repository extends JpaRepository<Stemness4, String> {
    default List<Stemness4> getAllRecords() {
        return findAll();
    }
}