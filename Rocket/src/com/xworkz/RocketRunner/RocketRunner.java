package com.xworkz.RocketRunner;

import com.xworkz.rocket.Abstract.Chandrayan;
import com.xworkz.rocket.Abstract.Rocket;
import com.xworkz.rocket.implimentation.RocketImplimentation;

public class RocketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rocket rocket=new RocketImplimentation();
		
		rocket.controlSystem();
		rocket.engineSeperation();
		Chandrayan chandrayan=(Chandrayan)rocket;
		chandrayan.gravityTurn();

	}

}
