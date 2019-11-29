package com.ustglobal.thread.defining;

public class Mythread extends Thread {

	@Override
	public void run() {
		for(int i= 0; i<10; i++)  {
			System.out.println("child  thread");
		}
	}
	
//	public void start() {
//		System.out.println();
//	}

}
