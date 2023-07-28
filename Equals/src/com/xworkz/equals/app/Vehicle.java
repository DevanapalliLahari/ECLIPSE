package com.xworkz.equals.app;

public class Vehicle {
	
	private String type;
	private int noOfWheels;
	private int price;
	private int capacity;
	private boolean safty;
	public Vehicle(String type, int noOfWheels, int price, int capacity, boolean safty) {
		super();
		System.out.println("Running String,int,int,int,boolean const in Vehicle..");
		this.type = type;
		this.noOfWheels = noOfWheels;
		this.price = price;
		this.capacity = capacity;
		this.safty = safty;
	}
	@Override
	public String toString() {
		return "type " + this.type + "noOfWheels " + this.noOfWheels + "price " + this.price + "capacity " + this.capacity + "safty " + this.safty;
		
	}
	public String getType() {
		return type;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public int getPrice() {
		return price;
	}
	public int getCapacity() {
		return capacity;
	}
	public boolean getsafty() {
		return safty;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking Object method");
		if(obj!=null)
		{
			System.out.println("Argument is not null,Do comparision");
			if(obj instanceof Vehicle)
			{
			System.out.println(this);
			System.out.println(obj);
			Vehicle casted=(Vehicle)obj;
			if(this.type==casted.type&&this.capacity==casted.capacity&&noOfWheels==casted.noOfWheels&&price==this.price&&safty==this.safty)
			{
				System.out.println("print arguments...");
				return true;
			}else {
				return false;
			}
			}
			else {
				System.out.println("Vehicle...");
			}
		}
		else {
			System.err.println("Argument is null,Skip comparision");
		}
		return true;
		
	}

	
	

}
