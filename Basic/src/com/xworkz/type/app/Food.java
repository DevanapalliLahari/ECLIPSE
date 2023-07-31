package com.xworkz.type.app;

public class Food {
	
	int price;
	String shopName;
	
	public Food(int price, String shopName) {
		super();
		System.out.println("Running int,String consts in Food...");
		this.price = price;
		this.shopName = shopName;
	}
	public void printInfo()
	{
		System.out.println("Print info about Food..");
		System.out.println("Price "+this.price);
		System.out.println("ShopName "+this.shopName);
	}

}
