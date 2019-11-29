package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.HelloConfigurationClass;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {
	
	public static void main(String[] args) {
	
	/*ApplicationContext*/AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
	
	Hello hello = context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	//System.out.println(hello);
	
	Hello hello1 = context.getBean(Hello.class);
	System.out.println(hello1.getMsg());
	//System.out.println(hello1);
	
	//Animal animal= context.getBean(Animal.class);
	//animal.makeSound();
	
	System.out.println("**************************");
	Pet pet = context.getBean(Pet.class);
	System.out.println(pet.getName());
	pet.getAnimal().makeSound();
	
	context.close();
  }

}