package com.xworkz.rocket.implementation;

import com.xworkz.robot.app.BankRule;

public class AccountBankRule implements BankRule{

	@Override
	public void transaction() {
		System.out.println("invoking transaction in bank rule");
	}

}
