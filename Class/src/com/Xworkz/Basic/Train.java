package com.Xworkz.Basic;

public class Train {
	
	static String destination;
	boolean express;
	
	void travel()
	{
		System.out.println("Display...");
		System.out.println(destination);
		System.out.println(this.express);
		carryMaterials();
	}
	
	static void carryMaterials()
	{
		System.out.println("Static");
		destination="Tirupati";
		System.out.println(destination);
	}

}
