package com.ustglobal.thread.pausin;

public class MyJoinThread extends Thread {
	
	public void run() {
		
		for(int i =0 ; i<10;i++) {
			System.out.println("child thread");
		}
		try {
			Thread.sleep(100000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
