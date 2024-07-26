package d0320.oop;

public class Tv {
//main () 에서 객체 생성해서 사용
	int inch;
	String model;
	int channel;
	boolean power;
	
	void power() {power = !power; }
	void chUp() { channel++;}
	void chDown() {channel--; } 

}
