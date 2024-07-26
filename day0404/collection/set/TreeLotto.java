package day0404.collection.set;

import java.util.TreeSet;

public class TreeLotto {

	public static void main(String[] args) {
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		//set은 랜덤값을 출력하고 있음, <=6 하면 일곱자리를 출력함
		while(lotto.size() < 6) {
			int num = (int) (Math.random()*45)+1;
			lotto.add(num);//기존 없는 값을 저장함, 횟수로 돌려서는 안됨
		}
		System.out.println(lotto);
		

	}

}
