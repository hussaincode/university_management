package com.capgemini.um.beans;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class ApplicationBean implements Serializable {

	private int applicationId;
	private String fullName;
	private String dob;
	private String hqualification;
	private double marksObtained;
	private String goals;
	private String emailId;
	private int courseId;
	private String status;
	private String doi;

	// Constructor
	public ApplicationBean() {

	}

	// Getter and Setter

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getHqualification() {
		return hqualification;
	}

	public void setHqualification(String hqualification) {
		this.hqualification = hqualification;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

} // End of class
