package com.gcit.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JtApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtApplication.class, args);
	}
	

	
	@RequestMapping(value = "/j")
	public String test() {
		System.out.println("???????????");
		return "hellow world";
	}
	
}
