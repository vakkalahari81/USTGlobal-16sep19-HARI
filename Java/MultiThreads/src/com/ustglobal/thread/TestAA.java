package com.ustglobal.thread;

public class TestAA {
	
	public static void main(String[] args) {
		
		
		System.out.println("main started");
		
		MyThread t1 = new MyThread();
		t1.start();
		
		/*Don't call run method, it behaves like a normal program
		 * All code will be executed inside main thread only
		 * t1.run m();
		 */
		//t1.start(); // we cannot restart start() method java.lang.IllegalThreadStateException
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("main thread");
		}
		System.out.println("Main ended");	
	}
}
