package day0403.collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {
// 오름차순으로 정렬해서 저장.
// 새로 저장하는 값이 기존 값보다 작으면 왼쪽, 크면 오른쪽에 저장
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		int[] score = {23, 10, 28, 15, 7, 22, 56};
		
		for(int i : score) {
			ts.add(i);
		}
		System.out.println(ts);
		System.out.println(ts.headSet(22));
		System.out.println(ts.tailSet(22));

	}

}
