package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Lnc1;
import com.example.medicalproject.models.advancedSearch.Lnc2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Lnc2Repository extends JpaRepository<Lnc2, String> {
    default List<Lnc2> getAllRecords() {
        return findAll();
    }
}