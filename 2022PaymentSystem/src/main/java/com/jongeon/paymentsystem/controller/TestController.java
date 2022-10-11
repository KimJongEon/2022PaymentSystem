package com.jongeon.paymentsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/test")
	public String getTest() {
		return "test";
	}

	@GetMapping("/hello")
	public List<String> hello() {

		return Arrays.asList("안녕하세요", "Hello");
	}
}
