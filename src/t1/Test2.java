package t1;

class Apple2 {}
class Food2 {}
class Goods {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class Test2 {
	public static void main(String[] args) {
		// Goods 을 통해서 Apple 객체와 Food 객체 추가 및 가져오기
		Goods goods = new Goods();
		goods.setObject(new Apple2());
		Apple2 apple = (Apple2)goods.getObject();
		System.out.println("apple: "+apple);
		System.out.println();
		
		Goods goods2 = new Goods();
		goods2.setObject(new Food2());
		Food2 food = (Food2)goods2.getObject();
		System.out.println("food: "+food);
		
		// 잘못된 casting
		Goods goods3 = new Goods();
		goods3.setObject(new Apple2());
		Food2 food2 = (Food2)goods3.getObject();
		System.out.println("food2: "+food2);
	}
}
