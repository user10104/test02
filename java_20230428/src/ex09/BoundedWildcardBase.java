package ex09;


class Box<T>{
	private T ob;
	public T getOb() {
		return ob;
		
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}


class Toy {
	public String toString() {
		return " I am a Toy()";
		
	}
}

class BoxHandler{
	public static void outBox(Box<? extends Toy>box) {//outBox용도는 get기능 역할만 담당   ?extends 하면 26번의 셋기능 사용 불가능
		Toy toy = box.getOb(); //getter 기능
//		box.setOb(toy); //set 처리가 됨
		System.out.println();
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.setOb(n);//setter 기능
	}
}

public class BoundedWildcardBase {

	public static void main(String[] args) {

		Box<Toy>box =  new Box<>();
		BoxHandler.inBox(box, new Toy()); // 객체생성
		BoxHandler.outBox(box);
		
	}
}

