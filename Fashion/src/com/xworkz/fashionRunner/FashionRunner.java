package com.xworkz.fashionRunner;

import com.xworkz.fashion.Abstract.Cloths;
import com.xworkz.fashion.Abstract.Fashion;
import com.xworkz.fashion.implimentation.DnmxCloths;

public class FashionRunner {

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		Fashion fashion=new DnmxCloths();
		fashion.cleaning();
		fashion.getWear();
		Cloths cloths=(Cloths)fashion;
		cloths.sell();
		
	}

}

