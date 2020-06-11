package com.example.Spring_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class JPAController {
@GetMapping("/ greetings")
public String message() {
	return "HI";
}

}
