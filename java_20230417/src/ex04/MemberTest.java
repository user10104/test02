package ex04;

 class Member{
	
	int age; 			//멤버변수, 인스턴스 변수
	static int num;		//클래스 변수, 정적변수, 공유변수, 인스턴스가 생성되기 전에 형성된다.

 }

public class MemberTest {

	public static void main(String[] args) {
		
		Member m = new Member(); //객체를 생성
		Member.num = 100;
		System.out.println(Member.num);
		
		
	}

}
