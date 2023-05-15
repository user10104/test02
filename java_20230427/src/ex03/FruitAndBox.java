package ex03;


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
class Box<T>{ 
	private T obj;
	public T getObj(){
		return obj;
}

public void setobj(T obj) {
	this.obj=obj;
	

}
}
public class FruitAndBox {


	public static void main(String[] args) {

		Box<Apple> aBox = new Box<Apple>();  
		Box<Orange> oBox = new Box<Orange>();
//		aBox.setobj(new Apple()); //"Apple" < 문자열이라서 불가능, 객체 new Apple만 가능. 이하동문
//		oBox.setobj(new Orange());
		
		
		aBox.setobj(new Apple()); // = ("Apple") 도 가능 하지만 이 경우 문자열 (String)이 되기때문에 아래 (Apple)aBox안의 Apple을 String으로 바꿔줘야한다.
		oBox.setobj(new Orange());
		
		Apple ap = /*(Apple)*/aBox.getObj(); // 형변환 생략 가능
		Orange or = (Orange)oBox.getObj();
		
		
//		System.out.println(abox.getObj());
//		System.out.println(obox.getObj());
		
		System.out.println(ap);
		System.out.println(or);
	}

}
