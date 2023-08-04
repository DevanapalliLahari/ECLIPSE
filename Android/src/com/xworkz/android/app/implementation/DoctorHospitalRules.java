package com.xworkz.android.app.implementation;

import com.xworkz.android.app.HospitalRules;

public class DoctorHospitalRules implements HospitalRules{
	
	public int NO_OF_SPECIALISTS=15;

	@Override
	public void silence() {
		
		System.out.println("Running silence method in DoctorHospitalRules");
	}

}
