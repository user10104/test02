package java_20230406;

import java.util.*;

public class Exam01_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		double average;
		
		System.out.println("국어 점수 입력.");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력.");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력.");
		math = sc.nextInt();
		
		total = kor+eng+math;
		average = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		//소수점 아래를 생략하려면 29를 참고.
		System.out.printf("평균 : %.2f\n", average);
		
	}

}
