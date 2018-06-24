package com.springstuff.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstuff.demo.model.Student;
import com.springstuff.demo.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	
	@GetMapping("/students")
	List<Student>showAllStudents(){
		List<Student> students = studentRepository.findAll();
		return students;
		
	}
	

	
	
	
	

}
