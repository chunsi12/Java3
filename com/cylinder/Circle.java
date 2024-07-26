package com.cylinder;

public class Circle {
	double radius;
	static final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * PI;
	}
	
	

}
