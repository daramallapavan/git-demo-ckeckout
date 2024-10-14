package com.example.demo_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGitApplication {
	@GetMapping("/get")
	public String get(){
		return "get";
	}
	@GetMapping("/get")
	public String welcome(){
		return "welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGitApplication.class, args);
	}

}
