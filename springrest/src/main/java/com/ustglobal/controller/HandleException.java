package com.ustglobal.controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.ustglobal.dto.EmployeeResponse;

@RestControllerAdvice //if any exceptions are there this class will execute
public class HandleException {
	
	@ExceptionHandler(Exception.class)//it can be accept any type of exception
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatuscode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
}
