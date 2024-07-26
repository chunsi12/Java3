package day0403.collection.list;

import java.util.Arrays;
import java.util.List;

public class AsListEx {
//List 객체 생성 2
	public static void main(String[] args) {
		List<String> list = Arrays.asList("김자바", "김디비","김파이썬");
		for(String name :list) {
			System.out.println(name);
		}
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		System.out.println(list2);

	}

}
