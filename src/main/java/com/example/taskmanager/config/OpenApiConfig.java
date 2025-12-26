package com.example.taskmanager.config;

import org.springframework.context.annotation.*;
import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
            .title("Task Manager API")
            .version("0.0.1")
            .description("CRUD for tasks"));
    }
}