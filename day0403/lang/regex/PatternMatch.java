package day0403.lang.regex;

import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		String regExp = "010-\\d{4}-\\d{4}";
		String data = "010-1234-5678";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화번호가 맞습니다.");
		}else {
			System.out.println("전화번호가 아닙니다.");
		}
		//이메일 주소 검사
		regExp = "\\w+@\\w+(\\.\\w+)?";
		data = "test@test.co.kr";
		
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("email이 맞습니다.");
		}else {
			System.out.println("email이 아닙니다.");
		}

	}

}
