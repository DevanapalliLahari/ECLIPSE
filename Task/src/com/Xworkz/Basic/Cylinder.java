package com.Xworkz.Basic;

public class Cylinder {
	static int price;
	int duration;
	
	void  cylinderInstance() 
	{
		System.out.println("Display...");
		System.out.println(price);
		System.out.println(this.duration);
		cylinderStatic();
	}
	static void cylinderStatic()
	{
		System.out.println("Static");
		price=1200;
		price=1100;
		System.out.println(price);
	}

}
