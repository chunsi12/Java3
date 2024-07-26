package mytest;

public class School {

	public static void main(String[] args) {
		
		Person s = new Student("홍학생", 24, 25000);
		Person t = new Teacher("홍강사", 30, "자바");
		Person e = new Employee("김관리자", 40, "교육지원부");
		
		s.print(); 
		t.print();
		e.print();

	}

}
