package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {


		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		for(int i = 0;i<nums.length;i++)  {
			System.out.println(nums[i]); 
		}

		for(int num : nums)  {
			System.out.println("---------------------------------");
		}
		System.out.println("=================================");
		char[] ch = {'a', 'b', 'c', 'd'};
		for(int i = 0;i<ch.length;i++);  {
			System.out.println(ch[i]);
		}
		System.out.println("==================================");
		for(int c : ch)  {
			System.out.println(c);
		}

		System.out.println("===================================");
		boolean[] b = {true, false, true, false, true, true};
		for(int j = 0;j<b.length;j++) {
			System.out.println(j);
		}
		
		System.out.println("---------------------------------");
		String[] names = {"aishu", "kavya", "divya", "priya"};
		for(int i=0; i<names.length;i++)  {
			System.out.println(names[i]);
		}
		
		System.out.println("==================================");
		for(String name : names);  {
			System.out.println(names);
		}
		


	}
}
