package day0403.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {
//순서대로 저장해서 사용 -> ArrayList
//list중간 데이터 추가 or 삭제 -> LinkedList
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i =0; i < 10000; i++) {
			l1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList : "+(end-start));
		
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			l2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		
		System.out.println("LinkedList :"+(end - start));
	}

}
