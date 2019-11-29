package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ComponetScanConfiguration;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ComponetScanConfiguration.class);
		
		Hello hello  = context.getBean(Hello.class);
		hello.setMsg("this is Spring Core");
		System.out.println(hello.getMsg());
		
		System.out.println("********************");
		
		Pet  pet  = context.getBean(Pet.class);
		pet.setName("puppy");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
