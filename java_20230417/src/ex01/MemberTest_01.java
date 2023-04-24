package ex01;

class Member1 {

	int age;		//
	static int num; //
	
}

class Member2{

	int age;		//
	static int num; //
	
}
public class MemberTest_01 {

	
	public static void main(String[] args) {
	
		Member1 m = new Member1();
		m.age = 20;
		m.num = 30;
	
		Member1 m2 = new Member1
				();
		m2 = m;
		m2. age = 50;
	
		System.out.println(m.age);
		System.out.println(m2.age);
		
	}

}
