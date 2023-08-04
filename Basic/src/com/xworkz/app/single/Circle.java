package com.xworkz.app.single;

public class Circle extends Shape{
	
	int radius;
	double diameter;
	
	public Circle()
	{
		System.out.println("Running no-args const in Circle..");
	}
	
	public Circle(int radius, double diameter,String type,double width) {
		super(type,width);
		System.out.println("Running String,double,int,double consts in Circle...");
		this.radius = radius;
		this.diameter = diameter;
	}
	@Override
	public void printInfo()
	{
		System.out.println("Print the info about Circle..");
		super.printInfo();
		System.out.println("Radius "+this.radius);
		System.out.println("Diameter "+this.diameter);
	}

	

}
