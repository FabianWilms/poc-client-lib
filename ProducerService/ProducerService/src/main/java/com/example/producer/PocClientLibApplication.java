package com.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class PocClientLibApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocClientLibApplication.class, args);
	}

}
