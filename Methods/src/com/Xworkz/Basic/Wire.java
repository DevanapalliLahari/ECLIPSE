package com.Xworkz.Basic;

public class Wire {
	
	static String color;
	String type;
	
	void sharing()
	{
		System.out.println("Display..");
		System.out.println(color);
		System.out.println(this.type);
		communicate();
	
	}
	
	void communicate()
	{
		System.out.println("Static..");
		color="Black ";
		System.out.println(color);
	}

}
