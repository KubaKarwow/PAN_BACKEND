package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.M1;
import com.example.medicalproject.models.advancedSearch.M3;
import com.example.medicalproject.models.advancedSearch.M4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface M4Repository extends JpaRepository<M4, String> {
    default List<M4> getAllRecords() {
        return findAll();
    }
}