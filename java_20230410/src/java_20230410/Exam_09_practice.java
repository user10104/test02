package java_20230410;

import java.util.Scanner;

public class Exam_09_practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int save = 0;
		boolean flag = true ; //boolean옆에 객체 잊지말기
		
		for(;flag;) { //괄호 뒤에 ;있으면 인식이 안됨
			
			System.out.println("------------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료  ");
			System.out.println("------------------------------------");
			System.out.println("선택 > ");
			
			int num = sc.nextInt();
			
		switch(num) {
		
		case 1 : 
			System.out.println("예금");
			save += sc.nextInt();
			break;
			
		case 2 : 
			System.out.println("출금");
			save -= sc.nextInt();
			break;
			
		case 3 : 
			System.out.println("잔고");
			System.out.println("잔고>" + save);
			break;
			
		case 4 : 
			System.out.println("선택");
			
			flag = false; //중요
			break;



		}
		
		}
		System.out.println("시스템 종료");
	}
}

