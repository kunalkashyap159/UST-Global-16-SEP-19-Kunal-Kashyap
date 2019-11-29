package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {

		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();

		lh.put("Hyderabad", 568765);
		lh.put("Delhi", 138765);
		lh.put("Bhagalpur", 812001);
	//	lh.put(null, 746373);   NullPointException

		for(Map.Entry<String, Integer> m : lh.entrySet()) {

			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
			System.out.println("=========================");
		}

	}

}
