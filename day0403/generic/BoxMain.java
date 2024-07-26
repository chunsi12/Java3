package day0403.generic;

public class BoxMain {

	public static void main(String[] args) {
		
		Box<String> b1 = new Box<>();
		b1.content = "문자열 저장";
		//<기본형> X!!
		Box<Integer> b2 = new Box<>();
		b2.content = 10;

	}

}
