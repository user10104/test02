package java_20230407;

//성적을 입력받아서 학점 구분해주는 시스템

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력");
		int number = sc.nextInt();
		
		if (number>90) {
			System.out.println("A");
		}else{
				if(number>=80)
				System.out.println("B");
		else{
				if(number>=70)
					System.out.println("C");
				
		else{
				if(number>=60);
						System.out.println("D");
		}
				
				{
				System.out.println("f");
				}
			//오류고치기
		}}
}}
