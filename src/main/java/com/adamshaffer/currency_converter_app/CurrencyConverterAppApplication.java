package com.adamshaffer.currency_converter_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.adamshaffer.currency_converter_app.Repository")
@EnableJpaAuditing
public class CurrencyConverterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterAppApplication.class, args);
	}

}
