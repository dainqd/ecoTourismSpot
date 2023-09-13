package com.example.ecotourismspot.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
class WebMvcConfig implements WebMvcConfigurer {
    private static final String[] ALLOWED_METHODS = {"GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"};
    private static final String ALLOWED_HEADER = "*";
    private static final String ADD_MAPPING = "/**";
    final long MAX_AGE_SECS = 60 * 60;


    @Value("${app.cors.allowed-origins}")
    private String[] allowedOrigins;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(ADD_MAPPING)
                .allowedOriginPatterns(allowedOrigins)
                .allowedMethods(ALLOWED_METHODS)
                .allowedHeaders(ALLOWED_HEADER)
                .allowCredentials(false)
                .maxAge(MAX_AGE_SECS);
    }
}
