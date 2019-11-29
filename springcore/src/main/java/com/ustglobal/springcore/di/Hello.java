package com.ustglobal.springcore.di;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void init() {
		System.out.println("Init Method	8 Executing");
	}
	public void destroy() {
		System.out.println("Destroy Method Excuting from hello");
	}
	
	private Map<String,Integer> map;
	
	public Map<String,Integer> getMap(){
		return map;
	}
	public void setMap(Map<String,Integer> map) {
		this.map = map;
	}
}
