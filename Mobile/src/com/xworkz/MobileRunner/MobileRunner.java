package com.xworkz.MobileRunner;

import com.xworkz.mobile.Abstract.Mobile;
import com.xworkz.mobile.Abstract.Oppo;
import com.xworkz.mobile.implimentation.MobileImplimentation;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mobile=new MobileImplimentation();
		
		mobile.batteryLife();
		mobile.getUpdates();
		Oppo oppo=(Oppo)mobile;
		oppo.security();

	}

}
