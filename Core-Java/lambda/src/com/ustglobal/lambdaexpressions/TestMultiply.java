package com.ustglobal.lambdaexpressions;

public class TestMultiply {
	public static void main(String[] args) {
		
		MultiplyInterface multi = (a,b)->a*b;   //lambda expression....
		int product = multi.multiply(20, 10);
		System.out.println("Product is " +product);
		
	}

}
