package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("kuku", 986467);
		hm.put("mala", 245664);
		hm.put("kusum", 567467);

		HashMap hm1 = new HashMap();

		hm1.put("deepa", 986467);
		hm1.put("riya", 327264);
		hm1.put("kriri", 469806);

		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key "+hasKey);

		System.out.println("************************");

		boolean hasKey1 = hm.containsValue(245664);
		System.out.println("Has Value "+hasKey1);

		hm.putAll(hm1);    // merger two map.........

		System.out.println("-------------------------");

		System.out.println("After put all "+hm);

		System.out.println(hm.size());

		boolean b1 = hm.isEmpty();
		System.out.println("Map is Empty "+b1);

		hm.clear();
		System.out.println("After clearance "+hm);
	}

}
