package com.bmi;

public class Bmi {
	double length;
	double weight;
	Bmi(double length, double weight) {
		this.length = length * 0.01;//m 단위로 변경
		this.weight = weight;
	}
	public double mtdBMI() {
		return weight / (length * length);
	}
	@Override
	public String toString() {
		return String.format("%.2f", mtdBMI());
		
	}
	
	

}
