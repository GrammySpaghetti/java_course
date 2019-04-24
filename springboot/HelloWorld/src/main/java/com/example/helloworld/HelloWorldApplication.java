package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings! " + test();
	}
	public String test() {
		return "Test";
	}
	

}
