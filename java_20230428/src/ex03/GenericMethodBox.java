package ex03;



class A	{}
class B extends A{}
class C extends B{}
 
class Box <T extends A> {
	private T ob;

	public T getOb() {
		return ob;
	
	}

public void setOb(T ob) {
	this.ob = ob;

	}
}

class Unboxer{
	public static <T extends A > T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {

		Box<C> cBox = new Box<C>();
		Box<B> bBox = new Box<B>();
		Box<A> aBox = new Box<A>();
		System.out.println();
		
		
	
		
		
//		Box box = new Box ();
//		box.setOb("korea");
//		System.out.println(box.getOb());
//		
		
//		Integer tmp = Unboxer.openBox(box)/*intValue*/;
//		int num = tmp.intValue();
//		System.out.println(tmp);
		
		
		
		//Unboxer클래스 openBox를 이용해 ob를 꺼내고 변수에 담아서 출력하라
		
	}

}
