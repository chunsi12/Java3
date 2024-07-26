package day0403.collection.set;

import java.util.Objects;

public class Member implements Comparable<Member> {
	int id;
	String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return id + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member m) {
			if(id == m.id) {
			return name.equals(m.name);
		}
	}
		return false;
	}//id 로 정렬(기본형)
//	@Override
	//public int compareTo(Member o) {
		//return id-o.id;
//	}
	//name 으로 정렬(참조형)
@Override
public int compareTo(Member o) {
	return name.compareTo(o.name);
	
}
}
	
	
	

//}
