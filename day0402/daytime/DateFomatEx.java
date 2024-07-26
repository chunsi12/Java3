package day0402.daytime;

import java.util.*;
import java.text.*;


public class DateFomatEx {

	public static void main(String[] args) {
			String pattern = "yyyy/MM/dd"; 
			DateFormat df = new SimpleDateFormat(pattern);
			
			Scanner s = new Scanner(System.in);

			Date inDate = null;

			System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2024/05/11)");

			while(s.hasNextLine()) {
				try {
					inDate = df.parse(s.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2024/05/11)");
				}
			} // while

			Calendar cal = Calendar.getInstance();
			cal.setTime(inDate);
			Calendar today = Calendar.getInstance();
	        long day = (cal.getTimeInMillis() - today.getTimeInMillis())/(24*60*60*1000);
			
			System.out.println("입력하신 날짜는 현재와 "+ Math.abs(day) +"일 차이가 있습니다.");
		} // main

	}


