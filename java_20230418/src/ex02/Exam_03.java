package ex02;

class Member{
	private String name;
	private int age;
	
	/*	디폴트 생성자는 자바가 직접 생성한다
	 * 	다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어준다
	 *	생성자 ==> 반환타입x, 클래스 이름과 같다. 오버로딩이 가능하다. 초기화 기능을 가지고 있다.

	 /*	this
	 * 	1.지역변수와 멤버변수가 충돌날 때 this 를 붙이면 멤버변수를 의미
	 * 	2.생성자를 찾을 때 ...
	 */
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Member() {
		this("미정의",1);
		
	}
	Member(String name){
		this(name,1);
	}
	void display() {
		System.out.println();
		System.out.println(name + ", " + age);
	}
	void setData(String n , int a) {
		name = n;
		if(a>0 && a<=120)
			age = a;
		else
			age = 1;
			
	}
	
}
public class Exam_03 {

	public static void main(String[] args) {

		Member s1 = new Member("구본우", 26);
		int num = 10;
		num = 10;
		
		Member s2 = new Member("추명선",26);
		
		Member s3 = new Member("이성진",26);
		s3.display();
		Member s4 = new Member("");
		s4.display();
		
	}

}
