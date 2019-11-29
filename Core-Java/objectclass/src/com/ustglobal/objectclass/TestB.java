package com.ustglobal.objectclass;

public class TestB {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.hashCode();
		int pHashCode = p.hashCode();
		System.out.println("Hashcode of p is " +pHashCode) ;
		
		Pen q = new Pen();
		q.hashCode();
		int qHashCode = q.hashCode();
		System.out.println("Hashcode of p is " +qHashCode) ;


	}

}
