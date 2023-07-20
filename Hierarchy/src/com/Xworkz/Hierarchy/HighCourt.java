package com.Xworkz.Hierarchy;

public class HighCourt extends SupremeCourt{
	
	HighCourt()
	{
		System.out.println("Running no-arg const in HighCourt...");
	}
	void criminalCase()
	{
		System.out.println("Running criminalCase method in HighCourt");
	}
	void forgeryCase()
	{
		System.out.println("Running forgeryCase method in HighCourt");
	}
	@Override
	void importantCase()
	{
		System.out.println("Running importantCase method in HighCourt");
	}

}
