package com.ustglobal.thread;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		System.out.println("main - started");
		MyRunnable mr = new MyRunnable();
		Thread t =new Thread(mr);
		t.start();
		
		for(int  i =0 ; i< 10 ;i++) {
			System.out.println("Main - Thread");
		}
		System.out.println("main - ended ");
		
	}
}
