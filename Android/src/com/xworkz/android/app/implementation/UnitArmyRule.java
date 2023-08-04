package com.xworkz.android.app.implementation;

import com.xworkz.android.app.ArmyRule;

public class UnitArmyRule implements ArmyRule{
	
	public static final int NO_OF_SOLDIERS=40;

	@Override
	public void fitness() {
		System.out.println("Running fitness method in UnitArmyRule...");
		
	}

}


