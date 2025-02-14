package com.capgemini.um.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.um.beans.AdministrativeBean;

public class AdministrativeDAOImp implements AdministrativeDAO {
	ArrayList<AdministrativeBean> adminList = new ArrayList<AdministrativeBean>();

	@Override
	public List<AdministrativeBean> adminData() {
		AdministrativeBean admin1 = new AdministrativeBean();
		admin1.setAdminEmail("admin");
		admin1.setAdminPassword("12345");

		AdministrativeBean admin2 = new AdministrativeBean();
		admin2.setAdminEmail("saddam");
		admin2.setAdminPassword("12345");
		adminList.add(admin1);
		adminList.add(admin2);
		return adminList;
	}

	@Override
	public boolean adminLogin(String adminEmail, String adminPassword) {
		List<AdministrativeBean> loginList = adminData();
		if (loginList != null) {
			for (AdministrativeBean admBean : loginList) {
				if (adminEmail.equals(admBean.getAdminEmail()) && adminPassword.equals(admBean.getAdminPassword())) {
					System.out.println("login sccesfully");
					return true;

				}
			}
		}
		return false;
	}



}
