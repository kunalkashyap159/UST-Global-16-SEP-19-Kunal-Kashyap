package com.ustglobal.sorting.queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class TestA {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
				
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(23);
		Object[] o = v.toArray();
		System.out.println(o);
		List l = Arrays.asList(o);
		System.out.println(l);
		
		
		
		System.out.println(v.capacity());
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		v.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.offer(1);
		
		System.out.println(v.capacity());
		
		System.out.println("Before Poll" +pq);
		System.out.println("**************** Using Iterator***************");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext())  {
			System.out.println(pq.poll());
		}
		System.out.println("After poll "+pq);
	
		
	}

}
