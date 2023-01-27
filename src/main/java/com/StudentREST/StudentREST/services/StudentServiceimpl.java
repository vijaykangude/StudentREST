package com.StudentREST.StudentREST.services;

import java.util.ArrayList;
import java.util.List;

import com.StudentREST.StudentREST.Model.Students;

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
	public Students GetStudent(int id)
		return null;
	}

}
