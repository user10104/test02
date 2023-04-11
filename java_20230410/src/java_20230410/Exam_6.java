package java_20230410;

import java.util.Scanner;

// 1~100까지의합계

public class Exam_6 {

	
	public static void main(String[] args) {

	int sum = 0;
	
	for(int i=1; i<=100; i++) { 	// 1~100회전(반복)
		sum+=i;						// i값을 계속 sum누적
		
		System.out.println(sum);	// for 벗어나면 실행
	}
	
	}

}
