package com.ustglobal.objectclass;

public class TestC {

	public static void main(String[] args) {
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m. toString();
		System.out.println(h);
		System.out.println(s);
		
		int a = 10;
		
		Marker p = new Marker();
		System.out.println(p);  // internally toString() method gets called...
		System.out.println(a);

	}

}
