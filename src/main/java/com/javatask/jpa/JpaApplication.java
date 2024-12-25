package com.javatask.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

import com.javatask.jpa.Models.Auther;
import com.javatask.jpa.Repositories.AutherRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// @Bean
	public CommandLineRunner commandLineRunner(
			AutherRepository autherRepository
			) {
		return args -> {
			var auther = Auther.builder()
					.firstName("mahmoud")
					.lastName("khider")
					.age(23)
					.email("mahmoud@gmail.com")
					.build();
			autherRepository.save(auther);
		};
	}

}
