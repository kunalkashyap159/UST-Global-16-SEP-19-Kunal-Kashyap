package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		
		
		ls.add(12.59);
		ls.add(45.62);
		ls.add(65.78);
		ls.add(45.44);
		ls.add(24.87);
		ls.add(12.89);


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
		
		
	