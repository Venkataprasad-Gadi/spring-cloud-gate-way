package com.venkat.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class ServiceAController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Service A";
	}

	@GetMapping("/addNumbers")
	public int addNumbers(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}

}
