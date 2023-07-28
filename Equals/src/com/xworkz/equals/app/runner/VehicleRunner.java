package com.xworkz.equals.app.runner;

import com.xworkz.equals.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		Vehicle vehicle=new Vehicle("Bus",4,700000,50,true);
		System.out.println(vehicle);
		
		Vehicle vehicle1=new Vehicle("Bus",4,700000,50,true);
		System.out.println(vehicle1);
		
		boolean same=vehicle.equals(vehicle1);
		System.out.println("Both are same :"+same);
	
	}

}
