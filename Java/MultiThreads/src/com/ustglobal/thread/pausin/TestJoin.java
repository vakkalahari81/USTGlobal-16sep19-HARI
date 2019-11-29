package com.ustglobal.thread.pausin;

public class TestJoin {
	public static void main(String[] args) {
		
		MyJoinThread m = new MyJoinThread();
		m.start();
		
		try {
		     	m.join(10000);
		     	System.out.println("Now Started");
		  }
		catch(Exception e ) {
			e.printStackTrace();
		}
		for(int  i= 0;i<10;i++) {
			
			System.out.println("Main Thread");
	
		}
		
		System.out.println("Main Ended");
	}
	
	

}
