package ex04;

class Box <T> {
	private T ob;
	
	public T getob(){
		return ob;
	}

public void setOb(T ob) {
	this.ob = ob;

	}

}



public class GenericMethodBox {

	public static void main(String[] args) {

	Box<Integer> box1 = new Box<>();
	box1.setOb(99);
	Box<Integer> box2 = new Box<>();
	box2.setOb(55);
	
	
	
	//99 & 55
	System.out.println(box1.getob()+"&"+box2.getob());
	swapBox(box1,box2);
	//55 & 99
	System.out.println(box1.getob()+"&"+box2.getob());
	
	Box<Double> box3 = new Box();
	Box<Double> box4 = new Box();
	
	
	}

	static<T extends Number> void swapBox(Box<T> box1,Box<T> box2) {
		Box<T> tmp = new Box<T>();
		tmp.setOb(box1.getob());
		box1.setOb(box2.getob());
		box2.setOb(tmp.getob());
	}
}
