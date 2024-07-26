package day0403.reflection;

public class GetClassExample {

		public static void main(String[] args) throws Exception {
			//how1
			Class clazz1 = Car.class;
			
			//how2
			Class clazz2 = Class.forName("day0403.reflection.Car");
			
			//how3
			//Car car = new Car();
			//Class clazz3 = car.getClass();
			
			System.out.println("패키지: " + clazz1.getPackage().getName());
			System.out.println("클래스 간단 이름: " + clazz1.getSimpleName());
			System.out.println("클래스 전체 이름: " + clazz1.getName());
		}


	}

