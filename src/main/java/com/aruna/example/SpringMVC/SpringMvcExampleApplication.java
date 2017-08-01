package com.aruna.example.SpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication()
@ComponentScan("com.aruna.example.SpringMVC")
@Configuration  
public class SpringMvcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleApplication.class, args);
	}
}
