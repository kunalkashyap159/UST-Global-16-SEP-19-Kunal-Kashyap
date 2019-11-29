package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestO {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		
		System.out.println("Before sorting "+l);
		Collections.sort(l);
		System.out.println("After sorting "+l);
		
		Collections.reverse(l);
		System.out.println("After reversing "+l);
		
		Collections.shuffle(l);
		System.out.println("After shuffling "+l);
	}

}
