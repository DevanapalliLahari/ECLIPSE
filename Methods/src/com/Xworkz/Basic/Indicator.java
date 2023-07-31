package com.Xworkz.Basic;

public class Indicator {
	
	static String color;
	String typeOfIndicator;
	
	void Monitor()
	{
		System.out.println("Display...");
		System.out.println(color);
		System.out.println(this.typeOfIndicator);
		navigate();
	}
	static void navigate()
	{
		System.out.println("Static");
		color="Green ";
		System.out.println(color);
	}

}
