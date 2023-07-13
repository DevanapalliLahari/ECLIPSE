package com.Xworkz.Basic;

public class Printer {
	
	static int speed;
	String type;
	
	void zerox()
	{
		System.out.println("Display...");
		System.out.println(speed);
		System.out.println(this.type);
		printing();
	}
	static void printing()
	{
		System.out.println("Static");
		speed=100;
		System.out.println(speed);
	}

}
