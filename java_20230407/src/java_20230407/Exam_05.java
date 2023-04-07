package java_20230407;

import java.util.Scanner;

/*
 * 숫자 하나를 입력받고 2와 3의 배수이면 
 * 2와 3의 배수입니다 출력
 * 아니면 2와 3의 배수가 아닙니다를 출력
 */
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		
		if(num1 % 2== 0 && num1 % 3 == 0)
			System.out.println("2와 3의 배수이다");
		else
			System.out.println("2와 3의 배수가 아니다");
//2가 배수가아닌이유 3이아니라서 2와 3의 최소공배수인 6부터 시작한다. && 에 주목
		
}}
