package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class TestG {

	public static void main(String[] args) {

		Employee e1 = new Employee (2, "divya", 654244.98);
		Employee e2 = new Employee (5, "simran", 43356.76);
		Employee e3 = new Employee (12, "sapna", 81434.17);
		Employee e4 = new Employee (34, "dinesh", 21355.17);
		Employee e5 = new Employee (7, "piyush", 93350.07);
		Employee e6 = new Employee (11, "heena", 53456.83);
		Employee e7 = new Employee (19, "aarav", 38535.96);
		Employee e8 = new Employee (22, "sophie", 75338.85);
		Employee e9 = new Employee (13, "vishnu", 41544.74);
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(e1);
		al.add(e2);
		al.add(e3);

		ArrayList<Employee> al1 = new ArrayList<Employee>();

		al1.add(e4);
		al1.add(e5);
		al1.add(e6);

		ArrayList<Employee> al2 = new ArrayList<Employee>();

		al2.add(e7);
		al2.add(e8);
		al2.add(e9);

		LinkedHashMap<String, ArrayList<Employee>> hm = new LinkedHashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);

		ArrayList<Employee> third = hm.get("third");

		Iterator<Employee> it = third.iterator();
		while(it.hasNext())  {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Nmae is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("===============================");
		}
	}
}

