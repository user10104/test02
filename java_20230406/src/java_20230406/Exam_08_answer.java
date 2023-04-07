package java_20230406;

import java.util.Scanner;

//세 정수를 입력받아서 최대값과 최소값 구하기

public class Exam_08_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
			
		//최대값 구하기
			if(num1>num2) {
			if(num1>num3) max =num1;
			else max = num3;
		}else {
			if(num2>num3) max= num2;
			else max = num3;		
			
		//최소값 구하기
			if (num1>num2) {
			if(num2>num3) min =num3;
			else min = num2;
		}else {
			if(num1>num3) min =num3;
			else min = num1;
		}
		
		
		
		///////
		//max = (num1>num2)? ((num1>num3)?num1:num3):((num2>num3)?num2:num3) ;
		//max = (num1>num2)? ((num2>num3)?num3:num2):((num1>num3)?num3:num1) ;
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	
		System.out.println("프로그램 종료");
		}
	}
}
		


