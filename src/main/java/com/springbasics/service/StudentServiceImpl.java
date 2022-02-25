package com.springbasics.service;

import org.springframework.stereotype.Service;

import com.springbasics.entity.Student;

@Service
public class StudentServiceImpl {

	private Student student;
	
	public StudentServiceImpl() {
		student = new Student();
	}

	public Student get() {
		return student;
	}
}
