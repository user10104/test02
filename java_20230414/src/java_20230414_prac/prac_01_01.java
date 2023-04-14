package java_20230414_prac;

import java.util.Scanner;

//메뉴 3가지를 정하고 잘못 선택하면 재확인 메시지가 나오도록 만들기

public class prac_01_01 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in); //Scanner sc였으면 후에 sc.nextLine으로 써줘야한다 scanner로 쓰면 인식 x
		
		while(true) { 
		
			System.out.println("(1) Square ");
			System.out.println("(2) Square root ");
			System.out.println("(3) log ");
		System.out.println();
			System.out.print("원하는 메뉴를 선택하세요( 종료: 0 ).");
		System.out.println();	
			
			String tmp = sc.nextLine();	// 입력받는 내용(Scanner.nesxtLine) 을 변수 tmp에 저장  
			menu = Integer.parseInt(tmp); 		// 문자열이 저장된 tmp를 숫자로 변환(parseInt)후 그것을 menu값으로 지정
			 
			if (menu == 0 ) {
				System.out.println("프로그램을 종료합니다.");
				break; 
			}else if (!(1 <= menu && menu <= 3)) { 
				System.out.println("메뉴를 잘못 선택 하셨습니다. ( 종료 : 0 )");
				continue;
			}
			System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
			
		}

	}

}
