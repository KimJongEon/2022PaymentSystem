package com.jongeon.paymentsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		System.out.println("home controller");
		return "index.html";
	}
	@GetMapping("/test")
	public String test() {
		System.out.println("home controller");
		return "test.html";
	}
}
