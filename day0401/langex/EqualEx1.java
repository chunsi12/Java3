package day0401.langex;

class Value{
	int value;
	
	public Value(int value) {
		this.value = value;
	}
	//value 변수가 가지고 있는 값이 같으면 true
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			return value == ((Value) obj).value;
		}
		return false;
	}
	
}
public class EqualEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1 == v2) {
			System.out.println("v1과 v2는 같다.");
		}else {
			System.out.println("v1과 v2는 다르다.");
		}
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같다.");
		}else {
			System.out.println("v1과 v2는 다르다.");
		}

	}

}
