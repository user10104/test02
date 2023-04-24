package ex02;

class A{
	int a;
	int c = 100;
	A(){}
	A(int a, int c){
		this.a = a; this.c = c;
	}
	void func() {
		System.out.println("func()");
	}
}

class B extends A{ //extends A 없으면 코드 오류 , (조상) 상속을받는 상위 클래스는 상위 클래스에 있는 변수만 사용가능, (자식) 하위클래스 상의 클래스모두 사용가능
	int b;
	int c = 200;

	B(){
		super(); //super()는 상위클래스(기본생성자)를찾아간다, 목적달성시 이 자리로 돌아와서 수행
	}
	B(int a, int b){
		super(a,b);
	}
	void func2() {	
		System.out.println("func()");
	}
	
}	
class C extends A {
	int k;
	void func3() {
		System.out.println("func3()");
		
	}
}
		class D extends B {
			int d;
			void func4() {
				System.out.println("func4()");
			}
		}
		
	
	


public class BankApplication {

	public static void main(String[] args) {

			B b = new B(1,2);
			b.a = 10;
			b.b = 20;
			b.func();
			b.func2();
			System.out.println(b.c); // A클래스 , B클래스 모두 변수 c 가 있을때 , 자신의 변수먼저 사용한다.
			
			System.out.println("______________________________");
			
			A a = new A();
			a.a = 1;
			a.c = 2;
			a.func();
			
			C c = new C();
			System.out.println("______________________________");
			
			D d = new D();
			
	}

}
