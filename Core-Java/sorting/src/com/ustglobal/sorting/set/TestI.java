package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {

//		SortByName sb = new SortByName();
		SortByPincode sb1 = new SortByPincode();
//		SortByMicr sb2 = new SortByMicr();
		
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		TreeSet<Bank> ts = new TreeSet<Bank>(sb1);
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb2);

		ts.add(new Bank("HDFC", 63527, 456789));
		ts.add(new Bank("ICICI", 35427, 495789));
		ts.add(new Bank("SBI", 83527, 656789));
		ts.add(new Bank("AXIX", 73527, 156789));
		ts.add(new Bank("PNB", 63527, 856789));


		System.out.println("=========Using iterator==============");

		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);

			System.out.println("====================================");


		}

	}
}
