package d0320.oop;

public class VariableEx {
	static int cv = 10;//클래스 영역에 선언, static
	int iv = 20;// 클래스 영역, instance 변수 
	
	void method() {
		int lv = 30;//local(지역) 변수 
		System.out.println(lv);
	}

}
