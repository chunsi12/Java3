package mytest;

public class Student extends Person {
	
	private int id;
	
	Student(String name, int age, int id){
		super(name, age);
		this.id = id;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void print() {
		System.out.printf("이름 %s 나이 %d 학번 %s\n",
				getName(), getAge(), id);

	}

}
