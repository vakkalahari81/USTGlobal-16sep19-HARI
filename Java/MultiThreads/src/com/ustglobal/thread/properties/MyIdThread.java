package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
	
	public static void main(String[] args) {
	
		System.out.println("Main Started");
		System.out.println(Thread.currentThread().getId());
		System.out.println("Priority = "+Thread.currentThread().getPriority());
		
		MyIdThread m1 = new MyIdThread();
		System.out.println("my thread Id ="+m1.getId());
		System.out.println("My Thread Priorityt = "+m1.currentThread().getPriority());
		
		
	}
	
	
	

}
