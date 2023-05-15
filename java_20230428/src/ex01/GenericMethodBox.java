package ex01;

class Box<T> {
	private T ob;
	public T getOb() {
		return ob;
		
	}
	public void setOb(T ob) {
		this.ob=ob;
	}
	
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {

		Box<Integer>box = new Box<Integer>();
		box.setOb(10);
		
		Unboxer.openBox(box); //Double f = (double)Abc(cde);
		System.out.println(box.getOb());
		
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
