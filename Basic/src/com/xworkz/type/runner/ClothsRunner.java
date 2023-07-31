package com.xworkz.type.runner;

import com.xworkz.type.app.Dress;
import com.xworkz.type.app.TShirt;

public class ClothsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TShirt shirt=new TShirt("DNMX", "Small", "Pink",200, "Casual", "V_Neck");
		shirt.printInfo();
		Dress dress=new Dress("Max", "Large", "Cotton", "Winter");
		dress.printInfo();

	}

}
