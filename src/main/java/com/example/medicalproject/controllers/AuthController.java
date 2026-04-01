package com.example.medicalproject.controllers;

import com.example.medicalproject.controllers.models.AuthResponse;
import com.example.medicalproject.controllers.models.LoginRequest;
import com.example.medicalproject.services.JwtService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Value("${app.admin.username}")
    private String adminUsername;

    @Value("${app.admin.password}")
    private String adminPassword;

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        if (adminUsername.equals(request.getUsername()) &&
                adminPassword.equals(request.getPassword())) {

            String token = jwtService.generateToken(request.getUsername());
            return ResponseEntity.ok(new AuthResponse(token).toString());
        }

        return ResponseEntity.notFound().build();
    }
}
