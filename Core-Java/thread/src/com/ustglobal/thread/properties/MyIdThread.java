package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {

		System.out.println("main started");

		System.out.println(Thread.currentThread().getId());

		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());

		//we can't set id only we can get id...

		System.out.println("Priority "+Thread.currentThread().getPriority());

		// Thread.currentThread().setPriority(16);  IllegalArgumentException.class..

		System.out.println("main ended");
	}

}
