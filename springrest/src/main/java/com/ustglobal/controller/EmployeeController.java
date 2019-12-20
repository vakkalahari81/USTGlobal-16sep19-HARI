package com.ustglobal.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.dto.EmployeeBean;
import com.ustglobal.dto.EmployeeResponse;
import com.ustglobal.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path = "/add",consumes=MediaType.APPLICATION_JSON_VALUE
			,produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponse addEmployee(@RequestBody EmployeeBean bean) {
		
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(bean))
		{
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data Added to the DB");
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not Added to the DB");

		}
		
		return response;
	}//end of addEmployee
	
	@PutMapping(path="/modify",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		
		if(service.modifyEmployee(bean)) {
			
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data modified in DB");
			
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not modified in DB");
		}
		
		return response;
	}//end of modify
	
	
	@DeleteMapping(path = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		EmployeeResponse response = new EmployeeResponse();
		 if(service.deleteEmployee(id)) {
				response.setStatuscode(201);
				response.setMessage("success");
				response.setDescription("Data Deleted in DB");
			 
		 }else {
				response.setStatuscode(401);
				response.setMessage("failure");
				response.setDescription("Data not Deleted in DB");
			 
		 }
		 return response;
	}//end of  delete
	
	@GetMapping(path="/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id")int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data Deleted in DB");
			response.setEmployeeBeans(Arrays.asList(bean));
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not Found in DB");
		}
		return response;
	}//end of getemployee
	
	@GetMapping(path ="/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
	
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> beans =service.getAllEmployee();
		if(!beans.isEmpty()) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data Deleted in DB");
			response.setEmployeeBeans(beans);
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("Data not Found in DB");
		}
		return response;
	}
	
	@GetMapping(path="/exce",produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i = 1/0;
	}
}
