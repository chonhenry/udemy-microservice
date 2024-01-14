package com.henrychon.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.henrychon.accounts.controller") })
@EnableJpaRepositories("com.henrychon.accounts.repository")
@EntityScan("com.henrychon.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Henry Chon",
						email = "chonhenry@outlook.com",
						url = "https://www.henrychon.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.henrychon.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Accounts microservice REST API Documentation",
				url = "https://www.henrychon.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
