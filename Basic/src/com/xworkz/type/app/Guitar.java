package com.xworkz.type.app;

public final class Guitar {
	
	final int noOfStrings=8;
	final double weight;
	final String type;
	
	public Guitar(double weight, String type) {
		super();
		System.out.println("Running double,String consts in Guitar..");
		this.weight = weight;
		this.type = type;
	}
	
	public final void printInfo() {
		System.out.println("Print info about Guitar..");
		System.out.println("NoOfStrings "+this.noOfStrings);
		System.out.println("Weight "+this.weight);
		System.out.println("Type "+this.type);
		
	}
	

}
