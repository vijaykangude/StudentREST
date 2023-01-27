package com.StudentREST.StudentREST.Model;

public class Students {
	
	private int Roll;
	private String Name;
	private String Course;
	public Students(int roll, String name, String course) {
		super();
		Roll = roll;
		Name = name;
		Course = course;
	}
	public Students() {
		super();
	}

	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	@Override
	public String toString() {
		return "Students [Roll=" + Roll + ", Name=" + Name + ", Course=" + Course + "]";
	}
	
}
