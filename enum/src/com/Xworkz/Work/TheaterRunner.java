package com.Xworkz.Work;

public class TheaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater theater=new Theater("Triveni");
		theater.setSeatColor("Blue");
		theater.location=TheaterLocation.BANGALORE;
		theater.display();
		Theater theater1=new Theater("Kent");
		theater1.setSeatColor("Blue");
		theater1.location=TheaterLocation.CHENNAI;
		theater1.display();
		

	}

}
