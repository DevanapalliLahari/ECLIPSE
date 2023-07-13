package com.Xworkz.Work;

public class Resort {
	String name;
	String ownerName;
	ResortRoomType roomType;
	boolean breakfast=true;
	
	Resort(String name)
	{
		this.name=name;
	}
	void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
		
	}
	void display()
	{
		System.out.println("Display...");
		System.out.println(name);
		System.out.println(ownerName);
		System.out.println(roomType);
		System.out.println(breakfast);
	}
	

}
