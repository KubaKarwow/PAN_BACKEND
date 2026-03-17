package com.example.medicalproject.services.guzik2;

import com.example.medicalproject.Repositories.advancedSearch.*;
import com.example.medicalproject.Repositories.guzik2.AdvancedSearch.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvancedSearchService2 {

    private final Differentiation1Repository circ1Repository;
    private final Differentiation2Repository circ2Repository;
    private final Differentiation3Repository circ3Repository;
    private final Differentiation4Repository circ4Repository;
    private final Stemness1Repository lnc1Repository;
    private final Stemness2Repository lnc2Repository;
    private final Stemness3Repository lnc3Repository;
    private final Stemness4Repository lnc4Repository;


    public AdvancedSearchService2(Differentiation1Repository circ1Repository, Differentiation2Repository circ2Repository, Differentiation3Repository circ3Repository, Differentiation4Repository circ4Repository, Stemness1Repository lnc1Repository, Stemness2Repository lnc2Repository, Stemness3Repository lnc3Repository, Stemness4Repository lnc4Repository) {
        this.circ1Repository = circ1Repository;
        this.circ2Repository = circ2Repository;
        this.circ3Repository = circ3Repository;
        this.circ4Repository = circ4Repository;
        this.lnc1Repository = lnc1Repository;
        this.lnc2Repository = lnc2Repository;
        this.lnc3Repository = lnc3Repository;
        this.lnc4Repository = lnc4Repository;
    }

    public <T> List<T> getProperTableData(String tableName) {
        switch (tableName) {
            // Circ cases
            case "stemness1":
                return (List<T>) circ1Repository.getAllRecords();
            case "stemness2":
                return (List<T>) circ2Repository.getAllRecords();
            case "stemness3":
                return (List<T>) circ3Repository.getAllRecords();
            case "stemness4":
                return (List<T>) circ4Repository.getAllRecords();

            // Lnc cases
            case "differentiation1":
                return (List<T>) lnc1Repository.getAllRecords();
            case "differentiation2":
                return (List<T>) lnc2Repository.getAllRecords();
            case "differentiation3":
                return (List<T>) lnc3Repository.getAllRecords();
            case "differentiation4":
                return (List<T>) lnc4Repository.getAllRecords();

            default:
                throw new IllegalArgumentException("Unknown table name: " + tableName);
        }
    }

}
