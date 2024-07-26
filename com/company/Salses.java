package com.company;

public class Salses extends Employee implements Bonus {

	
	public Salses() {
	
	}

	public Salses(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		
	}

	@Override
	public void incentive(int pay) {
		setSalary((int)(pay*1.2)+getSalary());

	}

	@Override
	public double tax() {
		return getSalary()*0.13;
	}
	@Override
	public String toString() {
		return getName() + "\t" + getDepartment()+"\t"+getSalary();
	}

}
