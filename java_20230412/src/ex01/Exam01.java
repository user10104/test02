package ex01;

/* 조원 3명 자바점수를 입력받아서
 * 자바점수 배점은 50~100 값이 장되도록 한다
 * 조원 총점.평균을 출력
 */

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
	
		int num = 0, sum = 0, average = 0;
		//double avg =0;
		
		
		int a= (int)(Math.random()*(100-50+1))+50; //(int)(Math.random()*50+1) + 50 ; 세번실행
		
		System.out.println("a의 점수:" + a);

		int b= (int)(Math.random()*(100-50+1))+50;
		
		System.out.println("b의 점수:" + b);

		int c= (int)(Math.random()*(100-50+1))+50;

		System.out.println("c의 점수:" + c);
		
		//
		//sum = a+b+c;
		//avg = sum/3.0;
		
		
		 	System.out.println("총합 :" + (a+b+c)); 
		 	System.out.println("평균 :" + (a+b+c)/3); // (sum + "," + avg)
		}

	}


