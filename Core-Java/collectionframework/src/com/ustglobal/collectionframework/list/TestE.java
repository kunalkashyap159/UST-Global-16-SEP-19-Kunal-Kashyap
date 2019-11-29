
package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

import javax.swing.GroupLayout.Alignment;

public class TestE {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("adrija");
		
		Object obj =al.get(0);
		String name = (String)obj;
		
		name = name.toUpperCase();
		System.out.println(name);
	}

}
