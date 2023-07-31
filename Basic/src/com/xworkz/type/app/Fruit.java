package com.xworkz.type.app;

public class Fruit extends Food{
	
	String name;
	int cost;
	public Fruit(int price, String shopName, String name, int cost)
	{
		super(price, shopName);
		System.out.println("Running int,String,String,int consts in Fruit..");
		this.name = name;
		this.cost = cost;
	}
	@Override
	public void printInfo()
	{
		System.out.println("Print info about Fruit");
		super.printInfo();
		System.out.println("Name "+this.name);
		System.out.println("Cost "+this.cost);
	}

}
