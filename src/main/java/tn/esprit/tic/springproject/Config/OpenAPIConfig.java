package tn.esprit.tic.springproject.Config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
        public OpenAPI openApiInformation(){

        return new OpenAPI().info((new io.swagger.v3.oas.models.info.Info()
                .title("Study Case Foyer")
                .version("1.0.0")
                .description("Spring Boot Project")
                .termsOfService("http://springdoc.org")
                .license(new io.swagger.v3.oas.models.info.License()
                        .name("Apache 2.0")
                        .url("http://springdoc.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                        .name("Ahmed Maddouri")
                        .email("ahmed.maddouri@gmail.com"))));
    }
}
