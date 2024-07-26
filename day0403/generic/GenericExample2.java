package day0403.generic;

public class GenericExample2 {
	
	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}

	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		
		boolean result2 = compare(4.5, 10);
		System.out.println(result2);
		
		//boolean result3 = compare("10", "3.14");//error 
		//System.out.println(result1);
		

	}

}
