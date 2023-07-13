package com.Xworkz.Work;

public class Theater {
	String name;
	TheaterLocation location;
	int noOfSeats=150;
	String seatColor;
	
	Theater(String name)
	{
		this.name=name;
	}
	
	void setSeatColor(String seatColor)
	{
		this.seatColor=seatColor;
		
	}
	void display()
	{
		System.out.println("Display...");
		System.out.println(name);
		System.out.println(location);
		System.out.println(noOfSeats);
		System.out.println(seatColor);
	}

}
