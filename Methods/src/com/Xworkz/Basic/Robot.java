package com.Xworkz.Basic;

public class Robot {
	
	static String size;
	String shape;
	
	void Manipulating()
	{
		System.out.println("Display...");
		System.out.println(size);
		System.out.println(this.shape);
		cleaning();
	}
	static void cleaning()
	{
		System.out.println("Static");
		size="Micro Robots";
		System.out.println(size);
	}

}
