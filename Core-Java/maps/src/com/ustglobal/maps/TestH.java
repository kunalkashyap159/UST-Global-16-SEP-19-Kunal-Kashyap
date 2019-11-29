package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(100, "monu");
		ht.put(99, "sonu");
		ht.put(101, "sriram");
		ht.put(105, "ax");
		ht.put(208, "jj");
//		ht.put(null, "rohan");  NullPointerException
//		ht.put(108, null);	NullPointerException
		
		System.out.println("Data "+ht);
		
	}

}
