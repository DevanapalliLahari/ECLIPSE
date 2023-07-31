package com.Xworkz.Basic;

public class Engine {
	static String type;
	int length;
	
	void runner()
	{
		System.out.println("Display...");
		System.out.println(type);
		System.out.println(this.length);
		working();
	}
	
	static void working()
	{
		System.out.println("Static...");
		type="combustion";
		System.out.println(type);
	}

}
