package com.xworkz.car.implimentation;

import com.xworkz.car.Abstract.Bike;

public class CarImplimentation extends Bike{
	
	@Override 
	public void getElectricSystem() {
		System.out.println("Running electric system method in carimplimentation");
		
	}
	@Override 
	public void getSafty() {
		System.out.println("Running getSafty method in carimplimentation");
		
	}
	
	

}
