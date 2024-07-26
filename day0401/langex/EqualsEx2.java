package day0401.langex;

class Member{
	
	String id;
	int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
//id가 같으면 같은 사람(true)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			return id.equals(((Member)obj).id);
			
		}
		return false;//전달된 객체가 Member타입이 아니라면 비교할 필요없음
	}
	
}

public class EqualsEx2 {

	public static void main(String[] args) {
		Member m1 = new Member("javaKim",10);
		Member m2 = new Member("javaKim",10);
		Member m3 = new Member("FuBao",3);
		
		if(m1.equals(m2)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}
		if(m1.equals(m3)) {
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}
		

	}

}
