package com.xworkz.rocket.implimentation;

import com.xworkz.rocket.Abstract.Chandrayan;

public class RocketImplimentation extends Chandrayan {

	@Override   
	public  void gravityTurn()
	{
		System.out.println("Running gravityTurn method in RocketImplimentation");
	
	}
	@Override
	public void controlSystem() {
		
		System.out.println("Running controlSystem method in RocketImplimentation");
	}

}
