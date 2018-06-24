package com.springstuff.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springstuff.demo"})
public class SpringstuffApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringstuffApplication.class, args);
	}
	

}
