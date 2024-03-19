package t2;

class Apple {}
class Food {}

class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		goods1.setT(new Apple());
		Apple apple = goods1.getT();
		System.out.println("apple: "+apple);
		System.out.println();
		
		Goods<Food> goods2 = new Goods<>();
		goods2.setT(new Food());
		Food food = goods2.getT();
		System.out.println("food: "+food);
		System.out.println();
		
//		Goods<Apple> goods3 = new Goods<>();
//		goods3.setT(new Apple());
//		Food food2 = (Food)goods3.getT(); 원래는 실행오류가 뜨는데 제너릭을 사용해 컴파일오류가 떠서 쉽게 확인 가능
//		System.out.println("food2: "+food2);
//		System.out.println();
	}
	
}
