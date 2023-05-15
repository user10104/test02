package ex07;

import java.util.ArrayList;

class Fruit implements Eatable{
	public String toString() {return"Fruit";}
}
	class Apple extends Fruit {public String toString() {return "Apple";}}
	class Grape extends Fruit {public String toString() {return "Grape";}}
	class Toy 	extends Fruit {public String toString() {return "Toy";}}
	
	interface Eatable{}
	
	
		

class FruitBoxEx2 {
	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox= new FruitBox<Fruit>();
		FruitBox<Apple> appleBox= new FruitBox<Apple>();
		FruitBox<Grape> grapeBox= new FruitBox<Grape>();
//		FruitBox<grape> fruitBox= new FruitBox<Apple>();
//		FruitBox<Toy> 	toyBox	= new FruitBox<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		fruitBox.add(new Apple());
//		fruitBox.add(new Grape()); Grape 는 Apple의 자손 아님
		fruitBox.add(new Grape());
		
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
		
		
		
	}//main

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add (T item) 	{list.add(item);}
	T get (int i) 		{return list.get(i);}
	int size()			{return list.size();}
	public String toString() {return list.toString();}
}
