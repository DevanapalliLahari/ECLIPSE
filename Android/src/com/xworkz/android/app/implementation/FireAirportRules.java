package com.xworkz.android.app.implementation;

import com.xworkz.android.app.AirportRules;

public class FireAirportRules implements AirportRules{
	
	public int PASSINGERS=100;

	@Override
	public void doNotBringFireworks() {
		System.out.println("Running doNotBringFireworks method in FireAirportRules");
		
	}

}
