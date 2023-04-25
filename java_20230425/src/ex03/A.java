package ex03;

public class A {
	
	A(){
		class B{
			public B() {
				System.out.println("B객체 생성");
			}
		}
	B b = new B();
	
	}

	void method() {
		class C{
			public C() {System.out.println("C객체생성");}
			
		}
		
		C c = new C();
	}
	
}
