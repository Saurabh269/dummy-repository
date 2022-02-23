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
		//new line added
		//new branch created feature
		//added comment in MyController
		String name = "Saurabh";
		if(name.length() <= 8) {
			System.out.println("name should be greater than 9 characters.");
		}else {
			
			System.out.println("name is correct and allowed.");
		}
		return "Hello, My name is Saurabh!";
	}
}
