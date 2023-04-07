package java_20230407;

import java.util.Scanner;

//문제 1. 정수 한개를 입력받고, 그 수가 50 이상의 수인지 50 미만의 수인지 판단하게 만드세요.

public class Quest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc. nextInt();
		
		if(num>50) 
			System.out.println("50이상의 숫자입니다.");
		else
			System.out.println("50이하의 숫자입니다.");
		

}
}