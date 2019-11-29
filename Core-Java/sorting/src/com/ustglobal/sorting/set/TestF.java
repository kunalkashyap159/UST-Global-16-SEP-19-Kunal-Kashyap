package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {

		TreeSet<String> hs =  new TreeSet<String>();

		hs.add("adrija");
		hs.add("payal");
		hs.add("deepa");
		hs.add("aditi");
		hs.add("sonali");
		hs.add("varsha");


		System.out.println("***************Using for each***************");
		for(String s : hs) {
			System.out.println(s);
		}

		System.out.println("******************using iterator************");

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);

		}

	}

}
