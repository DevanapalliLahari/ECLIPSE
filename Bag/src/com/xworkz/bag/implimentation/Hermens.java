package com.xworkz.bag.implimentation;

import com.xworkz.bag.Abstract.RealBag;

public class Hermens extends RealBag {
	
	@Override
	public String storage() {
			System.out.println("Running Storage method in Hermens");
			return "abc";
		}
	
	@Override
	public void travel() {
		System.out.println("Running travel method in Hermens");
		
	}

}
