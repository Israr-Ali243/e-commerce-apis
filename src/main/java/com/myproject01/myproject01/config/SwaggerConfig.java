package com.myproject01.myproject01.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {



    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Ecommerce API")
                        .description("Ecommerce shop sample application")
                        .version("v0.0.1")
                        .contact(new Contact().name("israr Ali").email("aisrar243@gmail.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Ecommerce Shop API Documentation")
                        .url("https://github.com/Israr-Ali243/e-Commerce-APIs"));
    }

}
