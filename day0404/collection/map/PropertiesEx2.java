package day0404.collection.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		//프로퍼티스 파일 내용을 key와 value로 저장할 공간
		Properties p = new Properties();
		String path = "data.properties";//프로젝트 폴더에 만들었으면 파일명만...
//new FileInputStream(path) 파일로부터 데이터 읽어오는 객체 생성
//p.load : 파일로부터 읽어온 데이터를 =를 기준으로 key(String) = value(String)로 저장
		p.load(new FileInputStream(path));
		
		p.list(System.out);
		//학생의 이름, 총점, 평균 출력
		String name = p.getProperty("name");
		String[] scores = p.getProperty("score").split(",");
		
		int sum = 0;
		for(String s : scores) {
			sum += Integer.parseInt(s);
		}
		System.out.println("학생의 이름 :"+name);
		System.out.println("총점 : "+sum+", 평균 : "+(double)sum/scores.length);

	}

}
