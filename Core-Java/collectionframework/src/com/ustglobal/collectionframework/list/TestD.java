
package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.GroupLayout.Alignment;

public class TestD {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(20);
		al.add(67.5);
		al.add("yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
		
		System.out.println("-------------------->Forward");
		while(li.hasNext()) {
			Object o = li.next();
			System.out.println(o);
			
		}
		System.out.println("Backward------------------");
		
		while(li.hasPrevious()) {
			Object ob = li.previous();
			System.out.println(ob);
		}
	}

}
