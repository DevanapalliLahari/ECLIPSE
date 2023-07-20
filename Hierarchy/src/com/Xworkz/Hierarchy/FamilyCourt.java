package com.Xworkz.Hierarchy;

public class FamilyCourt extends CivilCourt{
	
	FamilyCourt()
	{
		System.out.println("Running no-args const in FamilyCourt");
	}
	void divorce()
	{
		System.out.println("Running divorce method in FamilyCourt");
	}
	@Override
	void propertyCase()
	{
		System.out.println("Running propertyCase method in CivilCourt");
	}
	@Override
	void theftCase()
	{
		System.out.println("Running theftCase method in CivilCourt");
	}

}
