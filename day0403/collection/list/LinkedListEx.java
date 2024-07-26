package day0403.collection.list;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> mylist = new LinkedList<>();
		
		mylist.add("a");
		mylist.add("b");
		mylist.add("c");
		
		System.out.println(mylist);
		mylist.add(1, "D");
		System.out.println(mylist);
		
		mylist.addFirst("0");
		mylist.addLast("9");
		System.out.println(mylist);

	}

}
