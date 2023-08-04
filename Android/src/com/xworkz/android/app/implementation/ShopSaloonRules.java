package com.xworkz.android.app.implementation;

import com.xworkz.android.app.SaloonRules;

public class ShopSaloonRules implements SaloonRules{
	
	public int HAIRCUT_PRICE=1000;

	@Override
	public void waiting() {
		System.out.println("Running waiting method in ShopSaloonRules");
		
	}

}
