package com.ab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String hello() {
<<<<<<< HEAD
		return "Welcome to Spring Boot App running on AWS EC2 instance!!!";
=======
		return "Welcome to Spring Boot App running on AWS EC2 instance, see its magic now on Jenkins!!! New message";
>>>>>>> df3f7c856632e668f49418b82c3fe3b6257746a9
	}

}
