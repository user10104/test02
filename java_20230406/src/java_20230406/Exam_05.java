package java_20230406;

import java.util.Scanner;

// 70 이상의 성적을 받으면 합격 메시지를 출력하도록 만드세요.

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt(); //입력받는줄
		//조건문 ~ if
		if (jumsu >= 70)
			System.out.println("합격입니다.");
			
		else // if 와 저 괄호 내의 사항을 쓰지 않아도 값이 참이 아닐땐 아래의 메시지를 출력한다
			System.out.println("불합격 입니다");
		

		
		//나이 입력 후 20 대 이상일 시 성년을 알리는 메시지를 출력하도록 만드세요.
		
		System.out.println("당신의 나이를 입력하세요");
		int age = sc.nextInt();
		String input = sc.nextLine();
		if (age > 20)
			System.out.println("성인입니다.");
	
		
		
	}

}
