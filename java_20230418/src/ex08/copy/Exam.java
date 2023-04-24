package ex08.copy;

class Parent {
	public String nation;

	public Parent() {
		this("대한민국"); //(1)
		System.out.println("Parent() call");
	
}
	public Parent(String nation) {
		this.nation = nation; //(2)
		System.out.println("parent(String nation) call");
	}
	
}

class Child2 extends Parent {
	public String name;
	
	public Child2() {  //아래의 객체생성이 찾아가는부분 , 순서 홍길동문단, 대한민국문단 그 아래 네이션문단,다시 홍길동, 마지막으로 차일드 네임
		this("홍길동"); // (3)
		System.out.println("Child2() call");
	}
	public Child2(String name) {
		this.name = name; //(4)
		System.out.println("Child2(String name) call");
	}
}


public class Exam {
	

	public static void main(String[] args) {

		Child2 child = new Child2();
		
	}

}
