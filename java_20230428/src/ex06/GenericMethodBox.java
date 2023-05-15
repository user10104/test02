package ex06;

class A{}
class B	extends A{}
class C extends B{}

class Box<T>{
	private T ob;
	public T getob() {
		return ob;

	}

}

class Unboxer{
//	public static void peekBox(Box<? extends Number> box) {//상한제한
		public static void peekBox(Box<? extends B > box) {//하한제한
		System.out.println(box.getob());
	}

public class GenericMethodBox {
	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		
//		Unboxer.peekBox(sBox);
		Unboxer.peekBox(bBox);
		Unboxer.peekBox(cBox);
	}
	
}

}
