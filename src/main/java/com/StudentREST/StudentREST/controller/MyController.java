package com.StudentREST.StudentREST.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentREST.StudentREST.Model.Students;
import com.StudentREST.StudentREST.services.StudentServices;

@RestController
public class MyController {
	
	private StudentServices stService;
	
	@GetMapping("/students")
	public List<Students> GetStudents() {
		return this.stService.GetStudents();
	}
	
	@GetMapping("/student/{id}")
	public Students GetStudent(int id) {
		return null;
	}
}
