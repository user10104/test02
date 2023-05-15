package ex04;

import java.util.ArrayList;

class Fruit						{public String toString() {return "Fruit";}}
class Apple extends Fruit		{public String toString() {return "Apple";}}
class Grape extends Fruit		{public String toString() {return "grape";}}
class Toy						{private static final char[] AppleBox = null;
private static final char[] FruitBox = null;


public String toString() {return "Toy";}


	public static void main(String[] args) {

	Box<Fruit> fruitBox = new Box<Fruit>();
	Box<Apple> appleBox = new Box<Apple>();
	Box<Toy> 	ToyBox 	= new Box<Toy>();
	//Box<Grape> grapeBox = new Box<Apple>();	//	Not OK 타입 불일치
	
	fruitBox.add(new Fruit());
	fruitBox.add(new Apple());				//	OK. void add(Fruit item)
	//fruitBox.add(new.Grape());
	
	appleBox.add(new Apple());				//void add(Apple item)
	appleBox.add(new Apple());
	//appleBox.add(new Toy()); 				//	Not OK Box<Apple>엔 Toy담기 불가능
	
	ToyBox.add(new Toy());
	//ToyBox.add(new Apple()); 				//	Not OK Box<Toy>에는 Apple담기 불가능
	
	System.out.println(fruitBox);
	System.out.println(appleBox);
	System.out.println(ToyBox);
	
	}

}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
	
}
