package com.StudentREST.StudentREST.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentREST.StudentREST.Model.Students;

@Service
public class StudentServiceimpl implements StudentServices {
	
	public static List<Students> stlist;
	
	public StudentServiceimpl() {
		stlist = new ArrayList<>();
		stlist.add(new Students(101,"Vijay","MSc_CS"));
		stlist.add(new Students(102,"Tanay","MSc_CS"));
		stlist.add(new Students(103,"Gaurav","MSc_CS"));
		stlist.add(new Students(104,"Sandesh","MSc_CA"));
	}

	@Override
	public List<Students> GetStudents() {
		return stlist;
	}

	@Override
	public Students GetStudent(int id) {
		
		Students s=null;
		for(Students student:stlist) {
			if(student.getRoll()==id) {
				s = student;
				break;
			}
		}
		return s;
	}

	@Override
	public Students AddStudent(Students student) {
		stlist.add(student);
		return student;
	}

}
