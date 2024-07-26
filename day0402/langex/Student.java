package day0402.langex;

public class Student {
	private int no;
	private String name;
	
	Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return no + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s) {
		if(no == s.no && name.equals(s.getName()))
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	
	

}
