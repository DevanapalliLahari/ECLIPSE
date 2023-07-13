package com.Xworkz.Basic;

public class Vaccum {
	
	static String name;
	int price;
	
	void clean()
	{
	System.out.println("Display...");
	System.out.println(name);
	System.out.println(price);
	removeDust();
	}
	
	static void removeDust()
	{
		System.out.println("Static...");
		name="Roomba";
		System.out.println(name);
	}

}
