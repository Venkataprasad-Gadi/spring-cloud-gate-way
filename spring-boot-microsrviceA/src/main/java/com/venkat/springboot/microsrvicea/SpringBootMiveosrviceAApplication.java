package com.venkat.springboot.microsrvicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.venkat.springboot.restcontroller")
public class SpringBootMiveosrviceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMiveosrviceAApplication.class, args);
	}

}
