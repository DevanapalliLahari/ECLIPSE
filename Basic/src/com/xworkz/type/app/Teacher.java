package com.xworkz.type.app;

public class Teacher extends Employee {
	
	String status;
	String schoolName;
	public Teacher(String name, String status, String schoolName) {
		super(name);
		System.out.println("Running String,String,String consts in Teacher...");
		this.status = status;
		this.schoolName = schoolName;
	}
	@Override
	public void printInfo()
	{
	System.out.println("Print info about Teacher...");
	super.printInfo();
	System.out.println("Status "+this.status);
	System.out.println("SchoolName "+this.schoolName);
	}
}
