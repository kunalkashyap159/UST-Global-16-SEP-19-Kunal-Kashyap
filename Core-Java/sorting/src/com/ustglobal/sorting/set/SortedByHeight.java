package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortedByHeight {
	public static void main(String[] args) {

		Comparator<Employee1> comp = (e1, e2) -> {
			if(e1.height > e2.height) {
				return 1;
			} else if(e1.height < e2.height) {
				return -1;
			} else  {
				return 0;
			}
		};

		TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);

		ts.add(new Employee1(4, "nikhil", 6.1));
		ts.add(new Employee1(1, "baskar", 5.8));
		ts.add(new Employee1(6, "dubey", 5.1));
		ts.add(new Employee1(2, "sunny", 4.6));

		System.out.println("==========Using Iterator============");
		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext()) {
			Employee1 e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("================================");
		}
	}

}
