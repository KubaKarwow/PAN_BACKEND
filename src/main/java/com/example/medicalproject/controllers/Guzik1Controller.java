package com.example.medicalproject.controllers;

import com.example.medicalproject.services.AdvancedSearchService;
import com.example.medicalproject.services.GetLncRNA;
import com.example.medicalproject.services.GetCircRNA;
import com.example.medicalproject.services.GetMRNA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/controller")
public class Guzik1Controller {

    private final GetCircRNA getCircRNA;
    private final GetLncRNA getLncRNA;
    private final GetMRNA getMRNA;
    private final AdvancedSearchService advancedSearchService;

    public Guzik1Controller(GetCircRNA getCircRNA, GetLncRNA getLncRNA, GetMRNA getMRNA, AdvancedSearchService advancedSearchService) {
        this.getCircRNA = getCircRNA;
        this.getLncRNA = getLncRNA;
        this.getMRNA = getMRNA;
        this.advancedSearchService = advancedSearchService;
    }

    @GetMapping("/AdvancedSearch/{query}")
    public ResponseEntity<?> getProperTableData(@PathVariable String query) {
        return ResponseEntity.ok(advancedSearchService.getProperTableData(query));
    }

    //* *//
    @GetMapping("/LncByGeneName/{geneSymbol}")
    public ResponseEntity<?> getLncByGeneSymbol(@PathVariable String geneSymbol) {
        return ResponseEntity.ok(getLncRNA.getLNCRNAsByGeneSymbol(geneSymbol));
    }

    @GetMapping("/MByGeneName/{geneSymbol}")
    public ResponseEntity<?> getMByGeneSymbol(@PathVariable String geneSymbol) {
        return ResponseEntity.ok(getMRNA.getLNCRNAsByGeneSymbol(geneSymbol));
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

    // By CircRNA
    @GetMapping("/circById/{circRna}")
    public ResponseEntity<?> getCircByCircRNA(@PathVariable String circRna) {
        return ResponseEntity.ok(getCircRNA.getCircRNAsByCircRnaOrAlias(circRna));
    }

    @GetMapping("/circ/{id}")
    public ResponseEntity<?> getCirc(@PathVariable Long id) {
        return ResponseEntity.ok(getCircRNA.getCircRNA(id));
    }

    @GetMapping("/lnc/{id}")
    public ResponseEntity<?> getLnc(@PathVariable Long id) {
        return ResponseEntity.ok(getLncRNA.getLnc(id));
    }

    @GetMapping("/m/{id}")
    public ResponseEntity<?> getM(@PathVariable Long id) {
        return ResponseEntity.ok(getMRNA.getMRNA(id));
    }
}
