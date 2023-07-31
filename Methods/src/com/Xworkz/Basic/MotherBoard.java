package com.Xworkz.Basic;

public class MotherBoard {
	
	static int cost;
	String brand;
	
	void typing()
	{
		System.out.println("Display...");
		System.out.println(cost);
		System.out.println(this.brand);
		input();
	}
	static void input()
	{
		System.out.println("Static");
		cost=2000;
		System.out.println(cost);

	}

}
