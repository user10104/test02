package ex01;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age; // 변수 age를 선언, age변수는 ~ -21억부터 +21억 저장 가능. 더 큰 값을 저장하기 위해선 'long'을 써준다 예시. long age = 10000000000l; 이때 값 뒤에 l을 붙여주어야 한다.
		
		Scanner sc = new Scanner(System.in);//sc의 변수설정
		age = sc.nextInt();//age(나이)는 입력한대로 출력
		
		System.out.println("나이 : " + age);
		System.out.println("프로그램 종료.");

	}

}