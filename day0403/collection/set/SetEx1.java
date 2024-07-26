package day0403.collection.set;

import java.util.HashSet;

public class SetEx1 {

	public static void main(String[] args) {
//String, wrapper 클래스는 hashcode(), equals(), 오버라이딩되어있음
//String : 저장하고 있는 문자열, Integer : 저장하고 있는 int 값 비교
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("A");
		set1.add("B");
		set1.add("A");
		set1.add("C");
		
		System.out.println(set1);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set2.add(1);
		set2.add(3);
		set2.add(4);
		set2.add(3);
		
		System.out.println(set2);
		

	}

}
