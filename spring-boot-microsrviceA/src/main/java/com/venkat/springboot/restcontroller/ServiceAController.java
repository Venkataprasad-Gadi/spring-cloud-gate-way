package com.venkat.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class ServiceAController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A";
    }
}
