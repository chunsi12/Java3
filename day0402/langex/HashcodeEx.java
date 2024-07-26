package day0402.langex;

public class HashcodeEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "김자바");
		Student s2 = new Student(1, "김아근");
		Student s3 = new Student(2, "김디비");
		
		if(s1.hashCode()==s2.hashCode()) {
			System.out.println("동일한 학생입니다.");
		}else {
			System.out.println("다른 학생입니다.");
		}
		if(s1.hashCode()==s3.hashCode()) {
			System.out.println("동일한 학생입니다.");
		}else {
			System.out.println("다른 학생입니다.");
		}

	}

}
