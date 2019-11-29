package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ{
	public static void main(String[] args) {

//		SortByName sb = new SortByName();
		SortById sb1 = new SortById();
//		SortBySalary sb2 = new SortBySalary();
		
//		TreeSet<Bank> tp = new TreeSet<Bank>(sb);
		TreeSet<Bank> tp = new TreeSet<Bank>(sb1);
//		TreeSet<Bank> tp = new TreeSet<Bank>(sb2);

		tp.add(new Customer("Shivam", 100, 456789));
		tp.add(new Customer("ICICI", 35427, 495789));
		tp.add(new Customer("SBI", 83527, 656789));
		tp.add(new Customer("AXIX", 73527, 156789));
		tp.add(new Customer("PNB", 63527, 856789));


		System.out.println("=========Using iterator==============");

		Iterator<Customer> it = tp.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Name is "+c.name);
			System.out.println("Id is "+c.id);
			System.out.println("Salary is "+c.salary);

			System.out.println("====================================");


		}

	}
}
