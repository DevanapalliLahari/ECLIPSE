package com.xworkz.type.app;

public class Meat extends Fruit{
	
	String type;
	int grams;
	
	
	public Meat(int price, String shopName, String name, int cost, String type, int grams) {
		super(price, shopName, name, cost);
		System.out.println("Running int,String,String,int,String,int consts in Meat...");
		this.type = type;
		this.grams = grams;
	}
	
	@Override
	public void printInfo()
	{
		System.out.println("Print info about Meat");
		super.printInfo();
		System.out.println("Type "+this.type);
		System.out.println("Grams "+this.grams);
	}
}
