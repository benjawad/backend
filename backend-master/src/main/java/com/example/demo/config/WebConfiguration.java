package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * @Configuration
 * public class WebConfiguration {
 * 
 * @Bean
 * public WebMvcConfigurer corsConfigurer() {
 * return new WebMvcConfigurer() {
 * 
 * @Override
 * public void addCorsMappings(CorsRegistry registry) {
 * registssry.addMapping("/**") // Allow all endpoints
 * .allowedOrigins("http://localhost:4200") // Allow Angular frontend's origin
 * .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP
 * methods
 * .allowedHeaders("*") // Allow all headers
 * .allowCredentials(true); // Allow credentials if needed
 * }
 * };
 * }
 * }
 */