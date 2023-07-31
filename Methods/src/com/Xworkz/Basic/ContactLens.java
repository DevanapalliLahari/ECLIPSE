package com.Xworkz.Basic;

public class ContactLens {
	static String purpose;
	String brand;
	
	void frame()
	{
		System.out.println("Display...");
		System.out.println(purpose);
		System.out.println(brand);
		defect();
	}
	
	static void defect()
	{
		System.out.println("Static...");
		purpose="View";
		System.out.println(purpose);
	}

}
