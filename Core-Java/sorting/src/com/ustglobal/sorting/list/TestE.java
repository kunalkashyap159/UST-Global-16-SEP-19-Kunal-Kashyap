package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	
	LinkedList<Pen> lp = new LinkedList<Pen>();
	
	Pen p1 = new Pen(100, "parker","red");
	Pen p2 = new Pen(200, "glycer","blue");
	Pen p3 = new Pen(50,"cello","black");
	lp.add(p1);
	lp.add(p2);
	lp.add(p3);
	
	
		System.out.println("Before sorting---------->");
	void displayPenDetails(al);
	

}
 
static void displayPenDetails(LinkedList<Pen> al) {
	Iterator<Pen> it = al.iterator();
	while(it.hasNext()) {
		Pen p = it.next();
		System.out.println("pen price " +p.price );
		System.out.println("pen brand "+p.brand);
		
	}
}
