package com.ustglobal.atmmachine;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("ICICI validating");
	}

	@Override
	public void getInfo() {
	
		System.out.println("ICICI getinfo");
		
	}

}
