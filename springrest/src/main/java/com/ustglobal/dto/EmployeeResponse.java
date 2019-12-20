package com.ustglobal.dto;

import java.util.List;

public class EmployeeResponse {
	
	
	private int statuscode;
	private String message;
	private List<EmployeeBean>employeeBeans;
	
	public int getStatuscode() {
		return statuscode;
	}
	public List<EmployeeBean> getEmployeeBeans() {
		return employeeBeans;
	}
	public void setEmployeeBeans(List<EmployeeBean> employeeBeans) {
		this.employeeBeans = employeeBeans;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String description;
}
