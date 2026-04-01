//package com.example.medicalproject.Utils;
//
//import com.example.medicalproject.services.JwtService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
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
//        return http
//                .csrf(csrf -> csrf.disable())
//                // DODAJ TO: Wyłącza domyślny formularz logowania
//                .formLogin(form -> form.disable())
//                // DODAJ TO: Wyłącza okienko logowania przeglądarki
//                .httpBasic(basic -> basic.disable())
//
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/auth/login").permitAll()
//                        .anyRequest().authenticated()
//                )
//                // DODAJ TO: Skoro używasz JWT, nie chcesz sesji (to zabija "pamiętanie" logowania przez przeglądarkę)
//                .sessionManagement(session -> session
//                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                )
//                .addFilterBefore(
//                        new JwtFilter(jwtService),
//                        UsernamePasswordAuthenticationFilter.class
//                )
//                .build();
//    }
//}
