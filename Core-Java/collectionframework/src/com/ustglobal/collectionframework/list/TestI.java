package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
	public static void main(String[] args) {
		
		Stack li = new Stack();
		
		li.add(20);
		li.add(67.5);
		li.add("yash");
		li.add(true);
		li.add(null);
		li.add(null);
		
		
		System.out.println("-----------Using For Loop-----------");
		Iterator it = li.iterator();
		for (int i = 0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("================Using for each loop==========");
		 for(Object object : li)   {
			 System.out.println(object);
		 }
	
		
		
		System.out.println("-----------Using iterator-----------");
		Iterator it1 =li.iterator();
		while(it.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
			
		}
		
		System.out.println("=============Using List Iterator============");
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("-------------List Iterator backward--------------");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(0);
		}
		
	}

}
