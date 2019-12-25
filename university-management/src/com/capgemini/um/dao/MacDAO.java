package com.capgemini.um.dao;

import java.util.List;

import com.capgemini.um.beans.MacBean;

public interface MacDAO {
	public List<MacBean> macData();
	public boolean macLogin(String email, String password);
}
