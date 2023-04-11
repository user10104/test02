package java_20230410;

import java.util.Scanner;

public class Exam_08 {
	/*
	 * for 문은 무한 반복 ... 처리 (for문, switch조합)
	 *
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ---------------------------------
	 * 선택>1
	 * 예금액>10000
	 * ---------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ---------------------------------
	 * 선택>2
	 * 예금액>2000
	 * ---------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ---------------------------------
	 * 선택>3
	 * 예금액>8000
	 * ---------------------------------
	 * 선택>4
	 * 
	 * 프로그램 종료
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int save = 0;
		boolean flag= true;
		
		for(;flag;) {
		
			System.out.println("------------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료  ");
			System.out.println("------------------------------------");
			System.out.println("선택>");
			
			int number = sc. nextInt();
			
			switch(number) {
			case 1:/*
			*System.out.println("------------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료  ");
			System.out.println("------------------------------------");
			깔끔하게 하려면 더 위에있는 것들을 빼고 이렇게 일일히 넣는게 좋다.는데
			본 코드는 수정된 코드이다. 참고만하자 
			**/
				System.out.println("예금액>");
				save += sc.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				save -= sc.nextInt();
				break;

			case 3:
				System.out.println("잔고>");
				System.out.println("현재 잔고> :" + save ); //이상한 더하기 코드를 안넣게 조심
				break; 
			case 4 :
				System.out.println("선택>");
				flag = false;
				break;

			}
			if( number == 4)break;
			
		}
		System.out.println("종료");

	}
	
}
