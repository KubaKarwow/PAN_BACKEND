package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.M1;
import com.example.medicalproject.models.advancedSearch.M2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface M2Repository extends JpaRepository<M2, String> {
    default List<M2> getAllRecords() {
        return findAll();
    }
}