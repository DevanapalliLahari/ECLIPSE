package com.xworkz.android.app.implementation;

import com.xworkz.android.app.HotelRules;

public class SleepyHotelRules implements HotelRules {
	
	public int NO_OF_ROOMS=30;

	@Override
	public void doNotAllowDrugs() {
		System.out.println("Running doNotAllowDrugs method in SleepyHotelRules");
		
	}

}
