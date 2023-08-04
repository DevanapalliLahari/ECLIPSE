package com.xworkz.android.app.implementation;

import com.xworkz.android.app.HomeRules;

public class AtpHomeRule implements HomeRules{
	
	public int BUDGET=10000;


	@Override
	public void dontGoNightouts() {
		System.out.println("Running DontGoNightouts method in AtpHomeRule");
		
	}

}
