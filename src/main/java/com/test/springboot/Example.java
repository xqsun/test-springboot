package com.test.springboot;

import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
	
	private static Logger logger = LogManager.getLogger(Example.class);
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}
}
