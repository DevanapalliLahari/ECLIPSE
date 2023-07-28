package com.xworkz.equals.app.runner;

import com.xworkz.equals.app.DryFruits;

public class DryFruitsRunner {
	public static void main(String[]args) {
		
		System.out.println("Main Method");
		DryFruits fruits=new DryFruits("Almond", "Minerals", false, true, 150, "Vitamin A");
		System.out.println(fruits);
		DryFruits fruits1=new DryFruits("Almond", "Minerals", false, true, 150, "Vitamin A");
		System.out.println(fruits1);
		
		boolean same=fruits.equals(fruits1);
		System.out.println("Both are same "+same);

		
	}

}
