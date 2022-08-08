package com.devanshitrivedi.springormdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringormApplication {

	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(SpringormApplication.class, args);
	}
}
