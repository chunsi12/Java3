package day0401.enumex;

import java.util.Calendar;

public class WeekCheck {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//현재 시간이 저장된 캘린더 객체 생성
		int w = cal.get(Calendar.DAY_OF_WEEK);//1(일) ~ 7(토)
		
		Week week;
		
		switch (w) {
		case 1: 
			week = Week.SUN;
			break;
			case 7 : week = Week.SAT; break;
			
		default :
			week = Week.MON;
		}
		System.out.println("오늘 요일 : "+ week);
		if(week == Week.SAT || week == Week.SUN) {
			System.out.println("공부를 열심히 한다.");
		}else {
			System.out.println("공부를 더 열심히 한다.");
		}
		}

	}


