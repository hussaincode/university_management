package com.capgemini.um.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.um.beans.CourseOfferedBean;

public class CourseOfferedDAOImpl implements CourseOfferedDAO {
	public int courseId = 101;

	CourseOfferedBean courseOfferedBean = new CourseOfferedBean();

	private HashMap<Integer, CourseOfferedBean> courseInfo = new HashMap<Integer, CourseOfferedBean>();

	@Override
	public CourseOfferedBean setCourseOffered() {
		ArrayList<String> courseName = new ArrayList<String>();
		courseName.add("BE/Btech");
		courseName.add("MCA");
		courseName.add("MBA");
		courseName.add("BCA");
		courseName.add("BBA");
		courseName.add("MTECH");

		courseOfferedBean.setCourseName(courseName);

		// Traversing list through Iterator
		Iterator<String> itr = courseName.iterator();
		while (itr.hasNext()) {
			System.out.println(" " + courseId + " : " + itr.next());
			courseId++;

		} // End of while()

		return courseOfferedBean;

	}

	@Override
	public CourseOfferedBean getCourseOffered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createCourse(CourseOfferedBean courseOfferedBean) {
		if (courseInfo.containsKey(courseOfferedBean.getCourseId()) != true) {
			courseInfo.put(courseOfferedBean.getCourseId(), courseOfferedBean);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteCourse(int courseId) {
		if (courseInfo.containsKey(courseId)) {
			courseInfo.remove(courseId);

			return true;
		} else {
			return false;
		}
	}
}
