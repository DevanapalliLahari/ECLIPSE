package com.xworkz.mobile.Abstract;

public abstract class Mobile {
	
	public abstract void batteryLife();
	
	public final void getUpdates()
	{
		System.out.println("Running get Updates method in Mobile");
	}

}
