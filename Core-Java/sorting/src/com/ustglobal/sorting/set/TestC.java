package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {

		LinkedHashSet ls = new LinkedHashSet();

		ls.add(12);
		ls.add(45);
		ls.add("deepa");
		ls.add(45.44);
		ls.add("bhavya");
		ls.add(12);


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