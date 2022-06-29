package com.simplilearn.project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Project2Application.class);
	}
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello Spring Boot Family";
	}


}
