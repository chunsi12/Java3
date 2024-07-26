package com.bmi;

import java.util.Scanner;

public class BmiTest {

	public static void main(String[] args) {
		System.out.println("BMI 계산기");
		System.out.println("==============");
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해주세요 : ");
		double length = scanner.nextDouble();
		System.out.println("몸무게를 입력해주세요 : ");
		double weight = scanner.nextDouble();
		
		Bmi bmi = new Bmi(length, weight);
		
		System.out.printf(
				"BMI 지수 : %.2f", bmi.mtdBMI());
	}

}
