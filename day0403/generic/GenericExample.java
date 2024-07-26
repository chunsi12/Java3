package day0403.generic;

public class GenericExample {
	//제네릭 메서드
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		Box<Integer> b1 = boxing(100);
		int content = b1.get();
		System.out.println(content);
		
		Box<String> b2 = boxing("김자바");
		String content2 = b2.get();
	    System.out.println(content2);

	}

}
