package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {

		Car c1 = new Car(50000, "BMW", "Blue");
		Car c2 = new Car(70000, "Jaguar", "White");

		int k = c1.color.hashCode();
		System.out.println(k);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
