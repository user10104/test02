package java_20230410;

import java.util.Scanner;

//1~100내의범위에서 2와3의 공배수 구하기.

public class practice_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		for(int i =1; i<=100; i++) {
			if (i % 2 ==0 && i %3 ==0) {
				System.out.print(i + ", ");
			count++;
		}
		
	}
		System.out.println("\n1~100 에서 2와 3의 배수 갯수는 :" + count );
	//중괄호 위치 주의.	
}
}