package java_20230407;

import java.util.Scanner;

//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자

public class Quest_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,num4,num5;
		int max,min;
		
		System.out.println("세 개의 정수를 차례대로 입력하세요.");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = num1+num2+num3;
				
		//int total = a+b+c; < 이런 방법도?
		
			if (num1>num2) {
			if (num1>num3) max = num1;
			else max = num3;
		}else{
			if (num2>num3) max = num2;
			else max = num3;
		
	
		}
		
		if (num1>num2) {
			if(num2>num3) min =num3;
			else min = num2;
		}else {
			if(num1>num3) min =num3;
			else min = num1;
		}
			System.out.println("최소값: "+ min);
			System.out.println("최대값: "+ max);
			System.out.println("합계: " + (num1+num2+num3)+"");
			System.out.println("평균: " + (num4/3));
	}

}
