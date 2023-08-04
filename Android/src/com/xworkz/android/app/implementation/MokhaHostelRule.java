package com.xworkz.android.app.implementation;

import com.xworkz.android.app.HostelRules;

public class MokhaHostelRule implements HostelRules{
	
	public int NO_OF_ROOMS=35;

	@Override
	public void electricDevicesNotAllowed() {
		System.out.println("Running electricDevicesNotAllowed method in MokhaHostelRule");
		
	}

}
