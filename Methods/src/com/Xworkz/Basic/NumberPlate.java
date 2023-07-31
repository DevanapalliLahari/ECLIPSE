package com.Xworkz.Basic;

public class NumberPlate {
	
	static String format;
	String country;
	
	void Legal()
	{
		System.out.println("Display...");
		System.out.println(format);
		System.out.println(this.country);
		vehicle();
	}
	static void vehicle()
	{
		System.out.println("Static");
		format="Combination of letters and Numbers ";
		System.out.println(format);
	}

}
