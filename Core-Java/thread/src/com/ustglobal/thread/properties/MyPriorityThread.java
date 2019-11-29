package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	public static void main(String[] args) {

		System.out.println("main started");
		int p = Thread.currentThread().getPriority();
		System.out.println("main thread priority "+p);
		
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority "+Thread.currentThread().getPriority());

		// All child priority is based on the parent priority, if we change in parent priority 
		// then automatically it effect the child priority also....
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("mypriority thread priority "+q);

		System.out.println("main ended");
	}

}
