package com.Xworkz.Work;

public class Temple {
	String name;
	String location;
	boolean historical=false;
	TempleArchitectName architectName;
	
	Temple(String name)
	{
		this.name=name;
	}
	void setLocation(String location )
	{
		this.location=location;
		
	}
	void display()
	{
		System.out.println("Display...");
		System.out.println(name);
		System.out.println(location);
		System.out.println(historical);
		System.out.println(architectName);
	}

}
