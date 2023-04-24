package ex01;


class Cat{
	void sound() {
		System.out.println("miaooo");
		
	}
}

class Dog{
	void makeSound() {
		System.out.println("bowwow");
	}
}

class Pig{
	void sound() {
		System.out.println("oinkoink");

class Rabbit{
	void makeSound(){
		System.out.println("토끼는 울지 않는다");
	}
}
	}
	
}
public class Animal_Test {
	//고양이 miaooo, 개 bowwow,돼지 oinkoink
	public static void main(String[] args) {

	Cat cat = new Cat();
	cat.sound();
	
	Dog dog = new Dog();
	dog.makeSound();
	
	Pig pig = new Pig();
	pig.sound();
	
	
	
	}

}

