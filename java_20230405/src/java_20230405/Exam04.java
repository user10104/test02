package java_20230405;

import java.util. Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.err.println("계산할 초를 입력>>");
		int num = sc.nextInt();
				
		int second = num % 60;
		int hour = num /3600; //60*60
		int minute = (num % 3600) /60;
		
		System.out.println(hour + "시," + minute + "분,"+ second + "초");
		//키보드로 4000 입력받는다 4000초
		
		//화면상 출력
		//1시간 6분 40초
	}

}
