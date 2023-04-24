package ex05;

interface Animal{
	void eat();
	public abstract void sleep(); 
}

class Cat implements Animal{

	@Override
	public void eat() {
		
		System.out.println("고양이가 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("고양이가 잔다");
	}
	
}

class Dog implements Animal{

	@Override
	public void eat() {
		
		System.out.println("강아지가 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("강아지가 잔다");
	}
	
}

public class Exam01 {

	public static void main(String[] args) {
		
		Animal an = new Dog();
		an. eat();
		an. sleep();
		
		an = new Cat();
		an.eat();
		an.sleep();

	}

}
