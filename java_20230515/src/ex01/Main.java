package ex01;

public class Main {
	static void test(A test) {

	if (test instanceof D) {
		D d=new D();
		d.funcD();
	}else if (test instanceof E) {
		E e = new E();
		e.funcE();
		}
		
	}
	
	public static void main(String[] args) {


//		
//		D dd = new D();
//		E ee = new E();
//		dd.funcD();
//		ee.funcE();
//
//		A a = new D(); //new A(); (x) => 인터페이스 참조변수 a가 참조할수 있는 대상은 A인터페이스를구현한 클래스
//		B b = new D(); //or new D() => 객체 자신과 자신을 상속하는 하위클래스가 올수 있다.
//		C c = new C(); //or new E() => 객체 자신과 자신을 상속하는 하위클래스가 올수 있다.
//		D d= (D)b;//new B();
//		
		
		
		test( new B() ); //객체생성이 안되는 A제외하고 모든 클래스 가능 (B~E)
		test( new C() ); //객체생성이 안되는 A제외하고 모든 클래스 가능 (B~E)
		test( new D() ); //객체생성이 안되는 A제외하고 모든 클래스 가능 (B~E)
		test( new E() ); //객체생성이 안되는 A제외하고 모든 클래스 가능 (B~E)
		
	}

}
