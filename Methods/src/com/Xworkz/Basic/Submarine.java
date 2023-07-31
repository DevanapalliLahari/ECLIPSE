package com.Xworkz.Basic;

public class Submarine {
	
	static String size;
	String missionType;
	
	void system()
	{
		System.out.println("Display...");
		System.out.println(size);
		System.out.println(this.missionType);
		awareness();
	}
	static void awareness()
	{
		System.out.println("Static");
		size="Vary in Size ";
		System.out.println(size);
	}

}
