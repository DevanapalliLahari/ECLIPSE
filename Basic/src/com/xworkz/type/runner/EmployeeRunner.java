package com.xworkz.type.runner;

import com.xworkz.type.app.Employee;
import com.xworkz.type.app.Manager;
import com.xworkz.type.app.Teacher;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Method");
		Employee employee=new  Teacher("Anand","HeadMaster","ABC");
		Manager.Casting(employee);
		Employee employee1=new Manager("Arjun","R&D",12);
		Manager.Casting(employee1);

	}

}
