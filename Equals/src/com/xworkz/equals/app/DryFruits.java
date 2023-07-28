package com.xworkz.equals.app;

public class DryFruits {
	
	private String name;
	private String nutrients;
	private boolean allergy;
	private boolean fiberContent;
	private int price;
	private String vitamins;
	
	public DryFruits(String name, String nutrients, boolean allergy, boolean fiberContent, int price, String vitamins) {
		super();
		System.out.println("Running String,String,boolean,boolean,int,String consts in DryFruits");
		this.name = name;
		this.nutrients = nutrients;
		this.allergy = allergy;
		this.fiberContent = fiberContent;
		this.price = price;
		this.vitamins = vitamins;
	}
	
	@Override
	public String toString() {
		return "name " +this.name + "nutrients " +this.nutrients + "allergy " +this.allergy + "fiberContent " +this.fiberContent + "price " +this.price + "vitamins " +this.vitamins;
		
	}
	public String getName() {
		return name;
	}
	public String getNutrients() {
		return nutrients;
	}
	public int getPrice() {
		return price;
	}
	public String getVitamins() {
		return vitamins;
	}
	public boolean getallergy() {
		return allergy;
	}
	public boolean getfiberContent() {
		return fiberContent;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking Object method");
		if(obj!=null)
		{
			System.out.println("Argument is not null,Do comparision");
			if(obj instanceof DryFruits)
			{
			System.out.println(this);
			System.out.println(obj);
			DryFruits casted=(DryFruits)obj;
			if(this.name==casted.name&&this.nutrients==casted.nutrients&&allergy==casted.allergy&&fiberContent==casted.fiberContent&&price==casted.price&&vitamins==casted.vitamins)
			{
				System.out.println("print arguments...");
				return true;
			}else {
				return false;
			}
			}
			else {
				System.out.println("DryFruits...");
			}
		}
		else {
			System.err.println("Argument is null,Skip comparision");
		}
		return true;
	}
	
	

}
