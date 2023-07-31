package com.Xworkz.Basic;

public class Rope {
	static String material;
	int weight;
	
	void dragging()
	{
		System.out.println("Display..");
		System.out.println(material);
		System.out.println(this.weight);
		lifting();
	}
	
	static void lifting()
	{
		System.out.println("Static..");
		material="Cotton ";
		System.out.println(material);
	}

}
