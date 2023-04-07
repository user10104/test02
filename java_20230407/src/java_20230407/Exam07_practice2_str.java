package java_20230407;

import java.util.Scanner;

public class Exam07_practice2_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력하세요");
		String season = sc.nextLine();
		
		switch(season) {
		
		case "봄" :
		System.out.println("spring");
		break;
		
		case "여름" :
		System.out.println("summer");
		break;
		
		case "가을" :
		System.out.println("fall");
		break;
		
		case "겨울" :
		System.out.println("winter");
		break;
		
		default :
			System.out.println("계절을 입력해주세요");
		}
	}

}
