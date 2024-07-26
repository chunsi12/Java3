package day0401.inner;

public class Main {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.InnerA iA = outer.new InnerA();
		System.out.println(iA.field);
		
		Outer.InnerB ib = new Outer.InnerB();
		System.out.println("ib.field :"+ib.field);
		System.out.println("ib.field :"+Outer.InnerB.field);
		
		outer.method(10);

	}

}
