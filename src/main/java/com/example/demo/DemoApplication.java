package com.example.demo;

import com.example.demo.Entities.School;
import com.example.demo.Repositories.SchoolRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Bean
	CommandLineRunner demo(SchoolRepo repo) {
		return args -> {
			School school = new School();
			school.setSchoolAddress("adresse");
		};

	};

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
