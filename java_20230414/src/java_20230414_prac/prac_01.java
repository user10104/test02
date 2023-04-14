package java_20230414_prac;

import java.util.Scanner;

//메뉴 3가지를 정하고 잘못 선택하면 재확인 메시지가 나오도록 만들기

public class prac_01 {

	public static void main(String[] args) {
	
	int num = 0;
	int menu = 0;
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("(1) play ");
		System.out.println("(2) pause");
		System.out.println("(3) quit ");
		System.out.print("메뉴를 선택해주세요 (종료는 0번)");
		System.out.println();
		
		String tmp = sc.nextLine();
		menu = Integer.parseInt(tmp);
		
		if (menu == 0) {
			System.out.println("프로그램 종료");
			break;
		}else if (!(1<= menu && menu <=3)){ //중요한 열 , false값을 처리하려면 참고
			System.out.println("메뉴를 잘못 선택 하셨습니다. (종료는 0번)");
		}
		System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
		System.out.println();
		
		
	}
	
		
	} //main의 끝. 연습 완료!!

}
