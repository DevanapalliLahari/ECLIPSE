package com.Xworkz.Basic;

public class Television {
		
		static int length;
		String brand;
		
		void watch()
		{
			System.out.println("Display..");
			System.out.println(length);
			System.out.println(this.brand);
			enjoy();
		}
		static void enjoy()
		{
			System.out.println("Static..");
			length=20;
			System.out.println(length);
		}
}

