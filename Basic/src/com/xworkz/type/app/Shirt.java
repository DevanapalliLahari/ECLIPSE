package com.xworkz.type.app;

public class Shirt extends Cloths{
	
	String color;
	int price;
	public Shirt(String brand, String size, String color, int price) {
		super(brand, size);
		System.out.println("Running String,String,String,int consts in Shirt..");
		this.color = color;
		this.price = price;
	}
	
	@Override
	public void printInfo()
	{
		System.out.println("print info about Shirt...");
		super.printInfo();
		System.out.println("Color"+this.color);
		System.out.println("Price "+this.price);
	}
	

}
