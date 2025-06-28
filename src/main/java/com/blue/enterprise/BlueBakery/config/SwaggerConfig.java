package com.blue.enterprise.BlueBakery.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI bakeryOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Blue Bakery API")
                        .description("API for managing products and orders in the online bakery")
                        .version("1.0.0"));
    }
}