package ex01;

	class Member{
		
		//private;접근제어자
			private String name;
			private int age ; 
		
		
		//생성자 ==> 반환타입x, 클래스 이름과 같다. 오버로딩 가능.
		public Member() {
		}
		void display() {
			System.out.println(name + ", "+ age);
			}
		void setData(String n , int a) {
			name = n;
			if (a >= 0 && a <= 120)
				age = a;
			else
				a = 1;
				}
	}
public class Exam_01 {
	
	//클래스변수(정적 변수), 클래스 메서드(정적 메소드)는 공유자원이면서 다른 것들과 데이터를 공유하지 않음.
	
	public static void main(String[] args) {
		
		Member s1 = new Member();
		s1.setData("A", 26 );
		
		//s1.name = "구본우"
		//s1.age = 26;
		
		Member s2 = new Member();
		s2.setData("B", 29 );
		//s2.name = "추명선";
		//s2.age = 26;

		s1.display();
		s2.display();
		
		}

}
