package com.ustglobal.javabeanclass;

public class TestB {
	public static void main(String[] args) {
		
		Employee e = new Employee ();
		
		e.setAddress("Bangalore");
		e.setName("Kabir");
		e.setDept(453);
		e.setDesignation("Software Developer");
		e.setSalary(50000);
		e.setEmail("kabir@gmail.com");
		e.setId(100);
		
		
		Database1 db1 = new Database1();
		db1.receive(e);
	}

}
