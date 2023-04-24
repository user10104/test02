package ex02;

abstract class Animals{
	abstract void makeSound(); //추상메소드
	abstract void sound();	//이거만들면 어노테이션이란걸 붙여저ㅜ야함
}



class Dog extends Animals{
	void makeSound() {
		System.out.println("bowwow");
	}

	@Override
	void sound() {
	}
}


class Rabbit extends Animals{
	void makeSound(){
		System.out.println("토끼는 울지 않는다");
	}

	@Override //어노테이션 -
	//Override -> 상위클래스는 재정의 하겠다는 적극적 표현
	void sound() {
	}

}
class Pig extends Animals{
	void makeSound() {
		System.out.println("oinkoink");
	}

	@Override
	void sound() {
	}
	
}class Cat extends Animals{
	void makeSound() {
		System.out.println("miaooo");
		
	}

	@Override
	void sound() {
	}
}

public class Animal_Test {
	//고양이 miaooo, 개 bowwow,돼지 oinkoink
	public static void main(String[] args) {

	Animals[] animals = {new Cat(), new Dog(),new Pig(), new Rabbit()};
	
	for(int i = 0; i<animals.length;i++)
		animals[i].makeSound(); //makeSound();펑션이랑 이름이 다르면 실행되지 않는다.
	

	//<향상된 for
	for(Animals animal:animals) 
		animal.makeSound();	
	
	System.out.println("------------");
	//Animal an = new Animals();
	//an.makeSound
	
	//한꺼번에 호출해서 가능, 클래스만 추가해주면 모두 Animal[]내 모든 내용을 출력 가능하다.
	//추상메소드 : 참조하지않는한 사용불가하게만드려고
	}
}

		
//	Cat cat = new Cat();
//	cat.sound();
//	
//	Dog dog = new Dog();
//	dog.makeSound();
//	
//	Pig pig = new Pig();
//	pig.sound();
//	
//	Rabbit rab = new Rabbit();
//	rab.makeSound();
//	
	
	
