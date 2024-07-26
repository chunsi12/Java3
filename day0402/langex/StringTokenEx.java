package day0402.langex;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		String data = "2024/04/02";
		
		StringTokenizer st = new StringTokenizer(data, "/");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String[] arr = data.split("/");
		for(String s : arr) {
			System.out.println(s);
		}

	}

}
