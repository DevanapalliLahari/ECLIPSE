package com.xworkz.type.app;

public class Cloths {
	
	String brand;
	String size;
	public Cloths(String brand, String size) {
		super();
		System.out.println("Running String,String consts in Cloths...");
		this.brand = brand;
		this.size = size;
	}
	
	public void printInfo()
	{
		System.out.println("print info about cloths...");
		System.out.println("Brand "+this.brand);
		System.out.println("Size "+this.size);
	}

}
