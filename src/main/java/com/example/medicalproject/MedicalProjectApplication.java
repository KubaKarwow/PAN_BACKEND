package com.example.medicalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
public class MedicalProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalProjectApplication.class, args);
    }

}
