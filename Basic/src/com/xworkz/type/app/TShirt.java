package com.xworkz.type.app;

public class TShirt extends Shirt{
	
	String style;
	String neckLine;
	public TShirt(String brand, String size, String color, int price, String style, String neckLine) {
		super(brand, size, color, price);
		System.out.println("Running String,String,String,int,String,String Consts in TShirt..");
		this.style = style;
		this.neckLine = neckLine;
	}
	
	@Override
	public void printInfo()
	{
		System.out.println("print info about TShirt...");
		super.printInfo();
		System.out.println("Style"+this.style);
		System.out.println("NeckLine "+this.neckLine);
	}

}
