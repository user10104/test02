package java_20230407;

import java.util.Scanner;

public class Exam07_practice_int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~부터 4까지 입력");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		case 4 :
			System.out.println("four");
			break;
		
			default:
			System.out.println("범위 내의 숫자를 입력");
	}
	}

}
  