package com.venkat.springboot.restcontroller;

import java.util.ArrayList;
import java.util.List;

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
	
	@GetMapping("/hello2")
	public String hello2() {
		
		return "Hello from Service A2";
	}

	@GetMapping("/getEmployeeList")
	public List<String> getEmployeeList() {
		List<String> list = new ArrayList<>();
		list.add("Venkat");
		list.add("Prasad");
		list.add("Reddy");
		return list;
	}

	
}
