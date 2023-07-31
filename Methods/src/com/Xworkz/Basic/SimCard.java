package com.Xworkz.Basic;

public class SimCard {
	
	static String type;
	int price;
	
	void storage()
	{
		System.out.println("Display..");
		System.out.println(type);
		System.out.println(this.price);
		text();
	
	}
	
	static void text()
	{
		System.out.println("Static..");
		type="Micro Sim";
		System.out.println(type);
	}

}
