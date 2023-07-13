package com.Xworkz.Basic;

public class Coastal {
	static boolean floraAndFauna;
	String climate;
	
	void tourism()
	{
		System.out.println("Display...");
		System.out.println(floraAndFauna);
		System.out.println(this.climate);
		aquaCulture();
	}
	static void aquaCulture()
	{
		System.out.println("Static");
		floraAndFauna=true;
		System.out.println(floraAndFauna);
	}

}
