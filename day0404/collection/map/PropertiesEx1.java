package day0404.collection.map;

import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		//192.168.0.2 서버에 30초내로 접속, 업로드 파일의 최대 크기는 5MB
		prop.put("ip", "192.168.0.2");
		prop.setProperty("timeout", "30");
		prop.setProperty("maxsize", "5MB");
		
		prop.list(System.out);
		
		prop.setProperty("maxsize", "10MB");
		System.out.println(prop.getProperty("maxsize","5MB"));
		System.out.println(prop.getProperty("minsize","5MB"));
		
		System.out.println(prop.size());
		

	}

}
