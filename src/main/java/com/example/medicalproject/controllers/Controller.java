package com.example.medicalproject.controllers;

import com.example.medicalproject.services.GetLncRNA;
import com.example.medicalproject.services.GetCircRNA;
import com.example.medicalproject.services.GetMRNA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/controller")
public class Controller {

    private final GetCircRNA getCircRNA;
    private final GetLncRNA getLncRNA;
    private final GetMRNA getMRNA;

    public Controller(GetCircRNA getCircRNA, GetLncRNA getLncRNA, GetMRNA getMRNA) {
        this.getCircRNA = getCircRNA;
        this.getLncRNA = getLncRNA;
        this.getMRNA = getMRNA;
    }


    @GetMapping("/circ/{id}")
    public ResponseEntity<?> getCirc(@PathVariable Long id){
        return ResponseEntity.ok(getCircRNA.getCircRNA(id));
    }

    @GetMapping("/lnc/{id}")
    public ResponseEntity<?> getLnc(@PathVariable Long id){
        return ResponseEntity.ok(getLncRNA.getLnc(id));
    }

    @GetMapping("/m/{id}")
    public ResponseEntity<?> getM(@PathVariable Long id) {
        return ResponseEntity.ok(getMRNA.getMRNA(id));
    }
}
