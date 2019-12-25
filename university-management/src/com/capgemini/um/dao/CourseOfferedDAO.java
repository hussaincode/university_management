package com.capgemini.um.dao;

import com.capgemini.um.beans.CourseOfferedBean;

public interface CourseOfferedDAO {

	public CourseOfferedBean setCourseOffered();

	public CourseOfferedBean getCourseOffered();
	
	public boolean createCourse(CourseOfferedBean course) ;

	public boolean deleteCourse(int course_id);
	
}
