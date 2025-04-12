package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.M1;
import com.example.medicalproject.models.advancedSearch.M2;
import com.example.medicalproject.models.advancedSearch.M3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface M3Repository extends JpaRepository<M3, String> {
    default List<M3> getAllRecords() {
        return findAll();
    }
}