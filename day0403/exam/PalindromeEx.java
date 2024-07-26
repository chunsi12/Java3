package day0403.exam;

public class PalindromeEx {
	
	public boolean palindrome(String str) {
		String str2 = "";//역순 문자열 저장 공간, null 값은 문자열로 취급하므로 회문문자열이 아닙니다 출력값이 나옴
		for(int i = str.length(); i > 0; i--) {
			str2 += str.charAt(i-1);
		}
		return str.equals(str2);
	}

	public static void main(String[] args) {
		PalindromeEx p = new PalindromeEx();
		String str = "abCba";
		boolean result = p.palindrome(str);
		if(result) {
			System.out.println(str + "은 회문문자열입니다.");
		}else {
			System.out.println(str + "은 회문문자열이 아닙니다.");
		}

	}

}
