package java_20230406;

import java.util.Scanner;



public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("면접점수 입력");
		int facing = sc.nextInt(); //입력받는줄

		System.out.println("실기점수 입력");
		int playing = sc.nextInt(); 
		//조건문 ~ if
		
		if (facing >= 70 && playing >= 70) //{
			System.out.println("합격입니다.");//}	
		else//{
			System.out.println("불합격 입니다");
		//}

		
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
		
		
		System.out.println("프로그램 종료");
		
		
	}

}
