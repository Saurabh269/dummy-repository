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
	//mmm
	@Autowired
	private StudentServiceImpl service;

//gfgfdgfdgf
//nbnbnb
	//aman & rajesh
	@GetMapping("/name")
	//@ResponseBody
	public String getString() {
		
		Student student = service.get();
		if(student.getName().equals("Saurabh") && student.getId() == 100|| student!=null) {
			System.out.println("correct");
		}else {
			System.out.println("incorrect");
		}
		System.out.println(student);
		return "Hello, My name is Saurabh!";
	}
}//nn
