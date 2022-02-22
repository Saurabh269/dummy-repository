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
		return "Hello, My name is Saurabh!";
	}
}
