package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {

		System.out.println("main started");

		Mythread t1 = new Mythread();

		/*t1.run() don't call run() method, it behaves like normal program...
		 * All code will be executed inside main thread only...
		 */

		t1.start();
		
	//	t1.start();  IllegalThreadStateException.........

		for(int i =0;i<10;i++) {
			System.out.println("main thread");
		}
		System.out.println("main ended");
	}

}
