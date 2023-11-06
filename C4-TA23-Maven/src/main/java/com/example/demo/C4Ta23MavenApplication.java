package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class C4Ta23MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(C4Ta23MavenApplication.class, args);
	}
	
	@GetMapping ("/")
	public String inicio() {
		return "Bienvenido a mi API REST con Maven".formatted();
	}
	@GetMapping("/home")
	public String home () {
		return "/home".formatted();
	}

}
