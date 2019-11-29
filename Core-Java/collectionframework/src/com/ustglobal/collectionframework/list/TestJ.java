package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "varun", 45.12);
		Student s2 = new Student(102, "hrithik", 54.56);
		Student s3 = new Student(103, "sahid", 65.33);
		Student s4 = new Student(104, "akshay", 76.90);
		Student s5 = new Student(105, "sahid", 81.24);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		for (int i = 0; i<al.size(); i++)  {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Nmae is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			
		}
		System.out.println("============for each============");
		for(Student s : al) {
			System.out.println(s);
		}
	}

}
