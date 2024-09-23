package com.org.CRMSystem.CRM_System;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Your API", version = "1.0", description = "API Description"))
public class CrmSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmSystemApplication.class, args);
	}

}
