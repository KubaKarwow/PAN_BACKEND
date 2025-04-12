package com.example.medicalproject.Repositories.advancedSearch;

import com.example.medicalproject.models.advancedSearch.Circ4;
import com.example.medicalproject.models.advancedSearch.Lnc1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Lnc1Repository extends JpaRepository<Lnc1, String> {
    default List<Lnc1> getAllRecords() {
        return findAll();
    }
}