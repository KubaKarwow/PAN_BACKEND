package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Lnc4;
import com.example.medicalproject.models.advancedSearch.M1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface M1Repository extends JpaRepository<M1, String> {
    default List<M1> getAllRecords() {
        return findAll();
    }
}