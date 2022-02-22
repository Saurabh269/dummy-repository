package com.springbasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/name")
	//@ResponseBody
	public String getString() {
		String name = "Saurabh";
		if(name.length() <= 8) {
			System.out.println("name should be greater than 9 characters.");
		}
		return "Hello, My name is Saurabh!";
	}
}
