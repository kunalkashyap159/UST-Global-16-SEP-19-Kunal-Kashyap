package com.ustglobal.singleton;

public class TestA {
	public static void main(String[] args) {
		
		String s1 ="Hello";
		
		MySingleton ms1 =  MySingleton.getDbConnection();
		ms1.s = "Hello";
		System.out.println("Hashcode of ms1 "+ms1.hashCode());
		
		MySingleton ms2 =  MySingleton.getDbConnection();
		ms2.s ="Hi";
		System.out.println("Hashcode of ms2 "+ms2.hashCode());
		
		System.out.println(ms1.s);
		System.out.println(ms2.s);
		
		
	}

}     
