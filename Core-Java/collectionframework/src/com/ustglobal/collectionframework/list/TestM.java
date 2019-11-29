package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestM {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		
		al.add(34.1);
		al.add(23.9);
		al.add(87.4);
		al.add(24.6);
		al.add(18.7);
		al.add(34.1);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		al.add(2, 54.6);
		System.out.println("After adding in 2nd index "+al);
		al.remove(0);
		System.out.println("After removing in 0th index "+al);
		al.add(null);
		System.out.println("After removing null "+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index "+al);
		al.set(2, 77.6);
		System.out.println("After replacing 2nd index "+al);
		al.clear();
		System.out.println("After clear method "+al);
		al.contains(54.6);
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(42.6);
		al1.add(37.8);
		
		al.addAll(al1);
		System.out.println("After add all "+al1);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Cointains all "+contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("Removed all of al1 "+res);
		System.out.println("After removing "+al);
	}

}
