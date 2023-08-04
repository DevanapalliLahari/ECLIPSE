package com.xworkz.rocket.implementation;

import com.xworkz.robot.app.HomeRules;

public class ParentHomeRules implements HomeRules {

	@Override
	public void silent() {
		System.out.println("Invoking silent in Home rules");

	}

}
