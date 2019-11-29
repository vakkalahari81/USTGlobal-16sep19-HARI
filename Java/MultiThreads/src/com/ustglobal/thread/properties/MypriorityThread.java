package com.ustglobal.thread.properties;

public class MypriorityThread extends Thread{
	
	public static void main(String[] args) {
		
		
		System.out.println("Main Started");
		int  p = Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority = "+p);
		
		
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
		
		
		MypriorityThread t = new MypriorityThread();
		int q = t.getPriority();
		System.out.println("Child Thread Priority = "+q);
		
		
		
	}

}
