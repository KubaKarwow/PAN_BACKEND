package com.example.medicalproject.controllers;

import com.example.medicalproject.services.AdvancedSearchService;
import com.example.medicalproject.services.GetLncRNA;
import com.example.medicalproject.services.GetCircRNA;
import com.example.medicalproject.services.GetMRNA;
import com.example.medicalproject.services.guzik2.AdvancedSearchService2;
import com.example.medicalproject.services.guzik2.ComparisonService2;
import com.example.medicalproject.services.guzik2.GetCircRNA2guzik;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/controller2")
public class Guzik2Controller {

    private final GetCircRNA2guzik getCircRNA;
    private final AdvancedSearchService2 advancedSearchService;
    private final ComparisonService2 comarationService;

    public Guzik2Controller(GetCircRNA2guzik getCircRNA, AdvancedSearchService2 advancedSearchService, ComparisonService2 comarationService) {
        this.getCircRNA = getCircRNA;
        this.advancedSearchService = advancedSearchService;
        this.comarationService = comarationService;
    }

    @GetMapping("/Comparison/{query}")
    public ResponseEntity<?> getProperComparisonData(@PathVariable String query) {
        return ResponseEntity.ok(comarationService.getProperTableData(query));
    }

    @GetMapping("/AdvancedSearch/{query}")
    public ResponseEntity<?> getProperTableData(@PathVariable String query) {
        return ResponseEntity.ok(advancedSearchService.getProperTableData(query));
    }

    // by GeneSymbol
    @GetMapping("/circByGeneName/{geneSymbol}")
    public ResponseEntity<?> getCircByGeneSymbol(@PathVariable String geneSymbol) {
        return ResponseEntity.ok(getCircRNA.getCircRNAsByGeneSymbol(geneSymbol));
    }

    // by GenomicPosition
    @GetMapping("/circByGenomicPosition/{chrom}/{tx_start}/{tx_end}")
    public ResponseEntity<?> getCircByGenomicPosition(@PathVariable String chrom, @PathVariable Long tx_start,@PathVariable Long tx_end) {
        return ResponseEntity.ok(getCircRNA.getCircRNAsByGenomicPosition(chrom,tx_start,tx_end));
    }

    @GetMapping("/circ/{id}")
    public ResponseEntity<?> getCirc(@PathVariable Long id) {
        return ResponseEntity.ok(getCircRNA.getCircRNA(id));
    }

    // By CircRNA
    @GetMapping("/circById/{circRna}")
    public ResponseEntity<?> getCircByCircRNA(@PathVariable String circRna) {
        return ResponseEntity.ok(getCircRNA.getCircRNAsByCircRnaOrAlias(circRna));
    }

}
