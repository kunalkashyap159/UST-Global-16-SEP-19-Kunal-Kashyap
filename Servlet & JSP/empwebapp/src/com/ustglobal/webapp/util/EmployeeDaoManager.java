package com.ustglobal.webapp.util;

import com.ustglobal.webapp.dao.EmployeeDAO;
import com.ustglobal.webapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}

	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}

}
