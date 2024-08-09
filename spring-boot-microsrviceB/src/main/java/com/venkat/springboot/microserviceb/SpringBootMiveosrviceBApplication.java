package com.venkat.springboot.microserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.venkat.springboot.restcontroller")
public class SpringBootMiveosrviceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMiveosrviceBApplication.class, args);
	}

}
