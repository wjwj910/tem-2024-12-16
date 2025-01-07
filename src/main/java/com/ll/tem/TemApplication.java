package com.ll.tem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemApplication.class, args);
	}

}