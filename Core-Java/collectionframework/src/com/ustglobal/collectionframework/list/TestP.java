package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestP {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("girja");
		al.add("manya");
		al.add("jalja");
		al.add("mosai");
		
		System.out.println("Before sorting------>"+al);
		Collections.sort(al);
		System.out.println("After sorting------->"+al);
	}

}
