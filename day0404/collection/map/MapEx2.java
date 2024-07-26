package day0404.collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		//key : id , value : password 저장
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("poi", "1234");
		//키보드로 id와 password를 입력받아 저장해둔 데이터와 일치한다면 "로그인 성공" 출력 후 종료,
		//아니면 다시 로그인 하는 코드로 돌아간다.
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요");
			System.out.println("id > ");
			String id = scan.next();
			
			System.out.print("password > ");
			String password = scan.next();
			//입력한 아이디가 map에 없다면
			if(!map.containsKey(id)) {
				System.out.println("입력한 아이디는 없습니다. 다시 입력하세요.");
				continue; 
			}else {
				//아이디 있고 비번이 맞으면
				if(password.equals(map.get(id))) {
					System.out.println(id+"로그인 성공");
					break;
				}else {
					//아이디 있고 비번이 맞지 않는다면	
					System.out.println("비밀번호가 일치하지 않습니다.");
				}//if
			}//while
		}
	}

}
