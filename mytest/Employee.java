package mytest;

public class Employee extends Person {
	
	private String dept;


	Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}


	@Override
	public void print() {
		System.out.printf("이름 %s 나이 %d 학번 %s \n",
				getName(), getAge(), dept);

	}

}
