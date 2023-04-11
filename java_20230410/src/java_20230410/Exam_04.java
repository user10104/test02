package java_20230410;

import java.util.Scanner;

//3이상 4462 이하에서 짝수인 정수의 합


public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int sum1 = 0;
		
		for(int i = 1 ; i <= 5000; i++ ) {
			if(3<=i && i <= 4462 && i%2 ==0 )
				sum1+=i;
		}
	System.out.println(sum1);
		
	}
	
}