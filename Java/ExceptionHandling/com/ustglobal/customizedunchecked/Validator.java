package com.ustglobal.customizedunchecked;

public class Validator {
	
	void verify(int age)
	{
		if(age<18)
		{
			throw new InvalidAgeException("age is restricted");
		}
	}
}
