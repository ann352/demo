package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired //we can injection bean to the field but that is not good solution
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//in that method we use method registerUser()
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hallo run");
		userService.registerUser("Dominik");
	}
}
