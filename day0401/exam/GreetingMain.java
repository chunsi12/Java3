package day0401.exam;

import java.util.Scanner;

public class GreetingMain {

	public static void main(String[] args) {
		Greeting greeting;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.한국어 2. 스페인어 3. 기타(영어) 4. 종료");
			System.out.print("선택 > ");
			
			int menu = scan.nextInt();
			
			if(menu == 1) {
				greeting = new Korean();
			}else if(menu == 2) {
				greeting = new Spanish();
			}else if(menu == 3) {
				greeting = new Etc();
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			greeting.hi();
		}//while

	}

}
