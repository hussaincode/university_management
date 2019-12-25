package com.capgemini.um.beans;

import java.util.ArrayList;

public class CourseOfferedBean {
	private int courseId;
	private ArrayList<String> courseName;
	
	//Getter and Setter
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public ArrayList<String> getCourseName() {
		return courseName;
	}
	public void setCourseName(ArrayList<String> course) {
		this.courseName = course;
	}
	
	
}
