package ex01;
	
class Member2{
	
	private String name;
	private int age; {
	
	//디폴드 생성자는 자바가 직접 생성. 다만 개발자가 생성자를 생성하지 않는 경우에만 만들어준다.
	//생성자==> 반환타입x, 클래스 이름과 같다. 오버로딩이 가능, 초기화 기능이 있다.
}
	public Member2(String n , int a) { 
		name = n;
		age = a;
	}
	
	public Member2() {
	 name = "C";
	 age = 20;
	}
	void display() {
	System.out.println(name + ", " + age);
	
}
	void setData(String n , int a) {
		name = n;
		if(a>=0 && a<=120)
			age = a;
			age = 1;
			
	}


public class Exam_02 {

	public static void main(String[] args) {

		Member2 s1 = new Member2("A",1);

		Member2 s2 = new Member2("B",2);
		
		Member2 s3 = new Member2("C",3);
		}

	}
}
