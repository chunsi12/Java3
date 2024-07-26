package com.company;

public class Company {

	public static void main(String[] args) {
	Employee[] employees = new Employee[2];
	employees[0] = new Secretary ("Hilery", 1, "Secretary",800);
	employees[1] = new  Salses ("Cliten",2,"Salses",1200);
	System.out.println("name\tdepartment\tsalary");
	System.out.println("-------------------------");
	
	for(Employee e: employees) {
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println("------------------");
	}
	for(Employee e : employees) {
		if(e instanceof Secretary) {
			((Secretary)e).incentive (100);
		}else if(e instanceof Salses) {
			((Secretary)e).incentive(100);
		}
		System.out.println(e);
	}
	
	
	
	

	}

}
