package com.example.demo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class LoginController {
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome To Jenkins CI/CD";
	}

}
