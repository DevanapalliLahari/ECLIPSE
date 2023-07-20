package com.Xworkz.Hierarchy;

public class CivilCourt extends HighCourt {
	
	CivilCourt()
	{
		System.out.println("Running no-args const in CivilCourt");
	}
	void propertyCase()
	{
		System.out.println("Running propertyCase method in CivilCourt");
	}
	void theftCase()
	{
		System.out.println("Running theftCase method in CivilCourt");
	}
	@Override
	void criminalCase()
	{
		System.out.println("Running criminalCase method in HighCourt");
	}
	@Override
	void forgeryCase()
	{
		System.out.println("Running forgeryCase method in HighCourt");
	}

}
