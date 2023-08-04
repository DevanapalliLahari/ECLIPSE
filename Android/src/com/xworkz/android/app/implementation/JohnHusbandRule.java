package com.xworkz.android.app.implementation;

import com.xworkz.android.app.HusbandRules;

public class JohnHusbandRule implements HusbandRules{
	
	public int HUSBAND_AGE=30;

	@Override
	public void dontArgue() {
		System.out.println("Running dont Argue method in JohnHusbandRule");
		
	}

}
