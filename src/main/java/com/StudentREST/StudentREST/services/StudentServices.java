package com.StudentREST.StudentREST.services;

import java.util.List;

import com.StudentREST.StudentREST.Model.Students;

public interface StudentServices {
	
	public List<Students> GetStudents();
	public Students GetStudent(int id);
}
