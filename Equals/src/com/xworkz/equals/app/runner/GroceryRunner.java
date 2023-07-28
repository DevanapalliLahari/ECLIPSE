package com.xworkz.equals.app.runner;

import com.xworkz.equals.app.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		Grocery grocery=new Grocery(15,true);
		System.out.println(grocery);
		
		Grocery grocery1=new Grocery(17,true);
		System.out.println(grocery1);
		
		boolean same=grocery.equals(grocery1);
		System.out.println("Both are same :"+same);
		

	}

}
