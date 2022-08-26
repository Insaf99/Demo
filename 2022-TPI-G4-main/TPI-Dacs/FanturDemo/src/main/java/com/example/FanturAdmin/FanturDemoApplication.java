package com.example.FanturAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={"com.example.FanturAdmin.*"})
@EntityScan(basePackages ={"com.example.FanturAdmin.*"})
public class FanturDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanturDemoApplication.class, args);
	}

}
