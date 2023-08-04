package com.xworkz.rocket.implementation;

import com.xworkz.robot.app.HotelRule;

public class HotelManager implements HotelRule {

	@Override
	public void serving() {
		System.out.println("Invoking treatment ");
	}

}
