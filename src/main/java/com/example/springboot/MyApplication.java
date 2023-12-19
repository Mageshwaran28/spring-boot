package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		System.out.println("Welcome to " + MyApplication.class.getName());
	}

	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome to Spring Application";
	}

}
