package com.Xworkz.Hierarchy;

public class SupremeCourt extends Court {
	
	SupremeCourt()
	{
		System.out.println("Running no-arg const in SupremeCourt");
	}
	void importantCase()
	{
		System.out.println("Running importantCase method in SupremeCourt");
	}
	@Override
	void justice()
	{
		System.out.println("Running justice method in SupremeCourt..");
	}

}
