package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;

public class LifeCycleClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello  = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		((AbstractApplicationContext) context).close();
		
		
		
	}

}
