
package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.GroupLayout.Alignment;

public class TestF {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Anupama");
		al.add("Savitha");
		al.add("Kavitha");
		al.add("Sunitha");

		String name = al.get(0);
		System.out.println(name.toUpperCase());
		
		
		Iterator<String> li = al.iterator();
		while(li.hasNext())  {
			String s = li.next();
			System.out.println(s);
			
			
		}
		
		System.out.println("--------------Using List Listiterator-----");
		
		ListIterator<String> li1 =al.listIterator();
		while(li1.hasPrevious()) {
			String s = li1.previous();
			System.out.println(s);
			
		}
			

	}
}
