package java_20230407;

import java.util.Scanner;

//학점구하기(Exam01)를 Switch문으로 변경

public class Exam_09 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ';
		
		System.out.println("1~100까지의 점수 입력");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) { // /는 나누기 10이라 case9는 99까지, 10은 100까지
		case 10 :
		case 9 :
			grade = 'A';
			break ;
		
		case 8 :
			grade = 'B';
			break ;
			
		case 7 :
			grade = 'C';
			break ;

		case 6 :
			grade = 'D';
			break ;

		default :
			grade = 'F';
			
			
		
		}
			System.out.println("당신의 학점은" + grade +"입니다.");		
		
	}

}
