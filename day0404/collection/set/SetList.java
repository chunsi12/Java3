package day0404.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("J","A","V","A");
		System.out.println("list : "+list);
		
		//List -> Set
		Set<String> set = new HashSet<String>(list);
		System.out.println("set:"+set);
		
		//Set -> List
		List<String> list2 = new ArrayList<String>(set);
		
		System.out.println("list2 :"+list2);
		System.out.println(list2.get(0));
		
		List<String>list3 = List.copyOf(set);
		System.out.println("list3 : "+ list3);
		
		

	}

}
