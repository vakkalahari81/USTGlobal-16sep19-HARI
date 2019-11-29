package com.ustglobal.customizedcheckedException;

public class Test {
	
	
	public static void main(String[] args) {
		
		System.out.println("main is started");
		ValidateAmount a  = new ValidateAmount();
		try {
			   a.checkAmount(500000);
			   System.out.println("Withdraw your cash");
		} 
			catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
			e.getMessage();
		}
	}

}
