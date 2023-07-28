package com.xworkz.equals.app.runner;

import com.xworkz.equals.app.Assets;

public class AssetsRunner {
	
	public static void main(String[]args) {
		
		System.out.println("Main Method");
		
		Assets assets=new Assets("James",500000,"land");
		System.out.println(assets);
		
		Assets assets1=new Assets("James",500000,"land");
		System.out.println(assets1);
		
		boolean same=assets.equals(assets1);
		System.out.println("Both are same :"+same);
	}

}
