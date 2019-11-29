package com.ustglobal.thread.pausing;

public class TestThread {
	
	public static void main(String[] args) {
		
	    System.out.println("Main Started");	
		
	    MyThread t = new MyThread();
		t.start();
		for(int i = 0;i<=1200;i++) {
			
			System.out.println(i+"Main Thread");
			Thread.yield();
		}
		System.out.println("Main Ended");
	}
}
