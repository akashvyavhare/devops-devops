package com.devops.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {

	@GetMapping("/")
	public String getMassage() {
		return "welcome to sprongboot...!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

}
