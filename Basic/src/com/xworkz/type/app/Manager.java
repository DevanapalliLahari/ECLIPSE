package com.xworkz.type.app;

public class Manager extends Employee{
	
	String department;
	int id;
	
	public Manager(String name,String department, int id) {
		super(name);
		System.out.println("Running String,String,int Consts in Manager...");
		this.department = department;
		this.id = id;
	}
	
	@Override
	public void printInfo()
	{
	System.out.println("Print info about Manager...");
	super.printInfo();
	System.out.println("Department "+this.department);
	System.out.println("ID "+this.id);
	}
	public static void Casting(Employee employee)
	{
		System.out.println("Running Manager...");
		if(employee !=null)
		{
			System.out.println("Running");
			}
		else {
			System.out.println("give valid employee");
		}
			if(employee instanceof Teacher)
			{
				Teacher teacher=(Teacher)employee;
				teacher.printInfo();
				
			}
			if(employee instanceof Manager)
			{
				Manager manager=(Manager)employee;
				manager.printInfo();
			}
		}

}
