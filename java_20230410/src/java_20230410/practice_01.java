package java_20230410;

import java.util.Scanner;

//사용자로부터 두개의 정수 (시작, 끝)를 입력받아 시작 (포함)해서 끝 (포함)까지의 합을 출력

public class practice_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("두개의 숫자를 각각 입력하세요.");
		int start = sc.nextInt();
		int finsh = sc.nextInt();
		int sum = 0;
			
		for(int i=start ; i<=finsh; i++) 
			sum += i;
			
			System.out.print(sum);
		
	}
		
}