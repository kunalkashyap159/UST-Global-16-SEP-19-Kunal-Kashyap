package com.ustglobal.lambdaexpressions;

public class TestMessage {
	public static void main(String[] args) {

		MessageInterface m = (str)-> str;

		String m1 = m.greet("Hello");
		String m2 = m.greet("World");
		System.out.println(m1+" "+m2);


	}
}











