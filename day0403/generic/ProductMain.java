package day0403.generic;

public class ProductMain {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("SUV 자동차");

	}

}
