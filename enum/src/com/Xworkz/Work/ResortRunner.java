package com.Xworkz.Work;

public class ResortRunner {

	public static void main(String[] args) {
		Resort resort=new Resort("Guhantara");
		resort.setOwnerName("John");
		resort.roomType=ResortRoomType.DELUXE;
		resort.display();
		Resort resort1=new Resort("Wonderla_Resort");
		resort1.setOwnerName("James");
		resort1.roomType=ResortRoomType.DELUXE;
		resort.display();
		
		ShoeUtil.Buy();

	}

}
