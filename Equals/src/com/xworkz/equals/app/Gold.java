package com.xworkz.equals.app;

public class Gold {
	
	private String location;
	private String design;
	private int price;
	private boolean historical;
	
	public Gold(String location, String design, int price, boolean historical) {
		super();
		System.out.println("Running String,String,int,boolean consts in gold..");
		this.location = location;
		this.design = design;
		this.price = price;
		this.historical = historical;
	}
	@Override
	public String toString() {
		return "location " +this.location +"design "+ this.design +"price "+this.price +"historical " +this.historical;
		
	}
	public String getDesign() {
		return design;
	}
	public int getPrice() {
		return price;
	}
	public String getLocation() {
		return location;
	}
	public boolean gethisorical() {
		return historical;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking Object method");
		if(obj!=null)
		{
			System.out.println("Argument is not null,Do comparision");
			if(obj instanceof Gold)
			{
			System.out.println(this);
			System.out.println(obj);
			Gold casted=(Gold)obj;
			if(this.location==casted.location&&this.design==casted.design&&price==casted.price&&historical==casted.historical)
			{
				System.out.println("Both  are same...");
				return true;
			}else {
				System.out.println("Both  are not same...");
			}
			}
			else {
				System.out.println("Gold...");
			}
		}
		else {
			System.err.println("Argument is null,Skip comparision");
		}
		return false;
	}

}
