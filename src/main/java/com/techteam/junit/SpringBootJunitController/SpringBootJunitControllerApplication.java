package com.techteam.junit.SpringBootJunitController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.techteam.junit")
public class SpringBootJunitControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJunitControllerApplication.class, args);
	}

}
