package ex03;

interface WithDefault{
	int count = 100;
	void test();
	default void show() {
		System.out.println("I am show");
	}
}

class Test implements WithDefault {
	public void test() {   
		System.out.println("I am test");
	}
}

public class Prac01_1 {
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.test();
		System.out.println("count : " + WithDefault.count);
	}
}
