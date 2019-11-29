package com.ustglobal.hasarelation.weak;

public class Car {
	String name;
	Music m = new Music();
	
	void move() {
		System.out.println("car () ");
	
	}
	
	void park() {
		System.out.println("car park() ");
	}

}
