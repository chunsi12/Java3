package day0403.collection.set;

import java.util.HashSet;

public class SetEx2 {

	public static void main(String[] args) {
		
		Member m1 = new Member(1, "김자바");
		Member m2= new Member(2, "안디비");
		Member m3 = new Member(2, "안디비");
		Member m4 = new Member(4, "윤대니얼");
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		
		for(Member m : members) {
			System.out.println(m);
		}
		System.out.println(members.size());
	}

}
