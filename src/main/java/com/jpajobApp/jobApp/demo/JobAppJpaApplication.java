package com.jpajobApp.jobApp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.jpajobApp.jobApp.demo.repo")
public class JobAppJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobAppJpaApplication.class, args);
		System.out.println("hello jpa");
	}

}
