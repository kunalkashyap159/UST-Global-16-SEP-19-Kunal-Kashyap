package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "range", 45.77);
		Student s2 = new Student(11, "vignesh", 76.87);
		
		int h = s1.name.hashCode();
		System.out.println(h);
		// s1.printDetails();
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
