package com.Xworkz.Basic;

public class Hospital {

	static String name;
	String branch;
	String chiefDoctor;
	
	void  displayInstance() 
	{
		System.out.println("Display...");
		System.out.println(name);
		System.out.println(branch);
		System.out.println(this.chiefDoctor);
		displayStatic();
	}
	
	static void displayStatic()
	{
		System.out.println("Static");
		name="St.johns";
		name="Jayadeva";
		System.out.println(name);
		

	}
	
}
