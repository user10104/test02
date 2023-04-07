package java_20230407;

import java.util.Scanner;

//문제 3 1학년부터 4학년까지 중간고사 시험을 보았다. 4학년은 70점이상이면 합격, 그이외의 학년은 60 점 이상이면 합격이다.
//이를 판단하는 프로그램을 작성해보자.
//점수가 0미만 100초과이면 경고문구 출력.

public class Quest_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학년 입력");
		int grade = sc.nextInt();
		
		
		System.out.println("점수 입력");
		int score = sc.nextInt();
		
		 
			if (grade==4 && score>=70)
				System.out.println("4학년 합격");
			else if (grade<4 && score >= 60)                // 조건부 괄호에 ; 안들어가도록
				System.out.println("그 외 학년 합격");  
			//&&는 그리고
			else if (score<0 || score >100)
				System.out.println("경고 대상");
			else
				System.out.println("불합격");
			
	
	}

}
