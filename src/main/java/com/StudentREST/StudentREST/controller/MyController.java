package com.StudentREST.StudentREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentREST.StudentREST.Model.Students;
import com.StudentREST.StudentREST.services.StudentServices;

@RestController
public class MyController {
	
	@Autowired
	private StudentServices stService;
	
	@GetMapping("/get/students")
	public List<Students> GetStudents() {
		return this.stService.GetStudents();
	}
	
	@GetMapping("/get/student/{id}")
	public Students GetStudent(@PathVariable String id) {
		return this.stService.GetStudent(Integer.parseInt(id));
	}
	
	@PostMapping(path="/post/student", consumes = "application/json")
	public Students AddStudent(@RequestBody Students student) {
		return this.stService.AddStudent(student);
	}
}
