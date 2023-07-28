package com.xworkz.equals.app.runner;

import com.xworkz.equals.app.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		Gold gold=new Gold("Btm","Ring",30000,true);
		System.out.println(gold);
		Gold gold1=new Gold("Btm","Ring",25000,false);
		System.out.println(gold1);
		boolean same=gold.equals(gold1);
		System.out.println("Both are same "+same);

	}

}
