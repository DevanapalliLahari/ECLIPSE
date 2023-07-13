package com.Xworkz.Work;

public class Battery {
	boolean rechargable;
	int capacity=1000;
	BatteryCellType cellType;
	int voltage;
	
	Battery(boolean rechargable)
	{
		this.rechargable=rechargable;
	}
	void setVoltage(int voltage)
	{
		this.voltage=voltage;
	}
	void display()
	{

		System.out.println("Display...");
		System.out.println(rechargable);
		System.out.println(capacity);
		System.out.println(cellType);
		System.out.println(voltage);
	}

}
