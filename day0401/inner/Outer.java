package day0401.inner;

public class Outer {
	int iv = 0;
	static int cv = 0;
	
	public Outer() {
		System.out.println("Outer 객체 생성");
	}
	class InnerA{
		InnerA(){System.out.println("InnerA 생성");}
		int field = iv;//외부 멤버를 내 멤버처럼 사용 가능
		
	}
	static class InnerB{
		InnerB(){System.out.println("InnerB 생성");}
		static int field = cv;
		//static in field2 = iv;//Outer에 있는 인스턴스 멤버 불가
	}
	void method(int a) {
		class InnerC{
			int field = iv;
			int field2 = cv;
			InnerC(){System.out.println("InnerC 생성");}
		}
		InnerC ic = new InnerC(); //메서드 안에서 객체 생성
		System.out.println("ic.field : "+ic.field);
		
	}

	

	

}
