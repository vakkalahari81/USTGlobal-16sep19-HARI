package com.ustglobal.springmvcwithhibernate.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.ustglobal.springmvcwithhibernate.dto.RetailerBean;
import com.ustglobal.springmvcwithhibernate.service.RetailerService;

@Controller
public class ProductController {
	
	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login
	
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest request) {//the variables name must be same as login.jsp {
	RetailerBean bean=service.login(id,password);
	if(bean==null) {
		request.setAttribute("msg","Invalid Credentials");
		return "login";
	}
	else {
				HttpSession session = request.getSession();
				session.setAttribute("bean",bean);
				return "home";
	  }
   }//end of login
	

	@GetMapping("/register")
	public String registerPage() {
		
		return "register";
		
	}//end of register page
	@PostMapping("/register")
	public String register(RetailerBean bean,ModelMap map) {
		
		int check = service.registration(bean);
		if(check>0) {
			map.addAttribute("msg","You are registered and ID is"+check);
		}else {
				map.addAttribute("msg","Email is repeated");
		}
		return "login";
	}//end of register
}	