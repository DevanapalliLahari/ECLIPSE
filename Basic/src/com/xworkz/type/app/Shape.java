package com.xworkz.type.app;

public class Shape {

	String type;
	double width;
	
	public Shape()
	{
		System.out.println("Running no-args const in Shape..");
	}
	
	public Shape(String type, double width) {
		super();
		System.out.println("Running String,double consts in Shape...");
	    this.type = type;
		this.width = width;
	}
	public void printInfo()
	{
		System.out.println("Print the info about Shape..");
		System.out.println("Type "+this.type);
		System.out.println("Width "+this.width);
	}

}
