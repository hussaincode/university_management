package com.capgemini.um.dao;

import java.util.List;

import com.capgemini.um.beans.AdministrativeBean;

public interface AdministrativeDAO {
	public List<AdministrativeBean> adminData();
	public boolean adminLogin(String email, String password);
}
