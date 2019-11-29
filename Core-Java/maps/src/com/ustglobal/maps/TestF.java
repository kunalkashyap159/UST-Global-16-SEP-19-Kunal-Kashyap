package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class TestF {

	public static void main(String[] args) {

		Student s1 = new Student (2, "divya", 65.98);
		Student s2 = new Student (5, "simran", 56.76);
		Student s3 = new Student (12, "sapna", 81.17);
		Student s4 = new Student (34, "dinesh", 21.17);
		Student s5 = new Student (7, "piyush", 90.07);
		Student s6 = new Student (11, "heena", 56.83);
		Student s7 = new Student (19, "aarav", 38.96);
		Student s8 = new Student (22, "sophie", 78.85);
		Student s9 = new Student (13, "vishnu", 41.74);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<Student>();

		al1.add(s4);
		al1.add(s5);
		al1.add(s6);

		ArrayList<Student> al2 = new ArrayList<Student>();

		al2.add(s7);
		al2.add(s8);
		al2.add(s9);

		LinkedHashMap<String, ArrayList<Student>> hm = new LinkedHashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);

		ArrayList<Student> second = hm.get("second");

		Iterator<Student> it = second.iterator();
		while(it.hasNext())  {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Nmae is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===============================");
		}
	}
}

