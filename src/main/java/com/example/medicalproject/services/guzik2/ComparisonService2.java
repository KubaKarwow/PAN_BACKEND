package com.example.medicalproject.services.guzik2;

import com.example.medicalproject.Repositories.advancedSearch.*;
import com.example.medicalproject.Repositories.guzik2.AdvancedSearch.*;
import com.example.medicalproject.Repositories.guzik2.Comparison.Comparison1Repository;
import com.example.medicalproject.Repositories.guzik2.Comparison.Comparison2Repository;
import com.example.medicalproject.Repositories.guzik2.Comparison.Comparison3Repository;
import com.example.medicalproject.models.guzik2.comparison.Comparison3;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComparisonService2 {

    private final Comparison1Repository circ1Repository;
    private final Comparison2Repository circ2Repository;
    private final Comparison3Repository circ3Repository;


    public ComparisonService2(Comparison1Repository circ1Repository, Comparison2Repository circ2Repository, Comparison3Repository circ3Repository) {
        this.circ1Repository = circ1Repository;
        this.circ2Repository = circ2Repository;
        this.circ3Repository = circ3Repository;
    }

    public <T> List<T> getProperTableData(String tableName) {
        switch (tableName) {
            // Circ cases
            case "1":
                return (List<T>) circ1Repository.getAllRecords();
            case "2":
                return (List<T>) circ2Repository.getAllRecords();
            case "3":
                return (List<T>) circ3Repository.getAllRecords();
            default:
                throw new IllegalArgumentException("Unknown table name: " + tableName);
        }
    }

}
