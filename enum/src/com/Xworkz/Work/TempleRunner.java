package com.Xworkz.Work;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temple temple=new Temple("Anjaneyaswami Temple");
		temple.setLocation("BTM");
		temple.architectName=TempleArchitectName.ROBERT;
		temple.display();
		Temple temple1=new Temple("Lakshmi Temple");
		temple1.setLocation("Electronic city");
		temple1.architectName=TempleArchitectName.ALICE;
		temple1.display();
		

	}

}
