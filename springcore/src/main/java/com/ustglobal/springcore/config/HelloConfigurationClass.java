package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	
	@Bean(name= "hello")
	
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I Love  Python");
		return hello;
	} 
	@Bean(name = "dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name = "pet")
	public Pet getPet() {
		
		Pet pet = new Pet();
		pet.setName("Scooby");
		//pet.setAnimal(getDog());//wiring
		return pet;
	}
	@Bean(name = "cat")
	public Cat getCat() {
		return new Cat();
	}
}
