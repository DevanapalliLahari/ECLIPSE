package com.xworkz.equals.app;

public class Slipper {
	
	private String brand;
	private int size;
	private int price;
	private boolean lightWeight;
	private boolean washable;
	private String color;
	private String shop;
	
	public Slipper(String brand, int size, int price, boolean lightWeight, boolean washable, String color,
			String shop) {
		super();
		System.out.println("Running String,int,int,boolean,boolean,String,String consts in Slipper...");
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.lightWeight = lightWeight;
		this.washable = washable;
		this.color = color;
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "brand " + this.brand + "size " + this.size + "price " + this.price + "lightWeight " + 
	this.lightWeight + "washable " + this.washable + "color " + this.color + "shop " + this.shop;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	public String getShop() {
		return shop;
	}
	public int getSize() {
		return size;
	}
	public boolean getLightWeight() {
		return lightWeight;
	}
	public boolean getWashable() {
		return washable;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking Object method");
		if(obj!=null)
		{
			System.out.println("Argument is not null,Do comparision");
			if(obj instanceof Slipper)
			{
			System.out.println(this);
			System.out.println(obj);
			Slipper casted=(Slipper)obj;
			if(this.brand==casted.brand&&this.size==casted.size&&price==casted.price&&lightWeight==casted.lightWeight&&washable==casted.washable&&color==casted.color&&shop==casted.shop)
			{
				System.out.println("print arguments...");
				return true;
			}else {
				return false;
			}
			}
			else {
				System.out.println("Slipper...");
			}
		}
		else {
			System.err.println("Argument is null,Skip comparision");
		}
		return true;
	}

}
