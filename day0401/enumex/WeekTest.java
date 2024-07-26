package day0401.enumex;

public class WeekTest {

	public static void main(String[] args) {
		Week today = Week.MON;
		
		System.out.println(today);
		System.out.println(today.name());//열거객체의 문자열 리턴
		
		today = Week.valueOf("FRI");
		System.out.println(today);
		
		for(Week w: Week.values()) {//열거 객체 안에 있는 상수들을 배열로 가져옴
			System.out.println(w);
		}
		//today = "SUN"; Week에 없는 값은 저장 불가

	}

}
