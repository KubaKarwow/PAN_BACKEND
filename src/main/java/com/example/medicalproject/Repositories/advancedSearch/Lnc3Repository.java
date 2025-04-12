package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Lnc1;
import com.example.medicalproject.models.advancedSearch.Lnc3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Lnc3Repository extends JpaRepository<Lnc3, String> {
    default List<Lnc3> getAllRecords() {
        return findAll();
    }
}