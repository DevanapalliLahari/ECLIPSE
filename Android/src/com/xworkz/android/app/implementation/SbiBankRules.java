package com.xworkz.android.app.implementation;

import com.xworkz.android.app.BankRules;

public class SbiBankRules implements BankRules {
	public String location = "Banglore";

	@Override
	public void loan() {
		System.out.println("Loan interest");

	}

}
