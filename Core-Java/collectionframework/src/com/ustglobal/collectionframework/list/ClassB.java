package com.ustglobal.collectionframework.list;

public class ClassB extends ClassA {
	private void m1() {
		System.out.println("bbbbbbb");
		
	}
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b  = new ClassB();
		
		b.m1();
	}

}
