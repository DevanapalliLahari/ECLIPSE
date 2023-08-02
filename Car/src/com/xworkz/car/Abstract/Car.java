package com.xworkz.car.Abstract;

public abstract class Car {
	
	public abstract void getSafty();
	
	public final void environmentalImpact()
	{
		System.out.println("Running environmental impact method usin final keyword in Car..");	
	}

}
