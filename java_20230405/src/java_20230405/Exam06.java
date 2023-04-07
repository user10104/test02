package java_20230405;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력>>");
		int num = sc.nextInt();
		
		int result = (num>0) ? num : -num;
		System.out.println("당신은 " + result + "입니다.");
		
		}

}
