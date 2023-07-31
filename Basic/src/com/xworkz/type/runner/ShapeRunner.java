package com.xworkz.type.runner;

import com.xworkz.type.app.Circle;

public class ShapeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Method");
		Circle circle1 = new Circle();
		circle1.printInfo();
		Circle circle = new Circle(12, 6, "Square", 10);
		circle.printInfo();

	}

}
