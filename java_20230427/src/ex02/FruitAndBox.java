package ex02;


class Apple{
	public String toString() {
		return "I am an Apple";
		
	}
}
class Orange{
	public String toString() {
		return "I am an Orange";
		
	}
}
class Box{ 
	private Object obj;
	public Object getObj(){
		return obj;
}

public void setobj(Object obj) {
	this.obj=obj;
	

}
}
public class FruitAndBox {


	public static void main(String[] args) {

		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setobj(new Apple());
		oBox.setobj(new Orange());
		
		Apple ap = (Apple)aBox.getObj();
		Orange or = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(or);
	}

}
