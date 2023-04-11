package java_20230411;

import java.util.Scanner;

//구구단


public class Exam_11 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { 
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴 (1~3)를 선택 ( 종료 > 0 )");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
					break;
		} else if (! (1<= menu&&menu <=3)) { 
			System.out.println("잘못된 선택, 종료 0번");
			
			continue;
			
		//int com = (int)(math.random()*180+1 //1~100
		//
		//
			//System.out println("프로그램 종료");
			
		}
			System.out.println("선택하신 번호는" + menu +"번입니다)");
			
		}
	
	
	}
	
}
