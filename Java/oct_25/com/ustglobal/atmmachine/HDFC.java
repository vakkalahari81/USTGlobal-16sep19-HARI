package com.ustglobal.atmmachine;

public class HDFC implements ATM {

	@Override
	public void validateCard() {
		System.out.println("HDFC validate");
	}

	@Override
	public void getInfo() {

		System.out.println("HDFC get Info");
		
	}

}
