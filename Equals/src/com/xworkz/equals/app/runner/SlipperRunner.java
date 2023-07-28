package com.xworkz.equals.app.runner;

import com.xworkz.equals.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		Slipper slipper=new Slipper("Spark",9, 500, true, true, "Black", "ABC");
		System.out.println(slipper);
		Slipper slipper1=new Slipper("Spark",9, 500, true, true, "Black", "ABC");
		System.out.println(slipper1);
		
		boolean same=slipper.equals(slipper1);
		System.out.println("Both are same "+same);


	}

}
