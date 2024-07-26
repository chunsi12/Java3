package com.cylinder;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(new Circle(2.8),5.6);
		System.out.printf("원통의 부피 : %.3f",cylinder.getVolume());

	}

}
