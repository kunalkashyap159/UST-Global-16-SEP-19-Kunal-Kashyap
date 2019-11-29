package com.ustglobal.objectclass;

public class TestA {

	public static void main(String[] args) {
		
		PenDrive p= new PenDrive();
		USB.connect(p);
		
		Mouse m = new Mouse();
		USB.connect(m);
		

	}

}
