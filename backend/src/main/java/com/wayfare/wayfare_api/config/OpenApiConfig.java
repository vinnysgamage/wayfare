package com.wayfare.wayfare_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Wayfare API",
        version = "0.0.1",
        description = "Backend for the Wayfare collaborative trip planner."
    )
)
public class OpenApiConfig {
}
