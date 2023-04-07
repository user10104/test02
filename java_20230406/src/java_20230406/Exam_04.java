package java_20230406;

import java.util.Scanner;

// 70 이상의 성적을 받으면 합격 메시지를 출력하도록 만드세요. 조건 만족.

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt(); //입력받는줄
		//조건문 ~ if
		if (jumsu >= 70)
			System.out.println("합격입니다."); // 조건을 만족할때만 출력함, 낮으면 출력을 하지 않고 패스됨
			
		if(jumsu < 70) //이 행을 다시 체크하게 하는것은 비효율적이니 효율을 올리기 위해선 ~if else 구문을 사용
			System.out.println("불합격 입니다");
		

		
		//나이 입력 후 20 대 이상일 시 성년을 알리는 메시지를 출력하도록 만드세요.
		
		System.out.println("당신의 나이를 입력하세요");
		
		
		
	}

}
