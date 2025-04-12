package com.example.medicalproject.services;

import com.example.medicalproject.Repositories.M_rnaRepository;
import com.example.medicalproject.Repositories.advancedSearch.*;
import com.example.medicalproject.models.M_rna;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvancedSearchService {

    private final Circ1Repository circ1Repository;
    private final Circ2Repository circ2Repository;
    private final Circ3Repository circ3Repository;
    private final Circ4Repository circ4Repository;
    private final Lnc1Repository lnc1Repository;
    private final Lnc2Repository lnc2Repository;
    private final Lnc3Repository lnc3Repository;
    private final Lnc4Repository lnc4Repository;
    private final M1Repository m1Repository;
    private final M2Repository m2Repository;
    private final M3Repository m3Repository;
    private final M4Repository m4Repository;

    public AdvancedSearchService(Circ1Repository circ1Repository, Circ2Repository circ2Repository, Circ3Repository circ3Repository, Circ4Repository circ4Repository, Lnc1Repository lnc1Repository, Lnc2Repository lnc2Repository, Lnc3Repository lnc3Repository, Lnc4Repository lnc4Repository, M1Repository m1Repository, M2Repository m2Repository, M3Repository m3Repository, M4Repository m4Repository) {
        this.circ1Repository = circ1Repository;
        this.circ2Repository = circ2Repository;
        this.circ3Repository = circ3Repository;
        this.circ4Repository = circ4Repository;
        this.lnc1Repository = lnc1Repository;
        this.lnc2Repository = lnc2Repository;
        this.lnc3Repository = lnc3Repository;
        this.lnc4Repository = lnc4Repository;
        this.m1Repository = m1Repository;
        this.m2Repository = m2Repository;
        this.m3Repository = m3Repository;
        this.m4Repository = m4Repository;
    }

    public <T> List<T> getProperTableData(String tableName) {
        switch (tableName) {
            // Circ cases
            case "circ1":
                return (List<T>) circ1Repository.getAllRecords();
            case "circ2":
                return (List<T>) circ2Repository.getAllRecords();
            case "circ3":
                return (List<T>) circ3Repository.getAllRecords();
            case "circ4":
                return (List<T>) circ4Repository.getAllRecords();

            // Lnc cases
            case "lnc1":
                return (List<T>) lnc1Repository.getAllRecords();
            case "lnc2":
                return (List<T>) lnc2Repository.getAllRecords();
            case "lnc3":
                return (List<T>) lnc3Repository.getAllRecords();
            case "lnc4":
                return (List<T>) lnc4Repository.getAllRecords();

            // M cases
            case "m1":
                return (List<T>) m1Repository.getAllRecords();
            case "m2":
                return (List<T>) m2Repository.getAllRecords();
            case "m3":
                return (List<T>) m3Repository.getAllRecords();
            case "m4":
                return (List<T>) m4Repository.getAllRecords();

            default:
                throw new IllegalArgumentException("Unknown table name: " + tableName);
        }
    }

}
