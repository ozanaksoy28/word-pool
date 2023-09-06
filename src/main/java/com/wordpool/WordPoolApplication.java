package com.wordpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wordpool.repository")
public class WordPoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordPoolApplication.class, args);
	}

}

