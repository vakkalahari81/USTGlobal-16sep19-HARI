package com.ustglobal.springcore.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorClass implements BeanPostProcessor {
	
	@Override
	 public Object postProcessBeforeInitialization(Object bean, String beanName) 
		      throws BeansException {
				System.out.println("BeforeInitialization : "+beanName);
				return beanName;
		
	}
	 public Object postProcessAfterInitialization(Object bean, String beanName) 
		      throws BeansException {
		      
		      System.out.println("AfterInitialization : " + beanName);
		      return bean;  // you can return any other object as well
		   }
	
	
	

}
