package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.HashSet;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs =  new HashSet<>();
		
		hs.add("adrija");
		hs.add("payal");
		hs.add("deepa");
		hs.add("aditi");
		
		
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
