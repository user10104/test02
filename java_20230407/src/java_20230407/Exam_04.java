package java_20230407;

import java.util.Scanner;

/*
 * 숫자 하나를 입력 받아서 짝수,홀수 구분하게 만들기
 */
public class Exam_04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		
		if(num1%2==0)
			System.out.println("num1은 짝수입니다.");
		else //(굳이 (num1==zero) 필요x
			System.out.println("num1은 홀수입니다.");
		
	
	}

}