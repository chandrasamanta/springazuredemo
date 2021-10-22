package com.chandra.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringazuredemoApplication {

	public String message(){
		return "Congratulations! Your App deployed successfully.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringazuredemoApplication.class, args);
	}

}
