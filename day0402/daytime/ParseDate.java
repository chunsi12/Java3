package day0402.daytime;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {

	public static void main(String[] args) {
		//날짜 형식의 문자열 입력 -> parse Date -> 출력
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		Date d = null;
		try {
		d = df.parse("2024-04-02");
		} catch (ParseException e) {
			System.out.println("패턴이 일치하지 않습니다.");
		}
		if(d != null) {
			System.out.println(df2.format(d));
		}
	}

}
