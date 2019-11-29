package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		
		li.add(20);
		li.add(67.5);
		li.add("yash");
		li.add(true);
		li.add(null);
		li.add(null);
		
		
		System.out.println("-----------Using For Loop-----------");
		for (int i = 0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("================Using for each loop==========");
		 for(Object obj : li)   {
			 System.out.println(obj);
		 }
	
		
		
		System.out.println("-----------Using iterator forward -----------");
		
		Iterator it =li.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
		
		System.out.println("=============Using List Iterator forward ============");
		
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("===============backward============");
		
		while(lt.hasPrevious()) {
			Object ob = lt.previous();
			System.out.println(ob);
		}
	
		
		
		
	}

}