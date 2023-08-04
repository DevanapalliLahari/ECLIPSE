package com.xworkz.android.app.implementation;

import com.xworkz.android.app.TheaterRules;

public class AbcTheaterRule implements TheaterRules{
	
	public int TICKET_PRICE=250;

	@Override
	public void snackesNotAllowed() {
		System.out.println("Running snackesNotAllowed method in AbcTheaterRule");
		
	}

}
