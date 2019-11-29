package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(29.5);
		al.add("jimmy");
		al.add(true);
		al.add("china");


		for (Object object : al)  {
			System.out.println(object);
		}
	}

}
