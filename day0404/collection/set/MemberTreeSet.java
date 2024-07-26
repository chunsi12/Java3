package day0404.collection.set;

import java.util.TreeSet;

import day0403.collection.set.Member;

public class MemberTreeSet {

	public static void main(String[] args) {
		
		Member m1 = new Member(1, "김자바");
		Member m2 = new Member(2, "안디비");
		Member m3 = new Member(2, "안디비"); //id 값 기준으로 정렬기준을 삼는다
		Member m4 = new Member(4, "강다니엘");
		
		TreeSet<Member> members = new TreeSet<Member>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		
		System.out.println(members);
		//TreeSet 비교하고 정렬해야 하는데 정렬할 수 없어서 오류남
		
		

	}

}
