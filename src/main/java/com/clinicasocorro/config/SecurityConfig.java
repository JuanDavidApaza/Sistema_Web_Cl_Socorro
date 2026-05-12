package com.clinicasocorro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	// haciendo pruebas git
	 @Bean
	    public SecurityFilterChain seguridad(HttpSecurity http) throws Exception {

	        http
	            .csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(auth -> auth
	                .anyRequest().permitAll()
	            );

	        return http.build();
	    }

}
