package com.ustglobal.dao;

import java.util.List;

import com.ustglobal.dto.EmployeeBean;

public interface EmployeeDAO {
	
	public boolean addEmployee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	
	public List<EmployeeBean> getAllEmployee();

}
