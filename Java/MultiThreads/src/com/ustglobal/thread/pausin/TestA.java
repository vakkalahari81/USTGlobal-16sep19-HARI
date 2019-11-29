package com.ustglobal.thread.pausin;

public class TestA {
	
	public static void main(String[] args) {
		
	Object obj1 = new Object();
	Object obj2 = new Object();
	
	Runnable r1 = ()->{
		synchronized (obj1) {
			System.out.println("T1 Started");
			System.out.println("T1 has locked");
			
			synchronized (obj2) {
				System.out.println("T1 has locked Object2");
			}
		}
		try {
			obj1.wait();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("T1 Finished");
	};
	
	Runnable r2 = ()->{
		synchronized (obj2) {
			System.out.println("T2 Started");
			System.out.println("T2 has locked");
			
			synchronized (obj1) {
				System.out.println("T2 has locked Object1");
				obj1.notifyAll();
			}
		}
		System.out.println("T2 Finished");
	};
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
	}
}