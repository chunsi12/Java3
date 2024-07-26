package mytest;

public class Teacher extends Person {

	private String subject;
	
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	

	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void print() {
		System.out.printf("이름 %s 나이 %d 학번 %s \n",
				getName(), getAge(), subject);

	}

}
