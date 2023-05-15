package ex08;


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
	public static void outBox(Box<Toy>box) {//outBox용도는 get기능 역할만 담당
		Toy toy = box.getOb(); //getter 기능
		box.setOb(toy); //set 처리가 됨, ? extends Toy 를썼을때는 사용 불가, setOb에 상위클래스 를포함해서 가져올 가능성이 포함되어있어서 에러처리를 한다.
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

