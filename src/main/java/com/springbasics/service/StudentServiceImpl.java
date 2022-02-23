package com.springbasics.service;

import org.springframework.stereotype.Service;

import com.springbasics.entity.Student;

/*
 * Student Service
 */
@Service
public class StudentServiceImpl {

	private Student student;
	
	public StudentServiceImpl() {
		student = new Student(100, "Saurabh");
	}

	//get student details
	public Student get() {
		return student;
	}
}
