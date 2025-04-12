package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Lnc1;
import com.example.medicalproject.models.advancedSearch.Lnc3;
import com.example.medicalproject.models.advancedSearch.Lnc4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Lnc4Repository extends JpaRepository<Lnc4, String> {
    default List<Lnc4> getAllRecords() {
        return findAll();
    }
}