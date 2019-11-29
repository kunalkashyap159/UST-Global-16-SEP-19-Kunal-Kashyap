package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();

		lh.put("Bangalore", 568765);
		lh.put("Haryana", 138765);
		lh.put("Bhagalpur", 812001);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is: "+key+" ------ "+"value is: "+value);
			System.out.println("=========================");
		}
	}

}
