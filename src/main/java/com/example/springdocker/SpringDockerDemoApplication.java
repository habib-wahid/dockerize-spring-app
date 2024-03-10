package com.example.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerDemoApplication {

	@GetMapping("/api/welcome")
	public String welcome(){
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerDemoApplication.class, args);
	}

}
