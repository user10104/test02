package java_20230407;

import java.util.Scanner;

//1~부터 4까지의 정수를 입력받아 1,2,3,4 학년으로 분류하세요.
public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년 입력");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1:
			System.out.println("1학년");
			break;
		case 2:
			System.out.println("2학년");
			break;
		case 3:
			System.out.println("3학년");
			break;
		case 4 :
			System.out.println("4학년");
			break;
			default :
				System.out.println("1~4까지의 수 입력");
	} 
		System.out.println("프로그램 종료");
	} 

}

//오류수정 완료
//케이스앞에다가 작은따옴표 x
