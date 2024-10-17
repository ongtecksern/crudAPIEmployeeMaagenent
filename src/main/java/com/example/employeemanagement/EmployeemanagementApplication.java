package com.example.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.employeemanagement.model")  // Add this if the model package is different
@EnableJpaRepositories(basePackages = "com.example.employeemanagement.repository")
public class EmployeemanagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementApplication.class, args);
	}
}
