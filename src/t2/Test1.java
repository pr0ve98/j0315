package t2;

class MyClass<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Test1 {
	public static void main(String[] args) {
//		MyClass<String> mc1 = new MyClass<String>(); // 객체 타입만 (기본타입 X)
		MyClass<String> mc1 = new MyClass</*생략가능*/>(); // 객체 타입만 (기본타입 X)
		mc1.setT("안녕하세요");
		System.out.println("mc1: "+mc1.getT());
		System.out.println();
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.setT(100);
		System.out.println("mc2: "+mc2.getT());
		System.out.println();
	}
}
