package com.ustglobal.javabeanclass;
import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Scannar class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Are you male ? ");
		boolean a = sc.hasNextBoolean();
		System.out.println(a);
	}

}
