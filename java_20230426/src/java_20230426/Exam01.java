package java_20230426;

import java.util.Scanner;
class A{}
class B extends A{}
public class Exam01{



	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		A a = new A();
		B b = new B();

			System.out.println("프로그램 종료");
	}

	
	
}
