package ex05;

class Box<T>{
		private T ob;
		public void set(T o) {
			ob = o;
			
		}
		
		public T get() {
			return ob;
		}
}
class BoxFactory{
	public static <T extends Number> Box <T> makeBox(T o){ //넘버가 상속한 애들만(자식) 가능 인티저, 더블
		Box<T>box = new Box<T>(); //실수 정수만
		box.set(o);
		
		System.out.println("Boxed Data : " + o.intValue());
		return box;
	}
}


class Unboxer{ //double !=Double
	public static <T extends Number> T openBox(Box<T>box) { 
		System.out.println("Unboxed Data : " + box.get().intValue());
			return box.get();
		
	}
}

		
public class BoundedGenericMethod {

	public static void main(String[] args) {
//		Box<Integer>sBox = BoxFactory.makeBox(new Integer(7777));
//		int n = Unboxer.openBox(sBox);
//		System.out.println("n: " + n);
		Box<Double>sBox2 = BoxFactory.makeBox(new Double(7777));
		double n2 = Unboxer.openBox(sBox2);
		System.out.println("n: " + n2);
		
		
	}

}
