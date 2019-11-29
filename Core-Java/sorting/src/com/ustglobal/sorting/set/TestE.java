package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		
		TreeSet ls = new TreeSet();
		
		
		ls.add(12);
		ls.add(45);
		ls.add(65);
		ls.add(45);
		ls.add(24);
		ls.add(12);
		// null not allowed and non generics not allowed
	//	ls.add("deepika");  ClassCastException 
	//  ls.add(null);	

		System.out.println("***************Using for each***************");
		for(Object s : ls) {
			System.out.println(s);
		}

		System.out.println("******************using iterator************");

		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);


		}
	}
}
		
		
	