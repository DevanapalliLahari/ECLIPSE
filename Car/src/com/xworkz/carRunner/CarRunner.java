package com.xworkz.carRunner;

import com.xworkz.car.Abstract.Bike;
import com.xworkz.car.Abstract.Car;
import com.xworkz.car.implimentation.CarImplimentation;


public class CarRunner {

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		
		Car car=new CarImplimentation();
		
		car.environmentalImpact();
		car.getSafty();
		Bike bike1=(Bike)car;
		bike1.getElectricSystem();

	}

}
