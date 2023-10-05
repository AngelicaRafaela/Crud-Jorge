package br.com.matheusbales.rentacar.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Rent a Car API")
                        .version("1.0")
                        .description("Hot to use the car API")
                        .termsOfService("http://.jlgregorio.com.br")
                        .license(
                                new License()
                                        .name("Apache License").url(
                                                "http://www.apache.org/licenses/LICENSE-2.0"
                                        )
                        )
                );
    }

}
