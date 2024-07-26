package day0403.generic;

public class Box<T> {
	public T content;
	
	public T get() {
		return content;
	}
	public void set(T t) {
		content = t;
	}

}
