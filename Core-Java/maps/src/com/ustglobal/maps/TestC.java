package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();

		lh.put("Bangalore", 568765);
		lh.put("Haryana", 138765);
		lh.put("Bhagalpur", 812001);

		System.out.println(lh);

		Set<String> s =lh.keySet();

		for(String key : s) {
			System.out.println("key: "+key);

		}

		System.out.println("==========================");

		Collection<Integer> c = lh.values();

		for(Integer value : c)  {
			System.out.println("Value: "+value);
		}
		System.out.println("----------------------------");

	}

}