package com.vu.model.entity;

public class Student {

	private String fullName;
	private String courseName;
	
	public Student() {
		super();
	}

	public Student(String fullName, String courseName) {
		super();
		this.fullName = fullName;
		this.courseName = courseName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
