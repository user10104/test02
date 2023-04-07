package java_20230406;

import java.util.Scanner;

//세 정수를 입력받아서 최대값과 최소값 구하기

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int max,min;
		
		System.out.println("첫번째 정수 입력");
		int fir = sc.nextInt();
		
		System.out.println("두번째 정수 입력");
		int sec = sc.nextInt();
		
		System.out.println("세번째 정수 입력");
		int trd = sc.nextInt();
		
	if (fir >sec) max = fir; 
	else 
		{
			if (fir > trd) max = fir;
			else
			max = trd;} 
	 
	if (fir <sec) min = fir;
	else
		{
			if (fir <trd) min = fir;
			else
			min = trd;	}
			
			System.out.println("최대값: " + max);
		    System.out.println("최소값: " + min);
		
		    System.out.println("프로그램 종료");
			
		///////
		/*
		 * 	if (facing >= 70) {
			if(playing >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격 입니다");
		}
	}else {
			System.out.println("불합격 입니다");
	}
	
	이것도 가능
		 */
		
		
	}}

