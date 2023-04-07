package java_20230407;

import java.util.Scanner;

//문제 2. 정수 한개를 입력받아서, 그 수가 배수인지 판단해보자

public class Quest_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		if(num% 3 ==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다");
	}

}

