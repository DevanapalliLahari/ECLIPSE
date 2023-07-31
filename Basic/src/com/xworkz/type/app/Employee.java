package com.xworkz.type.app;

public class Employee {
	
	String name;

	public Employee(String name) {
		super();
		System.out.println("Running String const in Employee...");
		this.name = name;
	}
	
	public void printInfo()
	{
		System.out.println("Print info about Employee...");
		System.out.println("Name "+this.name);
	}

}
