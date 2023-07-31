package com.Xworkz.Basic;

public class NailCutter {
	static String madeOf;
	int price;
	
	void uses()
	{
		System.out.println("Display..");
		System.out.println(madeOf);
		System.out.println(price);
		trim();
	}
	static void trim()
	{
		System.out.println("Static..");
		madeOf="Stainless Steel";
		System.out.println(madeOf);
	}
	

}
