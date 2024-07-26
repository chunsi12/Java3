package day0402.wrapper;

public class WrapperEx2 {

	public static void main(String[] args) {
		// String -> int
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		Integer i3 = Integer.valueOf("100");
		
		int i4 = Integer.parseInt("100", 2);
		int i5 = Integer.parseInt("100", 8);
		int i6 = Integer.parseInt("100", 16);
		
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		

	}

}
