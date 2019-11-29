package com.ustglobal.javabeanclass;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRoll(12);
		s.setName("divya");
		s.setMobile(45678765);
		
		Database db = new Database();
		db.receive(s);
	}

}
