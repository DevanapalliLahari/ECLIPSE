package com.Xworkz.Basic;

public class Fabric {
	static String type;
	int price;
	
	void fabricInstance()
	{
	System.out.println("Display...");
	System.out.println(this.price);
	System.out.println(type);
	fabricStatic();
	}
	
	static void fabricStatic()
	{
		System.out.println("Static...");
		type="Silk";
		System.out.println(type);
	}
	

}

	

