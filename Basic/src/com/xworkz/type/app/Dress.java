package com.xworkz.type.app;

public class Dress extends Cloths{
	
	String material;
	String season;
	public Dress(String brand, String size, String material, String season) {
		super(brand, size);
		System.out.println("Running Strin,String,String,String consts in Dress..");
		this.material = material;
		this.season = season;
	}
	@Override
	public void printInfo()
	{
		System.out.println("print info about Dress...");
		super.printInfo();
		System.out.println("Material"+this.material);
		System.out.println("Season "+this.season);
	}

}
