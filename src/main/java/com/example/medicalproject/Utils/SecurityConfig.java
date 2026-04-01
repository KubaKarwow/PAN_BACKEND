//package com.example.medicalproject.Utils;
//
//import com.example.medicalproject.services.JwtService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//public class SecurityConfig {
//
//    private final JwtService jwtService;
//
//    public SecurityConfig(JwtService jwtService) {
//        this.jwtService = jwtService;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        return http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/auth/login").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .addFilterBefore(
//                        new JwtFilter(jwtService),
//                        UsernamePasswordAuthenticationFilter.class
//                )
//                .build();
//    }
//}
