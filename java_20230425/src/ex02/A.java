package ex02;

public class A {
	
	//중첩 클래스
	static class B{
		
		//	17버전부터 허용
		//	static int field2 = 1; //정적변수, 정적클래스변수
		//	static void test(){} //정적메서드
		//
		
		B(){System.out.println("B객체생성");}
	}
	
	static class C{
		C(){System.out.println("C객체생성");}
	}
	
	B field = new B();
	C field2 = new C();
	
	A(){
		B b = new B();
		System.out.println("A객체생성");
	}
	void method() {
		B b = new B();
	
	}
	static void method2() {
		B b = new B();
	
	}
}
