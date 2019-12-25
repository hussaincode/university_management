package com.capgemini.um.beans;

public class AdministrativeBean {
	private String adminName;
	private int adminId;
	private String adminPassword;
	private String adminEmail;
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + "\n adminId=" + adminId + "\n adminEmail=" + adminEmail + "]";
	}
	
}


