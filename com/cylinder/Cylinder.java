package com.cylinder;

public class Cylinder {
	Circle circle;
	double height;
	
	public Cylinder(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}
	public double getVolume() {
		return circle.getArea()*height;
	}
	
	

}
