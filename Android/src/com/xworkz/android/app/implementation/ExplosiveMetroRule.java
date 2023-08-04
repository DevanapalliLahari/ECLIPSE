package com.xworkz.android.app.implementation;

import com.xworkz.android.app.MetroRules;

public class ExplosiveMetroRule implements MetroRules{
		
		public String METRO_NAME="Bengalore Metro";

		@Override
		public void buyTicket() {
			System.out.println("Running buyTicket method in ExplosiveMetroRule");
			
		}

	}


