package com.ustglobal.thread.pausin;

public class TestCounter {
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
		Runnable r = ()->{
			c.increment();
			c.showValue();
			
		};
		Runnable r1 = ()->{
			c.decrement();
			c.showValue();
			
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		System.out.println("main ended");
		
	}

}
