package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	double price;
	int ram;
	String name;

	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;

	}

	@Override
	public int compareTo(Laptop lp)
	{
		if(this.price>lp.price) {

			return 1;

		}else if(this.price<lp.price)  {

			return -1;

		}else {

			return 0;


		}
	}
}