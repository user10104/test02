package ex05;

class Member {
	
	/*
	 * 1. 함수 이름이 같아야 함
	 * 2. 매개변수 타입이나 갯수가 달라야함.
	 */
	int func(int n) {
		return n;
		
	}
	double func(double d) {
		return d;
	}
	String func(String str) {
		System.out.println("string");
	return str;
	}

	int func(int n1, int n2) {
		
		System.out.println("int int");
		System.out.println(n1+n2);
		return n1+n2;
		
	}
	

}

public class Exam01 {

	public static void main(String[] args) {

		Member m = new Member();
				
		System.out.println(m.func(10,2));		
	}

}
