package com.xworkz.BagRunner;

import com.xworkz.bag.Abstract.Bag;
import com.xworkz.bag.Abstract.RealBag;
import com.xworkz.bag.implimentation.Hermens;

public class BagRunner {
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		Bag bag=new Hermens();
		String value = bag.storage();
		bag.thingsCarry();
		RealBag realBag=(RealBag)bag;
		realBag.travel();
	}
	
	

}
