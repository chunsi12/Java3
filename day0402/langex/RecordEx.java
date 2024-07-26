package day0402.langex;

public class RecordEx {

	public static void main(String[] args) {
		Member m = new Member("kimjava","김자바",20);
		System.out.println(m.id());
		System.out.println(m.age());
		System.out.println(m.name());
		System.out.println(m.toString());
		
		System.out.println();
		
		Member m1 = new Member("kimjava","김자바",20);
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		System.out.println(m.equals(m1));

	}

}
