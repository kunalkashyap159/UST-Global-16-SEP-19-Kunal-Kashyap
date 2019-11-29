package com.ustglobal.sorting.list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(14, "dimple", 35.6);
		Student s2 = new Student(13, "bhavna", 70.7);
		Student s3 = new Student(11, "simran", 85.9);
		Student s4 = new Student(12, "kriti", 45.2);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("Before sorting---------->");
		displayStudentDetails(al);
		Collections.sort((List<Student>) al);
		System.out.println("After sorting----------->");
		displayStudentDetails(al);
	}
	static void displayStudentDetails(ArrayList<Student> al)  {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("-----------------------------------");
		}
	}

}
