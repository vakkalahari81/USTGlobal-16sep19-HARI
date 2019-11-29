package com.ustglobal.thread.properties;

public class MyThread extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
		
		MyThread t1 = new MyThread();
		String nm = t1.getName();
		System.out.println(nm);
		
		Thread.currentThread().setName("Bala");
		System.out.println(name);
		
		System.out.println(10/0);
		
		
	}

}
