package com.duoc.backend; // Asegúrate de mantener el package original si no es este

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Apaga la seguridad de formularios
            .cors(cors -> cors.disable()) // Apaga restricciones de origen
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // 🔓 ¡PERMITE TODO! Cualquier URL y método pasa libre
            );

        return http.build();
    }
}