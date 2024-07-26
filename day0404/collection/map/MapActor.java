package day0404.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapActor {

	public static void main(String[] args) {
		Map<String,String[]>actor = new HashMap<String, String[]>();
		actor.put("송강호", new String[] {"브로커","택시운전사","기생충"});
		actor.put("김수현", new String[] {"도둑들","드림하이","은밀하게 위대하게"});
		actor.put("이병헌", new String[] {"남산으 부장들","콘크리트 유토피아","광해"});
		
		System.out.println("검색할 배우 > ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		if(actor.containsKey(name)) {
			String[] filmo = actor.get(name);
			for(String movie : filmo) {
				System.out.println(movie);
			}
		}else {
			System.out.println("해당 배우가 존재하지 않습니다.");
		}
		
	}
}
