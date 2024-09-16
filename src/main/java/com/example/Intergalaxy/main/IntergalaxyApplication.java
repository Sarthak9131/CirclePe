package com.example.Intergalaxy.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.example.Intergalaxy")
@EnableJpaRepositories(basePackages = "com.example.Intergalaxy.shipment")
@EnableAutoConfiguration
public class IntergalaxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntergalaxyApplication.class, args);
	}
}
