package java_20230407;

import java.util.Scanner;

/*
 * 숫자 하나를 입력 받아서 양수 , 음수 , zero로 출력
 */
public class Exam03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		
		if(num1 >0)
			System.out.println("num1은 양수입니다.");
		else if (num1 <0)
			System.out.println("num1은 음수입니다.");
		else //(굳이 (num1==zero) 필요x
			System.out.println("num1은 Zero입니다.");
	}

}
