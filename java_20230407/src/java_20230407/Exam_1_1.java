package java_20230407;

import java.util.Scanner;

public class Exam_1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력");
		int number = sc.nextInt();
		
		if(number>=90)
			System.out.println("A");
		else if(number >=80)
			System.out.println("B");
		else if(number >=70)
			System.out.println("C");
		else if(number >=60)
			System.out.println("D");
		else if(number >=50)
			System.out.println("F");
		
		System.out.println("프로그램 종료");

	}

}
