package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog  implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
		System.out.println("Baooooooooo");
	}
}
