package com.xworkz.equals.app;

public class Grocery {

	private int storeSize;
	private boolean customerService;

	public Grocery(int storeSize, boolean customerService) {
		super();
		System.out.println("Running int boolean consts in Grocery..");
		this.storeSize = storeSize;
		this.customerService = customerService;
		
	}

	@Override
	public String toString() {
		return "storeSize :"+ this.storeSize + "customerService :"+ this.customerService;
	}

	public int getStoreSize() {
		return storeSize;
	}

	public boolean getcustomerService() {
		return customerService;
	}

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoking Object method");
			if(obj!=null)
			{
				System.out.println("Argument is not null,Do comparision");
				if(obj instanceof Grocery)
				{
				System.out.println(this);
				System.out.println(obj);
				Grocery casted=(Grocery)obj;
				if(this.storeSize==casted.storeSize&&this.customerService==casted.customerService)
				{
					System.out.println("print arguments...");
					return true;
				}else {
					return false;
				}
				}
				else {
					System.out.println("Grocery...");
				}
			}
			else {
				System.err.println("Argument is null,Skip comparision");
			}
			return true;
			
	}
	

}
