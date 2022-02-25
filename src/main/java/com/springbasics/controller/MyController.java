package com.springbasics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbasics.entity.Student;
import com.springbasics.service.StudentServiceImpl;

@RestController
public class MyController {

	@Autowired
	private StudentServiceImpl service;

	@GetMapping("/name")
	//@ResponseBody
	public String getString() {
		
		Student student = service.get();


		if(student!=null && student.getName()!=null && student.getId() !=0 && student.getId()>0) {
			System.out.println("correct");
		}
		System.out.println(student);
		return "Hello, My name is Saurabh!";
	}
}
